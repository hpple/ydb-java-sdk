// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ydb/public/api/grpc/ydb_export_v1.proto

package tech.ydb.export.v1;

public final class YdbExportV1 {
  private YdbExportV1() {}
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
      "\n\'ydb/public/api/grpc/ydb_export_v1.prot" +
      "o\022\rYdb.Export.V1\032&ydb/public/api/protos/" +
      "ydb_export.proto2\251\001\n\rExportService\022K\n\nEx" +
      "portToYt\022\035.Ydb.Export.ExportToYtRequest\032" +
      "\036.Ydb.Export.ExportToYtResponse\022K\n\nExpor" +
      "tToS3\022\035.Ydb.Export.ExportToS3Request\032\036.Y" +
      "db.Export.ExportToS3ResponseB\032\n\030com.yand" +
      "ex.ydb.export.v1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          tech.ydb.export.YdbExport.getDescriptor(),
        });
    tech.ydb.export.YdbExport.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
