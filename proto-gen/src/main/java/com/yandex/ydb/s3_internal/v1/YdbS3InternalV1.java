// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ydb/public/api/grpc/draft/ydb_s3_internal_v1.proto

package tech.ydb.s3_internal.v1;

public final class YdbS3InternalV1 {
  private YdbS3InternalV1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2ydb/public/api/grpc/draft/ydb_s3_inter" +
      "nal_v1.proto\022\021Ydb.S3Internal.V1\032+ydb/pub" +
      "lic/api/protos/ydb_s3_internal.proto2e\n\021" +
      "S3InternalService\022P\n\tS3Listing\022 .Ydb.S3I" +
      "nternal.S3ListingRequest\032!.Ydb.S3Interna" +
      "l.S3ListingResponseB\037\n\035tech.ydb.s3" +
      "_internal.v1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          tech.ydb.s3_internal.S3InternalProtos.getDescriptor(),
        });
    tech.ydb.s3_internal.S3InternalProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
