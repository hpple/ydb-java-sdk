// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ydb/public/api/protos/ydb_rate_limiter.proto

package tech.ydb.rate_limiter;

public interface DescribeResourceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ydb.RateLimiter.DescribeResourceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Holds DescribeResourceResult in case of successful call.
   * </pre>
   *
   * <code>.Ydb.Operations.Operation operation = 1;</code>
   * @return Whether the operation field is set.
   */
  boolean hasOperation();
  /**
   * <pre>
   * Holds DescribeResourceResult in case of successful call.
   * </pre>
   *
   * <code>.Ydb.Operations.Operation operation = 1;</code>
   * @return The operation.
   */
  tech.ydb.OperationProtos.Operation getOperation();
  /**
   * <pre>
   * Holds DescribeResourceResult in case of successful call.
   * </pre>
   *
   * <code>.Ydb.Operations.Operation operation = 1;</code>
   */
  tech.ydb.OperationProtos.OperationOrBuilder getOperationOrBuilder();
}
