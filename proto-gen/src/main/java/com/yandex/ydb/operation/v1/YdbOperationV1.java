// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ydb/public/api/grpc/ydb_operation_v1.proto

package tech.ydb.operation.v1;

public final class YdbOperationV1 {
  private YdbOperationV1() {}
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
      "\n*ydb/public/api/grpc/ydb_operation_v1.p" +
      "roto\022\020Ydb.Operation.V1\032)ydb/public/api/p" +
      "rotos/ydb_operation.proto2\226\003\n\020OperationS" +
      "ervice\022Y\n\014GetOperation\022#.Ydb.Operations." +
      "GetOperationRequest\032$.Ydb.Operations.Get" +
      "OperationResponse\022b\n\017CancelOperation\022&.Y" +
      "db.Operations.CancelOperationRequest\032\'.Y" +
      "db.Operations.CancelOperationResponse\022b\n" +
      "\017ForgetOperation\022&.Ydb.Operations.Forget" +
      "OperationRequest\032\'.Ydb.Operations.Forget" +
      "OperationResponse\022_\n\016ListOperations\022%.Yd" +
      "b.Operations.ListOperationsRequest\032&.Ydb" +
      ".Operations.ListOperationsResponseB\035\n\033co" +
      "m.yandex.ydb.operation.v1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          tech.ydb.OperationProtos.getDescriptor(),
        });
    tech.ydb.OperationProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
