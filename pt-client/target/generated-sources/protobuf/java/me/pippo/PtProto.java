// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pt.proto

package me.pippo;

public final class PtProto {
  private PtProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_me_pippo_proto_PtReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_me_pippo_proto_PtReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_me_pippo_proto_PtResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_me_pippo_proto_PtResp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\010pt.proto\022\016me.pippo.proto\"\"\n\005PtReq\022\013\n\003m" +
      "sg\030\001 \001(\t\022\014\n\004uuid\030\002 \001(\t\"#\n\006PtResp\022\013\n\003msg\030" +
      "\001 \001(\t\022\014\n\004uuid\030\002 \001(\t2B\n\007Service\0227\n\004echo\022\025" +
      ".me.pippo.proto.PtReq\032\026.me.pippo.proto.P" +
      "tResp\"\000B\025\n\010me.pippoB\007PtProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_me_pippo_proto_PtReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_me_pippo_proto_PtReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_me_pippo_proto_PtReq_descriptor,
        new java.lang.String[] { "Msg", "Uuid", });
    internal_static_me_pippo_proto_PtResp_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_me_pippo_proto_PtResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_me_pippo_proto_PtResp_descriptor,
        new java.lang.String[] { "Msg", "Uuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}