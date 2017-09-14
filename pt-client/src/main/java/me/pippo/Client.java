package me.pippo;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.RateLimiter;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.PreDestroy;
import java.util.UUID;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

public class Client {

	private static final Logger logger = LoggerFactory.getLogger(Client.class);

	private ManagedChannel channel;

	private ServiceGrpc.ServiceFutureStub futureStub;

	@Value("${pt.client.rate:100_000}")
	private int rate;

	@Value("${pt.client.host:localhost}")
	private String host;

	@Value("${pt.client.port:50001}")
	private int port;

	@Value("${pt.client.threads:5}")
	private int threads;

	@Value("${pt.client.timeout:50}")
	private int timeout;

	private RateLimiter limiter;

	private volatile boolean running;

	private BlockingQueue<ListenableFuture<PtResp>> futures = new LinkedBlockingQueue<>();

	private AtomicLong timeoutCount = new AtomicLong(0);

	public void start() {
		channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext(true).build();
		futureStub = ServiceGrpc.newFutureStub(channel);
		limiter = RateLimiter.create(rate);
		ExecutorService executorService = Executors.newFixedThreadPool(threads);
		running = true;
		executorService.submit(() -> {
			while (running) {
				try {
					ListenableFuture<PtResp> future = futures.take();
					future.get(150, TimeUnit.MILLISECONDS);
				} catch (Exception e) {
					timeoutCount.incrementAndGet();
				}
			}
		});
	}

	@PreDestroy
	private void destroy() {
		running = false;
	}

	public void greet(String msg) throws InterruptedException {
		limiter.acquire(1);
		String uuid = UUID.randomUUID().toString();
		PtReq req = PtReq.newBuilder().setMsg(msg).setUuid(uuid).build();
		ListenableFuture<PtResp> future = futureStub.echo(req);
		futures.put(future);
	}

	@Scheduled(fixedDelay = 1_000)
	private void log() {
		if (running)
			logger.info("futures:{},timeout:{}", futures.size(), timeoutCount.get());
	}

}
