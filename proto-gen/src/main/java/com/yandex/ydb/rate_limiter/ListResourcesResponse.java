// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ydb/public/api/protos/ydb_rate_limiter.proto

package tech.ydb.rate_limiter;

/**
 * Protobuf type {@code Ydb.RateLimiter.ListResourcesResponse}
 */
public final class ListResourcesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ydb.RateLimiter.ListResourcesResponse)
    ListResourcesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListResourcesResponse.newBuilder() to construct.
  private ListResourcesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListResourcesResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListResourcesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListResourcesResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            tech.ydb.OperationProtos.Operation.Builder subBuilder = null;
            if (operation_ != null) {
              subBuilder = operation_.toBuilder();
            }
            operation_ = input.readMessage(tech.ydb.OperationProtos.Operation.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(operation_);
              operation_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return tech.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_ListResourcesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tech.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_ListResourcesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tech.ydb.rate_limiter.ListResourcesResponse.class, tech.ydb.rate_limiter.ListResourcesResponse.Builder.class);
  }

  public static final int OPERATION_FIELD_NUMBER = 1;
  private tech.ydb.OperationProtos.Operation operation_;
  /**
   * <pre>
   * Holds ListResourcesResult in case of successful call.
   * </pre>
   *
   * <code>.Ydb.Operations.Operation operation = 1;</code>
   * @return Whether the operation field is set.
   */
  @java.lang.Override
  public boolean hasOperation() {
    return operation_ != null;
  }
  /**
   * <pre>
   * Holds ListResourcesResult in case of successful call.
   * </pre>
   *
   * <code>.Ydb.Operations.Operation operation = 1;</code>
   * @return The operation.
   */
  @java.lang.Override
  public tech.ydb.OperationProtos.Operation getOperation() {
    return operation_ == null ? tech.ydb.OperationProtos.Operation.getDefaultInstance() : operation_;
  }
  /**
   * <pre>
   * Holds ListResourcesResult in case of successful call.
   * </pre>
   *
   * <code>.Ydb.Operations.Operation operation = 1;</code>
   */
  @java.lang.Override
  public tech.ydb.OperationProtos.OperationOrBuilder getOperationOrBuilder() {
    return getOperation();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (operation_ != null) {
      output.writeMessage(1, getOperation());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOperation());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof tech.ydb.rate_limiter.ListResourcesResponse)) {
      return super.equals(obj);
    }
    tech.ydb.rate_limiter.ListResourcesResponse other = (tech.ydb.rate_limiter.ListResourcesResponse) obj;

    if (hasOperation() != other.hasOperation()) return false;
    if (hasOperation()) {
      if (!getOperation()
          .equals(other.getOperation())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasOperation()) {
      hash = (37 * hash) + OPERATION_FIELD_NUMBER;
      hash = (53 * hash) + getOperation().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tech.ydb.rate_limiter.ListResourcesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.ydb.rate_limiter.ListResourcesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.ydb.rate_limiter.ListResourcesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.ydb.rate_limiter.ListResourcesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.ydb.rate_limiter.ListResourcesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.ydb.rate_limiter.ListResourcesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.ydb.rate_limiter.ListResourcesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech.ydb.rate_limiter.ListResourcesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tech.ydb.rate_limiter.ListResourcesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tech.ydb.rate_limiter.ListResourcesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tech.ydb.rate_limiter.ListResourcesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech.ydb.rate_limiter.ListResourcesResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(tech.ydb.rate_limiter.ListResourcesResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code Ydb.RateLimiter.ListResourcesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ydb.RateLimiter.ListResourcesResponse)
      tech.ydb.rate_limiter.ListResourcesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_ListResourcesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_ListResourcesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech.ydb.rate_limiter.ListResourcesResponse.class, tech.ydb.rate_limiter.ListResourcesResponse.Builder.class);
    }

    // Construct using tech.ydb.rate_limiter.ListResourcesResponse.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (operationBuilder_ == null) {
        operation_ = null;
      } else {
        operation_ = null;
        operationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tech.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_ListResourcesResponse_descriptor;
    }

    @java.lang.Override
    public tech.ydb.rate_limiter.ListResourcesResponse getDefaultInstanceForType() {
      return tech.ydb.rate_limiter.ListResourcesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public tech.ydb.rate_limiter.ListResourcesResponse build() {
      tech.ydb.rate_limiter.ListResourcesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tech.ydb.rate_limiter.ListResourcesResponse buildPartial() {
      tech.ydb.rate_limiter.ListResourcesResponse result = new tech.ydb.rate_limiter.ListResourcesResponse(this);
      if (operationBuilder_ == null) {
        result.operation_ = operation_;
      } else {
        result.operation_ = operationBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof tech.ydb.rate_limiter.ListResourcesResponse) {
        return mergeFrom((tech.ydb.rate_limiter.ListResourcesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tech.ydb.rate_limiter.ListResourcesResponse other) {
      if (other == tech.ydb.rate_limiter.ListResourcesResponse.getDefaultInstance()) return this;
      if (other.hasOperation()) {
        mergeOperation(other.getOperation());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      tech.ydb.rate_limiter.ListResourcesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (tech.ydb.rate_limiter.ListResourcesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private tech.ydb.OperationProtos.Operation operation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        tech.ydb.OperationProtos.Operation, tech.ydb.OperationProtos.Operation.Builder, tech.ydb.OperationProtos.OperationOrBuilder> operationBuilder_;
    /**
     * <pre>
     * Holds ListResourcesResult in case of successful call.
     * </pre>
     *
     * <code>.Ydb.Operations.Operation operation = 1;</code>
     * @return Whether the operation field is set.
     */
    public boolean hasOperation() {
      return operationBuilder_ != null || operation_ != null;
    }
    /**
     * <pre>
     * Holds ListResourcesResult in case of successful call.
     * </pre>
     *
     * <code>.Ydb.Operations.Operation operation = 1;</code>
     * @return The operation.
     */
    public tech.ydb.OperationProtos.Operation getOperation() {
      if (operationBuilder_ == null) {
        return operation_ == null ? tech.ydb.OperationProtos.Operation.getDefaultInstance() : operation_;
      } else {
        return operationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Holds ListResourcesResult in case of successful call.
     * </pre>
     *
     * <code>.Ydb.Operations.Operation operation = 1;</code>
     */
    public Builder setOperation(tech.ydb.OperationProtos.Operation value) {
      if (operationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        operation_ = value;
        onChanged();
      } else {
        operationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Holds ListResourcesResult in case of successful call.
     * </pre>
     *
     * <code>.Ydb.Operations.Operation operation = 1;</code>
     */
    public Builder setOperation(
        tech.ydb.OperationProtos.Operation.Builder builderForValue) {
      if (operationBuilder_ == null) {
        operation_ = builderForValue.build();
        onChanged();
      } else {
        operationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Holds ListResourcesResult in case of successful call.
     * </pre>
     *
     * <code>.Ydb.Operations.Operation operation = 1;</code>
     */
    public Builder mergeOperation(tech.ydb.OperationProtos.Operation value) {
      if (operationBuilder_ == null) {
        if (operation_ != null) {
          operation_ =
            tech.ydb.OperationProtos.Operation.newBuilder(operation_).mergeFrom(value).buildPartial();
        } else {
          operation_ = value;
        }
        onChanged();
      } else {
        operationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Holds ListResourcesResult in case of successful call.
     * </pre>
     *
     * <code>.Ydb.Operations.Operation operation = 1;</code>
     */
    public Builder clearOperation() {
      if (operationBuilder_ == null) {
        operation_ = null;
        onChanged();
      } else {
        operation_ = null;
        operationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Holds ListResourcesResult in case of successful call.
     * </pre>
     *
     * <code>.Ydb.Operations.Operation operation = 1;</code>
     */
    public tech.ydb.OperationProtos.Operation.Builder getOperationBuilder() {
      
      onChanged();
      return getOperationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Holds ListResourcesResult in case of successful call.
     * </pre>
     *
     * <code>.Ydb.Operations.Operation operation = 1;</code>
     */
    public tech.ydb.OperationProtos.OperationOrBuilder getOperationOrBuilder() {
      if (operationBuilder_ != null) {
        return operationBuilder_.getMessageOrBuilder();
      } else {
        return operation_ == null ?
            tech.ydb.OperationProtos.Operation.getDefaultInstance() : operation_;
      }
    }
    /**
     * <pre>
     * Holds ListResourcesResult in case of successful call.
     * </pre>
     *
     * <code>.Ydb.Operations.Operation operation = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        tech.ydb.OperationProtos.Operation, tech.ydb.OperationProtos.Operation.Builder, tech.ydb.OperationProtos.OperationOrBuilder> 
        getOperationFieldBuilder() {
      if (operationBuilder_ == null) {
        operationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            tech.ydb.OperationProtos.Operation, tech.ydb.OperationProtos.Operation.Builder, tech.ydb.OperationProtos.OperationOrBuilder>(
                getOperation(),
                getParentForChildren(),
                isClean());
        operation_ = null;
      }
      return operationBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Ydb.RateLimiter.ListResourcesResponse)
  }

  // @@protoc_insertion_point(class_scope:Ydb.RateLimiter.ListResourcesResponse)
  private static final tech.ydb.rate_limiter.ListResourcesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tech.ydb.rate_limiter.ListResourcesResponse();
  }

  public static tech.ydb.rate_limiter.ListResourcesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListResourcesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListResourcesResponse>() {
    @java.lang.Override
    public ListResourcesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListResourcesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListResourcesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListResourcesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tech.ydb.rate_limiter.ListResourcesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

