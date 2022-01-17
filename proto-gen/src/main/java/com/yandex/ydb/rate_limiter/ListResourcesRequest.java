// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ydb/public/api/protos/ydb_rate_limiter.proto

package tech.ydb.rate_limiter;

/**
 * Protobuf type {@code Ydb.RateLimiter.ListResourcesRequest}
 */
public final class ListResourcesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ydb.RateLimiter.ListResourcesRequest)
    ListResourcesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListResourcesRequest.newBuilder() to construct.
  private ListResourcesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListResourcesRequest() {
    coordinationNodePath_ = "";
    resourcePath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListResourcesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListResourcesRequest(
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
            tech.ydb.OperationProtos.OperationParams.Builder subBuilder = null;
            if (operationParams_ != null) {
              subBuilder = operationParams_.toBuilder();
            }
            operationParams_ = input.readMessage(tech.ydb.OperationProtos.OperationParams.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(operationParams_);
              operationParams_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            coordinationNodePath_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            resourcePath_ = s;
            break;
          }
          case 32: {

            recursive_ = input.readBool();
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
    return tech.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_ListResourcesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tech.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_ListResourcesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tech.ydb.rate_limiter.ListResourcesRequest.class, tech.ydb.rate_limiter.ListResourcesRequest.Builder.class);
  }

  public static final int OPERATION_PARAMS_FIELD_NUMBER = 1;
  private tech.ydb.OperationProtos.OperationParams operationParams_;
  /**
   * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
   * @return Whether the operationParams field is set.
   */
  @java.lang.Override
  public boolean hasOperationParams() {
    return operationParams_ != null;
  }
  /**
   * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
   * @return The operationParams.
   */
  @java.lang.Override
  public tech.ydb.OperationProtos.OperationParams getOperationParams() {
    return operationParams_ == null ? tech.ydb.OperationProtos.OperationParams.getDefaultInstance() : operationParams_;
  }
  /**
   * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
   */
  @java.lang.Override
  public tech.ydb.OperationProtos.OperationParamsOrBuilder getOperationParamsOrBuilder() {
    return getOperationParams();
  }

  public static final int COORDINATION_NODE_PATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object coordinationNodePath_;
  /**
   * <pre>
   * Path of a coordination node.
   * </pre>
   *
   * <code>string coordination_node_path = 2;</code>
   * @return The coordinationNodePath.
   */
  @java.lang.Override
  public java.lang.String getCoordinationNodePath() {
    java.lang.Object ref = coordinationNodePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      coordinationNodePath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Path of a coordination node.
   * </pre>
   *
   * <code>string coordination_node_path = 2;</code>
   * @return The bytes for coordinationNodePath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCoordinationNodePathBytes() {
    java.lang.Object ref = coordinationNodePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      coordinationNodePath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_PATH_FIELD_NUMBER = 3;
  private volatile java.lang.Object resourcePath_;
  /**
   * <pre>
   * Path of resource inside a coordination node.
   * May be empty.
   * In that case all root resources will be listed.
   * </pre>
   *
   * <code>string resource_path = 3;</code>
   * @return The resourcePath.
   */
  @java.lang.Override
  public java.lang.String getResourcePath() {
    java.lang.Object ref = resourcePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourcePath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Path of resource inside a coordination node.
   * May be empty.
   * In that case all root resources will be listed.
   * </pre>
   *
   * <code>string resource_path = 3;</code>
   * @return The bytes for resourcePath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourcePathBytes() {
    java.lang.Object ref = resourcePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourcePath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RECURSIVE_FIELD_NUMBER = 4;
  private boolean recursive_;
  /**
   * <pre>
   * List resources recursively.
   * </pre>
   *
   * <code>bool recursive = 4;</code>
   * @return The recursive.
   */
  @java.lang.Override
  public boolean getRecursive() {
    return recursive_;
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
    if (operationParams_ != null) {
      output.writeMessage(1, getOperationParams());
    }
    if (!getCoordinationNodePathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, coordinationNodePath_);
    }
    if (!getResourcePathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, resourcePath_);
    }
    if (recursive_ != false) {
      output.writeBool(4, recursive_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operationParams_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOperationParams());
    }
    if (!getCoordinationNodePathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, coordinationNodePath_);
    }
    if (!getResourcePathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, resourcePath_);
    }
    if (recursive_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, recursive_);
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
    if (!(obj instanceof tech.ydb.rate_limiter.ListResourcesRequest)) {
      return super.equals(obj);
    }
    tech.ydb.rate_limiter.ListResourcesRequest other = (tech.ydb.rate_limiter.ListResourcesRequest) obj;

    if (hasOperationParams() != other.hasOperationParams()) return false;
    if (hasOperationParams()) {
      if (!getOperationParams()
          .equals(other.getOperationParams())) return false;
    }
    if (!getCoordinationNodePath()
        .equals(other.getCoordinationNodePath())) return false;
    if (!getResourcePath()
        .equals(other.getResourcePath())) return false;
    if (getRecursive()
        != other.getRecursive()) return false;
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
    if (hasOperationParams()) {
      hash = (37 * hash) + OPERATION_PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getOperationParams().hashCode();
    }
    hash = (37 * hash) + COORDINATION_NODE_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getCoordinationNodePath().hashCode();
    hash = (37 * hash) + RESOURCE_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getResourcePath().hashCode();
    hash = (37 * hash) + RECURSIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRecursive());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tech.ydb.rate_limiter.ListResourcesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.ydb.rate_limiter.ListResourcesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.ydb.rate_limiter.ListResourcesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.ydb.rate_limiter.ListResourcesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.ydb.rate_limiter.ListResourcesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.ydb.rate_limiter.ListResourcesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.ydb.rate_limiter.ListResourcesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech.ydb.rate_limiter.ListResourcesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tech.ydb.rate_limiter.ListResourcesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tech.ydb.rate_limiter.ListResourcesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tech.ydb.rate_limiter.ListResourcesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech.ydb.rate_limiter.ListResourcesRequest parseFrom(
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
  public static Builder newBuilder(tech.ydb.rate_limiter.ListResourcesRequest prototype) {
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
   * Protobuf type {@code Ydb.RateLimiter.ListResourcesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ydb.RateLimiter.ListResourcesRequest)
      tech.ydb.rate_limiter.ListResourcesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_ListResourcesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_ListResourcesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech.ydb.rate_limiter.ListResourcesRequest.class, tech.ydb.rate_limiter.ListResourcesRequest.Builder.class);
    }

    // Construct using tech.ydb.rate_limiter.ListResourcesRequest.newBuilder()
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
      if (operationParamsBuilder_ == null) {
        operationParams_ = null;
      } else {
        operationParams_ = null;
        operationParamsBuilder_ = null;
      }
      coordinationNodePath_ = "";

      resourcePath_ = "";

      recursive_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tech.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_ListResourcesRequest_descriptor;
    }

    @java.lang.Override
    public tech.ydb.rate_limiter.ListResourcesRequest getDefaultInstanceForType() {
      return tech.ydb.rate_limiter.ListResourcesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public tech.ydb.rate_limiter.ListResourcesRequest build() {
      tech.ydb.rate_limiter.ListResourcesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tech.ydb.rate_limiter.ListResourcesRequest buildPartial() {
      tech.ydb.rate_limiter.ListResourcesRequest result = new tech.ydb.rate_limiter.ListResourcesRequest(this);
      if (operationParamsBuilder_ == null) {
        result.operationParams_ = operationParams_;
      } else {
        result.operationParams_ = operationParamsBuilder_.build();
      }
      result.coordinationNodePath_ = coordinationNodePath_;
      result.resourcePath_ = resourcePath_;
      result.recursive_ = recursive_;
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
      if (other instanceof tech.ydb.rate_limiter.ListResourcesRequest) {
        return mergeFrom((tech.ydb.rate_limiter.ListResourcesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tech.ydb.rate_limiter.ListResourcesRequest other) {
      if (other == tech.ydb.rate_limiter.ListResourcesRequest.getDefaultInstance()) return this;
      if (other.hasOperationParams()) {
        mergeOperationParams(other.getOperationParams());
      }
      if (!other.getCoordinationNodePath().isEmpty()) {
        coordinationNodePath_ = other.coordinationNodePath_;
        onChanged();
      }
      if (!other.getResourcePath().isEmpty()) {
        resourcePath_ = other.resourcePath_;
        onChanged();
      }
      if (other.getRecursive() != false) {
        setRecursive(other.getRecursive());
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
      tech.ydb.rate_limiter.ListResourcesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (tech.ydb.rate_limiter.ListResourcesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private tech.ydb.OperationProtos.OperationParams operationParams_;
    private com.google.protobuf.SingleFieldBuilderV3<
        tech.ydb.OperationProtos.OperationParams, tech.ydb.OperationProtos.OperationParams.Builder, tech.ydb.OperationProtos.OperationParamsOrBuilder> operationParamsBuilder_;
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
     * @return Whether the operationParams field is set.
     */
    public boolean hasOperationParams() {
      return operationParamsBuilder_ != null || operationParams_ != null;
    }
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
     * @return The operationParams.
     */
    public tech.ydb.OperationProtos.OperationParams getOperationParams() {
      if (operationParamsBuilder_ == null) {
        return operationParams_ == null ? tech.ydb.OperationProtos.OperationParams.getDefaultInstance() : operationParams_;
      } else {
        return operationParamsBuilder_.getMessage();
      }
    }
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
     */
    public Builder setOperationParams(tech.ydb.OperationProtos.OperationParams value) {
      if (operationParamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        operationParams_ = value;
        onChanged();
      } else {
        operationParamsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
     */
    public Builder setOperationParams(
        tech.ydb.OperationProtos.OperationParams.Builder builderForValue) {
      if (operationParamsBuilder_ == null) {
        operationParams_ = builderForValue.build();
        onChanged();
      } else {
        operationParamsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
     */
    public Builder mergeOperationParams(tech.ydb.OperationProtos.OperationParams value) {
      if (operationParamsBuilder_ == null) {
        if (operationParams_ != null) {
          operationParams_ =
            tech.ydb.OperationProtos.OperationParams.newBuilder(operationParams_).mergeFrom(value).buildPartial();
        } else {
          operationParams_ = value;
        }
        onChanged();
      } else {
        operationParamsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
     */
    public Builder clearOperationParams() {
      if (operationParamsBuilder_ == null) {
        operationParams_ = null;
        onChanged();
      } else {
        operationParams_ = null;
        operationParamsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
     */
    public tech.ydb.OperationProtos.OperationParams.Builder getOperationParamsBuilder() {
      
      onChanged();
      return getOperationParamsFieldBuilder().getBuilder();
    }
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
     */
    public tech.ydb.OperationProtos.OperationParamsOrBuilder getOperationParamsOrBuilder() {
      if (operationParamsBuilder_ != null) {
        return operationParamsBuilder_.getMessageOrBuilder();
      } else {
        return operationParams_ == null ?
            tech.ydb.OperationProtos.OperationParams.getDefaultInstance() : operationParams_;
      }
    }
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        tech.ydb.OperationProtos.OperationParams, tech.ydb.OperationProtos.OperationParams.Builder, tech.ydb.OperationProtos.OperationParamsOrBuilder> 
        getOperationParamsFieldBuilder() {
      if (operationParamsBuilder_ == null) {
        operationParamsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            tech.ydb.OperationProtos.OperationParams, tech.ydb.OperationProtos.OperationParams.Builder, tech.ydb.OperationProtos.OperationParamsOrBuilder>(
                getOperationParams(),
                getParentForChildren(),
                isClean());
        operationParams_ = null;
      }
      return operationParamsBuilder_;
    }

    private java.lang.Object coordinationNodePath_ = "";
    /**
     * <pre>
     * Path of a coordination node.
     * </pre>
     *
     * <code>string coordination_node_path = 2;</code>
     * @return The coordinationNodePath.
     */
    public java.lang.String getCoordinationNodePath() {
      java.lang.Object ref = coordinationNodePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        coordinationNodePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Path of a coordination node.
     * </pre>
     *
     * <code>string coordination_node_path = 2;</code>
     * @return The bytes for coordinationNodePath.
     */
    public com.google.protobuf.ByteString
        getCoordinationNodePathBytes() {
      java.lang.Object ref = coordinationNodePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        coordinationNodePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Path of a coordination node.
     * </pre>
     *
     * <code>string coordination_node_path = 2;</code>
     * @param value The coordinationNodePath to set.
     * @return This builder for chaining.
     */
    public Builder setCoordinationNodePath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      coordinationNodePath_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path of a coordination node.
     * </pre>
     *
     * <code>string coordination_node_path = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCoordinationNodePath() {
      
      coordinationNodePath_ = getDefaultInstance().getCoordinationNodePath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path of a coordination node.
     * </pre>
     *
     * <code>string coordination_node_path = 2;</code>
     * @param value The bytes for coordinationNodePath to set.
     * @return This builder for chaining.
     */
    public Builder setCoordinationNodePathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      coordinationNodePath_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object resourcePath_ = "";
    /**
     * <pre>
     * Path of resource inside a coordination node.
     * May be empty.
     * In that case all root resources will be listed.
     * </pre>
     *
     * <code>string resource_path = 3;</code>
     * @return The resourcePath.
     */
    public java.lang.String getResourcePath() {
      java.lang.Object ref = resourcePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourcePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Path of resource inside a coordination node.
     * May be empty.
     * In that case all root resources will be listed.
     * </pre>
     *
     * <code>string resource_path = 3;</code>
     * @return The bytes for resourcePath.
     */
    public com.google.protobuf.ByteString
        getResourcePathBytes() {
      java.lang.Object ref = resourcePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourcePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Path of resource inside a coordination node.
     * May be empty.
     * In that case all root resources will be listed.
     * </pre>
     *
     * <code>string resource_path = 3;</code>
     * @param value The resourcePath to set.
     * @return This builder for chaining.
     */
    public Builder setResourcePath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourcePath_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path of resource inside a coordination node.
     * May be empty.
     * In that case all root resources will be listed.
     * </pre>
     *
     * <code>string resource_path = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearResourcePath() {
      
      resourcePath_ = getDefaultInstance().getResourcePath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path of resource inside a coordination node.
     * May be empty.
     * In that case all root resources will be listed.
     * </pre>
     *
     * <code>string resource_path = 3;</code>
     * @param value The bytes for resourcePath to set.
     * @return This builder for chaining.
     */
    public Builder setResourcePathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourcePath_ = value;
      onChanged();
      return this;
    }

    private boolean recursive_ ;
    /**
     * <pre>
     * List resources recursively.
     * </pre>
     *
     * <code>bool recursive = 4;</code>
     * @return The recursive.
     */
    @java.lang.Override
    public boolean getRecursive() {
      return recursive_;
    }
    /**
     * <pre>
     * List resources recursively.
     * </pre>
     *
     * <code>bool recursive = 4;</code>
     * @param value The recursive to set.
     * @return This builder for chaining.
     */
    public Builder setRecursive(boolean value) {
      
      recursive_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List resources recursively.
     * </pre>
     *
     * <code>bool recursive = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRecursive() {
      
      recursive_ = false;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:Ydb.RateLimiter.ListResourcesRequest)
  }

  // @@protoc_insertion_point(class_scope:Ydb.RateLimiter.ListResourcesRequest)
  private static final tech.ydb.rate_limiter.ListResourcesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tech.ydb.rate_limiter.ListResourcesRequest();
  }

  public static tech.ydb.rate_limiter.ListResourcesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListResourcesRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListResourcesRequest>() {
    @java.lang.Override
    public ListResourcesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListResourcesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListResourcesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListResourcesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tech.ydb.rate_limiter.ListResourcesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

