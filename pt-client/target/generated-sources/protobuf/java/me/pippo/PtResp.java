// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pt.proto

package me.pippo;

/**
 * Protobuf type {@code me.pippo.proto.PtResp}
 */
public  final class PtResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:me.pippo.proto.PtResp)
    PtRespOrBuilder {
  // Use PtResp.newBuilder() to construct.
  private PtResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PtResp() {
    msg_ = "";
    uuid_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PtResp(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            msg_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            uuid_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return me.pippo.PtProto.internal_static_me_pippo_proto_PtResp_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return me.pippo.PtProto.internal_static_me_pippo_proto_PtResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            me.pippo.PtResp.class, me.pippo.PtResp.Builder.class);
  }

  public static final int MSG_FIELD_NUMBER = 1;
  private volatile java.lang.Object msg_;
  /**
   * <code>optional string msg = 1;</code>
   */
  public java.lang.String getMsg() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      msg_ = s;
      return s;
    }
  }
  /**
   * <code>optional string msg = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMsgBytes() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UUID_FIELD_NUMBER = 2;
  private volatile java.lang.Object uuid_;
  /**
   * <code>optional string uuid = 2;</code>
   */
  public java.lang.String getUuid() {
    java.lang.Object ref = uuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uuid_ = s;
      return s;
    }
  }
  /**
   * <code>optional string uuid = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUuidBytes() {
    java.lang.Object ref = uuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getMsgBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, msg_);
    }
    if (!getUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, uuid_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMsgBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, msg_);
    }
    if (!getUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, uuid_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof me.pippo.PtResp)) {
      return super.equals(obj);
    }
    me.pippo.PtResp other = (me.pippo.PtResp) obj;

    boolean result = true;
    result = result && getMsg()
        .equals(other.getMsg());
    result = result && getUuid()
        .equals(other.getUuid());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + MSG_FIELD_NUMBER;
    hash = (53 * hash) + getMsg().hashCode();
    hash = (37 * hash) + UUID_FIELD_NUMBER;
    hash = (53 * hash) + getUuid().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static me.pippo.PtResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static me.pippo.PtResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static me.pippo.PtResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static me.pippo.PtResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static me.pippo.PtResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static me.pippo.PtResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static me.pippo.PtResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static me.pippo.PtResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static me.pippo.PtResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static me.pippo.PtResp parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(me.pippo.PtResp prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code me.pippo.proto.PtResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:me.pippo.proto.PtResp)
      me.pippo.PtRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return me.pippo.PtProto.internal_static_me_pippo_proto_PtResp_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return me.pippo.PtProto.internal_static_me_pippo_proto_PtResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              me.pippo.PtResp.class, me.pippo.PtResp.Builder.class);
    }

    // Construct using me.pippo.PtResp.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      msg_ = "";

      uuid_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return me.pippo.PtProto.internal_static_me_pippo_proto_PtResp_descriptor;
    }

    public me.pippo.PtResp getDefaultInstanceForType() {
      return me.pippo.PtResp.getDefaultInstance();
    }

    public me.pippo.PtResp build() {
      me.pippo.PtResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public me.pippo.PtResp buildPartial() {
      me.pippo.PtResp result = new me.pippo.PtResp(this);
      result.msg_ = msg_;
      result.uuid_ = uuid_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof me.pippo.PtResp) {
        return mergeFrom((me.pippo.PtResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(me.pippo.PtResp other) {
      if (other == me.pippo.PtResp.getDefaultInstance()) return this;
      if (!other.getMsg().isEmpty()) {
        msg_ = other.msg_;
        onChanged();
      }
      if (!other.getUuid().isEmpty()) {
        uuid_ = other.uuid_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      me.pippo.PtResp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (me.pippo.PtResp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object msg_ = "";
    /**
     * <code>optional string msg = 1;</code>
     */
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string msg = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string msg = 1;</code>
     */
    public Builder setMsg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      msg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string msg = 1;</code>
     */
    public Builder clearMsg() {
      
      msg_ = getDefaultInstance().getMsg();
      onChanged();
      return this;
    }
    /**
     * <code>optional string msg = 1;</code>
     */
    public Builder setMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      msg_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object uuid_ = "";
    /**
     * <code>optional string uuid = 2;</code>
     */
    public java.lang.String getUuid() {
      java.lang.Object ref = uuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string uuid = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUuidBytes() {
      java.lang.Object ref = uuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string uuid = 2;</code>
     */
    public Builder setUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      uuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string uuid = 2;</code>
     */
    public Builder clearUuid() {
      
      uuid_ = getDefaultInstance().getUuid();
      onChanged();
      return this;
    }
    /**
     * <code>optional string uuid = 2;</code>
     */
    public Builder setUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      uuid_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:me.pippo.proto.PtResp)
  }

  // @@protoc_insertion_point(class_scope:me.pippo.proto.PtResp)
  private static final me.pippo.PtResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new me.pippo.PtResp();
  }

  public static me.pippo.PtResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PtResp>
      PARSER = new com.google.protobuf.AbstractParser<PtResp>() {
    public PtResp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PtResp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PtResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PtResp> getParserForType() {
    return PARSER;
  }

  public me.pippo.PtResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

