// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FindProvision.proto

package com.cg.grpc;

public final class FindProvisionOuterClass {
  private FindProvisionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_cg_grpc_FindProvision_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_cg_grpc_FindProvision_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_cg_grpc_GetResults_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_cg_grpc_GetResults_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_cg_grpc_GetPage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_cg_grpc_GetPage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023FindProvision.proto\022\013com.cg.grpc\">\n\rFi" +
      "ndProvision\022\021\n\ttimestamp\030\001 \001(\003\022\014\n\004page\030\002" +
      " \001(\005\022\014\n\004size\030\003 \001(\005\"E\n\nGetResults\022\016\n\006codi" +
      "go\030\001 \001(\t\022\024\n\014cod_socieded\030\002 \001(\t\022\021\n\ttimest" +
      "amp\030\003 \001(\003\"I\n\007GetPage\022\'\n\006result\030\001 \003(\0132\027.c" +
      "om.cg.grpc.GetResults\022\025\n\rtotalelements\030\002" +
      " \001(\0052I\n\014Fetchservice\0229\n\005fetch\022\032.com.cg.g" +
      "rpc.FindProvision\032\024.com.cg.grpc.GetPageB" +
      "\002P\001b\006proto3"
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
    internal_static_com_cg_grpc_FindProvision_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_cg_grpc_FindProvision_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_cg_grpc_FindProvision_descriptor,
        new java.lang.String[] { "Timestamp", "Page", "Size", });
    internal_static_com_cg_grpc_GetResults_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_cg_grpc_GetResults_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_cg_grpc_GetResults_descriptor,
        new java.lang.String[] { "Codigo", "CodSocieded", "Timestamp", });
    internal_static_com_cg_grpc_GetPage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_cg_grpc_GetPage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_cg_grpc_GetPage_descriptor,
        new java.lang.String[] { "Result", "Totalelements", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}