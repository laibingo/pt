package me.pippo;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class GrpcService {

	private static final Logger logger = LoggerFactory.getLogger(GrpcService.class);

	private int port = 50001;

	private Server server;

	private AtomicLong atomictLong = new AtomicLong(0);

	@PostConstruct
	void init() {
		server = ServerBuilder.forPort(port).addService(new PtService()).build();
	}

	@PreDestroy
	void stop() {
		server.shutdown();
	}

	public void start() throws IOException {
		server.start();
		logger.info("Grpc Service Start");
		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			logger.info("Runtime shutdown begin stop Grpc Service");
			GrpcService.this.stop();
		}));
	}

	public void blockUtilShutdown() throws InterruptedException {
		if (server != null) {
			server.awaitTermination();
		}
	}

	@Scheduled(fixedDelay = 1_000)
	public void log() {
		logger.info("count:{}", atomictLong.get());
	}

	private class PtService extends ServiceGrpc.ServiceImplBase {

		@Override
		public void echo(PtReq request, StreamObserver<PtResp> responseObserver) {
			String msg = request.getMsg();
			PtResp resp = PtResp.newBuilder().setMsg(msg).build();
			GrpcService.this.atomictLong.incrementAndGet();
			responseObserver.onNext(resp);
			responseObserver.onCompleted();
		}
	}

}
