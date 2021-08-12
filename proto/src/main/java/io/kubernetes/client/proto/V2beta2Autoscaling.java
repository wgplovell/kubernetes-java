/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.proto;

public final class V2beta2Autoscaling {
  private V2beta2Autoscaling() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface CrossVersionObjectReferenceOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
     * </pre>
     *
     * <code>optional string kind = 1;</code>
     */
    boolean hasKind();
    /**
     *
     *
     * <pre>
     * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
     * </pre>
     *
     * <code>optional string kind = 1;</code>
     */
    java.lang.String getKind();
    /**
     *
     *
     * <pre>
     * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
     * </pre>
     *
     * <code>optional string kind = 1;</code>
     */
    com.google.protobuf.ByteString getKindBytes();

    /**
     *
     *
     * <pre>
     * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    boolean hasName();
    /**
     *
     *
     * <pre>
     * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    java.lang.String getName();
    /**
     *
     *
     * <pre>
     * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    com.google.protobuf.ByteString getNameBytes();

    /**
     *
     *
     * <pre>
     * API version of the referent
     * +optional
     * </pre>
     *
     * <code>optional string apiVersion = 3;</code>
     */
    boolean hasApiVersion();
    /**
     *
     *
     * <pre>
     * API version of the referent
     * +optional
     * </pre>
     *
     * <code>optional string apiVersion = 3;</code>
     */
    java.lang.String getApiVersion();
    /**
     *
     *
     * <pre>
     * API version of the referent
     * +optional
     * </pre>
     *
     * <code>optional string apiVersion = 3;</code>
     */
    com.google.protobuf.ByteString getApiVersionBytes();
  }
  /**
   *
   *
   * <pre>
   * CrossVersionObjectReference contains enough information to let you identify the referred resource.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference}
   */
  public static final class CrossVersionObjectReference
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference)
      CrossVersionObjectReferenceOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use CrossVersionObjectReference.newBuilder() to construct.
    private CrossVersionObjectReference(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private CrossVersionObjectReference() {
      kind_ = "";
      name_ = "";
      apiVersion_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private CrossVersionObjectReference(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                kind_ = bs;
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                name_ = bs;
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000004;
                apiVersion_ = bs;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_CrossVersionObjectReference_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_CrossVersionObjectReference_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference.class,
              io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference.Builder
                  .class);
    }

    private int bitField0_;
    public static final int KIND_FIELD_NUMBER = 1;
    private volatile java.lang.Object kind_;
    /**
     *
     *
     * <pre>
     * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
     * </pre>
     *
     * <code>optional string kind = 1;</code>
     */
    public boolean hasKind() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
     * </pre>
     *
     * <code>optional string kind = 1;</code>
     */
    public java.lang.String getKind() {
      java.lang.Object ref = kind_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          kind_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
     * </pre>
     *
     * <code>optional string kind = 1;</code>
     */
    public com.google.protobuf.ByteString getKindBytes() {
      java.lang.Object ref = kind_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        kind_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object name_;
    /**
     *
     *
     * <pre>
     * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
     * </pre>
     *
     * <code>optional string name = 2;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int APIVERSION_FIELD_NUMBER = 3;
    private volatile java.lang.Object apiVersion_;
    /**
     *
     *
     * <pre>
     * API version of the referent
     * +optional
     * </pre>
     *
     * <code>optional string apiVersion = 3;</code>
     */
    public boolean hasApiVersion() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * API version of the referent
     * +optional
     * </pre>
     *
     * <code>optional string apiVersion = 3;</code>
     */
    public java.lang.String getApiVersion() {
      java.lang.Object ref = apiVersion_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          apiVersion_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * API version of the referent
     * +optional
     * </pre>
     *
     * <code>optional string apiVersion = 3;</code>
     */
    public com.google.protobuf.ByteString getApiVersionBytes() {
      java.lang.Object ref = apiVersion_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        apiVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, kind_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, apiVersion_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, kind_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, apiVersion_);
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
      if (!(obj
          instanceof io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference other =
          (io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference) obj;

      boolean result = true;
      result = result && (hasKind() == other.hasKind());
      if (hasKind()) {
        result = result && getKind().equals(other.getKind());
      }
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName().equals(other.getName());
      }
      result = result && (hasApiVersion() == other.hasApiVersion());
      if (hasApiVersion()) {
        result = result && getApiVersion().equals(other.getApiVersion());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasKind()) {
        hash = (37 * hash) + KIND_FIELD_NUMBER;
        hash = (53 * hash) + getKind().hashCode();
      }
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasApiVersion()) {
        hash = (37 * hash) + APIVERSION_FIELD_NUMBER;
        hash = (53 * hash) + getApiVersion().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
        parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * CrossVersionObjectReference contains enough information to let you identify the referred resource.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference)
        io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReferenceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_CrossVersionObjectReference_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_CrossVersionObjectReference_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference.class,
                io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        kind_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        apiVersion_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_CrossVersionObjectReference_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference build() {
        io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
          buildPartial() {
        io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference result =
            new io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.kind_ = kind_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.apiVersion_ = apiVersion_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference other) {
        if (other
            == io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
                .getDefaultInstance()) return this;
        if (other.hasKind()) {
          bitField0_ |= 0x00000001;
          kind_ = other.kind_;
          onChanged();
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000002;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasApiVersion()) {
          bitField0_ |= 0x00000004;
          apiVersion_ = other.apiVersion_;
          onChanged();
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
        io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object kind_ = "";
      /**
       *
       *
       * <pre>
       * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
       * </pre>
       *
       * <code>optional string kind = 1;</code>
       */
      public boolean hasKind() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
       * </pre>
       *
       * <code>optional string kind = 1;</code>
       */
      public java.lang.String getKind() {
        java.lang.Object ref = kind_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            kind_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
       * </pre>
       *
       * <code>optional string kind = 1;</code>
       */
      public com.google.protobuf.ByteString getKindBytes() {
        java.lang.Object ref = kind_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          kind_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
       * </pre>
       *
       * <code>optional string kind = 1;</code>
       */
      public Builder setKind(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        kind_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
       * </pre>
       *
       * <code>optional string kind = 1;</code>
       */
      public Builder clearKind() {
        bitField0_ = (bitField0_ & ~0x00000001);
        kind_ = getDefaultInstance().getKind();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
       * </pre>
       *
       * <code>optional string kind = 1;</code>
       */
      public Builder setKindBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        kind_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       *
       *
       * <pre>
       * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
       * </pre>
       *
       * <code>optional string name = 2;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
       * </pre>
       *
       * <code>optional string name = 2;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
       * </pre>
       *
       * <code>optional string name = 2;</code>
       */
      public com.google.protobuf.ByteString getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
       * </pre>
       *
       * <code>optional string name = 2;</code>
       */
      public Builder setName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
       * </pre>
       *
       * <code>optional string name = 2;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
       * </pre>
       *
       * <code>optional string name = 2;</code>
       */
      public Builder setNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object apiVersion_ = "";
      /**
       *
       *
       * <pre>
       * API version of the referent
       * +optional
       * </pre>
       *
       * <code>optional string apiVersion = 3;</code>
       */
      public boolean hasApiVersion() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * API version of the referent
       * +optional
       * </pre>
       *
       * <code>optional string apiVersion = 3;</code>
       */
      public java.lang.String getApiVersion() {
        java.lang.Object ref = apiVersion_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            apiVersion_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * API version of the referent
       * +optional
       * </pre>
       *
       * <code>optional string apiVersion = 3;</code>
       */
      public com.google.protobuf.ByteString getApiVersionBytes() {
        java.lang.Object ref = apiVersion_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          apiVersion_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * API version of the referent
       * +optional
       * </pre>
       *
       * <code>optional string apiVersion = 3;</code>
       */
      public Builder setApiVersion(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        apiVersion_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * API version of the referent
       * +optional
       * </pre>
       *
       * <code>optional string apiVersion = 3;</code>
       */
      public Builder clearApiVersion() {
        bitField0_ = (bitField0_ & ~0x00000004);
        apiVersion_ = getDefaultInstance().getApiVersion();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * API version of the referent
       * +optional
       * </pre>
       *
       * <code>optional string apiVersion = 3;</code>
       */
      public Builder setApiVersionBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        apiVersion_ = value;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference)
    private static final io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference();
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<CrossVersionObjectReference> PARSER =
        new com.google.protobuf.AbstractParser<CrossVersionObjectReference>() {
          @java.lang.Override
          public CrossVersionObjectReference parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new CrossVersionObjectReference(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<CrossVersionObjectReference> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CrossVersionObjectReference> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ExternalMetricSourceOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta2.ExternalMetricSource)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    boolean hasMetric();
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier getMetric();
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder getMetricOrBuilder();

    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    boolean hasTarget();
    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget getTarget();
    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder getTargetOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * ExternalMetricSource indicates how to scale on a metric not associated with
   * any Kubernetes object (for example length of queue in cloud
   * messaging service, or QPS from loadbalancer running outside of cluster).
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.ExternalMetricSource}
   */
  public static final class ExternalMetricSource extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta2.ExternalMetricSource)
      ExternalMetricSourceOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ExternalMetricSource.newBuilder() to construct.
    private ExternalMetricSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ExternalMetricSource() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ExternalMetricSource(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metric_.toBuilder();
                }
                metric_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metric_);
                  metric_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = target_.toBuilder();
                }
                target_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(target_);
                  target_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_ExternalMetricSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_ExternalMetricSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource.class,
              io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource.Builder.class);
    }

    private int bitField0_;
    public static final int METRIC_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier metric_;
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    public boolean hasMetric() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier getMetric() {
      return metric_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
          : metric_;
    }
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder
        getMetricOrBuilder() {
      return metric_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
          : metric_;
    }

    public static final int TARGET_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget target_;
    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    public boolean hasTarget() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget getTarget() {
      return target_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.getDefaultInstance()
          : target_;
    }
    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder
        getTargetOrBuilder() {
      return target_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.getDefaultInstance()
          : target_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetric());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getTarget());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetric());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getTarget());
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
      if (!(obj instanceof io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource other =
          (io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource) obj;

      boolean result = true;
      result = result && (hasMetric() == other.hasMetric());
      if (hasMetric()) {
        result = result && getMetric().equals(other.getMetric());
      }
      result = result && (hasTarget() == other.hasTarget());
      if (hasTarget()) {
        result = result && getTarget().equals(other.getTarget());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetric()) {
        hash = (37 * hash) + METRIC_FIELD_NUMBER;
        hash = (53 * hash) + getMetric().hashCode();
      }
      if (hasTarget()) {
        hash = (37 * hash) + TARGET_FIELD_NUMBER;
        hash = (53 * hash) + getTarget().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * ExternalMetricSource indicates how to scale on a metric not associated with
     * any Kubernetes object (for example length of queue in cloud
     * messaging service, or QPS from loadbalancer running outside of cluster).
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.ExternalMetricSource}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta2.ExternalMetricSource)
        io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSourceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_ExternalMetricSource_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_ExternalMetricSource_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource.class,
                io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetricFieldBuilder();
          getTargetFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metricBuilder_ == null) {
          metric_ = null;
        } else {
          metricBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (targetBuilder_ == null) {
          target_ = null;
        } else {
          targetBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_ExternalMetricSource_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource build() {
        io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource buildPartial() {
        io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource result =
            new io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metricBuilder_ == null) {
          result.metric_ = metric_;
        } else {
          result.metric_ = metricBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (targetBuilder_ == null) {
          result.target_ = target_;
        } else {
          result.target_ = targetBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource other) {
        if (other
            == io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource
                .getDefaultInstance()) return this;
        if (other.hasMetric()) {
          mergeMetric(other.getMetric());
        }
        if (other.hasTarget()) {
          mergeTarget(other.getTarget());
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
        io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier metric_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder>
          metricBuilder_;
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public boolean hasMetric() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier getMetric() {
        if (metricBuilder_ == null) {
          return metric_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
              : metric_;
        } else {
          return metricBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public Builder setMetric(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier value) {
        if (metricBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metric_ = value;
          onChanged();
        } else {
          metricBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public Builder setMetric(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder builderForValue) {
        if (metricBuilder_ == null) {
          metric_ = builderForValue.build();
          onChanged();
        } else {
          metricBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public Builder mergeMetric(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier value) {
        if (metricBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metric_ != null
              && metric_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier
                      .getDefaultInstance()) {
            metric_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.newBuilder(metric_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metric_ = value;
          }
          onChanged();
        } else {
          metricBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public Builder clearMetric() {
        if (metricBuilder_ == null) {
          metric_ = null;
          onChanged();
        } else {
          metricBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder
          getMetricBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetricFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder
          getMetricOrBuilder() {
        if (metricBuilder_ != null) {
          return metricBuilder_.getMessageOrBuilder();
        } else {
          return metric_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
              : metric_;
        }
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder>
          getMetricFieldBuilder() {
        if (metricBuilder_ == null) {
          metricBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder>(
                  getMetric(), getParentForChildren(), isClean());
          metric_ = null;
        }
        return metricBuilder_;
      }

      private io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget target_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder>
          targetBuilder_;
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public boolean hasTarget() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget getTarget() {
        if (targetBuilder_ == null) {
          return target_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.getDefaultInstance()
              : target_;
        } else {
          return targetBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public Builder setTarget(io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget value) {
        if (targetBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          target_ = value;
          onChanged();
        } else {
          targetBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public Builder setTarget(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder builderForValue) {
        if (targetBuilder_ == null) {
          target_ = builderForValue.build();
          onChanged();
        } else {
          targetBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public Builder mergeTarget(io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget value) {
        if (targetBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && target_ != null
              && target_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget
                      .getDefaultInstance()) {
            target_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.newBuilder(target_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            target_ = value;
          }
          onChanged();
        } else {
          targetBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public Builder clearTarget() {
        if (targetBuilder_ == null) {
          target_ = null;
          onChanged();
        } else {
          targetBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder getTargetBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getTargetFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder
          getTargetOrBuilder() {
        if (targetBuilder_ != null) {
          return targetBuilder_.getMessageOrBuilder();
        } else {
          return target_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.getDefaultInstance()
              : target_;
        }
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder>
          getTargetFieldBuilder() {
        if (targetBuilder_ == null) {
          targetBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder>(
                  getTarget(), getParentForChildren(), isClean());
          target_ = null;
        }
        return targetBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta2.ExternalMetricSource)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta2.ExternalMetricSource)
    private static final io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource();
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ExternalMetricSource> PARSER =
        new com.google.protobuf.AbstractParser<ExternalMetricSource>() {
          @java.lang.Override
          public ExternalMetricSource parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ExternalMetricSource(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ExternalMetricSource> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExternalMetricSource> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ExternalMetricStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta2.ExternalMetricStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    boolean hasMetric();
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier getMetric();
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder getMetricOrBuilder();

    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    boolean hasCurrent();
    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus getCurrent();
    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder getCurrentOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * ExternalMetricStatus indicates the current value of a global metric
   * not associated with any Kubernetes object.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.ExternalMetricStatus}
   */
  public static final class ExternalMetricStatus extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta2.ExternalMetricStatus)
      ExternalMetricStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ExternalMetricStatus.newBuilder() to construct.
    private ExternalMetricStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ExternalMetricStatus() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ExternalMetricStatus(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metric_.toBuilder();
                }
                metric_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metric_);
                  metric_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = current_.toBuilder();
                }
                current_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(current_);
                  current_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_ExternalMetricStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_ExternalMetricStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus.class,
              io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus.Builder.class);
    }

    private int bitField0_;
    public static final int METRIC_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier metric_;
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    public boolean hasMetric() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier getMetric() {
      return metric_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
          : metric_;
    }
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder
        getMetricOrBuilder() {
      return metric_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
          : metric_;
    }

    public static final int CURRENT_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus current_;
    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    public boolean hasCurrent() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus getCurrent() {
      return current_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.getDefaultInstance()
          : current_;
    }
    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder
        getCurrentOrBuilder() {
      return current_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.getDefaultInstance()
          : current_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetric());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getCurrent());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetric());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getCurrent());
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
      if (!(obj instanceof io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus other =
          (io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus) obj;

      boolean result = true;
      result = result && (hasMetric() == other.hasMetric());
      if (hasMetric()) {
        result = result && getMetric().equals(other.getMetric());
      }
      result = result && (hasCurrent() == other.hasCurrent());
      if (hasCurrent()) {
        result = result && getCurrent().equals(other.getCurrent());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetric()) {
        hash = (37 * hash) + METRIC_FIELD_NUMBER;
        hash = (53 * hash) + getMetric().hashCode();
      }
      if (hasCurrent()) {
        hash = (37 * hash) + CURRENT_FIELD_NUMBER;
        hash = (53 * hash) + getCurrent().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * ExternalMetricStatus indicates the current value of a global metric
     * not associated with any Kubernetes object.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.ExternalMetricStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta2.ExternalMetricStatus)
        io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_ExternalMetricStatus_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_ExternalMetricStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus.class,
                io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetricFieldBuilder();
          getCurrentFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metricBuilder_ == null) {
          metric_ = null;
        } else {
          metricBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (currentBuilder_ == null) {
          current_ = null;
        } else {
          currentBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_ExternalMetricStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus build() {
        io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus buildPartial() {
        io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus result =
            new io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metricBuilder_ == null) {
          result.metric_ = metric_;
        } else {
          result.metric_ = metricBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (currentBuilder_ == null) {
          result.current_ = current_;
        } else {
          result.current_ = currentBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus other) {
        if (other
            == io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus
                .getDefaultInstance()) return this;
        if (other.hasMetric()) {
          mergeMetric(other.getMetric());
        }
        if (other.hasCurrent()) {
          mergeCurrent(other.getCurrent());
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
        io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier metric_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder>
          metricBuilder_;
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public boolean hasMetric() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier getMetric() {
        if (metricBuilder_ == null) {
          return metric_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
              : metric_;
        } else {
          return metricBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public Builder setMetric(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier value) {
        if (metricBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metric_ = value;
          onChanged();
        } else {
          metricBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public Builder setMetric(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder builderForValue) {
        if (metricBuilder_ == null) {
          metric_ = builderForValue.build();
          onChanged();
        } else {
          metricBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public Builder mergeMetric(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier value) {
        if (metricBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metric_ != null
              && metric_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier
                      .getDefaultInstance()) {
            metric_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.newBuilder(metric_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metric_ = value;
          }
          onChanged();
        } else {
          metricBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public Builder clearMetric() {
        if (metricBuilder_ == null) {
          metric_ = null;
          onChanged();
        } else {
          metricBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder
          getMetricBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetricFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder
          getMetricOrBuilder() {
        if (metricBuilder_ != null) {
          return metricBuilder_.getMessageOrBuilder();
        } else {
          return metric_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
              : metric_;
        }
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder>
          getMetricFieldBuilder() {
        if (metricBuilder_ == null) {
          metricBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder>(
                  getMetric(), getParentForChildren(), isClean());
          metric_ = null;
        }
        return metricBuilder_;
      }

      private io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus current_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder>
          currentBuilder_;
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public boolean hasCurrent() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus getCurrent() {
        if (currentBuilder_ == null) {
          return current_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.getDefaultInstance()
              : current_;
        } else {
          return currentBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public Builder setCurrent(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus value) {
        if (currentBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          current_ = value;
          onChanged();
        } else {
          currentBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public Builder setCurrent(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder builderForValue) {
        if (currentBuilder_ == null) {
          current_ = builderForValue.build();
          onChanged();
        } else {
          currentBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public Builder mergeCurrent(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus value) {
        if (currentBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && current_ != null
              && current_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus
                      .getDefaultInstance()) {
            current_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.newBuilder(current_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            current_ = value;
          }
          onChanged();
        } else {
          currentBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public Builder clearCurrent() {
        if (currentBuilder_ == null) {
          current_ = null;
          onChanged();
        } else {
          currentBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder
          getCurrentBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getCurrentFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder
          getCurrentOrBuilder() {
        if (currentBuilder_ != null) {
          return currentBuilder_.getMessageOrBuilder();
        } else {
          return current_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.getDefaultInstance()
              : current_;
        }
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder>
          getCurrentFieldBuilder() {
        if (currentBuilder_ == null) {
          currentBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder>(
                  getCurrent(), getParentForChildren(), isClean());
          current_ = null;
        }
        return currentBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta2.ExternalMetricStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta2.ExternalMetricStatus)
    private static final io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus();
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ExternalMetricStatus> PARSER =
        new com.google.protobuf.AbstractParser<ExternalMetricStatus>() {
          @java.lang.Override
          public ExternalMetricStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ExternalMetricStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ExternalMetricStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExternalMetricStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface HorizontalPodAutoscalerOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * metadata is the standard object metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * metadata is the standard object metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMeta getMetadata();
    /**
     *
     *
     * <pre>
     * metadata is the standard object metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * spec is the specification for the behaviour of the autoscaler.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerSpec spec = 2;
     * </code>
     */
    boolean hasSpec();
    /**
     *
     *
     * <pre>
     * spec is the specification for the behaviour of the autoscaler.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerSpec spec = 2;
     * </code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec getSpec();
    /**
     *
     *
     * <pre>
     * spec is the specification for the behaviour of the autoscaler.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerSpec spec = 2;
     * </code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpecOrBuilder
        getSpecOrBuilder();

    /**
     *
     *
     * <pre>
     * status is the current information about the autoscaler.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerStatus status = 3;
     * </code>
     */
    boolean hasStatus();
    /**
     *
     *
     * <pre>
     * status is the current information about the autoscaler.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerStatus status = 3;
     * </code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus getStatus();
    /**
     *
     *
     * <pre>
     * status is the current information about the autoscaler.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerStatus status = 3;
     * </code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatusOrBuilder
        getStatusOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * HorizontalPodAutoscaler is the configuration for a horizontal pod
   * autoscaler, which automatically manages the replica count of any resource
   * implementing the scale subresource based on the metrics specified.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler}
   */
  public static final class HorizontalPodAutoscaler extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler)
      HorizontalPodAutoscalerOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use HorizontalPodAutoscaler.newBuilder() to construct.
    private HorizontalPodAutoscaler(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private HorizontalPodAutoscaler() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private HorizontalPodAutoscaler(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10:
              {
                io.kubernetes.client.proto.Meta.ObjectMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ObjectMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = spec_.toBuilder();
                }
                spec_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(spec_);
                  spec_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = status_.toBuilder();
                }
                status_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(status_);
                  status_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscaler_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscaler_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler.class,
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * metadata is the standard object metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * metadata is the standard object metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * metadata is the standard object metadata.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int SPEC_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec spec_;
    /**
     *
     *
     * <pre>
     * spec is the specification for the behaviour of the autoscaler.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerSpec spec = 2;
     * </code>
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * spec is the specification for the behaviour of the autoscaler.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerSpec spec = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec getSpec() {
      return spec_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
              .getDefaultInstance()
          : spec_;
    }
    /**
     *
     *
     * <pre>
     * spec is the specification for the behaviour of the autoscaler.
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerSpec spec = 2;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpecOrBuilder
        getSpecOrBuilder() {
      return spec_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
              .getDefaultInstance()
          : spec_;
    }

    public static final int STATUS_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus status_;
    /**
     *
     *
     * <pre>
     * status is the current information about the autoscaler.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerStatus status = 3;
     * </code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * status is the current information about the autoscaler.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerStatus status = 3;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus getStatus() {
      return status_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
              .getDefaultInstance()
          : status_;
    }
    /**
     *
     *
     * <pre>
     * status is the current information about the autoscaler.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerStatus status = 3;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatusOrBuilder
        getStatusOrBuilder() {
      return status_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
              .getDefaultInstance()
          : status_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getSpec());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getStatus());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSpec());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getStatus());
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
      if (!(obj instanceof io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler other =
          (io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && (hasSpec() == other.hasSpec());
      if (hasSpec()) {
        result = result && getSpec().equals(other.getSpec());
      }
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result && getStatus().equals(other.getStatus());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (hasSpec()) {
        hash = (37 * hash) + SPEC_FIELD_NUMBER;
        hash = (53 * hash) + getSpec().hashCode();
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * HorizontalPodAutoscaler is the configuration for a horizontal pod
     * autoscaler, which automatically manages the replica count of any resource
     * implementing the scale subresource based on the metrics specified.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler)
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscaler_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscaler_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler.class,
                io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getSpecFieldBuilder();
          getStatusFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (specBuilder_ == null) {
          spec_ = null;
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (statusBuilder_ == null) {
          status_ = null;
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscaler_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler build() {
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler buildPartial() {
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler result =
            new io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (specBuilder_ == null) {
          result.spec_ = spec_;
        } else {
          result.spec_ = specBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (statusBuilder_ == null) {
          result.status_ = status_;
        } else {
          result.status_ = statusBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler other) {
        if (other
            == io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler
                .getDefaultInstance()) return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (other.hasSpec()) {
          mergeSpec(other.getSpec());
        }
        if (other.hasStatus()) {
          mergeStatus(other.getStatus());
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
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ObjectMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * metadata is the standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(
          io.kubernetes.client.proto.Meta.ObjectMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ObjectMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard object metadata.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ObjectMeta,
                  io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
                  io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec spec_ =
          null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec,
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpecOrBuilder>
          specBuilder_;
      /**
       *
       *
       * <pre>
       * spec is the specification for the behaviour of the autoscaler.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerSpec spec = 2;
       * </code>
       */
      public boolean hasSpec() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * spec is the specification for the behaviour of the autoscaler.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerSpec spec = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec getSpec() {
        if (specBuilder_ == null) {
          return spec_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
                  .getDefaultInstance()
              : spec_;
        } else {
          return specBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * spec is the specification for the behaviour of the autoscaler.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerSpec spec = 2;
       * </code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec value) {
        if (specBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          spec_ = value;
          onChanged();
        } else {
          specBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * spec is the specification for the behaviour of the autoscaler.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerSpec spec = 2;
       * </code>
       */
      public Builder setSpec(
          io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec.Builder
              builderForValue) {
        if (specBuilder_ == null) {
          spec_ = builderForValue.build();
          onChanged();
        } else {
          specBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * spec is the specification for the behaviour of the autoscaler.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerSpec spec = 2;
       * </code>
       */
      public Builder mergeSpec(
          io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec value) {
        if (specBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && spec_ != null
              && spec_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
                      .getDefaultInstance()) {
            spec_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
                    .newBuilder(spec_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            spec_ = value;
          }
          onChanged();
        } else {
          specBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * spec is the specification for the behaviour of the autoscaler.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerSpec spec = 2;
       * </code>
       */
      public Builder clearSpec() {
        if (specBuilder_ == null) {
          spec_ = null;
          onChanged();
        } else {
          specBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * spec is the specification for the behaviour of the autoscaler.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerSpec spec = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec.Builder
          getSpecBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSpecFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * spec is the specification for the behaviour of the autoscaler.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerSpec spec = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpecOrBuilder
          getSpecOrBuilder() {
        if (specBuilder_ != null) {
          return specBuilder_.getMessageOrBuilder();
        } else {
          return spec_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
                  .getDefaultInstance()
              : spec_;
        }
      }
      /**
       *
       *
       * <pre>
       * spec is the specification for the behaviour of the autoscaler.
       * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerSpec spec = 2;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec,
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpecOrBuilder>
          getSpecFieldBuilder() {
        if (specBuilder_ == null) {
          specBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec,
                  io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling
                      .HorizontalPodAutoscalerSpecOrBuilder>(
                  getSpec(), getParentForChildren(), isClean());
          spec_ = null;
        }
        return specBuilder_;
      }

      private io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus status_ =
          null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus,
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatusOrBuilder>
          statusBuilder_;
      /**
       *
       *
       * <pre>
       * status is the current information about the autoscaler.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerStatus status = 3;
       * </code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * status is the current information about the autoscaler.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
          getStatus() {
        if (statusBuilder_ == null) {
          return status_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
                  .getDefaultInstance()
              : status_;
        } else {
          return statusBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * status is the current information about the autoscaler.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerStatus status = 3;
       * </code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus value) {
        if (statusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          status_ = value;
          onChanged();
        } else {
          statusBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * status is the current information about the autoscaler.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerStatus status = 3;
       * </code>
       */
      public Builder setStatus(
          io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus.Builder
              builderForValue) {
        if (statusBuilder_ == null) {
          status_ = builderForValue.build();
          onChanged();
        } else {
          statusBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * status is the current information about the autoscaler.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerStatus status = 3;
       * </code>
       */
      public Builder mergeStatus(
          io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus value) {
        if (statusBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && status_ != null
              && status_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
                      .getDefaultInstance()) {
            status_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
                    .newBuilder(status_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            status_ = value;
          }
          onChanged();
        } else {
          statusBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * status is the current information about the autoscaler.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerStatus status = 3;
       * </code>
       */
      public Builder clearStatus() {
        if (statusBuilder_ == null) {
          status_ = null;
          onChanged();
        } else {
          statusBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * status is the current information about the autoscaler.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus.Builder
          getStatusBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getStatusFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * status is the current information about the autoscaler.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerStatus status = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatusOrBuilder
          getStatusOrBuilder() {
        if (statusBuilder_ != null) {
          return statusBuilder_.getMessageOrBuilder();
        } else {
          return status_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
                  .getDefaultInstance()
              : status_;
        }
      }
      /**
       *
       *
       * <pre>
       * status is the current information about the autoscaler.
       * +optional
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerStatus status = 3;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus,
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatusOrBuilder>
          getStatusFieldBuilder() {
        if (statusBuilder_ == null) {
          statusBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus,
                  io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
                      .Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling
                      .HorizontalPodAutoscalerStatusOrBuilder>(
                  getStatus(), getParentForChildren(), isClean());
          status_ = null;
        }
        return statusBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler)
    private static final io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler();
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<HorizontalPodAutoscaler> PARSER =
        new com.google.protobuf.AbstractParser<HorizontalPodAutoscaler>() {
          @java.lang.Override
          public HorizontalPodAutoscaler parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new HorizontalPodAutoscaler(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<HorizontalPodAutoscaler> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HorizontalPodAutoscaler> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface HorizontalPodAutoscalerConditionOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * type describes the current condition
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    boolean hasType();
    /**
     *
     *
     * <pre>
     * type describes the current condition
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    java.lang.String getType();
    /**
     *
     *
     * <pre>
     * type describes the current condition
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    com.google.protobuf.ByteString getTypeBytes();

    /**
     *
     *
     * <pre>
     * status is the status of the condition (True, False, Unknown)
     * </pre>
     *
     * <code>optional string status = 2;</code>
     */
    boolean hasStatus();
    /**
     *
     *
     * <pre>
     * status is the status of the condition (True, False, Unknown)
     * </pre>
     *
     * <code>optional string status = 2;</code>
     */
    java.lang.String getStatus();
    /**
     *
     *
     * <pre>
     * status is the status of the condition (True, False, Unknown)
     * </pre>
     *
     * <code>optional string status = 2;</code>
     */
    com.google.protobuf.ByteString getStatusBytes();

    /**
     *
     *
     * <pre>
     * lastTransitionTime is the last time the condition transitioned from
     * one status to another
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;</code>
     */
    boolean hasLastTransitionTime();
    /**
     *
     *
     * <pre>
     * lastTransitionTime is the last time the condition transitioned from
     * one status to another
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;</code>
     */
    io.kubernetes.client.proto.Meta.Time getLastTransitionTime();
    /**
     *
     *
     * <pre>
     * lastTransitionTime is the last time the condition transitioned from
     * one status to another
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;</code>
     */
    io.kubernetes.client.proto.Meta.TimeOrBuilder getLastTransitionTimeOrBuilder();

    /**
     *
     *
     * <pre>
     * reason is the reason for the condition's last transition.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 4;</code>
     */
    boolean hasReason();
    /**
     *
     *
     * <pre>
     * reason is the reason for the condition's last transition.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 4;</code>
     */
    java.lang.String getReason();
    /**
     *
     *
     * <pre>
     * reason is the reason for the condition's last transition.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 4;</code>
     */
    com.google.protobuf.ByteString getReasonBytes();

    /**
     *
     *
     * <pre>
     * message is a human-readable explanation containing details about
     * the transition
     * +optional
     * </pre>
     *
     * <code>optional string message = 5;</code>
     */
    boolean hasMessage();
    /**
     *
     *
     * <pre>
     * message is a human-readable explanation containing details about
     * the transition
     * +optional
     * </pre>
     *
     * <code>optional string message = 5;</code>
     */
    java.lang.String getMessage();
    /**
     *
     *
     * <pre>
     * message is a human-readable explanation containing details about
     * the transition
     * +optional
     * </pre>
     *
     * <code>optional string message = 5;</code>
     */
    com.google.protobuf.ByteString getMessageBytes();
  }
  /**
   *
   *
   * <pre>
   * HorizontalPodAutoscalerCondition describes the state of
   * a HorizontalPodAutoscaler at a certain point.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition}
   */
  public static final class HorizontalPodAutoscalerCondition
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition)
      HorizontalPodAutoscalerConditionOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use HorizontalPodAutoscalerCondition.newBuilder() to construct.
    private HorizontalPodAutoscalerCondition(
        com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private HorizontalPodAutoscalerCondition() {
      type_ = "";
      status_ = "";
      reason_ = "";
      message_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private HorizontalPodAutoscalerCondition(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                type_ = bs;
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                status_ = bs;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.Meta.Time.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = lastTransitionTime_.toBuilder();
                }
                lastTransitionTime_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.Time.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(lastTransitionTime_);
                  lastTransitionTime_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            case 34:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000008;
                reason_ = bs;
                break;
              }
            case 42:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000010;
                message_ = bs;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerCondition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerCondition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition.class,
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition.Builder
                  .class);
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private volatile java.lang.Object type_;
    /**
     *
     *
     * <pre>
     * type describes the current condition
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * type describes the current condition
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          type_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * type describes the current condition
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public com.google.protobuf.ByteString getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STATUS_FIELD_NUMBER = 2;
    private volatile java.lang.Object status_;
    /**
     *
     *
     * <pre>
     * status is the status of the condition (True, False, Unknown)
     * </pre>
     *
     * <code>optional string status = 2;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * status is the status of the condition (True, False, Unknown)
     * </pre>
     *
     * <code>optional string status = 2;</code>
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          status_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * status is the status of the condition (True, False, Unknown)
     * </pre>
     *
     * <code>optional string status = 2;</code>
     */
    public com.google.protobuf.ByteString getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LASTTRANSITIONTIME_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.Meta.Time lastTransitionTime_;
    /**
     *
     *
     * <pre>
     * lastTransitionTime is the last time the condition transitioned from
     * one status to another
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;</code>
     */
    public boolean hasLastTransitionTime() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * lastTransitionTime is the last time the condition transitioned from
     * one status to another
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;</code>
     */
    public io.kubernetes.client.proto.Meta.Time getLastTransitionTime() {
      return lastTransitionTime_ == null
          ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
          : lastTransitionTime_;
    }
    /**
     *
     *
     * <pre>
     * lastTransitionTime is the last time the condition transitioned from
     * one status to another
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;</code>
     */
    public io.kubernetes.client.proto.Meta.TimeOrBuilder getLastTransitionTimeOrBuilder() {
      return lastTransitionTime_ == null
          ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
          : lastTransitionTime_;
    }

    public static final int REASON_FIELD_NUMBER = 4;
    private volatile java.lang.Object reason_;
    /**
     *
     *
     * <pre>
     * reason is the reason for the condition's last transition.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 4;</code>
     */
    public boolean hasReason() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * reason is the reason for the condition's last transition.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 4;</code>
     */
    public java.lang.String getReason() {
      java.lang.Object ref = reason_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          reason_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * reason is the reason for the condition's last transition.
     * +optional
     * </pre>
     *
     * <code>optional string reason = 4;</code>
     */
    public com.google.protobuf.ByteString getReasonBytes() {
      java.lang.Object ref = reason_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        reason_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MESSAGE_FIELD_NUMBER = 5;
    private volatile java.lang.Object message_;
    /**
     *
     *
     * <pre>
     * message is a human-readable explanation containing details about
     * the transition
     * +optional
     * </pre>
     *
     * <code>optional string message = 5;</code>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * message is a human-readable explanation containing details about
     * the transition
     * +optional
     * </pre>
     *
     * <code>optional string message = 5;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          message_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * message is a human-readable explanation containing details about
     * the transition
     * +optional
     * </pre>
     *
     * <code>optional string message = 5;</code>
     */
    public com.google.protobuf.ByteString getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, status_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getLastTransitionTime());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, reason_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, message_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, status_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeMessageSize(3, getLastTransitionTime());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, reason_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, message_);
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
      if (!(obj
          instanceof
          io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition other =
          (io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition) obj;

      boolean result = true;
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && getType().equals(other.getType());
      }
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result && getStatus().equals(other.getStatus());
      }
      result = result && (hasLastTransitionTime() == other.hasLastTransitionTime());
      if (hasLastTransitionTime()) {
        result = result && getLastTransitionTime().equals(other.getLastTransitionTime());
      }
      result = result && (hasReason() == other.hasReason());
      if (hasReason()) {
        result = result && getReason().equals(other.getReason());
      }
      result = result && (hasMessage() == other.hasMessage());
      if (hasMessage()) {
        result = result && getMessage().equals(other.getMessage());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType().hashCode();
      }
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + getStatus().hashCode();
      }
      if (hasLastTransitionTime()) {
        hash = (37 * hash) + LASTTRANSITIONTIME_FIELD_NUMBER;
        hash = (53 * hash) + getLastTransitionTime().hashCode();
      }
      if (hasReason()) {
        hash = (37 * hash) + REASON_FIELD_NUMBER;
        hash = (53 * hash) + getReason().hashCode();
      }
      if (hasMessage()) {
        hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getMessage().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
        parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * HorizontalPodAutoscalerCondition describes the state of
     * a HorizontalPodAutoscaler at a certain point.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition)
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerConditionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerCondition_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerCondition_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
                    .class,
                io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
                    .Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getLastTransitionTimeFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (lastTransitionTimeBuilder_ == null) {
          lastTransitionTime_ = null;
        } else {
          lastTransitionTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        reason_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerCondition_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
          build() {
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
          buildPartial() {
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition result =
            new io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition(
                this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.status_ = status_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (lastTransitionTimeBuilder_ == null) {
          result.lastTransitionTime_ = lastTransitionTime_;
        } else {
          result.lastTransitionTime_ = lastTransitionTimeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.reason_ = reason_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.message_ = message_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof
            io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition)
                  other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition other) {
        if (other
            == io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
                .getDefaultInstance()) return this;
        if (other.hasType()) {
          bitField0_ |= 0x00000001;
          type_ = other.type_;
          onChanged();
        }
        if (other.hasStatus()) {
          bitField0_ |= 0x00000002;
          status_ = other.status_;
          onChanged();
        }
        if (other.hasLastTransitionTime()) {
          mergeLastTransitionTime(other.getLastTransitionTime());
        }
        if (other.hasReason()) {
          bitField0_ |= 0x00000008;
          reason_ = other.reason_;
          onChanged();
        }
        if (other.hasMessage()) {
          bitField0_ |= 0x00000010;
          message_ = other.message_;
          onChanged();
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
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
            parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object type_ = "";
      /**
       *
       *
       * <pre>
       * type describes the current condition
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * type describes the current condition
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            type_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * type describes the current condition
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public com.google.protobuf.ByteString getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * type describes the current condition
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder setType(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * type describes the current condition
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * type describes the current condition
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder setTypeBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object status_ = "";
      /**
       *
       *
       * <pre>
       * status is the status of the condition (True, False, Unknown)
       * </pre>
       *
       * <code>optional string status = 2;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * status is the status of the condition (True, False, Unknown)
       * </pre>
       *
       * <code>optional string status = 2;</code>
       */
      public java.lang.String getStatus() {
        java.lang.Object ref = status_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            status_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * status is the status of the condition (True, False, Unknown)
       * </pre>
       *
       * <code>optional string status = 2;</code>
       */
      public com.google.protobuf.ByteString getStatusBytes() {
        java.lang.Object ref = status_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          status_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * status is the status of the condition (True, False, Unknown)
       * </pre>
       *
       * <code>optional string status = 2;</code>
       */
      public Builder setStatus(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * status is the status of the condition (True, False, Unknown)
       * </pre>
       *
       * <code>optional string status = 2;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000002);
        status_ = getDefaultInstance().getStatus();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * status is the status of the condition (True, False, Unknown)
       * </pre>
       *
       * <code>optional string status = 2;</code>
       */
      public Builder setStatusBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        status_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.Meta.Time lastTransitionTime_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          lastTransitionTimeBuilder_;
      /**
       *
       *
       * <pre>
       * lastTransitionTime is the last time the condition transitioned from
       * one status to another
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;
       * </code>
       */
      public boolean hasLastTransitionTime() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * lastTransitionTime is the last time the condition transitioned from
       * one status to another
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.Time getLastTransitionTime() {
        if (lastTransitionTimeBuilder_ == null) {
          return lastTransitionTime_ == null
              ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
              : lastTransitionTime_;
        } else {
          return lastTransitionTimeBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * lastTransitionTime is the last time the condition transitioned from
       * one status to another
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;
       * </code>
       */
      public Builder setLastTransitionTime(io.kubernetes.client.proto.Meta.Time value) {
        if (lastTransitionTimeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lastTransitionTime_ = value;
          onChanged();
        } else {
          lastTransitionTimeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * lastTransitionTime is the last time the condition transitioned from
       * one status to another
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;
       * </code>
       */
      public Builder setLastTransitionTime(
          io.kubernetes.client.proto.Meta.Time.Builder builderForValue) {
        if (lastTransitionTimeBuilder_ == null) {
          lastTransitionTime_ = builderForValue.build();
          onChanged();
        } else {
          lastTransitionTimeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * lastTransitionTime is the last time the condition transitioned from
       * one status to another
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;
       * </code>
       */
      public Builder mergeLastTransitionTime(io.kubernetes.client.proto.Meta.Time value) {
        if (lastTransitionTimeBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && lastTransitionTime_ != null
              && lastTransitionTime_ != io.kubernetes.client.proto.Meta.Time.getDefaultInstance()) {
            lastTransitionTime_ =
                io.kubernetes.client.proto.Meta.Time.newBuilder(lastTransitionTime_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            lastTransitionTime_ = value;
          }
          onChanged();
        } else {
          lastTransitionTimeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * lastTransitionTime is the last time the condition transitioned from
       * one status to another
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;
       * </code>
       */
      public Builder clearLastTransitionTime() {
        if (lastTransitionTimeBuilder_ == null) {
          lastTransitionTime_ = null;
          onChanged();
        } else {
          lastTransitionTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * lastTransitionTime is the last time the condition transitioned from
       * one status to another
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.Time.Builder getLastTransitionTimeBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getLastTransitionTimeFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * lastTransitionTime is the last time the condition transitioned from
       * one status to another
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.TimeOrBuilder getLastTransitionTimeOrBuilder() {
        if (lastTransitionTimeBuilder_ != null) {
          return lastTransitionTimeBuilder_.getMessageOrBuilder();
        } else {
          return lastTransitionTime_ == null
              ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
              : lastTransitionTime_;
        }
      }
      /**
       *
       *
       * <pre>
       * lastTransitionTime is the last time the condition transitioned from
       * one status to another
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastTransitionTime = 3;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          getLastTransitionTimeFieldBuilder() {
        if (lastTransitionTimeBuilder_ == null) {
          lastTransitionTimeBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.Time,
                  io.kubernetes.client.proto.Meta.Time.Builder,
                  io.kubernetes.client.proto.Meta.TimeOrBuilder>(
                  getLastTransitionTime(), getParentForChildren(), isClean());
          lastTransitionTime_ = null;
        }
        return lastTransitionTimeBuilder_;
      }

      private java.lang.Object reason_ = "";
      /**
       *
       *
       * <pre>
       * reason is the reason for the condition's last transition.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 4;</code>
       */
      public boolean hasReason() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * reason is the reason for the condition's last transition.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 4;</code>
       */
      public java.lang.String getReason() {
        java.lang.Object ref = reason_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            reason_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * reason is the reason for the condition's last transition.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 4;</code>
       */
      public com.google.protobuf.ByteString getReasonBytes() {
        java.lang.Object ref = reason_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          reason_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * reason is the reason for the condition's last transition.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 4;</code>
       */
      public Builder setReason(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * reason is the reason for the condition's last transition.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 4;</code>
       */
      public Builder clearReason() {
        bitField0_ = (bitField0_ & ~0x00000008);
        reason_ = getDefaultInstance().getReason();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * reason is the reason for the condition's last transition.
       * +optional
       * </pre>
       *
       * <code>optional string reason = 4;</code>
       */
      public Builder setReasonBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        reason_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object message_ = "";
      /**
       *
       *
       * <pre>
       * message is a human-readable explanation containing details about
       * the transition
       * +optional
       * </pre>
       *
       * <code>optional string message = 5;</code>
       */
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       *
       *
       * <pre>
       * message is a human-readable explanation containing details about
       * the transition
       * +optional
       * </pre>
       *
       * <code>optional string message = 5;</code>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            message_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * message is a human-readable explanation containing details about
       * the transition
       * +optional
       * </pre>
       *
       * <code>optional string message = 5;</code>
       */
      public com.google.protobuf.ByteString getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * message is a human-readable explanation containing details about
       * the transition
       * +optional
       * </pre>
       *
       * <code>optional string message = 5;</code>
       */
      public Builder setMessage(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        message_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * message is a human-readable explanation containing details about
       * the transition
       * +optional
       * </pre>
       *
       * <code>optional string message = 5;</code>
       */
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000010);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * message is a human-readable explanation containing details about
       * the transition
       * +optional
       * </pre>
       *
       * <code>optional string message = 5;</code>
       */
      public Builder setMessageBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        message_ = value;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition)
    private static final io.kubernetes.client.proto.V2beta2Autoscaling
            .HorizontalPodAutoscalerCondition
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition();
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<HorizontalPodAutoscalerCondition> PARSER =
        new com.google.protobuf.AbstractParser<HorizontalPodAutoscalerCondition>() {
          @java.lang.Override
          public HorizontalPodAutoscalerCondition parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new HorizontalPodAutoscalerCondition(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<HorizontalPodAutoscalerCondition> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HorizontalPodAutoscalerCondition> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface HorizontalPodAutoscalerListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerList)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * metadata is the standard list metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * metadata is the standard list metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMeta getMetadata();
    /**
     *
     *
     * <pre>
     * metadata is the standard list metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * items is the list of horizontal pod autoscaler objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler>
        getItemsList();
    /**
     *
     *
     * <pre>
     * items is the list of horizontal pod autoscaler objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler getItems(int index);
    /**
     *
     *
     * <pre>
     * items is the list of horizontal pod autoscaler objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;</code>
     */
    int getItemsCount();
    /**
     *
     *
     * <pre>
     * items is the list of horizontal pod autoscaler objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;</code>
     */
    java.util.List<
            ? extends
                io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerOrBuilder>
        getItemsOrBuilderList();
    /**
     *
     *
     * <pre>
     * items is the list of horizontal pod autoscaler objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerOrBuilder
        getItemsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * HorizontalPodAutoscalerList is a list of horizontal pod autoscaler objects.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerList}
   */
  public static final class HorizontalPodAutoscalerList
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerList)
      HorizontalPodAutoscalerListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use HorizontalPodAutoscalerList.newBuilder() to construct.
    private HorizontalPodAutoscalerList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private HorizontalPodAutoscalerList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private HorizontalPodAutoscalerList(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10:
              {
                io.kubernetes.client.proto.Meta.ListMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ListMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  items_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler
                            .PARSER,
                        extensionRegistry));
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = java.util.Collections.unmodifiableList(items_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList.class,
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList.Builder
                  .class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ListMeta metadata_;
    /**
     *
     *
     * <pre>
     * metadata is the standard list metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * metadata is the standard list metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * metadata is the standard list metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int ITEMS_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler>
        items_;
    /**
     *
     *
     * <pre>
     * items is the list of horizontal pod autoscaler objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler>
        getItemsList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * items is the list of horizontal pod autoscaler objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;</code>
     */
    public java.util.List<
            ? extends
                io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * items is the list of horizontal pod autoscaler objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;</code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * items is the list of horizontal pod autoscaler objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler getItems(
        int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * items is the list of horizontal pod autoscaler objects.
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerOrBuilder
        getItemsOrBuilder(int index) {
      return items_.get(index);
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        output.writeMessage(2, items_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, items_.get(i));
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
      if (!(obj
          instanceof io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList other =
          (io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && getItemsList().equals(other.getItemsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (getItemsCount() > 0) {
        hash = (37 * hash) + ITEMS_FIELD_NUMBER;
        hash = (53 * hash) + getItemsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList
        parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * HorizontalPodAutoscalerList is a list of horizontal pod autoscaler objects.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerList)
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList.class,
                io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getItemsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerList_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList build() {
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList
          buildPartial() {
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList result =
            new io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (itemsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            items_ = java.util.Collections.unmodifiableList(items_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.items_ = items_;
        } else {
          result.items_ = itemsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList other) {
        if (other
            == io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList
                .getDefaultInstance()) return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (itemsBuilder_ == null) {
          if (!other.items_.isEmpty()) {
            if (items_.isEmpty()) {
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureItemsIsMutable();
              items_.addAll(other.items_);
            }
            onChanged();
          }
        } else {
          if (!other.items_.isEmpty()) {
            if (itemsBuilder_.isEmpty()) {
              itemsBuilder_.dispose();
              itemsBuilder_ = null;
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
              itemsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getItemsFieldBuilder()
                      : null;
            } else {
              itemsBuilder_.addAllMessages(other.items_);
            }
          }
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
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ListMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * metadata is the standard list metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard list metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard list metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard list metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard list metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ListMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard list metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard list metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard list metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * metadata is the standard list metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ListMeta,
                  io.kubernetes.client.proto.Meta.ListMeta.Builder,
                  io.kubernetes.client.proto.Meta.ListMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler>
          items_ = java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ =
              new java.util.ArrayList<
                  io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler>(items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler,
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerOrBuilder>
          itemsBuilder_;

      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public java.util.List<io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler>
          getItemsList() {
        if (itemsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(items_);
        } else {
          return itemsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public int getItemsCount() {
        if (itemsBuilder_ == null) {
          return items_.size();
        } else {
          return itemsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler getItems(
          int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public Builder setItems(
          int index, io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.set(index, value);
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public Builder setItems(
          int index,
          io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler.Builder
              builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public Builder addItems(
          int index, io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(index, value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler.Builder
              builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public Builder addItems(
          int index,
          io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler.Builder
              builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public Builder addAllItems(
          java.lang.Iterable<
                  ? extends io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler>
              values) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, items_);
          onChanged();
        } else {
          itemsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public Builder clearItems() {
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public Builder removeItems(int index) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.remove(index);
          onChanged();
        } else {
          itemsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler.Builder
          getItemsBuilder(int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerOrBuilder
          getItemsOrBuilder(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public java.util.List<
              ? extends
                  io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerOrBuilder>
          getItemsOrBuilderList() {
        if (itemsBuilder_ != null) {
          return itemsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(items_);
        }
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler.Builder
          addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler.Builder
          addItemsBuilder(int index) {
        return getItemsFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * items is the list of horizontal pod autoscaler objects.
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscaler items = 2;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler.Builder>
          getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler,
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler,
                  io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscaler.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerOrBuilder>(
                  items_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          items_ = null;
        }
        return itemsBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerList)
    private static final io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList();
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<HorizontalPodAutoscalerList> PARSER =
        new com.google.protobuf.AbstractParser<HorizontalPodAutoscalerList>() {
          @java.lang.Override
          public HorizontalPodAutoscalerList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new HorizontalPodAutoscalerList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<HorizontalPodAutoscalerList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HorizontalPodAutoscalerList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerList
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface HorizontalPodAutoscalerSpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerSpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
     * should be collected, as well as to actually change the replica count.
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference scaleTargetRef = 1;
     * </code>
     */
    boolean hasScaleTargetRef();
    /**
     *
     *
     * <pre>
     * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
     * should be collected, as well as to actually change the replica count.
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference scaleTargetRef = 1;
     * </code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference getScaleTargetRef();
    /**
     *
     *
     * <pre>
     * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
     * should be collected, as well as to actually change the replica count.
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference scaleTargetRef = 1;
     * </code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReferenceOrBuilder
        getScaleTargetRefOrBuilder();

    /**
     *
     *
     * <pre>
     * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.
     * It defaults to 1 pod.
     * +optional
     * </pre>
     *
     * <code>optional int32 minReplicas = 2;</code>
     */
    boolean hasMinReplicas();
    /**
     *
     *
     * <pre>
     * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.
     * It defaults to 1 pod.
     * +optional
     * </pre>
     *
     * <code>optional int32 minReplicas = 2;</code>
     */
    int getMinReplicas();

    /**
     *
     *
     * <pre>
     * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up.
     * It cannot be less that minReplicas.
     * </pre>
     *
     * <code>optional int32 maxReplicas = 3;</code>
     */
    boolean hasMaxReplicas();
    /**
     *
     *
     * <pre>
     * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up.
     * It cannot be less that minReplicas.
     * </pre>
     *
     * <code>optional int32 maxReplicas = 3;</code>
     */
    int getMaxReplicas();

    /**
     *
     *
     * <pre>
     * metrics contains the specifications for which to use to calculate the
     * desired replica count (the maximum replica count across all metrics will
     * be used).  The desired replica count is calculated multiplying the
     * ratio between the target value and the current value by the current
     * number of pods.  Ergo, metrics used must decrease as the pod count is
     * increased, and vice-versa.  See the individual metric source types for
     * more information about how each type of metric must respond.
     * If not set, the default metric will be set to 80% average CPU utilization.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
     */
    java.util.List<io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec> getMetricsList();
    /**
     *
     *
     * <pre>
     * metrics contains the specifications for which to use to calculate the
     * desired replica count (the maximum replica count across all metrics will
     * be used).  The desired replica count is calculated multiplying the
     * ratio between the target value and the current value by the current
     * number of pods.  Ergo, metrics used must decrease as the pod count is
     * increased, and vice-versa.  See the individual metric source types for
     * more information about how each type of metric must respond.
     * If not set, the default metric will be set to 80% average CPU utilization.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec getMetrics(int index);
    /**
     *
     *
     * <pre>
     * metrics contains the specifications for which to use to calculate the
     * desired replica count (the maximum replica count across all metrics will
     * be used).  The desired replica count is calculated multiplying the
     * ratio between the target value and the current value by the current
     * number of pods.  Ergo, metrics used must decrease as the pod count is
     * increased, and vice-versa.  See the individual metric source types for
     * more information about how each type of metric must respond.
     * If not set, the default metric will be set to 80% average CPU utilization.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
     */
    int getMetricsCount();
    /**
     *
     *
     * <pre>
     * metrics contains the specifications for which to use to calculate the
     * desired replica count (the maximum replica count across all metrics will
     * be used).  The desired replica count is calculated multiplying the
     * ratio between the target value and the current value by the current
     * number of pods.  Ergo, metrics used must decrease as the pod count is
     * increased, and vice-versa.  See the individual metric source types for
     * more information about how each type of metric must respond.
     * If not set, the default metric will be set to 80% average CPU utilization.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpecOrBuilder>
        getMetricsOrBuilderList();
    /**
     *
     *
     * <pre>
     * metrics contains the specifications for which to use to calculate the
     * desired replica count (the maximum replica count across all metrics will
     * be used).  The desired replica count is calculated multiplying the
     * ratio between the target value and the current value by the current
     * number of pods.  Ergo, metrics used must decrease as the pod count is
     * increased, and vice-versa.  See the individual metric source types for
     * more information about how each type of metric must respond.
     * If not set, the default metric will be set to 80% average CPU utilization.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpecOrBuilder getMetricsOrBuilder(
        int index);
  }
  /**
   *
   *
   * <pre>
   * HorizontalPodAutoscalerSpec describes the desired functionality of the HorizontalPodAutoscaler.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerSpec}
   */
  public static final class HorizontalPodAutoscalerSpec
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerSpec)
      HorizontalPodAutoscalerSpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use HorizontalPodAutoscalerSpec.newBuilder() to construct.
    private HorizontalPodAutoscalerSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private HorizontalPodAutoscalerSpec() {
      minReplicas_ = 0;
      maxReplicas_ = 0;
      metrics_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private HorizontalPodAutoscalerSpec(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = scaleTargetRef_.toBuilder();
                }
                scaleTargetRef_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(scaleTargetRef_);
                  scaleTargetRef_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 16:
              {
                bitField0_ |= 0x00000002;
                minReplicas_ = input.readInt32();
                break;
              }
            case 24:
              {
                bitField0_ |= 0x00000004;
                maxReplicas_ = input.readInt32();
                break;
              }
            case 34:
              {
                if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                  metrics_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec>();
                  mutable_bitField0_ |= 0x00000008;
                }
                metrics_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec.PARSER,
                        extensionRegistry));
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          metrics_ = java.util.Collections.unmodifiableList(metrics_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec.class,
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec.Builder
                  .class);
    }

    private int bitField0_;
    public static final int SCALETARGETREF_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
        scaleTargetRef_;
    /**
     *
     *
     * <pre>
     * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
     * should be collected, as well as to actually change the replica count.
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference scaleTargetRef = 1;
     * </code>
     */
    public boolean hasScaleTargetRef() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
     * should be collected, as well as to actually change the replica count.
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference scaleTargetRef = 1;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
        getScaleTargetRef() {
      return scaleTargetRef_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
              .getDefaultInstance()
          : scaleTargetRef_;
    }
    /**
     *
     *
     * <pre>
     * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
     * should be collected, as well as to actually change the replica count.
     * </pre>
     *
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference scaleTargetRef = 1;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReferenceOrBuilder
        getScaleTargetRefOrBuilder() {
      return scaleTargetRef_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
              .getDefaultInstance()
          : scaleTargetRef_;
    }

    public static final int MINREPLICAS_FIELD_NUMBER = 2;
    private int minReplicas_;
    /**
     *
     *
     * <pre>
     * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.
     * It defaults to 1 pod.
     * +optional
     * </pre>
     *
     * <code>optional int32 minReplicas = 2;</code>
     */
    public boolean hasMinReplicas() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.
     * It defaults to 1 pod.
     * +optional
     * </pre>
     *
     * <code>optional int32 minReplicas = 2;</code>
     */
    public int getMinReplicas() {
      return minReplicas_;
    }

    public static final int MAXREPLICAS_FIELD_NUMBER = 3;
    private int maxReplicas_;
    /**
     *
     *
     * <pre>
     * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up.
     * It cannot be less that minReplicas.
     * </pre>
     *
     * <code>optional int32 maxReplicas = 3;</code>
     */
    public boolean hasMaxReplicas() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up.
     * It cannot be less that minReplicas.
     * </pre>
     *
     * <code>optional int32 maxReplicas = 3;</code>
     */
    public int getMaxReplicas() {
      return maxReplicas_;
    }

    public static final int METRICS_FIELD_NUMBER = 4;
    private java.util.List<io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec> metrics_;
    /**
     *
     *
     * <pre>
     * metrics contains the specifications for which to use to calculate the
     * desired replica count (the maximum replica count across all metrics will
     * be used).  The desired replica count is calculated multiplying the
     * ratio between the target value and the current value by the current
     * number of pods.  Ergo, metrics used must decrease as the pod count is
     * increased, and vice-versa.  See the individual metric source types for
     * more information about how each type of metric must respond.
     * If not set, the default metric will be set to 80% average CPU utilization.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec>
        getMetricsList() {
      return metrics_;
    }
    /**
     *
     *
     * <pre>
     * metrics contains the specifications for which to use to calculate the
     * desired replica count (the maximum replica count across all metrics will
     * be used).  The desired replica count is calculated multiplying the
     * ratio between the target value and the current value by the current
     * number of pods.  Ergo, metrics used must decrease as the pod count is
     * increased, and vice-versa.  See the individual metric source types for
     * more information about how each type of metric must respond.
     * If not set, the default metric will be set to 80% average CPU utilization.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
     */
    public java.util.List<
            ? extends io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpecOrBuilder>
        getMetricsOrBuilderList() {
      return metrics_;
    }
    /**
     *
     *
     * <pre>
     * metrics contains the specifications for which to use to calculate the
     * desired replica count (the maximum replica count across all metrics will
     * be used).  The desired replica count is calculated multiplying the
     * ratio between the target value and the current value by the current
     * number of pods.  Ergo, metrics used must decrease as the pod count is
     * increased, and vice-versa.  See the individual metric source types for
     * more information about how each type of metric must respond.
     * If not set, the default metric will be set to 80% average CPU utilization.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
     */
    public int getMetricsCount() {
      return metrics_.size();
    }
    /**
     *
     *
     * <pre>
     * metrics contains the specifications for which to use to calculate the
     * desired replica count (the maximum replica count across all metrics will
     * be used).  The desired replica count is calculated multiplying the
     * ratio between the target value and the current value by the current
     * number of pods.  Ergo, metrics used must decrease as the pod count is
     * increased, and vice-versa.  See the individual metric source types for
     * more information about how each type of metric must respond.
     * If not set, the default metric will be set to 80% average CPU utilization.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec getMetrics(int index) {
      return metrics_.get(index);
    }
    /**
     *
     *
     * <pre>
     * metrics contains the specifications for which to use to calculate the
     * desired replica count (the maximum replica count across all metrics will
     * be used).  The desired replica count is calculated multiplying the
     * ratio between the target value and the current value by the current
     * number of pods.  Ergo, metrics used must decrease as the pod count is
     * increased, and vice-versa.  See the individual metric source types for
     * more information about how each type of metric must respond.
     * If not set, the default metric will be set to 80% average CPU utilization.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpecOrBuilder getMetricsOrBuilder(
        int index) {
      return metrics_.get(index);
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getScaleTargetRef());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, minReplicas_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, maxReplicas_);
      }
      for (int i = 0; i < metrics_.size(); i++) {
        output.writeMessage(4, metrics_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getScaleTargetRef());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, minReplicas_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, maxReplicas_);
      }
      for (int i = 0; i < metrics_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, metrics_.get(i));
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
      if (!(obj
          instanceof io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec other =
          (io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec) obj;

      boolean result = true;
      result = result && (hasScaleTargetRef() == other.hasScaleTargetRef());
      if (hasScaleTargetRef()) {
        result = result && getScaleTargetRef().equals(other.getScaleTargetRef());
      }
      result = result && (hasMinReplicas() == other.hasMinReplicas());
      if (hasMinReplicas()) {
        result = result && (getMinReplicas() == other.getMinReplicas());
      }
      result = result && (hasMaxReplicas() == other.hasMaxReplicas());
      if (hasMaxReplicas()) {
        result = result && (getMaxReplicas() == other.getMaxReplicas());
      }
      result = result && getMetricsList().equals(other.getMetricsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasScaleTargetRef()) {
        hash = (37 * hash) + SCALETARGETREF_FIELD_NUMBER;
        hash = (53 * hash) + getScaleTargetRef().hashCode();
      }
      if (hasMinReplicas()) {
        hash = (37 * hash) + MINREPLICAS_FIELD_NUMBER;
        hash = (53 * hash) + getMinReplicas();
      }
      if (hasMaxReplicas()) {
        hash = (37 * hash) + MAXREPLICAS_FIELD_NUMBER;
        hash = (53 * hash) + getMaxReplicas();
      }
      if (getMetricsCount() > 0) {
        hash = (37 * hash) + METRICS_FIELD_NUMBER;
        hash = (53 * hash) + getMetricsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
        parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * HorizontalPodAutoscalerSpec describes the desired functionality of the HorizontalPodAutoscaler.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerSpec}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerSpec)
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerSpec_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerSpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec.class,
                io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getScaleTargetRefFieldBuilder();
          getMetricsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (scaleTargetRefBuilder_ == null) {
          scaleTargetRef_ = null;
        } else {
          scaleTargetRefBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        minReplicas_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        maxReplicas_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        if (metricsBuilder_ == null) {
          metrics_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          metricsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerSpec_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec build() {
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
          buildPartial() {
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec result =
            new io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (scaleTargetRefBuilder_ == null) {
          result.scaleTargetRef_ = scaleTargetRef_;
        } else {
          result.scaleTargetRef_ = scaleTargetRefBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.minReplicas_ = minReplicas_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.maxReplicas_ = maxReplicas_;
        if (metricsBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)) {
            metrics_ = java.util.Collections.unmodifiableList(metrics_);
            bitField0_ = (bitField0_ & ~0x00000008);
          }
          result.metrics_ = metrics_;
        } else {
          result.metrics_ = metricsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec other) {
        if (other
            == io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
                .getDefaultInstance()) return this;
        if (other.hasScaleTargetRef()) {
          mergeScaleTargetRef(other.getScaleTargetRef());
        }
        if (other.hasMinReplicas()) {
          setMinReplicas(other.getMinReplicas());
        }
        if (other.hasMaxReplicas()) {
          setMaxReplicas(other.getMaxReplicas());
        }
        if (metricsBuilder_ == null) {
          if (!other.metrics_.isEmpty()) {
            if (metrics_.isEmpty()) {
              metrics_ = other.metrics_;
              bitField0_ = (bitField0_ & ~0x00000008);
            } else {
              ensureMetricsIsMutable();
              metrics_.addAll(other.metrics_);
            }
            onChanged();
          }
        } else {
          if (!other.metrics_.isEmpty()) {
            if (metricsBuilder_.isEmpty()) {
              metricsBuilder_.dispose();
              metricsBuilder_ = null;
              metrics_ = other.metrics_;
              bitField0_ = (bitField0_ & ~0x00000008);
              metricsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getMetricsFieldBuilder()
                      : null;
            } else {
              metricsBuilder_.addAllMessages(other.metrics_);
            }
          }
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
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
          scaleTargetRef_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference,
              io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReferenceOrBuilder>
          scaleTargetRefBuilder_;
      /**
       *
       *
       * <pre>
       * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
       * should be collected, as well as to actually change the replica count.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference scaleTargetRef = 1;
       * </code>
       */
      public boolean hasScaleTargetRef() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
       * should be collected, as well as to actually change the replica count.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference scaleTargetRef = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
          getScaleTargetRef() {
        if (scaleTargetRefBuilder_ == null) {
          return scaleTargetRef_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
                  .getDefaultInstance()
              : scaleTargetRef_;
        } else {
          return scaleTargetRefBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
       * should be collected, as well as to actually change the replica count.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference scaleTargetRef = 1;
       * </code>
       */
      public Builder setScaleTargetRef(
          io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference value) {
        if (scaleTargetRefBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          scaleTargetRef_ = value;
          onChanged();
        } else {
          scaleTargetRefBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
       * should be collected, as well as to actually change the replica count.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference scaleTargetRef = 1;
       * </code>
       */
      public Builder setScaleTargetRef(
          io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference.Builder
              builderForValue) {
        if (scaleTargetRefBuilder_ == null) {
          scaleTargetRef_ = builderForValue.build();
          onChanged();
        } else {
          scaleTargetRefBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
       * should be collected, as well as to actually change the replica count.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference scaleTargetRef = 1;
       * </code>
       */
      public Builder mergeScaleTargetRef(
          io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference value) {
        if (scaleTargetRefBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && scaleTargetRef_ != null
              && scaleTargetRef_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
                      .getDefaultInstance()) {
            scaleTargetRef_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
                    .newBuilder(scaleTargetRef_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            scaleTargetRef_ = value;
          }
          onChanged();
        } else {
          scaleTargetRefBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
       * should be collected, as well as to actually change the replica count.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference scaleTargetRef = 1;
       * </code>
       */
      public Builder clearScaleTargetRef() {
        if (scaleTargetRefBuilder_ == null) {
          scaleTargetRef_ = null;
          onChanged();
        } else {
          scaleTargetRefBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
       * should be collected, as well as to actually change the replica count.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference scaleTargetRef = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference.Builder
          getScaleTargetRefBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getScaleTargetRefFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
       * should be collected, as well as to actually change the replica count.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference scaleTargetRef = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReferenceOrBuilder
          getScaleTargetRefOrBuilder() {
        if (scaleTargetRefBuilder_ != null) {
          return scaleTargetRefBuilder_.getMessageOrBuilder();
        } else {
          return scaleTargetRef_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
                  .getDefaultInstance()
              : scaleTargetRef_;
        }
      }
      /**
       *
       *
       * <pre>
       * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics
       * should be collected, as well as to actually change the replica count.
       * </pre>
       *
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference scaleTargetRef = 1;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference,
              io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReferenceOrBuilder>
          getScaleTargetRefFieldBuilder() {
        if (scaleTargetRefBuilder_ == null) {
          scaleTargetRefBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference,
                  io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling
                      .CrossVersionObjectReferenceOrBuilder>(
                  getScaleTargetRef(), getParentForChildren(), isClean());
          scaleTargetRef_ = null;
        }
        return scaleTargetRefBuilder_;
      }

      private int minReplicas_;
      /**
       *
       *
       * <pre>
       * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.
       * It defaults to 1 pod.
       * +optional
       * </pre>
       *
       * <code>optional int32 minReplicas = 2;</code>
       */
      public boolean hasMinReplicas() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.
       * It defaults to 1 pod.
       * +optional
       * </pre>
       *
       * <code>optional int32 minReplicas = 2;</code>
       */
      public int getMinReplicas() {
        return minReplicas_;
      }
      /**
       *
       *
       * <pre>
       * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.
       * It defaults to 1 pod.
       * +optional
       * </pre>
       *
       * <code>optional int32 minReplicas = 2;</code>
       */
      public Builder setMinReplicas(int value) {
        bitField0_ |= 0x00000002;
        minReplicas_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.
       * It defaults to 1 pod.
       * +optional
       * </pre>
       *
       * <code>optional int32 minReplicas = 2;</code>
       */
      public Builder clearMinReplicas() {
        bitField0_ = (bitField0_ & ~0x00000002);
        minReplicas_ = 0;
        onChanged();
        return this;
      }

      private int maxReplicas_;
      /**
       *
       *
       * <pre>
       * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up.
       * It cannot be less that minReplicas.
       * </pre>
       *
       * <code>optional int32 maxReplicas = 3;</code>
       */
      public boolean hasMaxReplicas() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up.
       * It cannot be less that minReplicas.
       * </pre>
       *
       * <code>optional int32 maxReplicas = 3;</code>
       */
      public int getMaxReplicas() {
        return maxReplicas_;
      }
      /**
       *
       *
       * <pre>
       * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up.
       * It cannot be less that minReplicas.
       * </pre>
       *
       * <code>optional int32 maxReplicas = 3;</code>
       */
      public Builder setMaxReplicas(int value) {
        bitField0_ |= 0x00000004;
        maxReplicas_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up.
       * It cannot be less that minReplicas.
       * </pre>
       *
       * <code>optional int32 maxReplicas = 3;</code>
       */
      public Builder clearMaxReplicas() {
        bitField0_ = (bitField0_ & ~0x00000004);
        maxReplicas_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec> metrics_ =
          java.util.Collections.emptyList();

      private void ensureMetricsIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          metrics_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec>(
                  metrics_);
          bitField0_ |= 0x00000008;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpecOrBuilder>
          metricsBuilder_;

      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * If not set, the default metric will be set to 80% average CPU utilization.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec>
          getMetricsList() {
        if (metricsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(metrics_);
        } else {
          return metricsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * If not set, the default metric will be set to 80% average CPU utilization.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
       */
      public int getMetricsCount() {
        if (metricsBuilder_ == null) {
          return metrics_.size();
        } else {
          return metricsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * If not set, the default metric will be set to 80% average CPU utilization.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec getMetrics(int index) {
        if (metricsBuilder_ == null) {
          return metrics_.get(index);
        } else {
          return metricsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * If not set, the default metric will be set to 80% average CPU utilization.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
       */
      public Builder setMetrics(
          int index, io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec value) {
        if (metricsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMetricsIsMutable();
          metrics_.set(index, value);
          onChanged();
        } else {
          metricsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * If not set, the default metric will be set to 80% average CPU utilization.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
       */
      public Builder setMetrics(
          int index,
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec.Builder builderForValue) {
        if (metricsBuilder_ == null) {
          ensureMetricsIsMutable();
          metrics_.set(index, builderForValue.build());
          onChanged();
        } else {
          metricsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * If not set, the default metric will be set to 80% average CPU utilization.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
       */
      public Builder addMetrics(io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec value) {
        if (metricsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMetricsIsMutable();
          metrics_.add(value);
          onChanged();
        } else {
          metricsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * If not set, the default metric will be set to 80% average CPU utilization.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
       */
      public Builder addMetrics(
          int index, io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec value) {
        if (metricsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMetricsIsMutable();
          metrics_.add(index, value);
          onChanged();
        } else {
          metricsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * If not set, the default metric will be set to 80% average CPU utilization.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
       */
      public Builder addMetrics(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec.Builder builderForValue) {
        if (metricsBuilder_ == null) {
          ensureMetricsIsMutable();
          metrics_.add(builderForValue.build());
          onChanged();
        } else {
          metricsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * If not set, the default metric will be set to 80% average CPU utilization.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
       */
      public Builder addMetrics(
          int index,
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec.Builder builderForValue) {
        if (metricsBuilder_ == null) {
          ensureMetricsIsMutable();
          metrics_.add(index, builderForValue.build());
          onChanged();
        } else {
          metricsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * If not set, the default metric will be set to 80% average CPU utilization.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
       */
      public Builder addAllMetrics(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec>
              values) {
        if (metricsBuilder_ == null) {
          ensureMetricsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, metrics_);
          onChanged();
        } else {
          metricsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * If not set, the default metric will be set to 80% average CPU utilization.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
       */
      public Builder clearMetrics() {
        if (metricsBuilder_ == null) {
          metrics_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
        } else {
          metricsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * If not set, the default metric will be set to 80% average CPU utilization.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
       */
      public Builder removeMetrics(int index) {
        if (metricsBuilder_ == null) {
          ensureMetricsIsMutable();
          metrics_.remove(index);
          onChanged();
        } else {
          metricsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * If not set, the default metric will be set to 80% average CPU utilization.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec.Builder getMetricsBuilder(
          int index) {
        return getMetricsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * If not set, the default metric will be set to 80% average CPU utilization.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpecOrBuilder getMetricsOrBuilder(
          int index) {
        if (metricsBuilder_ == null) {
          return metrics_.get(index);
        } else {
          return metricsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * If not set, the default metric will be set to 80% average CPU utilization.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpecOrBuilder>
          getMetricsOrBuilderList() {
        if (metricsBuilder_ != null) {
          return metricsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(metrics_);
        }
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * If not set, the default metric will be set to 80% average CPU utilization.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec.Builder addMetricsBuilder() {
        return getMetricsFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * If not set, the default metric will be set to 80% average CPU utilization.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec.Builder addMetricsBuilder(
          int index) {
        return getMetricsFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * metrics contains the specifications for which to use to calculate the
       * desired replica count (the maximum replica count across all metrics will
       * be used).  The desired replica count is calculated multiplying the
       * ratio between the target value and the current value by the current
       * number of pods.  Ergo, metrics used must decrease as the pod count is
       * increased, and vice-versa.  See the individual metric source types for
       * more information about how each type of metric must respond.
       * If not set, the default metric will be set to 80% average CPU utilization.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricSpec metrics = 4;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec.Builder>
          getMetricsBuilderList() {
        return getMetricsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpecOrBuilder>
          getMetricsFieldBuilder() {
        if (metricsBuilder_ == null) {
          metricsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpecOrBuilder>(
                  metrics_,
                  ((bitField0_ & 0x00000008) == 0x00000008),
                  getParentForChildren(),
                  isClean());
          metrics_ = null;
        }
        return metricsBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerSpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerSpec)
    private static final io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec();
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<HorizontalPodAutoscalerSpec> PARSER =
        new com.google.protobuf.AbstractParser<HorizontalPodAutoscalerSpec>() {
          @java.lang.Override
          public HorizontalPodAutoscalerSpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new HorizontalPodAutoscalerSpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<HorizontalPodAutoscalerSpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HorizontalPodAutoscalerSpec> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerSpec
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface HorizontalPodAutoscalerStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * observedGeneration is the most recent generation observed by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>optional int64 observedGeneration = 1;</code>
     */
    boolean hasObservedGeneration();
    /**
     *
     *
     * <pre>
     * observedGeneration is the most recent generation observed by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>optional int64 observedGeneration = 1;</code>
     */
    long getObservedGeneration();

    /**
     *
     *
     * <pre>
     * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
     * used by the autoscaler to control how often the number of pods is changed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
     */
    boolean hasLastScaleTime();
    /**
     *
     *
     * <pre>
     * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
     * used by the autoscaler to control how often the number of pods is changed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
     */
    io.kubernetes.client.proto.Meta.Time getLastScaleTime();
    /**
     *
     *
     * <pre>
     * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
     * used by the autoscaler to control how often the number of pods is changed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
     */
    io.kubernetes.client.proto.Meta.TimeOrBuilder getLastScaleTimeOrBuilder();

    /**
     *
     *
     * <pre>
     * currentReplicas is current number of replicas of pods managed by this autoscaler,
     * as last seen by the autoscaler.
     * </pre>
     *
     * <code>optional int32 currentReplicas = 3;</code>
     */
    boolean hasCurrentReplicas();
    /**
     *
     *
     * <pre>
     * currentReplicas is current number of replicas of pods managed by this autoscaler,
     * as last seen by the autoscaler.
     * </pre>
     *
     * <code>optional int32 currentReplicas = 3;</code>
     */
    int getCurrentReplicas();

    /**
     *
     *
     * <pre>
     * desiredReplicas is the desired number of replicas of pods managed by this autoscaler,
     * as last calculated by the autoscaler.
     * </pre>
     *
     * <code>optional int32 desiredReplicas = 4;</code>
     */
    boolean hasDesiredReplicas();
    /**
     *
     *
     * <pre>
     * desiredReplicas is the desired number of replicas of pods managed by this autoscaler,
     * as last calculated by the autoscaler.
     * </pre>
     *
     * <code>optional int32 desiredReplicas = 4;</code>
     */
    int getDesiredReplicas();

    /**
     *
     *
     * <pre>
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;</code>
     */
    java.util.List<io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus>
        getCurrentMetricsList();
    /**
     *
     *
     * <pre>
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus getCurrentMetrics(int index);
    /**
     *
     *
     * <pre>
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;</code>
     */
    int getCurrentMetricsCount();
    /**
     *
     *
     * <pre>
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatusOrBuilder>
        getCurrentMetricsOrBuilderList();
    /**
     *
     *
     * <pre>
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatusOrBuilder getCurrentMetricsOrBuilder(
        int index);

    /**
     *
     *
     * <pre>
     * conditions is the set of conditions required for this autoscaler to scale its target,
     * and indicates whether or not those conditions are met.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
     * </code>
     */
    java.util.List<io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition>
        getConditionsList();
    /**
     *
     *
     * <pre>
     * conditions is the set of conditions required for this autoscaler to scale its target,
     * and indicates whether or not those conditions are met.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
     * </code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition getConditions(
        int index);
    /**
     *
     *
     * <pre>
     * conditions is the set of conditions required for this autoscaler to scale its target,
     * and indicates whether or not those conditions are met.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
     * </code>
     */
    int getConditionsCount();
    /**
     *
     *
     * <pre>
     * conditions is the set of conditions required for this autoscaler to scale its target,
     * and indicates whether or not those conditions are met.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
     * </code>
     */
    java.util.List<
            ? extends
                io.kubernetes.client.proto.V2beta2Autoscaling
                    .HorizontalPodAutoscalerConditionOrBuilder>
        getConditionsOrBuilderList();
    /**
     *
     *
     * <pre>
     * conditions is the set of conditions required for this autoscaler to scale its target,
     * and indicates whether or not those conditions are met.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
     * </code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerConditionOrBuilder
        getConditionsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerStatus}
   */
  public static final class HorizontalPodAutoscalerStatus
      extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerStatus)
      HorizontalPodAutoscalerStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use HorizontalPodAutoscalerStatus.newBuilder() to construct.
    private HorizontalPodAutoscalerStatus(
        com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private HorizontalPodAutoscalerStatus() {
      observedGeneration_ = 0L;
      currentReplicas_ = 0;
      desiredReplicas_ = 0;
      currentMetrics_ = java.util.Collections.emptyList();
      conditions_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private HorizontalPodAutoscalerStatus(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 8:
              {
                bitField0_ |= 0x00000001;
                observedGeneration_ = input.readInt64();
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.Meta.Time.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = lastScaleTime_.toBuilder();
                }
                lastScaleTime_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.Time.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(lastScaleTime_);
                  lastScaleTime_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 24:
              {
                bitField0_ |= 0x00000004;
                currentReplicas_ = input.readInt32();
                break;
              }
            case 32:
              {
                bitField0_ |= 0x00000008;
                desiredReplicas_ = input.readInt32();
                break;
              }
            case 42:
              {
                if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                  currentMetrics_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus>();
                  mutable_bitField0_ |= 0x00000010;
                }
                currentMetrics_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus.PARSER,
                        extensionRegistry));
                break;
              }
            case 50:
              {
                if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                  conditions_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V2beta2Autoscaling
                              .HorizontalPodAutoscalerCondition>();
                  mutable_bitField0_ |= 0x00000020;
                }
                conditions_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling
                            .HorizontalPodAutoscalerCondition.PARSER,
                        extensionRegistry));
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
          currentMetrics_ = java.util.Collections.unmodifiableList(currentMetrics_);
        }
        if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
          conditions_ = java.util.Collections.unmodifiableList(conditions_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus.class,
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus.Builder
                  .class);
    }

    private int bitField0_;
    public static final int OBSERVEDGENERATION_FIELD_NUMBER = 1;
    private long observedGeneration_;
    /**
     *
     *
     * <pre>
     * observedGeneration is the most recent generation observed by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>optional int64 observedGeneration = 1;</code>
     */
    public boolean hasObservedGeneration() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * observedGeneration is the most recent generation observed by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>optional int64 observedGeneration = 1;</code>
     */
    public long getObservedGeneration() {
      return observedGeneration_;
    }

    public static final int LASTSCALETIME_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.Meta.Time lastScaleTime_;
    /**
     *
     *
     * <pre>
     * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
     * used by the autoscaler to control how often the number of pods is changed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
     */
    public boolean hasLastScaleTime() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
     * used by the autoscaler to control how often the number of pods is changed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
     */
    public io.kubernetes.client.proto.Meta.Time getLastScaleTime() {
      return lastScaleTime_ == null
          ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
          : lastScaleTime_;
    }
    /**
     *
     *
     * <pre>
     * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
     * used by the autoscaler to control how often the number of pods is changed.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
     */
    public io.kubernetes.client.proto.Meta.TimeOrBuilder getLastScaleTimeOrBuilder() {
      return lastScaleTime_ == null
          ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
          : lastScaleTime_;
    }

    public static final int CURRENTREPLICAS_FIELD_NUMBER = 3;
    private int currentReplicas_;
    /**
     *
     *
     * <pre>
     * currentReplicas is current number of replicas of pods managed by this autoscaler,
     * as last seen by the autoscaler.
     * </pre>
     *
     * <code>optional int32 currentReplicas = 3;</code>
     */
    public boolean hasCurrentReplicas() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * currentReplicas is current number of replicas of pods managed by this autoscaler,
     * as last seen by the autoscaler.
     * </pre>
     *
     * <code>optional int32 currentReplicas = 3;</code>
     */
    public int getCurrentReplicas() {
      return currentReplicas_;
    }

    public static final int DESIREDREPLICAS_FIELD_NUMBER = 4;
    private int desiredReplicas_;
    /**
     *
     *
     * <pre>
     * desiredReplicas is the desired number of replicas of pods managed by this autoscaler,
     * as last calculated by the autoscaler.
     * </pre>
     *
     * <code>optional int32 desiredReplicas = 4;</code>
     */
    public boolean hasDesiredReplicas() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * desiredReplicas is the desired number of replicas of pods managed by this autoscaler,
     * as last calculated by the autoscaler.
     * </pre>
     *
     * <code>optional int32 desiredReplicas = 4;</code>
     */
    public int getDesiredReplicas() {
      return desiredReplicas_;
    }

    public static final int CURRENTMETRICS_FIELD_NUMBER = 5;
    private java.util.List<io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus>
        currentMetrics_;
    /**
     *
     *
     * <pre>
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus>
        getCurrentMetricsList() {
      return currentMetrics_;
    }
    /**
     *
     *
     * <pre>
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;</code>
     */
    public java.util.List<
            ? extends io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatusOrBuilder>
        getCurrentMetricsOrBuilderList() {
      return currentMetrics_;
    }
    /**
     *
     *
     * <pre>
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;</code>
     */
    public int getCurrentMetricsCount() {
      return currentMetrics_.size();
    }
    /**
     *
     *
     * <pre>
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus getCurrentMetrics(int index) {
      return currentMetrics_.get(index);
    }
    /**
     *
     *
     * <pre>
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatusOrBuilder
        getCurrentMetricsOrBuilder(int index) {
      return currentMetrics_.get(index);
    }

    public static final int CONDITIONS_FIELD_NUMBER = 6;
    private java.util.List<
            io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition>
        conditions_;
    /**
     *
     *
     * <pre>
     * conditions is the set of conditions required for this autoscaler to scale its target,
     * and indicates whether or not those conditions are met.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
     * </code>
     */
    public java.util.List<
            io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition>
        getConditionsList() {
      return conditions_;
    }
    /**
     *
     *
     * <pre>
     * conditions is the set of conditions required for this autoscaler to scale its target,
     * and indicates whether or not those conditions are met.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
     * </code>
     */
    public java.util.List<
            ? extends
                io.kubernetes.client.proto.V2beta2Autoscaling
                    .HorizontalPodAutoscalerConditionOrBuilder>
        getConditionsOrBuilderList() {
      return conditions_;
    }
    /**
     *
     *
     * <pre>
     * conditions is the set of conditions required for this autoscaler to scale its target,
     * and indicates whether or not those conditions are met.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
     * </code>
     */
    public int getConditionsCount() {
      return conditions_.size();
    }
    /**
     *
     *
     * <pre>
     * conditions is the set of conditions required for this autoscaler to scale its target,
     * and indicates whether or not those conditions are met.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
        getConditions(int index) {
      return conditions_.get(index);
    }
    /**
     *
     *
     * <pre>
     * conditions is the set of conditions required for this autoscaler to scale its target,
     * and indicates whether or not those conditions are met.
     * </pre>
     *
     * <code>
     * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerConditionOrBuilder
        getConditionsOrBuilder(int index) {
      return conditions_.get(index);
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, observedGeneration_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getLastScaleTime());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, currentReplicas_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, desiredReplicas_);
      }
      for (int i = 0; i < currentMetrics_.size(); i++) {
        output.writeMessage(5, currentMetrics_.get(i));
      }
      for (int i = 0; i < conditions_.size(); i++) {
        output.writeMessage(6, conditions_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, observedGeneration_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getLastScaleTime());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, currentReplicas_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, desiredReplicas_);
      }
      for (int i = 0; i < currentMetrics_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, currentMetrics_.get(i));
      }
      for (int i = 0; i < conditions_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(6, conditions_.get(i));
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
      if (!(obj
          instanceof io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus other =
          (io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus) obj;

      boolean result = true;
      result = result && (hasObservedGeneration() == other.hasObservedGeneration());
      if (hasObservedGeneration()) {
        result = result && (getObservedGeneration() == other.getObservedGeneration());
      }
      result = result && (hasLastScaleTime() == other.hasLastScaleTime());
      if (hasLastScaleTime()) {
        result = result && getLastScaleTime().equals(other.getLastScaleTime());
      }
      result = result && (hasCurrentReplicas() == other.hasCurrentReplicas());
      if (hasCurrentReplicas()) {
        result = result && (getCurrentReplicas() == other.getCurrentReplicas());
      }
      result = result && (hasDesiredReplicas() == other.hasDesiredReplicas());
      if (hasDesiredReplicas()) {
        result = result && (getDesiredReplicas() == other.getDesiredReplicas());
      }
      result = result && getCurrentMetricsList().equals(other.getCurrentMetricsList());
      result = result && getConditionsList().equals(other.getConditionsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasObservedGeneration()) {
        hash = (37 * hash) + OBSERVEDGENERATION_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getObservedGeneration());
      }
      if (hasLastScaleTime()) {
        hash = (37 * hash) + LASTSCALETIME_FIELD_NUMBER;
        hash = (53 * hash) + getLastScaleTime().hashCode();
      }
      if (hasCurrentReplicas()) {
        hash = (37 * hash) + CURRENTREPLICAS_FIELD_NUMBER;
        hash = (53 * hash) + getCurrentReplicas();
      }
      if (hasDesiredReplicas()) {
        hash = (37 * hash) + DESIREDREPLICAS_FIELD_NUMBER;
        hash = (53 * hash) + getDesiredReplicas();
      }
      if (getCurrentMetricsCount() > 0) {
        hash = (37 * hash) + CURRENTMETRICS_FIELD_NUMBER;
        hash = (53 * hash) + getCurrentMetricsList().hashCode();
      }
      if (getConditionsCount() > 0) {
        hash = (37 * hash) + CONDITIONS_FIELD_NUMBER;
        hash = (53 * hash) + getConditionsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
        parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
        parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
        parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
        parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
        parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
        parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
        parseFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
        parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
        parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
        parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerStatus)
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerStatus_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus.class,
                io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus.Builder
                    .class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getLastScaleTimeFieldBuilder();
          getCurrentMetricsFieldBuilder();
          getConditionsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        observedGeneration_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (lastScaleTimeBuilder_ == null) {
          lastScaleTime_ = null;
        } else {
          lastScaleTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        currentReplicas_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        desiredReplicas_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        if (currentMetricsBuilder_ == null) {
          currentMetrics_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          currentMetricsBuilder_.clear();
        }
        if (conditionsBuilder_ == null) {
          conditions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000020);
        } else {
          conditionsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus build() {
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus result =
            buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
          buildPartial() {
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus result =
            new io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.observedGeneration_ = observedGeneration_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (lastScaleTimeBuilder_ == null) {
          result.lastScaleTime_ = lastScaleTime_;
        } else {
          result.lastScaleTime_ = lastScaleTimeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.currentReplicas_ = currentReplicas_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.desiredReplicas_ = desiredReplicas_;
        if (currentMetricsBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)) {
            currentMetrics_ = java.util.Collections.unmodifiableList(currentMetrics_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.currentMetrics_ = currentMetrics_;
        } else {
          result.currentMetrics_ = currentMetricsBuilder_.build();
        }
        if (conditionsBuilder_ == null) {
          if (((bitField0_ & 0x00000020) == 0x00000020)) {
            conditions_ = java.util.Collections.unmodifiableList(conditions_);
            bitField0_ = (bitField0_ & ~0x00000020);
          }
          result.conditions_ = conditions_;
        } else {
          result.conditions_ = conditionsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other
            instanceof
            io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus other) {
        if (other
            == io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
                .getDefaultInstance()) return this;
        if (other.hasObservedGeneration()) {
          setObservedGeneration(other.getObservedGeneration());
        }
        if (other.hasLastScaleTime()) {
          mergeLastScaleTime(other.getLastScaleTime());
        }
        if (other.hasCurrentReplicas()) {
          setCurrentReplicas(other.getCurrentReplicas());
        }
        if (other.hasDesiredReplicas()) {
          setDesiredReplicas(other.getDesiredReplicas());
        }
        if (currentMetricsBuilder_ == null) {
          if (!other.currentMetrics_.isEmpty()) {
            if (currentMetrics_.isEmpty()) {
              currentMetrics_ = other.currentMetrics_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensureCurrentMetricsIsMutable();
              currentMetrics_.addAll(other.currentMetrics_);
            }
            onChanged();
          }
        } else {
          if (!other.currentMetrics_.isEmpty()) {
            if (currentMetricsBuilder_.isEmpty()) {
              currentMetricsBuilder_.dispose();
              currentMetricsBuilder_ = null;
              currentMetrics_ = other.currentMetrics_;
              bitField0_ = (bitField0_ & ~0x00000010);
              currentMetricsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getCurrentMetricsFieldBuilder()
                      : null;
            } else {
              currentMetricsBuilder_.addAllMessages(other.currentMetrics_);
            }
          }
        }
        if (conditionsBuilder_ == null) {
          if (!other.conditions_.isEmpty()) {
            if (conditions_.isEmpty()) {
              conditions_ = other.conditions_;
              bitField0_ = (bitField0_ & ~0x00000020);
            } else {
              ensureConditionsIsMutable();
              conditions_.addAll(other.conditions_);
            }
            onChanged();
          }
        } else {
          if (!other.conditions_.isEmpty()) {
            if (conditionsBuilder_.isEmpty()) {
              conditionsBuilder_.dispose();
              conditionsBuilder_ = null;
              conditions_ = other.conditions_;
              bitField0_ = (bitField0_ & ~0x00000020);
              conditionsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getConditionsFieldBuilder()
                      : null;
            } else {
              conditionsBuilder_.addAllMessages(other.conditions_);
            }
          }
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
        io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus parsedMessage =
            null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private long observedGeneration_;
      /**
       *
       *
       * <pre>
       * observedGeneration is the most recent generation observed by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>optional int64 observedGeneration = 1;</code>
       */
      public boolean hasObservedGeneration() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * observedGeneration is the most recent generation observed by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>optional int64 observedGeneration = 1;</code>
       */
      public long getObservedGeneration() {
        return observedGeneration_;
      }
      /**
       *
       *
       * <pre>
       * observedGeneration is the most recent generation observed by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>optional int64 observedGeneration = 1;</code>
       */
      public Builder setObservedGeneration(long value) {
        bitField0_ |= 0x00000001;
        observedGeneration_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * observedGeneration is the most recent generation observed by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>optional int64 observedGeneration = 1;</code>
       */
      public Builder clearObservedGeneration() {
        bitField0_ = (bitField0_ & ~0x00000001);
        observedGeneration_ = 0L;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.Meta.Time lastScaleTime_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          lastScaleTimeBuilder_;
      /**
       *
       *
       * <pre>
       * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
       * used by the autoscaler to control how often the number of pods is changed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
       */
      public boolean hasLastScaleTime() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
       * used by the autoscaler to control how often the number of pods is changed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
       */
      public io.kubernetes.client.proto.Meta.Time getLastScaleTime() {
        if (lastScaleTimeBuilder_ == null) {
          return lastScaleTime_ == null
              ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
              : lastScaleTime_;
        } else {
          return lastScaleTimeBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
       * used by the autoscaler to control how often the number of pods is changed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
       */
      public Builder setLastScaleTime(io.kubernetes.client.proto.Meta.Time value) {
        if (lastScaleTimeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lastScaleTime_ = value;
          onChanged();
        } else {
          lastScaleTimeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
       * used by the autoscaler to control how often the number of pods is changed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
       */
      public Builder setLastScaleTime(
          io.kubernetes.client.proto.Meta.Time.Builder builderForValue) {
        if (lastScaleTimeBuilder_ == null) {
          lastScaleTime_ = builderForValue.build();
          onChanged();
        } else {
          lastScaleTimeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
       * used by the autoscaler to control how often the number of pods is changed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
       */
      public Builder mergeLastScaleTime(io.kubernetes.client.proto.Meta.Time value) {
        if (lastScaleTimeBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && lastScaleTime_ != null
              && lastScaleTime_ != io.kubernetes.client.proto.Meta.Time.getDefaultInstance()) {
            lastScaleTime_ =
                io.kubernetes.client.proto.Meta.Time.newBuilder(lastScaleTime_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            lastScaleTime_ = value;
          }
          onChanged();
        } else {
          lastScaleTimeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
       * used by the autoscaler to control how often the number of pods is changed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
       */
      public Builder clearLastScaleTime() {
        if (lastScaleTimeBuilder_ == null) {
          lastScaleTime_ = null;
          onChanged();
        } else {
          lastScaleTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
       * used by the autoscaler to control how often the number of pods is changed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
       */
      public io.kubernetes.client.proto.Meta.Time.Builder getLastScaleTimeBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getLastScaleTimeFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
       * used by the autoscaler to control how often the number of pods is changed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
       */
      public io.kubernetes.client.proto.Meta.TimeOrBuilder getLastScaleTimeOrBuilder() {
        if (lastScaleTimeBuilder_ != null) {
          return lastScaleTimeBuilder_.getMessageOrBuilder();
        } else {
          return lastScaleTime_ == null
              ? io.kubernetes.client.proto.Meta.Time.getDefaultInstance()
              : lastScaleTime_;
        }
      }
      /**
       *
       *
       * <pre>
       * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods,
       * used by the autoscaler to control how often the number of pods is changed.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.Time lastScaleTime = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.Time,
              io.kubernetes.client.proto.Meta.Time.Builder,
              io.kubernetes.client.proto.Meta.TimeOrBuilder>
          getLastScaleTimeFieldBuilder() {
        if (lastScaleTimeBuilder_ == null) {
          lastScaleTimeBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.Time,
                  io.kubernetes.client.proto.Meta.Time.Builder,
                  io.kubernetes.client.proto.Meta.TimeOrBuilder>(
                  getLastScaleTime(), getParentForChildren(), isClean());
          lastScaleTime_ = null;
        }
        return lastScaleTimeBuilder_;
      }

      private int currentReplicas_;
      /**
       *
       *
       * <pre>
       * currentReplicas is current number of replicas of pods managed by this autoscaler,
       * as last seen by the autoscaler.
       * </pre>
       *
       * <code>optional int32 currentReplicas = 3;</code>
       */
      public boolean hasCurrentReplicas() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * currentReplicas is current number of replicas of pods managed by this autoscaler,
       * as last seen by the autoscaler.
       * </pre>
       *
       * <code>optional int32 currentReplicas = 3;</code>
       */
      public int getCurrentReplicas() {
        return currentReplicas_;
      }
      /**
       *
       *
       * <pre>
       * currentReplicas is current number of replicas of pods managed by this autoscaler,
       * as last seen by the autoscaler.
       * </pre>
       *
       * <code>optional int32 currentReplicas = 3;</code>
       */
      public Builder setCurrentReplicas(int value) {
        bitField0_ |= 0x00000004;
        currentReplicas_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentReplicas is current number of replicas of pods managed by this autoscaler,
       * as last seen by the autoscaler.
       * </pre>
       *
       * <code>optional int32 currentReplicas = 3;</code>
       */
      public Builder clearCurrentReplicas() {
        bitField0_ = (bitField0_ & ~0x00000004);
        currentReplicas_ = 0;
        onChanged();
        return this;
      }

      private int desiredReplicas_;
      /**
       *
       *
       * <pre>
       * desiredReplicas is the desired number of replicas of pods managed by this autoscaler,
       * as last calculated by the autoscaler.
       * </pre>
       *
       * <code>optional int32 desiredReplicas = 4;</code>
       */
      public boolean hasDesiredReplicas() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * desiredReplicas is the desired number of replicas of pods managed by this autoscaler,
       * as last calculated by the autoscaler.
       * </pre>
       *
       * <code>optional int32 desiredReplicas = 4;</code>
       */
      public int getDesiredReplicas() {
        return desiredReplicas_;
      }
      /**
       *
       *
       * <pre>
       * desiredReplicas is the desired number of replicas of pods managed by this autoscaler,
       * as last calculated by the autoscaler.
       * </pre>
       *
       * <code>optional int32 desiredReplicas = 4;</code>
       */
      public Builder setDesiredReplicas(int value) {
        bitField0_ |= 0x00000008;
        desiredReplicas_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * desiredReplicas is the desired number of replicas of pods managed by this autoscaler,
       * as last calculated by the autoscaler.
       * </pre>
       *
       * <code>optional int32 desiredReplicas = 4;</code>
       */
      public Builder clearDesiredReplicas() {
        bitField0_ = (bitField0_ & ~0x00000008);
        desiredReplicas_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus>
          currentMetrics_ = java.util.Collections.emptyList();

      private void ensureCurrentMetricsIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          currentMetrics_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus>(
                  currentMetrics_);
          bitField0_ |= 0x00000010;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatusOrBuilder>
          currentMetricsBuilder_;

      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;
       * </code>
       */
      public java.util.List<io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus>
          getCurrentMetricsList() {
        if (currentMetricsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(currentMetrics_);
        } else {
          return currentMetricsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;
       * </code>
       */
      public int getCurrentMetricsCount() {
        if (currentMetricsBuilder_ == null) {
          return currentMetrics_.size();
        } else {
          return currentMetricsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus getCurrentMetrics(
          int index) {
        if (currentMetricsBuilder_ == null) {
          return currentMetrics_.get(index);
        } else {
          return currentMetricsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;
       * </code>
       */
      public Builder setCurrentMetrics(
          int index, io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus value) {
        if (currentMetricsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCurrentMetricsIsMutable();
          currentMetrics_.set(index, value);
          onChanged();
        } else {
          currentMetricsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;
       * </code>
       */
      public Builder setCurrentMetrics(
          int index,
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus.Builder builderForValue) {
        if (currentMetricsBuilder_ == null) {
          ensureCurrentMetricsIsMutable();
          currentMetrics_.set(index, builderForValue.build());
          onChanged();
        } else {
          currentMetricsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;
       * </code>
       */
      public Builder addCurrentMetrics(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus value) {
        if (currentMetricsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCurrentMetricsIsMutable();
          currentMetrics_.add(value);
          onChanged();
        } else {
          currentMetricsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;
       * </code>
       */
      public Builder addCurrentMetrics(
          int index, io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus value) {
        if (currentMetricsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCurrentMetricsIsMutable();
          currentMetrics_.add(index, value);
          onChanged();
        } else {
          currentMetricsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;
       * </code>
       */
      public Builder addCurrentMetrics(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus.Builder builderForValue) {
        if (currentMetricsBuilder_ == null) {
          ensureCurrentMetricsIsMutable();
          currentMetrics_.add(builderForValue.build());
          onChanged();
        } else {
          currentMetricsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;
       * </code>
       */
      public Builder addCurrentMetrics(
          int index,
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus.Builder builderForValue) {
        if (currentMetricsBuilder_ == null) {
          ensureCurrentMetricsIsMutable();
          currentMetrics_.add(index, builderForValue.build());
          onChanged();
        } else {
          currentMetricsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;
       * </code>
       */
      public Builder addAllCurrentMetrics(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus>
              values) {
        if (currentMetricsBuilder_ == null) {
          ensureCurrentMetricsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, currentMetrics_);
          onChanged();
        } else {
          currentMetricsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;
       * </code>
       */
      public Builder clearCurrentMetrics() {
        if (currentMetricsBuilder_ == null) {
          currentMetrics_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          currentMetricsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;
       * </code>
       */
      public Builder removeCurrentMetrics(int index) {
        if (currentMetricsBuilder_ == null) {
          ensureCurrentMetricsIsMutable();
          currentMetrics_.remove(index);
          onChanged();
        } else {
          currentMetricsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus.Builder
          getCurrentMetricsBuilder(int index) {
        return getCurrentMetricsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatusOrBuilder
          getCurrentMetricsOrBuilder(int index) {
        if (currentMetricsBuilder_ == null) {
          return currentMetrics_.get(index);
        } else {
          return currentMetricsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;
       * </code>
       */
      public java.util.List<
              ? extends io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatusOrBuilder>
          getCurrentMetricsOrBuilderList() {
        if (currentMetricsBuilder_ != null) {
          return currentMetricsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(currentMetrics_);
        }
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus.Builder
          addCurrentMetricsBuilder() {
        return getCurrentMetricsFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus.Builder
          addCurrentMetricsBuilder(int index) {
        return getCurrentMetricsFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * currentMetrics is the last read state of the metrics used by this autoscaler.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.autoscaling.v2beta2.MetricStatus currentMetrics = 5;
       * </code>
       */
      public java.util.List<io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus.Builder>
          getCurrentMetricsBuilderList() {
        return getCurrentMetricsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatusOrBuilder>
          getCurrentMetricsFieldBuilder() {
        if (currentMetricsBuilder_ == null) {
          currentMetricsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatusOrBuilder>(
                  currentMetrics_,
                  ((bitField0_ & 0x00000010) == 0x00000010),
                  getParentForChildren(),
                  isClean());
          currentMetrics_ = null;
        }
        return currentMetricsBuilder_;
      }

      private java.util.List<
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition>
          conditions_ = java.util.Collections.emptyList();

      private void ensureConditionsIsMutable() {
        if (!((bitField0_ & 0x00000020) == 0x00000020)) {
          conditions_ =
              new java.util.ArrayList<
                  io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition>(
                  conditions_);
          bitField0_ |= 0x00000020;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition,
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
                  .Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling
                  .HorizontalPodAutoscalerConditionOrBuilder>
          conditionsBuilder_;

      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition>
          getConditionsList() {
        if (conditionsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(conditions_);
        } else {
          return conditionsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public int getConditionsCount() {
        if (conditionsBuilder_ == null) {
          return conditions_.size();
        } else {
          return conditionsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
          getConditions(int index) {
        if (conditionsBuilder_ == null) {
          return conditions_.get(index);
        } else {
          return conditionsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public Builder setConditions(
          int index,
          io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition value) {
        if (conditionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureConditionsIsMutable();
          conditions_.set(index, value);
          onChanged();
        } else {
          conditionsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public Builder setConditions(
          int index,
          io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition.Builder
              builderForValue) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          conditions_.set(index, builderForValue.build());
          onChanged();
        } else {
          conditionsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public Builder addConditions(
          io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition value) {
        if (conditionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureConditionsIsMutable();
          conditions_.add(value);
          onChanged();
        } else {
          conditionsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public Builder addConditions(
          int index,
          io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition value) {
        if (conditionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureConditionsIsMutable();
          conditions_.add(index, value);
          onChanged();
        } else {
          conditionsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public Builder addConditions(
          io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition.Builder
              builderForValue) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          conditions_.add(builderForValue.build());
          onChanged();
        } else {
          conditionsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public Builder addConditions(
          int index,
          io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition.Builder
              builderForValue) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          conditions_.add(index, builderForValue.build());
          onChanged();
        } else {
          conditionsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public Builder addAllConditions(
          java.lang.Iterable<
                  ? extends
                      io.kubernetes.client.proto.V2beta2Autoscaling
                          .HorizontalPodAutoscalerCondition>
              values) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, conditions_);
          onChanged();
        } else {
          conditionsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public Builder clearConditions() {
        if (conditionsBuilder_ == null) {
          conditions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000020);
          onChanged();
        } else {
          conditionsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public Builder removeConditions(int index) {
        if (conditionsBuilder_ == null) {
          ensureConditionsIsMutable();
          conditions_.remove(index);
          onChanged();
        } else {
          conditionsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition.Builder
          getConditionsBuilder(int index) {
        return getConditionsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerConditionOrBuilder
          getConditionsOrBuilder(int index) {
        if (conditionsBuilder_ == null) {
          return conditions_.get(index);
        } else {
          return conditionsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public java.util.List<
              ? extends
                  io.kubernetes.client.proto.V2beta2Autoscaling
                      .HorizontalPodAutoscalerConditionOrBuilder>
          getConditionsOrBuilderList() {
        if (conditionsBuilder_ != null) {
          return conditionsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(conditions_);
        }
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition.Builder
          addConditionsBuilder() {
        return getConditionsFieldBuilder()
            .addBuilder(
                io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition.Builder
          addConditionsBuilder(int index) {
        return getConditionsFieldBuilder()
            .addBuilder(
                index,
                io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
                    .getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * conditions is the set of conditions required for this autoscaler to scale its target,
       * and indicates whether or not those conditions are met.
       * </pre>
       *
       * <code>
       * repeated .k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerCondition conditions = 6;
       * </code>
       */
      public java.util.List<
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
                  .Builder>
          getConditionsBuilderList() {
        return getConditionsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition,
              io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
                  .Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling
                  .HorizontalPodAutoscalerConditionOrBuilder>
          getConditionsFieldBuilder() {
        if (conditionsBuilder_ == null) {
          conditionsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition,
                  io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerCondition
                      .Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling
                      .HorizontalPodAutoscalerConditionOrBuilder>(
                  conditions_,
                  ((bitField0_ & 0x00000020) == 0x00000020),
                  getParentForChildren(),
                  isClean());
          conditions_ = null;
        }
        return conditionsBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta2.HorizontalPodAutoscalerStatus)
    private static final io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE =
          new io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus();
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<HorizontalPodAutoscalerStatus> PARSER =
        new com.google.protobuf.AbstractParser<HorizontalPodAutoscalerStatus>() {
          @java.lang.Override
          public HorizontalPodAutoscalerStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new HorizontalPodAutoscalerStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<HorizontalPodAutoscalerStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HorizontalPodAutoscalerStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta2Autoscaling.HorizontalPodAutoscalerStatus
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface MetricIdentifierOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta2.MetricIdentifier)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * name is the name of the given metric
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    boolean hasName();
    /**
     *
     *
     * <pre>
     * name is the name of the given metric
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    java.lang.String getName();
    /**
     *
     *
     * <pre>
     * name is the name of the given metric
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    com.google.protobuf.ByteString getNameBytes();

    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
     */
    boolean hasSelector();
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
     */
    io.kubernetes.client.proto.Meta.LabelSelector getSelector();
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
     */
    io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * MetricIdentifier defines the name and optionally selector for a metric
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.MetricIdentifier}
   */
  public static final class MetricIdentifier extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta2.MetricIdentifier)
      MetricIdentifierOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use MetricIdentifier.newBuilder() to construct.
    private MetricIdentifier(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private MetricIdentifier() {
      name_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private MetricIdentifier(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                name_ = bs;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.Meta.LabelSelector.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = selector_.toBuilder();
                }
                selector_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.LabelSelector.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(selector_);
                  selector_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_MetricIdentifier_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_MetricIdentifier_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.class,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     *
     *
     * <pre>
     * name is the name of the given metric
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * name is the name of the given metric
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * name is the name of the given metric
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SELECTOR_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.Meta.LabelSelector selector_;
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
     */
    public boolean hasSelector() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelector getSelector() {
      return selector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : selector_;
    }
    /**
     *
     *
     * <pre>
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric
     * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
     * When unset, just the metricName will be used to gather metrics.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;</code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder() {
      return selector_ == null
          ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
          : selector_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getSelector());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSelector());
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
      if (!(obj instanceof io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier other =
          (io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier) obj;

      boolean result = true;
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName().equals(other.getName());
      }
      result = result && (hasSelector() == other.hasSelector());
      if (hasSelector()) {
        result = result && getSelector().equals(other.getSelector());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasSelector()) {
        hash = (37 * hash) + SELECTOR_FIELD_NUMBER;
        hash = (53 * hash) + getSelector().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * MetricIdentifier defines the name and optionally selector for a metric
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.MetricIdentifier}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta2.MetricIdentifier)
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_MetricIdentifier_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_MetricIdentifier_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.class,
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getSelectorFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (selectorBuilder_ == null) {
          selector_ = null;
        } else {
          selectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_MetricIdentifier_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier build() {
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier buildPartial() {
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier result =
            new io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (selectorBuilder_ == null) {
          result.selector_ = selector_;
        } else {
          result.selector_ = selectorBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier) {
          return mergeFrom((io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier other) {
        if (other
            == io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance())
          return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasSelector()) {
          mergeSelector(other.getSelector());
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
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       *
       *
       * <pre>
       * name is the name of the given metric
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * name is the name of the given metric
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * name is the name of the given metric
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public com.google.protobuf.ByteString getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * name is the name of the given metric
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder setName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * name is the name of the given metric
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * name is the name of the given metric
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder setNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.Meta.LabelSelector selector_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          selectorBuilder_;
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;
       * </code>
       */
      public boolean hasSelector() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector getSelector() {
        if (selectorBuilder_ == null) {
          return selector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : selector_;
        } else {
          return selectorBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;
       * </code>
       */
      public Builder setSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (selectorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          selector_ = value;
          onChanged();
        } else {
          selectorBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;
       * </code>
       */
      public Builder setSelector(
          io.kubernetes.client.proto.Meta.LabelSelector.Builder builderForValue) {
        if (selectorBuilder_ == null) {
          selector_ = builderForValue.build();
          onChanged();
        } else {
          selectorBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;
       * </code>
       */
      public Builder mergeSelector(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (selectorBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && selector_ != null
              && selector_ != io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()) {
            selector_ =
                io.kubernetes.client.proto.Meta.LabelSelector.newBuilder(selector_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            selector_ = value;
          }
          onChanged();
        } else {
          selectorBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;
       * </code>
       */
      public Builder clearSelector() {
        if (selectorBuilder_ == null) {
          selector_ = null;
          onChanged();
        } else {
          selectorBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector.Builder getSelectorBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSelectorFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getSelectorOrBuilder() {
        if (selectorBuilder_ != null) {
          return selectorBuilder_.getMessageOrBuilder();
        } else {
          return selector_ == null
              ? io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance()
              : selector_;
        }
      }
      /**
       *
       *
       * <pre>
       * selector is the string-encoded form of a standard kubernetes label selector for the given metric
       * When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping.
       * When unset, just the metricName will be used to gather metrics.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector selector = 2;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          getSelectorFieldBuilder() {
        if (selectorBuilder_ == null) {
          selectorBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.LabelSelector,
                  io.kubernetes.client.proto.Meta.LabelSelector.Builder,
                  io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>(
                  getSelector(), getParentForChildren(), isClean());
          selector_ = null;
        }
        return selectorBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta2.MetricIdentifier)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta2.MetricIdentifier)
    private static final io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier();
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<MetricIdentifier> PARSER =
        new com.google.protobuf.AbstractParser<MetricIdentifier>() {
          @java.lang.Override
          public MetricIdentifier parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new MetricIdentifier(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<MetricIdentifier> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MetricIdentifier> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface MetricSpecOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta2.MetricSpec)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It should be one of "Object",
     * "Pods" or "Resource", each mapping to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    boolean hasType();
    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It should be one of "Object",
     * "Pods" or "Resource", each mapping to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    java.lang.String getType();
    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It should be one of "Object",
     * "Pods" or "Resource", each mapping to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    com.google.protobuf.ByteString getTypeBytes();

    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricSource object = 2;</code>
     */
    boolean hasObject();
    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricSource object = 2;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource getObject();
    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricSource object = 2;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSourceOrBuilder getObjectOrBuilder();

    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricSource pods = 3;</code>
     */
    boolean hasPods();
    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricSource pods = 3;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource getPods();
    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricSource pods = 3;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSourceOrBuilder getPodsOrBuilder();

    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricSource resource = 4;</code>
     */
    boolean hasResource();
    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricSource resource = 4;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource getResource();
    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricSource resource = 4;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSourceOrBuilder
        getResourceOrBuilder();

    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricSource external = 5;</code>
     */
    boolean hasExternal();
    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricSource external = 5;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource getExternal();
    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricSource external = 5;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSourceOrBuilder
        getExternalOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * MetricSpec specifies how to scale based on a single metric
   * (only `type` and one other matching field should be set at once).
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.MetricSpec}
   */
  public static final class MetricSpec extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta2.MetricSpec)
      MetricSpecOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use MetricSpec.newBuilder() to construct.
    private MetricSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private MetricSpec() {
      type_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private MetricSpec(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                type_ = bs;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = object_.toBuilder();
                }
                object_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(object_);
                  object_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = pods_.toBuilder();
                }
                pods_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(pods_);
                  pods_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            case 34:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                  subBuilder = resource_.toBuilder();
                }
                resource_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(resource_);
                  resource_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000008;
                break;
              }
            case 42:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000010) == 0x00000010)) {
                  subBuilder = external_.toBuilder();
                }
                external_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(external_);
                  external_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000010;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_MetricSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_MetricSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec.class,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec.Builder.class);
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private volatile java.lang.Object type_;
    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It should be one of "Object",
     * "Pods" or "Resource", each mapping to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It should be one of "Object",
     * "Pods" or "Resource", each mapping to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          type_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It should be one of "Object",
     * "Pods" or "Resource", each mapping to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public com.google.protobuf.ByteString getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int OBJECT_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource object_;
    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricSource object = 2;</code>
     */
    public boolean hasObject() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricSource object = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource getObject() {
      return object_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource.getDefaultInstance()
          : object_;
    }
    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricSource object = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSourceOrBuilder
        getObjectOrBuilder() {
      return object_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource.getDefaultInstance()
          : object_;
    }

    public static final int PODS_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource pods_;
    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricSource pods = 3;</code>
     */
    public boolean hasPods() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricSource pods = 3;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource getPods() {
      return pods_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource.getDefaultInstance()
          : pods_;
    }
    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricSource pods = 3;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSourceOrBuilder
        getPodsOrBuilder() {
      return pods_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource.getDefaultInstance()
          : pods_;
    }

    public static final int RESOURCE_FIELD_NUMBER = 4;
    private io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource resource_;
    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricSource resource = 4;</code>
     */
    public boolean hasResource() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricSource resource = 4;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource getResource() {
      return resource_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource.getDefaultInstance()
          : resource_;
    }
    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricSource resource = 4;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSourceOrBuilder
        getResourceOrBuilder() {
      return resource_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource.getDefaultInstance()
          : resource_;
    }

    public static final int EXTERNAL_FIELD_NUMBER = 5;
    private io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource external_;
    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricSource external = 5;</code>
     */
    public boolean hasExternal() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricSource external = 5;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource getExternal() {
      return external_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource.getDefaultInstance()
          : external_;
    }
    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricSource external = 5;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSourceOrBuilder
        getExternalOrBuilder() {
      return external_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource.getDefaultInstance()
          : external_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getObject());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getPods());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(4, getResource());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeMessage(5, getExternal());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getObject());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getPods());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getResource());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, getExternal());
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
      if (!(obj instanceof io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec other =
          (io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec) obj;

      boolean result = true;
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && getType().equals(other.getType());
      }
      result = result && (hasObject() == other.hasObject());
      if (hasObject()) {
        result = result && getObject().equals(other.getObject());
      }
      result = result && (hasPods() == other.hasPods());
      if (hasPods()) {
        result = result && getPods().equals(other.getPods());
      }
      result = result && (hasResource() == other.hasResource());
      if (hasResource()) {
        result = result && getResource().equals(other.getResource());
      }
      result = result && (hasExternal() == other.hasExternal());
      if (hasExternal()) {
        result = result && getExternal().equals(other.getExternal());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType().hashCode();
      }
      if (hasObject()) {
        hash = (37 * hash) + OBJECT_FIELD_NUMBER;
        hash = (53 * hash) + getObject().hashCode();
      }
      if (hasPods()) {
        hash = (37 * hash) + PODS_FIELD_NUMBER;
        hash = (53 * hash) + getPods().hashCode();
      }
      if (hasResource()) {
        hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getResource().hashCode();
      }
      if (hasExternal()) {
        hash = (37 * hash) + EXTERNAL_FIELD_NUMBER;
        hash = (53 * hash) + getExternal().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * MetricSpec specifies how to scale based on a single metric
     * (only `type` and one other matching field should be set at once).
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.MetricSpec}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta2.MetricSpec)
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpecOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_MetricSpec_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_MetricSpec_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec.class,
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getObjectFieldBuilder();
          getPodsFieldBuilder();
          getResourceFieldBuilder();
          getExternalFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (objectBuilder_ == null) {
          object_ = null;
        } else {
          objectBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (podsBuilder_ == null) {
          pods_ = null;
        } else {
          podsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (resourceBuilder_ == null) {
          resource_ = null;
        } else {
          resourceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        if (externalBuilder_ == null) {
          external_ = null;
        } else {
          externalBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_MetricSpec_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec build() {
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec buildPartial() {
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec result =
            new io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (objectBuilder_ == null) {
          result.object_ = object_;
        } else {
          result.object_ = objectBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (podsBuilder_ == null) {
          result.pods_ = pods_;
        } else {
          result.pods_ = podsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (resourceBuilder_ == null) {
          result.resource_ = resource_;
        } else {
          result.resource_ = resourceBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        if (externalBuilder_ == null) {
          result.external_ = external_;
        } else {
          result.external_ = externalBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec) {
          return mergeFrom((io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec other) {
        if (other == io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec.getDefaultInstance())
          return this;
        if (other.hasType()) {
          bitField0_ |= 0x00000001;
          type_ = other.type_;
          onChanged();
        }
        if (other.hasObject()) {
          mergeObject(other.getObject());
        }
        if (other.hasPods()) {
          mergePods(other.getPods());
        }
        if (other.hasResource()) {
          mergeResource(other.getResource());
        }
        if (other.hasExternal()) {
          mergeExternal(other.getExternal());
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
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object type_ = "";
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It should be one of "Object",
       * "Pods" or "Resource", each mapping to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It should be one of "Object",
       * "Pods" or "Resource", each mapping to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            type_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It should be one of "Object",
       * "Pods" or "Resource", each mapping to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public com.google.protobuf.ByteString getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It should be one of "Object",
       * "Pods" or "Resource", each mapping to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder setType(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It should be one of "Object",
       * "Pods" or "Resource", each mapping to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It should be one of "Object",
       * "Pods" or "Resource", each mapping to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder setTypeBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource object_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource,
              io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSourceOrBuilder>
          objectBuilder_;
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricSource object = 2;</code>
       */
      public boolean hasObject() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricSource object = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource getObject() {
        if (objectBuilder_ == null) {
          return object_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource
                  .getDefaultInstance()
              : object_;
        } else {
          return objectBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricSource object = 2;</code>
       */
      public Builder setObject(
          io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource value) {
        if (objectBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          object_ = value;
          onChanged();
        } else {
          objectBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricSource object = 2;</code>
       */
      public Builder setObject(
          io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource.Builder
              builderForValue) {
        if (objectBuilder_ == null) {
          object_ = builderForValue.build();
          onChanged();
        } else {
          objectBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricSource object = 2;</code>
       */
      public Builder mergeObject(
          io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource value) {
        if (objectBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && object_ != null
              && object_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource
                      .getDefaultInstance()) {
            object_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource.newBuilder(object_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            object_ = value;
          }
          onChanged();
        } else {
          objectBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricSource object = 2;</code>
       */
      public Builder clearObject() {
        if (objectBuilder_ == null) {
          object_ = null;
          onChanged();
        } else {
          objectBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricSource object = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource.Builder
          getObjectBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getObjectFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricSource object = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSourceOrBuilder
          getObjectOrBuilder() {
        if (objectBuilder_ != null) {
          return objectBuilder_.getMessageOrBuilder();
        } else {
          return object_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource
                  .getDefaultInstance()
              : object_;
        }
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricSource object = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource,
              io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSourceOrBuilder>
          getObjectFieldBuilder() {
        if (objectBuilder_ == null) {
          objectBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource,
                  io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSourceOrBuilder>(
                  getObject(), getParentForChildren(), isClean());
          object_ = null;
        }
        return objectBuilder_;
      }

      private io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource pods_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource,
              io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSourceOrBuilder>
          podsBuilder_;
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricSource pods = 3;</code>
       */
      public boolean hasPods() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricSource pods = 3;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource getPods() {
        if (podsBuilder_ == null) {
          return pods_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource.getDefaultInstance()
              : pods_;
        } else {
          return podsBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricSource pods = 3;</code>
       */
      public Builder setPods(io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource value) {
        if (podsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pods_ = value;
          onChanged();
        } else {
          podsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricSource pods = 3;</code>
       */
      public Builder setPods(
          io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource.Builder builderForValue) {
        if (podsBuilder_ == null) {
          pods_ = builderForValue.build();
          onChanged();
        } else {
          podsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricSource pods = 3;</code>
       */
      public Builder mergePods(
          io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource value) {
        if (podsBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && pods_ != null
              && pods_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource
                      .getDefaultInstance()) {
            pods_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource.newBuilder(pods_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            pods_ = value;
          }
          onChanged();
        } else {
          podsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricSource pods = 3;</code>
       */
      public Builder clearPods() {
        if (podsBuilder_ == null) {
          pods_ = null;
          onChanged();
        } else {
          podsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricSource pods = 3;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource.Builder
          getPodsBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getPodsFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricSource pods = 3;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSourceOrBuilder
          getPodsOrBuilder() {
        if (podsBuilder_ != null) {
          return podsBuilder_.getMessageOrBuilder();
        } else {
          return pods_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource.getDefaultInstance()
              : pods_;
        }
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricSource pods = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource,
              io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSourceOrBuilder>
          getPodsFieldBuilder() {
        if (podsBuilder_ == null) {
          podsBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource,
                  io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSourceOrBuilder>(
                  getPods(), getParentForChildren(), isClean());
          pods_ = null;
        }
        return podsBuilder_;
      }

      private io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource resource_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource,
              io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSourceOrBuilder>
          resourceBuilder_;
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricSource resource = 4;
       * </code>
       */
      public boolean hasResource() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricSource resource = 4;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource getResource() {
        if (resourceBuilder_ == null) {
          return resource_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource
                  .getDefaultInstance()
              : resource_;
        } else {
          return resourceBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricSource resource = 4;
       * </code>
       */
      public Builder setResource(
          io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource value) {
        if (resourceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          resource_ = value;
          onChanged();
        } else {
          resourceBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricSource resource = 4;
       * </code>
       */
      public Builder setResource(
          io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource.Builder
              builderForValue) {
        if (resourceBuilder_ == null) {
          resource_ = builderForValue.build();
          onChanged();
        } else {
          resourceBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricSource resource = 4;
       * </code>
       */
      public Builder mergeResource(
          io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource value) {
        if (resourceBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)
              && resource_ != null
              && resource_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource
                      .getDefaultInstance()) {
            resource_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource.newBuilder(
                        resource_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            resource_ = value;
          }
          onChanged();
        } else {
          resourceBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricSource resource = 4;
       * </code>
       */
      public Builder clearResource() {
        if (resourceBuilder_ == null) {
          resource_ = null;
          onChanged();
        } else {
          resourceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricSource resource = 4;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource.Builder
          getResourceBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getResourceFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricSource resource = 4;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSourceOrBuilder
          getResourceOrBuilder() {
        if (resourceBuilder_ != null) {
          return resourceBuilder_.getMessageOrBuilder();
        } else {
          return resource_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource
                  .getDefaultInstance()
              : resource_;
        }
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricSource resource = 4;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource,
              io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSourceOrBuilder>
          getResourceFieldBuilder() {
        if (resourceBuilder_ == null) {
          resourceBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource,
                  io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSourceOrBuilder>(
                  getResource(), getParentForChildren(), isClean());
          resource_ = null;
        }
        return resourceBuilder_;
      }

      private io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource external_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource,
              io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSourceOrBuilder>
          externalBuilder_;
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricSource external = 5;
       * </code>
       */
      public boolean hasExternal() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricSource external = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource getExternal() {
        if (externalBuilder_ == null) {
          return external_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource
                  .getDefaultInstance()
              : external_;
        } else {
          return externalBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricSource external = 5;
       * </code>
       */
      public Builder setExternal(
          io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource value) {
        if (externalBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          external_ = value;
          onChanged();
        } else {
          externalBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricSource external = 5;
       * </code>
       */
      public Builder setExternal(
          io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource.Builder
              builderForValue) {
        if (externalBuilder_ == null) {
          external_ = builderForValue.build();
          onChanged();
        } else {
          externalBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricSource external = 5;
       * </code>
       */
      public Builder mergeExternal(
          io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource value) {
        if (externalBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)
              && external_ != null
              && external_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource
                      .getDefaultInstance()) {
            external_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource.newBuilder(
                        external_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            external_ = value;
          }
          onChanged();
        } else {
          externalBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricSource external = 5;
       * </code>
       */
      public Builder clearExternal() {
        if (externalBuilder_ == null) {
          external_ = null;
          onChanged();
        } else {
          externalBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricSource external = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource.Builder
          getExternalBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getExternalFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricSource external = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSourceOrBuilder
          getExternalOrBuilder() {
        if (externalBuilder_ != null) {
          return externalBuilder_.getMessageOrBuilder();
        } else {
          return external_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource
                  .getDefaultInstance()
              : external_;
        }
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricSource external = 5;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource,
              io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSourceOrBuilder>
          getExternalFieldBuilder() {
        if (externalBuilder_ == null) {
          externalBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource,
                  io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSource.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricSourceOrBuilder>(
                  getExternal(), getParentForChildren(), isClean());
          external_ = null;
        }
        return externalBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta2.MetricSpec)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta2.MetricSpec)
    private static final io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec();
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<MetricSpec> PARSER =
        new com.google.protobuf.AbstractParser<MetricSpec>() {
          @java.lang.Override
          public MetricSpec parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new MetricSpec(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<MetricSpec> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MetricSpec> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricSpec getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface MetricStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta2.MetricStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It will be one of "Object",
     * "Pods" or "Resource", each corresponds to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    boolean hasType();
    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It will be one of "Object",
     * "Pods" or "Resource", each corresponds to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    java.lang.String getType();
    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It will be one of "Object",
     * "Pods" or "Resource", each corresponds to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    com.google.protobuf.ByteString getTypeBytes();

    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricStatus object = 2;</code>
     */
    boolean hasObject();
    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricStatus object = 2;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus getObject();
    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricStatus object = 2;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatusOrBuilder getObjectOrBuilder();

    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricStatus pods = 3;</code>
     */
    boolean hasPods();
    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricStatus pods = 3;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus getPods();
    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricStatus pods = 3;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatusOrBuilder getPodsOrBuilder();

    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricStatus resource = 4;</code>
     */
    boolean hasResource();
    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricStatus resource = 4;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus getResource();
    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricStatus resource = 4;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatusOrBuilder
        getResourceOrBuilder();

    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricStatus external = 5;</code>
     */
    boolean hasExternal();
    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricStatus external = 5;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus getExternal();
    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricStatus external = 5;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatusOrBuilder
        getExternalOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * MetricStatus describes the last-read state of a single metric.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.MetricStatus}
   */
  public static final class MetricStatus extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta2.MetricStatus)
      MetricStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use MetricStatus.newBuilder() to construct.
    private MetricStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private MetricStatus() {
      type_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private MetricStatus(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                type_ = bs;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = object_.toBuilder();
                }
                object_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(object_);
                  object_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = pods_.toBuilder();
                }
                pods_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(pods_);
                  pods_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            case 34:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                  subBuilder = resource_.toBuilder();
                }
                resource_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(resource_);
                  resource_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000008;
                break;
              }
            case 42:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000010) == 0x00000010)) {
                  subBuilder = external_.toBuilder();
                }
                external_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(external_);
                  external_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000010;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_MetricStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_MetricStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus.class,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus.Builder.class);
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private volatile java.lang.Object type_;
    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It will be one of "Object",
     * "Pods" or "Resource", each corresponds to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It will be one of "Object",
     * "Pods" or "Resource", each corresponds to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          type_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * type is the type of metric source.  It will be one of "Object",
     * "Pods" or "Resource", each corresponds to a matching field in the object.
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public com.google.protobuf.ByteString getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int OBJECT_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus object_;
    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricStatus object = 2;</code>
     */
    public boolean hasObject() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricStatus object = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus getObject() {
      return object_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus.getDefaultInstance()
          : object_;
    }
    /**
     *
     *
     * <pre>
     * object refers to a metric describing a single kubernetes object
     * (for example, hits-per-second on an Ingress object).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricStatus object = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatusOrBuilder
        getObjectOrBuilder() {
      return object_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus.getDefaultInstance()
          : object_;
    }

    public static final int PODS_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus pods_;
    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricStatus pods = 3;</code>
     */
    public boolean hasPods() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricStatus pods = 3;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus getPods() {
      return pods_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus.getDefaultInstance()
          : pods_;
    }
    /**
     *
     *
     * <pre>
     * pods refers to a metric describing each pod in the current scale target
     * (for example, transactions-processed-per-second).  The values will be
     * averaged together before being compared to the target value.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricStatus pods = 3;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatusOrBuilder
        getPodsOrBuilder() {
      return pods_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus.getDefaultInstance()
          : pods_;
    }

    public static final int RESOURCE_FIELD_NUMBER = 4;
    private io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus resource_;
    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricStatus resource = 4;</code>
     */
    public boolean hasResource() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricStatus resource = 4;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus getResource() {
      return resource_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus.getDefaultInstance()
          : resource_;
    }
    /**
     *
     *
     * <pre>
     * resource refers to a resource metric (such as those specified in
     * requests and limits) known to Kubernetes describing each pod in the
     * current scale target (e.g. CPU or memory). Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available
     * to normal per-pod metrics using the "pods" source.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricStatus resource = 4;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatusOrBuilder
        getResourceOrBuilder() {
      return resource_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus.getDefaultInstance()
          : resource_;
    }

    public static final int EXTERNAL_FIELD_NUMBER = 5;
    private io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus external_;
    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricStatus external = 5;</code>
     */
    public boolean hasExternal() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricStatus external = 5;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus getExternal() {
      return external_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus.getDefaultInstance()
          : external_;
    }
    /**
     *
     *
     * <pre>
     * external refers to a global metric that is not associated
     * with any Kubernetes object. It allows autoscaling based on information
     * coming from components running outside of cluster
     * (for example length of queue in cloud messaging service, or
     * QPS from loadbalancer running outside of cluster).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricStatus external = 5;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatusOrBuilder
        getExternalOrBuilder() {
      return external_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus.getDefaultInstance()
          : external_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getObject());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getPods());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(4, getResource());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeMessage(5, getExternal());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getObject());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getPods());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getResource());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, getExternal());
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
      if (!(obj instanceof io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus other =
          (io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus) obj;

      boolean result = true;
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && getType().equals(other.getType());
      }
      result = result && (hasObject() == other.hasObject());
      if (hasObject()) {
        result = result && getObject().equals(other.getObject());
      }
      result = result && (hasPods() == other.hasPods());
      if (hasPods()) {
        result = result && getPods().equals(other.getPods());
      }
      result = result && (hasResource() == other.hasResource());
      if (hasResource()) {
        result = result && getResource().equals(other.getResource());
      }
      result = result && (hasExternal() == other.hasExternal());
      if (hasExternal()) {
        result = result && getExternal().equals(other.getExternal());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType().hashCode();
      }
      if (hasObject()) {
        hash = (37 * hash) + OBJECT_FIELD_NUMBER;
        hash = (53 * hash) + getObject().hashCode();
      }
      if (hasPods()) {
        hash = (37 * hash) + PODS_FIELD_NUMBER;
        hash = (53 * hash) + getPods().hashCode();
      }
      if (hasResource()) {
        hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getResource().hashCode();
      }
      if (hasExternal()) {
        hash = (37 * hash) + EXTERNAL_FIELD_NUMBER;
        hash = (53 * hash) + getExternal().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * MetricStatus describes the last-read state of a single metric.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.MetricStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta2.MetricStatus)
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_MetricStatus_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_MetricStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus.class,
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getObjectFieldBuilder();
          getPodsFieldBuilder();
          getResourceFieldBuilder();
          getExternalFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (objectBuilder_ == null) {
          object_ = null;
        } else {
          objectBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (podsBuilder_ == null) {
          pods_ = null;
        } else {
          podsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (resourceBuilder_ == null) {
          resource_ = null;
        } else {
          resourceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        if (externalBuilder_ == null) {
          external_ = null;
        } else {
          externalBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_MetricStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus build() {
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus buildPartial() {
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus result =
            new io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (objectBuilder_ == null) {
          result.object_ = object_;
        } else {
          result.object_ = objectBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (podsBuilder_ == null) {
          result.pods_ = pods_;
        } else {
          result.pods_ = podsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (resourceBuilder_ == null) {
          result.resource_ = resource_;
        } else {
          result.resource_ = resourceBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        if (externalBuilder_ == null) {
          result.external_ = external_;
        } else {
          result.external_ = externalBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus) {
          return mergeFrom((io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus other) {
        if (other
            == io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus.getDefaultInstance())
          return this;
        if (other.hasType()) {
          bitField0_ |= 0x00000001;
          type_ = other.type_;
          onChanged();
        }
        if (other.hasObject()) {
          mergeObject(other.getObject());
        }
        if (other.hasPods()) {
          mergePods(other.getPods());
        }
        if (other.hasResource()) {
          mergeResource(other.getResource());
        }
        if (other.hasExternal()) {
          mergeExternal(other.getExternal());
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
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object type_ = "";
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It will be one of "Object",
       * "Pods" or "Resource", each corresponds to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It will be one of "Object",
       * "Pods" or "Resource", each corresponds to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            type_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It will be one of "Object",
       * "Pods" or "Resource", each corresponds to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public com.google.protobuf.ByteString getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It will be one of "Object",
       * "Pods" or "Resource", each corresponds to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder setType(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It will be one of "Object",
       * "Pods" or "Resource", each corresponds to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * type is the type of metric source.  It will be one of "Object",
       * "Pods" or "Resource", each corresponds to a matching field in the object.
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder setTypeBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus object_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus,
              io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatusOrBuilder>
          objectBuilder_;
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricStatus object = 2;</code>
       */
      public boolean hasObject() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricStatus object = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus getObject() {
        if (objectBuilder_ == null) {
          return object_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus
                  .getDefaultInstance()
              : object_;
        } else {
          return objectBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricStatus object = 2;</code>
       */
      public Builder setObject(
          io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus value) {
        if (objectBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          object_ = value;
          onChanged();
        } else {
          objectBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricStatus object = 2;</code>
       */
      public Builder setObject(
          io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus.Builder
              builderForValue) {
        if (objectBuilder_ == null) {
          object_ = builderForValue.build();
          onChanged();
        } else {
          objectBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricStatus object = 2;</code>
       */
      public Builder mergeObject(
          io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus value) {
        if (objectBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && object_ != null
              && object_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus
                      .getDefaultInstance()) {
            object_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus.newBuilder(object_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            object_ = value;
          }
          onChanged();
        } else {
          objectBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricStatus object = 2;</code>
       */
      public Builder clearObject() {
        if (objectBuilder_ == null) {
          object_ = null;
          onChanged();
        } else {
          objectBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricStatus object = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus.Builder
          getObjectBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getObjectFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricStatus object = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatusOrBuilder
          getObjectOrBuilder() {
        if (objectBuilder_ != null) {
          return objectBuilder_.getMessageOrBuilder();
        } else {
          return object_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus
                  .getDefaultInstance()
              : object_;
        }
      }
      /**
       *
       *
       * <pre>
       * object refers to a metric describing a single kubernetes object
       * (for example, hits-per-second on an Ingress object).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ObjectMetricStatus object = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus,
              io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatusOrBuilder>
          getObjectFieldBuilder() {
        if (objectBuilder_ == null) {
          objectBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus,
                  io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatusOrBuilder>(
                  getObject(), getParentForChildren(), isClean());
          object_ = null;
        }
        return objectBuilder_;
      }

      private io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus pods_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus,
              io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatusOrBuilder>
          podsBuilder_;
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricStatus pods = 3;</code>
       */
      public boolean hasPods() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricStatus pods = 3;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus getPods() {
        if (podsBuilder_ == null) {
          return pods_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus.getDefaultInstance()
              : pods_;
        } else {
          return podsBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricStatus pods = 3;</code>
       */
      public Builder setPods(io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus value) {
        if (podsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pods_ = value;
          onChanged();
        } else {
          podsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricStatus pods = 3;</code>
       */
      public Builder setPods(
          io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus.Builder builderForValue) {
        if (podsBuilder_ == null) {
          pods_ = builderForValue.build();
          onChanged();
        } else {
          podsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricStatus pods = 3;</code>
       */
      public Builder mergePods(
          io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus value) {
        if (podsBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && pods_ != null
              && pods_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus
                      .getDefaultInstance()) {
            pods_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus.newBuilder(pods_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            pods_ = value;
          }
          onChanged();
        } else {
          podsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricStatus pods = 3;</code>
       */
      public Builder clearPods() {
        if (podsBuilder_ == null) {
          pods_ = null;
          onChanged();
        } else {
          podsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricStatus pods = 3;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus.Builder
          getPodsBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getPodsFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricStatus pods = 3;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatusOrBuilder
          getPodsOrBuilder() {
        if (podsBuilder_ != null) {
          return podsBuilder_.getMessageOrBuilder();
        } else {
          return pods_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus.getDefaultInstance()
              : pods_;
        }
      }
      /**
       *
       *
       * <pre>
       * pods refers to a metric describing each pod in the current scale target
       * (for example, transactions-processed-per-second).  The values will be
       * averaged together before being compared to the target value.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.PodsMetricStatus pods = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus,
              io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatusOrBuilder>
          getPodsFieldBuilder() {
        if (podsBuilder_ == null) {
          podsBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus,
                  io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatusOrBuilder>(
                  getPods(), getParentForChildren(), isClean());
          pods_ = null;
        }
        return podsBuilder_;
      }

      private io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus resource_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus,
              io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatusOrBuilder>
          resourceBuilder_;
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricStatus resource = 4;
       * </code>
       */
      public boolean hasResource() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricStatus resource = 4;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus getResource() {
        if (resourceBuilder_ == null) {
          return resource_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus
                  .getDefaultInstance()
              : resource_;
        } else {
          return resourceBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricStatus resource = 4;
       * </code>
       */
      public Builder setResource(
          io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus value) {
        if (resourceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          resource_ = value;
          onChanged();
        } else {
          resourceBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricStatus resource = 4;
       * </code>
       */
      public Builder setResource(
          io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus.Builder
              builderForValue) {
        if (resourceBuilder_ == null) {
          resource_ = builderForValue.build();
          onChanged();
        } else {
          resourceBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricStatus resource = 4;
       * </code>
       */
      public Builder mergeResource(
          io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus value) {
        if (resourceBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)
              && resource_ != null
              && resource_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus
                      .getDefaultInstance()) {
            resource_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus.newBuilder(
                        resource_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            resource_ = value;
          }
          onChanged();
        } else {
          resourceBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricStatus resource = 4;
       * </code>
       */
      public Builder clearResource() {
        if (resourceBuilder_ == null) {
          resource_ = null;
          onChanged();
        } else {
          resourceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricStatus resource = 4;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus.Builder
          getResourceBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getResourceFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricStatus resource = 4;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatusOrBuilder
          getResourceOrBuilder() {
        if (resourceBuilder_ != null) {
          return resourceBuilder_.getMessageOrBuilder();
        } else {
          return resource_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus
                  .getDefaultInstance()
              : resource_;
        }
      }
      /**
       *
       *
       * <pre>
       * resource refers to a resource metric (such as those specified in
       * requests and limits) known to Kubernetes describing each pod in the
       * current scale target (e.g. CPU or memory). Such metrics are built in to
       * Kubernetes, and have special scaling options on top of those available
       * to normal per-pod metrics using the "pods" source.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ResourceMetricStatus resource = 4;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus,
              io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatusOrBuilder>
          getResourceFieldBuilder() {
        if (resourceBuilder_ == null) {
          resourceBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus,
                  io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatusOrBuilder>(
                  getResource(), getParentForChildren(), isClean());
          resource_ = null;
        }
        return resourceBuilder_;
      }

      private io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus external_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus,
              io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatusOrBuilder>
          externalBuilder_;
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricStatus external = 5;
       * </code>
       */
      public boolean hasExternal() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricStatus external = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus getExternal() {
        if (externalBuilder_ == null) {
          return external_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus
                  .getDefaultInstance()
              : external_;
        } else {
          return externalBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricStatus external = 5;
       * </code>
       */
      public Builder setExternal(
          io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus value) {
        if (externalBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          external_ = value;
          onChanged();
        } else {
          externalBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricStatus external = 5;
       * </code>
       */
      public Builder setExternal(
          io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus.Builder
              builderForValue) {
        if (externalBuilder_ == null) {
          external_ = builderForValue.build();
          onChanged();
        } else {
          externalBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricStatus external = 5;
       * </code>
       */
      public Builder mergeExternal(
          io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus value) {
        if (externalBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)
              && external_ != null
              && external_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus
                      .getDefaultInstance()) {
            external_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus.newBuilder(
                        external_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            external_ = value;
          }
          onChanged();
        } else {
          externalBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricStatus external = 5;
       * </code>
       */
      public Builder clearExternal() {
        if (externalBuilder_ == null) {
          external_ = null;
          onChanged();
        } else {
          externalBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricStatus external = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus.Builder
          getExternalBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getExternalFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricStatus external = 5;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatusOrBuilder
          getExternalOrBuilder() {
        if (externalBuilder_ != null) {
          return externalBuilder_.getMessageOrBuilder();
        } else {
          return external_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus
                  .getDefaultInstance()
              : external_;
        }
      }
      /**
       *
       *
       * <pre>
       * external refers to a global metric that is not associated
       * with any Kubernetes object. It allows autoscaling based on information
       * coming from components running outside of cluster
       * (for example length of queue in cloud messaging service, or
       * QPS from loadbalancer running outside of cluster).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.ExternalMetricStatus external = 5;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus,
              io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatusOrBuilder>
          getExternalFieldBuilder() {
        if (externalBuilder_ == null) {
          externalBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus,
                  io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatus.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.ExternalMetricStatusOrBuilder>(
                  getExternal(), getParentForChildren(), isClean());
          external_ = null;
        }
        return externalBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta2.MetricStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta2.MetricStatus)
    private static final io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus();
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<MetricStatus> PARSER =
        new com.google.protobuf.AbstractParser<MetricStatus>() {
          @java.lang.Override
          public MetricStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new MetricStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<MetricStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MetricStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricStatus getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface MetricTargetOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta2.MetricTarget)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * type represents whether the metric type is Utilization, Value, or AverageValue
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    boolean hasType();
    /**
     *
     *
     * <pre>
     * type represents whether the metric type is Utilization, Value, or AverageValue
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    java.lang.String getType();
    /**
     *
     *
     * <pre>
     * type represents whether the metric type is Utilization, Value, or AverageValue
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    com.google.protobuf.ByteString getTypeBytes();

    /**
     *
     *
     * <pre>
     * value is the target value of the metric (as a quantity).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 2;</code>
     */
    boolean hasValue();
    /**
     *
     *
     * <pre>
     * value is the target value of the metric (as a quantity).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 2;</code>
     */
    io.kubernetes.client.proto.Resource.Quantity getValue();
    /**
     *
     *
     * <pre>
     * value is the target value of the metric (as a quantity).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 2;</code>
     */
    io.kubernetes.client.proto.Resource.QuantityOrBuilder getValueOrBuilder();

    /**
     *
     *
     * <pre>
     * averageValue is the target value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 3;</code>
     */
    boolean hasAverageValue();
    /**
     *
     *
     * <pre>
     * averageValue is the target value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 3;</code>
     */
    io.kubernetes.client.proto.Resource.Quantity getAverageValue();
    /**
     *
     *
     * <pre>
     * averageValue is the target value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 3;</code>
     */
    io.kubernetes.client.proto.Resource.QuantityOrBuilder getAverageValueOrBuilder();

    /**
     *
     *
     * <pre>
     * averageUtilization is the target value of the average of the
     * resource metric across all relevant pods, represented as a percentage of
     * the requested value of the resource for the pods.
     * Currently only valid for Resource metric source type
     * +optional
     * </pre>
     *
     * <code>optional int32 averageUtilization = 4;</code>
     */
    boolean hasAverageUtilization();
    /**
     *
     *
     * <pre>
     * averageUtilization is the target value of the average of the
     * resource metric across all relevant pods, represented as a percentage of
     * the requested value of the resource for the pods.
     * Currently only valid for Resource metric source type
     * +optional
     * </pre>
     *
     * <code>optional int32 averageUtilization = 4;</code>
     */
    int getAverageUtilization();
  }
  /**
   *
   *
   * <pre>
   * MetricTarget defines the target value, average value, or average utilization of a specific metric
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.MetricTarget}
   */
  public static final class MetricTarget extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta2.MetricTarget)
      MetricTargetOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use MetricTarget.newBuilder() to construct.
    private MetricTarget(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private MetricTarget() {
      type_ = "";
      averageUtilization_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private MetricTarget(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                type_ = bs;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.Resource.Quantity.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = value_.toBuilder();
                }
                value_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Resource.Quantity.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(value_);
                  value_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.Resource.Quantity.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = averageValue_.toBuilder();
                }
                averageValue_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Resource.Quantity.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(averageValue_);
                  averageValue_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            case 32:
              {
                bitField0_ |= 0x00000008;
                averageUtilization_ = input.readInt32();
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_MetricTarget_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_MetricTarget_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.class,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder.class);
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private volatile java.lang.Object type_;
    /**
     *
     *
     * <pre>
     * type represents whether the metric type is Utilization, Value, or AverageValue
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * type represents whether the metric type is Utilization, Value, or AverageValue
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          type_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * type represents whether the metric type is Utilization, Value, or AverageValue
     * </pre>
     *
     * <code>optional string type = 1;</code>
     */
    public com.google.protobuf.ByteString getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VALUE_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.Resource.Quantity value_;
    /**
     *
     *
     * <pre>
     * value is the target value of the metric (as a quantity).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 2;</code>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * value is the target value of the metric (as a quantity).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 2;</code>
     */
    public io.kubernetes.client.proto.Resource.Quantity getValue() {
      return value_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : value_;
    }
    /**
     *
     *
     * <pre>
     * value is the target value of the metric (as a quantity).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 2;</code>
     */
    public io.kubernetes.client.proto.Resource.QuantityOrBuilder getValueOrBuilder() {
      return value_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : value_;
    }

    public static final int AVERAGEVALUE_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.Resource.Quantity averageValue_;
    /**
     *
     *
     * <pre>
     * averageValue is the target value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 3;</code>
     */
    public boolean hasAverageValue() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * averageValue is the target value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 3;</code>
     */
    public io.kubernetes.client.proto.Resource.Quantity getAverageValue() {
      return averageValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : averageValue_;
    }
    /**
     *
     *
     * <pre>
     * averageValue is the target value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 3;</code>
     */
    public io.kubernetes.client.proto.Resource.QuantityOrBuilder getAverageValueOrBuilder() {
      return averageValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : averageValue_;
    }

    public static final int AVERAGEUTILIZATION_FIELD_NUMBER = 4;
    private int averageUtilization_;
    /**
     *
     *
     * <pre>
     * averageUtilization is the target value of the average of the
     * resource metric across all relevant pods, represented as a percentage of
     * the requested value of the resource for the pods.
     * Currently only valid for Resource metric source type
     * +optional
     * </pre>
     *
     * <code>optional int32 averageUtilization = 4;</code>
     */
    public boolean hasAverageUtilization() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * averageUtilization is the target value of the average of the
     * resource metric across all relevant pods, represented as a percentage of
     * the requested value of the resource for the pods.
     * Currently only valid for Resource metric source type
     * +optional
     * </pre>
     *
     * <code>optional int32 averageUtilization = 4;</code>
     */
    public int getAverageUtilization() {
      return averageUtilization_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getValue());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getAverageValue());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, averageUtilization_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getValue());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getAverageValue());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, averageUtilization_);
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
      if (!(obj instanceof io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget other =
          (io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget) obj;

      boolean result = true;
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && getType().equals(other.getType());
      }
      result = result && (hasValue() == other.hasValue());
      if (hasValue()) {
        result = result && getValue().equals(other.getValue());
      }
      result = result && (hasAverageValue() == other.hasAverageValue());
      if (hasAverageValue()) {
        result = result && getAverageValue().equals(other.getAverageValue());
      }
      result = result && (hasAverageUtilization() == other.hasAverageUtilization());
      if (hasAverageUtilization()) {
        result = result && (getAverageUtilization() == other.getAverageUtilization());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType().hashCode();
      }
      if (hasValue()) {
        hash = (37 * hash) + VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getValue().hashCode();
      }
      if (hasAverageValue()) {
        hash = (37 * hash) + AVERAGEVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getAverageValue().hashCode();
      }
      if (hasAverageUtilization()) {
        hash = (37 * hash) + AVERAGEUTILIZATION_FIELD_NUMBER;
        hash = (53 * hash) + getAverageUtilization();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * MetricTarget defines the target value, average value, or average utilization of a specific metric
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.MetricTarget}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta2.MetricTarget)
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_MetricTarget_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_MetricTarget_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.class,
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getValueFieldBuilder();
          getAverageValueFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (valueBuilder_ == null) {
          value_ = null;
        } else {
          valueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (averageValueBuilder_ == null) {
          averageValue_ = null;
        } else {
          averageValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        averageUtilization_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_MetricTarget_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget build() {
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget buildPartial() {
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget result =
            new io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (valueBuilder_ == null) {
          result.value_ = value_;
        } else {
          result.value_ = valueBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (averageValueBuilder_ == null) {
          result.averageValue_ = averageValue_;
        } else {
          result.averageValue_ = averageValueBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.averageUtilization_ = averageUtilization_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget) {
          return mergeFrom((io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget other) {
        if (other
            == io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.getDefaultInstance())
          return this;
        if (other.hasType()) {
          bitField0_ |= 0x00000001;
          type_ = other.type_;
          onChanged();
        }
        if (other.hasValue()) {
          mergeValue(other.getValue());
        }
        if (other.hasAverageValue()) {
          mergeAverageValue(other.getAverageValue());
        }
        if (other.hasAverageUtilization()) {
          setAverageUtilization(other.getAverageUtilization());
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
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object type_ = "";
      /**
       *
       *
       * <pre>
       * type represents whether the metric type is Utilization, Value, or AverageValue
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * type represents whether the metric type is Utilization, Value, or AverageValue
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            type_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * type represents whether the metric type is Utilization, Value, or AverageValue
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public com.google.protobuf.ByteString getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * type represents whether the metric type is Utilization, Value, or AverageValue
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder setType(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * type represents whether the metric type is Utilization, Value, or AverageValue
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * type represents whether the metric type is Utilization, Value, or AverageValue
       * </pre>
       *
       * <code>optional string type = 1;</code>
       */
      public Builder setTypeBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.Resource.Quantity value_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          valueBuilder_;
      /**
       *
       *
       * <pre>
       * value is the target value of the metric (as a quantity).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 2;</code>
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * value is the target value of the metric (as a quantity).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 2;</code>
       */
      public io.kubernetes.client.proto.Resource.Quantity getValue() {
        if (valueBuilder_ == null) {
          return value_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : value_;
        } else {
          return valueBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * value is the target value of the metric (as a quantity).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 2;</code>
       */
      public Builder setValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (valueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          value_ = value;
          onChanged();
        } else {
          valueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * value is the target value of the metric (as a quantity).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 2;</code>
       */
      public Builder setValue(
          io.kubernetes.client.proto.Resource.Quantity.Builder builderForValue) {
        if (valueBuilder_ == null) {
          value_ = builderForValue.build();
          onChanged();
        } else {
          valueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * value is the target value of the metric (as a quantity).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 2;</code>
       */
      public Builder mergeValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (valueBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && value_ != null
              && value_ != io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()) {
            value_ =
                io.kubernetes.client.proto.Resource.Quantity.newBuilder(value_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            value_ = value;
          }
          onChanged();
        } else {
          valueBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * value is the target value of the metric (as a quantity).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 2;</code>
       */
      public Builder clearValue() {
        if (valueBuilder_ == null) {
          value_ = null;
          onChanged();
        } else {
          valueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * value is the target value of the metric (as a quantity).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 2;</code>
       */
      public io.kubernetes.client.proto.Resource.Quantity.Builder getValueBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getValueFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * value is the target value of the metric (as a quantity).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 2;</code>
       */
      public io.kubernetes.client.proto.Resource.QuantityOrBuilder getValueOrBuilder() {
        if (valueBuilder_ != null) {
          return valueBuilder_.getMessageOrBuilder();
        } else {
          return value_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : value_;
        }
      }
      /**
       *
       *
       * <pre>
       * value is the target value of the metric (as a quantity).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          getValueFieldBuilder() {
        if (valueBuilder_ == null) {
          valueBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Resource.Quantity,
                  io.kubernetes.client.proto.Resource.Quantity.Builder,
                  io.kubernetes.client.proto.Resource.QuantityOrBuilder>(
                  getValue(), getParentForChildren(), isClean());
          value_ = null;
        }
        return valueBuilder_;
      }

      private io.kubernetes.client.proto.Resource.Quantity averageValue_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          averageValueBuilder_;
      /**
       *
       *
       * <pre>
       * averageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 3;
       * </code>
       */
      public boolean hasAverageValue() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * averageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity getAverageValue() {
        if (averageValueBuilder_ == null) {
          return averageValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : averageValue_;
        } else {
          return averageValueBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * averageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 3;
       * </code>
       */
      public Builder setAverageValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (averageValueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          averageValue_ = value;
          onChanged();
        } else {
          averageValueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * averageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 3;
       * </code>
       */
      public Builder setAverageValue(
          io.kubernetes.client.proto.Resource.Quantity.Builder builderForValue) {
        if (averageValueBuilder_ == null) {
          averageValue_ = builderForValue.build();
          onChanged();
        } else {
          averageValueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * averageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 3;
       * </code>
       */
      public Builder mergeAverageValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (averageValueBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && averageValue_ != null
              && averageValue_
                  != io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()) {
            averageValue_ =
                io.kubernetes.client.proto.Resource.Quantity.newBuilder(averageValue_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            averageValue_ = value;
          }
          onChanged();
        } else {
          averageValueBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * averageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 3;
       * </code>
       */
      public Builder clearAverageValue() {
        if (averageValueBuilder_ == null) {
          averageValue_ = null;
          onChanged();
        } else {
          averageValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * averageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity.Builder getAverageValueBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getAverageValueFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * averageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 3;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.QuantityOrBuilder getAverageValueOrBuilder() {
        if (averageValueBuilder_ != null) {
          return averageValueBuilder_.getMessageOrBuilder();
        } else {
          return averageValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : averageValue_;
        }
      }
      /**
       *
       *
       * <pre>
       * averageValue is the target value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 3;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          getAverageValueFieldBuilder() {
        if (averageValueBuilder_ == null) {
          averageValueBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Resource.Quantity,
                  io.kubernetes.client.proto.Resource.Quantity.Builder,
                  io.kubernetes.client.proto.Resource.QuantityOrBuilder>(
                  getAverageValue(), getParentForChildren(), isClean());
          averageValue_ = null;
        }
        return averageValueBuilder_;
      }

      private int averageUtilization_;
      /**
       *
       *
       * <pre>
       * averageUtilization is the target value of the average of the
       * resource metric across all relevant pods, represented as a percentage of
       * the requested value of the resource for the pods.
       * Currently only valid for Resource metric source type
       * +optional
       * </pre>
       *
       * <code>optional int32 averageUtilization = 4;</code>
       */
      public boolean hasAverageUtilization() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * averageUtilization is the target value of the average of the
       * resource metric across all relevant pods, represented as a percentage of
       * the requested value of the resource for the pods.
       * Currently only valid for Resource metric source type
       * +optional
       * </pre>
       *
       * <code>optional int32 averageUtilization = 4;</code>
       */
      public int getAverageUtilization() {
        return averageUtilization_;
      }
      /**
       *
       *
       * <pre>
       * averageUtilization is the target value of the average of the
       * resource metric across all relevant pods, represented as a percentage of
       * the requested value of the resource for the pods.
       * Currently only valid for Resource metric source type
       * +optional
       * </pre>
       *
       * <code>optional int32 averageUtilization = 4;</code>
       */
      public Builder setAverageUtilization(int value) {
        bitField0_ |= 0x00000008;
        averageUtilization_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * averageUtilization is the target value of the average of the
       * resource metric across all relevant pods, represented as a percentage of
       * the requested value of the resource for the pods.
       * Currently only valid for Resource metric source type
       * +optional
       * </pre>
       *
       * <code>optional int32 averageUtilization = 4;</code>
       */
      public Builder clearAverageUtilization() {
        bitField0_ = (bitField0_ & ~0x00000008);
        averageUtilization_ = 0;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta2.MetricTarget)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta2.MetricTarget)
    private static final io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget();
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<MetricTarget> PARSER =
        new com.google.protobuf.AbstractParser<MetricTarget>() {
          @java.lang.Override
          public MetricTarget parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new MetricTarget(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<MetricTarget> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MetricTarget> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface MetricValueStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta2.MetricValueStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * value is the current value of the metric (as a quantity).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 1;</code>
     */
    boolean hasValue();
    /**
     *
     *
     * <pre>
     * value is the current value of the metric (as a quantity).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 1;</code>
     */
    io.kubernetes.client.proto.Resource.Quantity getValue();
    /**
     *
     *
     * <pre>
     * value is the current value of the metric (as a quantity).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 1;</code>
     */
    io.kubernetes.client.proto.Resource.QuantityOrBuilder getValueOrBuilder();

    /**
     *
     *
     * <pre>
     * averageValue is the current value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 2;</code>
     */
    boolean hasAverageValue();
    /**
     *
     *
     * <pre>
     * averageValue is the current value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 2;</code>
     */
    io.kubernetes.client.proto.Resource.Quantity getAverageValue();
    /**
     *
     *
     * <pre>
     * averageValue is the current value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 2;</code>
     */
    io.kubernetes.client.proto.Resource.QuantityOrBuilder getAverageValueOrBuilder();

    /**
     *
     *
     * <pre>
     * currentAverageUtilization is the current value of the average of the
     * resource metric across all relevant pods, represented as a percentage of
     * the requested value of the resource for the pods.
     * +optional
     * </pre>
     *
     * <code>optional int32 averageUtilization = 3;</code>
     */
    boolean hasAverageUtilization();
    /**
     *
     *
     * <pre>
     * currentAverageUtilization is the current value of the average of the
     * resource metric across all relevant pods, represented as a percentage of
     * the requested value of the resource for the pods.
     * +optional
     * </pre>
     *
     * <code>optional int32 averageUtilization = 3;</code>
     */
    int getAverageUtilization();
  }
  /**
   *
   *
   * <pre>
   * MetricValueStatus holds the current value for a metric
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.MetricValueStatus}
   */
  public static final class MetricValueStatus extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta2.MetricValueStatus)
      MetricValueStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use MetricValueStatus.newBuilder() to construct.
    private MetricValueStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private MetricValueStatus() {
      averageUtilization_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private MetricValueStatus(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10:
              {
                io.kubernetes.client.proto.Resource.Quantity.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = value_.toBuilder();
                }
                value_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Resource.Quantity.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(value_);
                  value_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.Resource.Quantity.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = averageValue_.toBuilder();
                }
                averageValue_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Resource.Quantity.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(averageValue_);
                  averageValue_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 24:
              {
                bitField0_ |= 0x00000004;
                averageUtilization_ = input.readInt32();
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_MetricValueStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_MetricValueStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.class,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder.class);
    }

    private int bitField0_;
    public static final int VALUE_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Resource.Quantity value_;
    /**
     *
     *
     * <pre>
     * value is the current value of the metric (as a quantity).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 1;</code>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * value is the current value of the metric (as a quantity).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 1;</code>
     */
    public io.kubernetes.client.proto.Resource.Quantity getValue() {
      return value_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : value_;
    }
    /**
     *
     *
     * <pre>
     * value is the current value of the metric (as a quantity).
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 1;</code>
     */
    public io.kubernetes.client.proto.Resource.QuantityOrBuilder getValueOrBuilder() {
      return value_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : value_;
    }

    public static final int AVERAGEVALUE_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.Resource.Quantity averageValue_;
    /**
     *
     *
     * <pre>
     * averageValue is the current value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 2;</code>
     */
    public boolean hasAverageValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * averageValue is the current value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 2;</code>
     */
    public io.kubernetes.client.proto.Resource.Quantity getAverageValue() {
      return averageValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : averageValue_;
    }
    /**
     *
     *
     * <pre>
     * averageValue is the current value of the average of the
     * metric across all relevant pods (as a quantity)
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 2;</code>
     */
    public io.kubernetes.client.proto.Resource.QuantityOrBuilder getAverageValueOrBuilder() {
      return averageValue_ == null
          ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
          : averageValue_;
    }

    public static final int AVERAGEUTILIZATION_FIELD_NUMBER = 3;
    private int averageUtilization_;
    /**
     *
     *
     * <pre>
     * currentAverageUtilization is the current value of the average of the
     * resource metric across all relevant pods, represented as a percentage of
     * the requested value of the resource for the pods.
     * +optional
     * </pre>
     *
     * <code>optional int32 averageUtilization = 3;</code>
     */
    public boolean hasAverageUtilization() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * currentAverageUtilization is the current value of the average of the
     * resource metric across all relevant pods, represented as a percentage of
     * the requested value of the resource for the pods.
     * +optional
     * </pre>
     *
     * <code>optional int32 averageUtilization = 3;</code>
     */
    public int getAverageUtilization() {
      return averageUtilization_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getValue());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getAverageValue());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, averageUtilization_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getValue());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getAverageValue());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, averageUtilization_);
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
      if (!(obj instanceof io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus other =
          (io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus) obj;

      boolean result = true;
      result = result && (hasValue() == other.hasValue());
      if (hasValue()) {
        result = result && getValue().equals(other.getValue());
      }
      result = result && (hasAverageValue() == other.hasAverageValue());
      if (hasAverageValue()) {
        result = result && getAverageValue().equals(other.getAverageValue());
      }
      result = result && (hasAverageUtilization() == other.hasAverageUtilization());
      if (hasAverageUtilization()) {
        result = result && (getAverageUtilization() == other.getAverageUtilization());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasValue()) {
        hash = (37 * hash) + VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getValue().hashCode();
      }
      if (hasAverageValue()) {
        hash = (37 * hash) + AVERAGEVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getAverageValue().hashCode();
      }
      if (hasAverageUtilization()) {
        hash = (37 * hash) + AVERAGEUTILIZATION_FIELD_NUMBER;
        hash = (53 * hash) + getAverageUtilization();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * MetricValueStatus holds the current value for a metric
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.MetricValueStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta2.MetricValueStatus)
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_MetricValueStatus_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_MetricValueStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.class,
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getValueFieldBuilder();
          getAverageValueFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (valueBuilder_ == null) {
          value_ = null;
        } else {
          valueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (averageValueBuilder_ == null) {
          averageValue_ = null;
        } else {
          averageValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        averageUtilization_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_MetricValueStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus build() {
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus buildPartial() {
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus result =
            new io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (valueBuilder_ == null) {
          result.value_ = value_;
        } else {
          result.value_ = valueBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (averageValueBuilder_ == null) {
          result.averageValue_ = averageValue_;
        } else {
          result.averageValue_ = averageValueBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.averageUtilization_ = averageUtilization_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus) {
          return mergeFrom((io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus other) {
        if (other
            == io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.getDefaultInstance())
          return this;
        if (other.hasValue()) {
          mergeValue(other.getValue());
        }
        if (other.hasAverageValue()) {
          mergeAverageValue(other.getAverageValue());
        }
        if (other.hasAverageUtilization()) {
          setAverageUtilization(other.getAverageUtilization());
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
        io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Resource.Quantity value_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          valueBuilder_;
      /**
       *
       *
       * <pre>
       * value is the current value of the metric (as a quantity).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 1;</code>
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * value is the current value of the metric (as a quantity).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 1;</code>
       */
      public io.kubernetes.client.proto.Resource.Quantity getValue() {
        if (valueBuilder_ == null) {
          return value_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : value_;
        } else {
          return valueBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * value is the current value of the metric (as a quantity).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 1;</code>
       */
      public Builder setValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (valueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          value_ = value;
          onChanged();
        } else {
          valueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * value is the current value of the metric (as a quantity).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 1;</code>
       */
      public Builder setValue(
          io.kubernetes.client.proto.Resource.Quantity.Builder builderForValue) {
        if (valueBuilder_ == null) {
          value_ = builderForValue.build();
          onChanged();
        } else {
          valueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * value is the current value of the metric (as a quantity).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 1;</code>
       */
      public Builder mergeValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (valueBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && value_ != null
              && value_ != io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()) {
            value_ =
                io.kubernetes.client.proto.Resource.Quantity.newBuilder(value_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            value_ = value;
          }
          onChanged();
        } else {
          valueBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * value is the current value of the metric (as a quantity).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 1;</code>
       */
      public Builder clearValue() {
        if (valueBuilder_ == null) {
          value_ = null;
          onChanged();
        } else {
          valueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * value is the current value of the metric (as a quantity).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 1;</code>
       */
      public io.kubernetes.client.proto.Resource.Quantity.Builder getValueBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getValueFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * value is the current value of the metric (as a quantity).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 1;</code>
       */
      public io.kubernetes.client.proto.Resource.QuantityOrBuilder getValueOrBuilder() {
        if (valueBuilder_ != null) {
          return valueBuilder_.getMessageOrBuilder();
        } else {
          return value_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : value_;
        }
      }
      /**
       *
       *
       * <pre>
       * value is the current value of the metric (as a quantity).
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity value = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          getValueFieldBuilder() {
        if (valueBuilder_ == null) {
          valueBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Resource.Quantity,
                  io.kubernetes.client.proto.Resource.Quantity.Builder,
                  io.kubernetes.client.proto.Resource.QuantityOrBuilder>(
                  getValue(), getParentForChildren(), isClean());
          value_ = null;
        }
        return valueBuilder_;
      }

      private io.kubernetes.client.proto.Resource.Quantity averageValue_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          averageValueBuilder_;
      /**
       *
       *
       * <pre>
       * averageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 2;
       * </code>
       */
      public boolean hasAverageValue() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * averageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity getAverageValue() {
        if (averageValueBuilder_ == null) {
          return averageValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : averageValue_;
        } else {
          return averageValueBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * averageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 2;
       * </code>
       */
      public Builder setAverageValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (averageValueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          averageValue_ = value;
          onChanged();
        } else {
          averageValueBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * averageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 2;
       * </code>
       */
      public Builder setAverageValue(
          io.kubernetes.client.proto.Resource.Quantity.Builder builderForValue) {
        if (averageValueBuilder_ == null) {
          averageValue_ = builderForValue.build();
          onChanged();
        } else {
          averageValueBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * averageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 2;
       * </code>
       */
      public Builder mergeAverageValue(io.kubernetes.client.proto.Resource.Quantity value) {
        if (averageValueBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && averageValue_ != null
              && averageValue_
                  != io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()) {
            averageValue_ =
                io.kubernetes.client.proto.Resource.Quantity.newBuilder(averageValue_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            averageValue_ = value;
          }
          onChanged();
        } else {
          averageValueBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * averageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 2;
       * </code>
       */
      public Builder clearAverageValue() {
        if (averageValueBuilder_ == null) {
          averageValue_ = null;
          onChanged();
        } else {
          averageValueBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * averageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.Quantity.Builder getAverageValueBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getAverageValueFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * averageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 2;
       * </code>
       */
      public io.kubernetes.client.proto.Resource.QuantityOrBuilder getAverageValueOrBuilder() {
        if (averageValueBuilder_ != null) {
          return averageValueBuilder_.getMessageOrBuilder();
        } else {
          return averageValue_ == null
              ? io.kubernetes.client.proto.Resource.Quantity.getDefaultInstance()
              : averageValue_;
        }
      }
      /**
       *
       *
       * <pre>
       * averageValue is the current value of the average of the
       * metric across all relevant pods (as a quantity)
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.api.resource.Quantity averageValue = 2;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Resource.Quantity,
              io.kubernetes.client.proto.Resource.Quantity.Builder,
              io.kubernetes.client.proto.Resource.QuantityOrBuilder>
          getAverageValueFieldBuilder() {
        if (averageValueBuilder_ == null) {
          averageValueBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Resource.Quantity,
                  io.kubernetes.client.proto.Resource.Quantity.Builder,
                  io.kubernetes.client.proto.Resource.QuantityOrBuilder>(
                  getAverageValue(), getParentForChildren(), isClean());
          averageValue_ = null;
        }
        return averageValueBuilder_;
      }

      private int averageUtilization_;
      /**
       *
       *
       * <pre>
       * currentAverageUtilization is the current value of the average of the
       * resource metric across all relevant pods, represented as a percentage of
       * the requested value of the resource for the pods.
       * +optional
       * </pre>
       *
       * <code>optional int32 averageUtilization = 3;</code>
       */
      public boolean hasAverageUtilization() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * currentAverageUtilization is the current value of the average of the
       * resource metric across all relevant pods, represented as a percentage of
       * the requested value of the resource for the pods.
       * +optional
       * </pre>
       *
       * <code>optional int32 averageUtilization = 3;</code>
       */
      public int getAverageUtilization() {
        return averageUtilization_;
      }
      /**
       *
       *
       * <pre>
       * currentAverageUtilization is the current value of the average of the
       * resource metric across all relevant pods, represented as a percentage of
       * the requested value of the resource for the pods.
       * +optional
       * </pre>
       *
       * <code>optional int32 averageUtilization = 3;</code>
       */
      public Builder setAverageUtilization(int value) {
        bitField0_ |= 0x00000004;
        averageUtilization_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * currentAverageUtilization is the current value of the average of the
       * resource metric across all relevant pods, represented as a percentage of
       * the requested value of the resource for the pods.
       * +optional
       * </pre>
       *
       * <code>optional int32 averageUtilization = 3;</code>
       */
      public Builder clearAverageUtilization() {
        bitField0_ = (bitField0_ & ~0x00000004);
        averageUtilization_ = 0;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta2.MetricValueStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta2.MetricValueStatus)
    private static final io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus();
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<MetricValueStatus> PARSER =
        new com.google.protobuf.AbstractParser<MetricValueStatus>() {
          @java.lang.Override
          public MetricValueStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new MetricValueStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<MetricValueStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MetricValueStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ObjectMetricSourceOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta2.ObjectMetricSource)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 1;
     * </code>
     */
    boolean hasDescribedObject();
    /**
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 1;
     * </code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference getDescribedObject();
    /**
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 1;
     * </code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReferenceOrBuilder
        getDescribedObjectOrBuilder();

    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    boolean hasTarget();
    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget getTarget();
    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder getTargetOrBuilder();

    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 3;</code>
     */
    boolean hasMetric();
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 3;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier getMetric();
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 3;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder getMetricOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * ObjectMetricSource indicates how to scale on a metric describing a
   * kubernetes object (for example, hits-per-second on an Ingress object).
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.ObjectMetricSource}
   */
  public static final class ObjectMetricSource extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta2.ObjectMetricSource)
      ObjectMetricSourceOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ObjectMetricSource.newBuilder() to construct.
    private ObjectMetricSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ObjectMetricSource() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ObjectMetricSource(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = describedObject_.toBuilder();
                }
                describedObject_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(describedObject_);
                  describedObject_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = target_.toBuilder();
                }
                target_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(target_);
                  target_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = metric_.toBuilder();
                }
                metric_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metric_);
                  metric_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_ObjectMetricSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_ObjectMetricSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource.class,
              io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource.Builder.class);
    }

    private int bitField0_;
    public static final int DESCRIBEDOBJECT_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
        describedObject_;
    /**
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 1;
     * </code>
     */
    public boolean hasDescribedObject() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 1;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
        getDescribedObject() {
      return describedObject_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
              .getDefaultInstance()
          : describedObject_;
    }
    /**
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 1;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReferenceOrBuilder
        getDescribedObjectOrBuilder() {
      return describedObject_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
              .getDefaultInstance()
          : describedObject_;
    }

    public static final int TARGET_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget target_;
    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    public boolean hasTarget() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget getTarget() {
      return target_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.getDefaultInstance()
          : target_;
    }
    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder
        getTargetOrBuilder() {
      return target_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.getDefaultInstance()
          : target_;
    }

    public static final int METRIC_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier metric_;
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 3;</code>
     */
    public boolean hasMetric() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 3;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier getMetric() {
      return metric_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
          : metric_;
    }
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 3;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder
        getMetricOrBuilder() {
      return metric_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
          : metric_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getDescribedObject());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getTarget());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getMetric());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getDescribedObject());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getTarget());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getMetric());
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
      if (!(obj instanceof io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource other =
          (io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource) obj;

      boolean result = true;
      result = result && (hasDescribedObject() == other.hasDescribedObject());
      if (hasDescribedObject()) {
        result = result && getDescribedObject().equals(other.getDescribedObject());
      }
      result = result && (hasTarget() == other.hasTarget());
      if (hasTarget()) {
        result = result && getTarget().equals(other.getTarget());
      }
      result = result && (hasMetric() == other.hasMetric());
      if (hasMetric()) {
        result = result && getMetric().equals(other.getMetric());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasDescribedObject()) {
        hash = (37 * hash) + DESCRIBEDOBJECT_FIELD_NUMBER;
        hash = (53 * hash) + getDescribedObject().hashCode();
      }
      if (hasTarget()) {
        hash = (37 * hash) + TARGET_FIELD_NUMBER;
        hash = (53 * hash) + getTarget().hashCode();
      }
      if (hasMetric()) {
        hash = (37 * hash) + METRIC_FIELD_NUMBER;
        hash = (53 * hash) + getMetric().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * ObjectMetricSource indicates how to scale on a metric describing a
     * kubernetes object (for example, hits-per-second on an Ingress object).
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.ObjectMetricSource}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta2.ObjectMetricSource)
        io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSourceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_ObjectMetricSource_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_ObjectMetricSource_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource.class,
                io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getDescribedObjectFieldBuilder();
          getTargetFieldBuilder();
          getMetricFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (describedObjectBuilder_ == null) {
          describedObject_ = null;
        } else {
          describedObjectBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (targetBuilder_ == null) {
          target_ = null;
        } else {
          targetBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (metricBuilder_ == null) {
          metric_ = null;
        } else {
          metricBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_ObjectMetricSource_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource build() {
        io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource buildPartial() {
        io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource result =
            new io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (describedObjectBuilder_ == null) {
          result.describedObject_ = describedObject_;
        } else {
          result.describedObject_ = describedObjectBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (targetBuilder_ == null) {
          result.target_ = target_;
        } else {
          result.target_ = targetBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (metricBuilder_ == null) {
          result.metric_ = metric_;
        } else {
          result.metric_ = metricBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource other) {
        if (other
            == io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource
                .getDefaultInstance()) return this;
        if (other.hasDescribedObject()) {
          mergeDescribedObject(other.getDescribedObject());
        }
        if (other.hasTarget()) {
          mergeTarget(other.getTarget());
        }
        if (other.hasMetric()) {
          mergeMetric(other.getMetric());
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
        io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
          describedObject_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference,
              io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReferenceOrBuilder>
          describedObjectBuilder_;
      /**
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 1;
       * </code>
       */
      public boolean hasDescribedObject() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
          getDescribedObject() {
        if (describedObjectBuilder_ == null) {
          return describedObject_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
                  .getDefaultInstance()
              : describedObject_;
        } else {
          return describedObjectBuilder_.getMessage();
        }
      }
      /**
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 1;
       * </code>
       */
      public Builder setDescribedObject(
          io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference value) {
        if (describedObjectBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          describedObject_ = value;
          onChanged();
        } else {
          describedObjectBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 1;
       * </code>
       */
      public Builder setDescribedObject(
          io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference.Builder
              builderForValue) {
        if (describedObjectBuilder_ == null) {
          describedObject_ = builderForValue.build();
          onChanged();
        } else {
          describedObjectBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 1;
       * </code>
       */
      public Builder mergeDescribedObject(
          io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference value) {
        if (describedObjectBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && describedObject_ != null
              && describedObject_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
                      .getDefaultInstance()) {
            describedObject_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
                    .newBuilder(describedObject_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            describedObject_ = value;
          }
          onChanged();
        } else {
          describedObjectBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 1;
       * </code>
       */
      public Builder clearDescribedObject() {
        if (describedObjectBuilder_ == null) {
          describedObject_ = null;
          onChanged();
        } else {
          describedObjectBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference.Builder
          getDescribedObjectBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getDescribedObjectFieldBuilder().getBuilder();
      }
      /**
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 1;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReferenceOrBuilder
          getDescribedObjectOrBuilder() {
        if (describedObjectBuilder_ != null) {
          return describedObjectBuilder_.getMessageOrBuilder();
        } else {
          return describedObject_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
                  .getDefaultInstance()
              : describedObject_;
        }
      }
      /**
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 1;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference,
              io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReferenceOrBuilder>
          getDescribedObjectFieldBuilder() {
        if (describedObjectBuilder_ == null) {
          describedObjectBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference,
                  io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling
                      .CrossVersionObjectReferenceOrBuilder>(
                  getDescribedObject(), getParentForChildren(), isClean());
          describedObject_ = null;
        }
        return describedObjectBuilder_;
      }

      private io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget target_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder>
          targetBuilder_;
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public boolean hasTarget() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget getTarget() {
        if (targetBuilder_ == null) {
          return target_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.getDefaultInstance()
              : target_;
        } else {
          return targetBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public Builder setTarget(io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget value) {
        if (targetBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          target_ = value;
          onChanged();
        } else {
          targetBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public Builder setTarget(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder builderForValue) {
        if (targetBuilder_ == null) {
          target_ = builderForValue.build();
          onChanged();
        } else {
          targetBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public Builder mergeTarget(io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget value) {
        if (targetBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && target_ != null
              && target_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget
                      .getDefaultInstance()) {
            target_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.newBuilder(target_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            target_ = value;
          }
          onChanged();
        } else {
          targetBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public Builder clearTarget() {
        if (targetBuilder_ == null) {
          target_ = null;
          onChanged();
        } else {
          targetBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder getTargetBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getTargetFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder
          getTargetOrBuilder() {
        if (targetBuilder_ != null) {
          return targetBuilder_.getMessageOrBuilder();
        } else {
          return target_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.getDefaultInstance()
              : target_;
        }
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder>
          getTargetFieldBuilder() {
        if (targetBuilder_ == null) {
          targetBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder>(
                  getTarget(), getParentForChildren(), isClean());
          target_ = null;
        }
        return targetBuilder_;
      }

      private io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier metric_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder>
          metricBuilder_;
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 3;</code>
       */
      public boolean hasMetric() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 3;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier getMetric() {
        if (metricBuilder_ == null) {
          return metric_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
              : metric_;
        } else {
          return metricBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 3;</code>
       */
      public Builder setMetric(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier value) {
        if (metricBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metric_ = value;
          onChanged();
        } else {
          metricBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 3;</code>
       */
      public Builder setMetric(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder builderForValue) {
        if (metricBuilder_ == null) {
          metric_ = builderForValue.build();
          onChanged();
        } else {
          metricBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 3;</code>
       */
      public Builder mergeMetric(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier value) {
        if (metricBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && metric_ != null
              && metric_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier
                      .getDefaultInstance()) {
            metric_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.newBuilder(metric_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metric_ = value;
          }
          onChanged();
        } else {
          metricBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 3;</code>
       */
      public Builder clearMetric() {
        if (metricBuilder_ == null) {
          metric_ = null;
          onChanged();
        } else {
          metricBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 3;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder
          getMetricBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getMetricFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 3;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder
          getMetricOrBuilder() {
        if (metricBuilder_ != null) {
          return metricBuilder_.getMessageOrBuilder();
        } else {
          return metric_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
              : metric_;
        }
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder>
          getMetricFieldBuilder() {
        if (metricBuilder_ == null) {
          metricBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder>(
                  getMetric(), getParentForChildren(), isClean());
          metric_ = null;
        }
        return metricBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta2.ObjectMetricSource)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta2.ObjectMetricSource)
    private static final io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource();
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ObjectMetricSource> PARSER =
        new com.google.protobuf.AbstractParser<ObjectMetricSource>() {
          @java.lang.Override
          public ObjectMetricSource parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ObjectMetricSource(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ObjectMetricSource> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ObjectMetricSource> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricSource
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ObjectMetricStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta2.ObjectMetricStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    boolean hasMetric();
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier getMetric();
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder getMetricOrBuilder();

    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    boolean hasCurrent();
    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus getCurrent();
    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder getCurrentOrBuilder();

    /**
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 3;
     * </code>
     */
    boolean hasDescribedObject();
    /**
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 3;
     * </code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference getDescribedObject();
    /**
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 3;
     * </code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReferenceOrBuilder
        getDescribedObjectOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * ObjectMetricStatus indicates the current value of a metric describing a
   * kubernetes object (for example, hits-per-second on an Ingress object).
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.ObjectMetricStatus}
   */
  public static final class ObjectMetricStatus extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta2.ObjectMetricStatus)
      ObjectMetricStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ObjectMetricStatus.newBuilder() to construct.
    private ObjectMetricStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ObjectMetricStatus() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ObjectMetricStatus(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metric_.toBuilder();
                }
                metric_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metric_);
                  metric_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = current_.toBuilder();
                }
                current_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(current_);
                  current_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference.Builder
                    subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = describedObject_.toBuilder();
                }
                describedObject_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
                            .PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(describedObject_);
                  describedObject_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_ObjectMetricStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_ObjectMetricStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus.class,
              io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus.Builder.class);
    }

    private int bitField0_;
    public static final int METRIC_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier metric_;
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    public boolean hasMetric() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier getMetric() {
      return metric_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
          : metric_;
    }
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder
        getMetricOrBuilder() {
      return metric_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
          : metric_;
    }

    public static final int CURRENT_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus current_;
    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    public boolean hasCurrent() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus getCurrent() {
      return current_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.getDefaultInstance()
          : current_;
    }
    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder
        getCurrentOrBuilder() {
      return current_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.getDefaultInstance()
          : current_;
    }

    public static final int DESCRIBEDOBJECT_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
        describedObject_;
    /**
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 3;
     * </code>
     */
    public boolean hasDescribedObject() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 3;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
        getDescribedObject() {
      return describedObject_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
              .getDefaultInstance()
          : describedObject_;
    }
    /**
     * <code>
     * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 3;
     * </code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReferenceOrBuilder
        getDescribedObjectOrBuilder() {
      return describedObject_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
              .getDefaultInstance()
          : describedObject_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetric());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getCurrent());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, getDescribedObject());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetric());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getCurrent());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getDescribedObject());
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
      if (!(obj instanceof io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus other =
          (io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus) obj;

      boolean result = true;
      result = result && (hasMetric() == other.hasMetric());
      if (hasMetric()) {
        result = result && getMetric().equals(other.getMetric());
      }
      result = result && (hasCurrent() == other.hasCurrent());
      if (hasCurrent()) {
        result = result && getCurrent().equals(other.getCurrent());
      }
      result = result && (hasDescribedObject() == other.hasDescribedObject());
      if (hasDescribedObject()) {
        result = result && getDescribedObject().equals(other.getDescribedObject());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetric()) {
        hash = (37 * hash) + METRIC_FIELD_NUMBER;
        hash = (53 * hash) + getMetric().hashCode();
      }
      if (hasCurrent()) {
        hash = (37 * hash) + CURRENT_FIELD_NUMBER;
        hash = (53 * hash) + getCurrent().hashCode();
      }
      if (hasDescribedObject()) {
        hash = (37 * hash) + DESCRIBEDOBJECT_FIELD_NUMBER;
        hash = (53 * hash) + getDescribedObject().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * ObjectMetricStatus indicates the current value of a metric describing a
     * kubernetes object (for example, hits-per-second on an Ingress object).
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.ObjectMetricStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta2.ObjectMetricStatus)
        io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_ObjectMetricStatus_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_ObjectMetricStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus.class,
                io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetricFieldBuilder();
          getCurrentFieldBuilder();
          getDescribedObjectFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metricBuilder_ == null) {
          metric_ = null;
        } else {
          metricBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (currentBuilder_ == null) {
          current_ = null;
        } else {
          currentBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (describedObjectBuilder_ == null) {
          describedObject_ = null;
        } else {
          describedObjectBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_ObjectMetricStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus build() {
        io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus buildPartial() {
        io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus result =
            new io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metricBuilder_ == null) {
          result.metric_ = metric_;
        } else {
          result.metric_ = metricBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (currentBuilder_ == null) {
          result.current_ = current_;
        } else {
          result.current_ = currentBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (describedObjectBuilder_ == null) {
          result.describedObject_ = describedObject_;
        } else {
          result.describedObject_ = describedObjectBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus other) {
        if (other
            == io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus
                .getDefaultInstance()) return this;
        if (other.hasMetric()) {
          mergeMetric(other.getMetric());
        }
        if (other.hasCurrent()) {
          mergeCurrent(other.getCurrent());
        }
        if (other.hasDescribedObject()) {
          mergeDescribedObject(other.getDescribedObject());
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
        io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier metric_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder>
          metricBuilder_;
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public boolean hasMetric() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier getMetric() {
        if (metricBuilder_ == null) {
          return metric_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
              : metric_;
        } else {
          return metricBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public Builder setMetric(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier value) {
        if (metricBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metric_ = value;
          onChanged();
        } else {
          metricBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public Builder setMetric(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder builderForValue) {
        if (metricBuilder_ == null) {
          metric_ = builderForValue.build();
          onChanged();
        } else {
          metricBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public Builder mergeMetric(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier value) {
        if (metricBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metric_ != null
              && metric_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier
                      .getDefaultInstance()) {
            metric_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.newBuilder(metric_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metric_ = value;
          }
          onChanged();
        } else {
          metricBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public Builder clearMetric() {
        if (metricBuilder_ == null) {
          metric_ = null;
          onChanged();
        } else {
          metricBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder
          getMetricBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetricFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder
          getMetricOrBuilder() {
        if (metricBuilder_ != null) {
          return metricBuilder_.getMessageOrBuilder();
        } else {
          return metric_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
              : metric_;
        }
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder>
          getMetricFieldBuilder() {
        if (metricBuilder_ == null) {
          metricBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder>(
                  getMetric(), getParentForChildren(), isClean());
          metric_ = null;
        }
        return metricBuilder_;
      }

      private io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus current_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder>
          currentBuilder_;
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public boolean hasCurrent() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus getCurrent() {
        if (currentBuilder_ == null) {
          return current_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.getDefaultInstance()
              : current_;
        } else {
          return currentBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public Builder setCurrent(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus value) {
        if (currentBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          current_ = value;
          onChanged();
        } else {
          currentBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public Builder setCurrent(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder builderForValue) {
        if (currentBuilder_ == null) {
          current_ = builderForValue.build();
          onChanged();
        } else {
          currentBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public Builder mergeCurrent(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus value) {
        if (currentBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && current_ != null
              && current_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus
                      .getDefaultInstance()) {
            current_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.newBuilder(current_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            current_ = value;
          }
          onChanged();
        } else {
          currentBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public Builder clearCurrent() {
        if (currentBuilder_ == null) {
          current_ = null;
          onChanged();
        } else {
          currentBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder
          getCurrentBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getCurrentFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder
          getCurrentOrBuilder() {
        if (currentBuilder_ != null) {
          return currentBuilder_.getMessageOrBuilder();
        } else {
          return current_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.getDefaultInstance()
              : current_;
        }
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder>
          getCurrentFieldBuilder() {
        if (currentBuilder_ == null) {
          currentBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder>(
                  getCurrent(), getParentForChildren(), isClean());
          current_ = null;
        }
        return currentBuilder_;
      }

      private io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
          describedObject_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference,
              io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReferenceOrBuilder>
          describedObjectBuilder_;
      /**
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 3;
       * </code>
       */
      public boolean hasDescribedObject() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
          getDescribedObject() {
        if (describedObjectBuilder_ == null) {
          return describedObject_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
                  .getDefaultInstance()
              : describedObject_;
        } else {
          return describedObjectBuilder_.getMessage();
        }
      }
      /**
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 3;
       * </code>
       */
      public Builder setDescribedObject(
          io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference value) {
        if (describedObjectBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          describedObject_ = value;
          onChanged();
        } else {
          describedObjectBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 3;
       * </code>
       */
      public Builder setDescribedObject(
          io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference.Builder
              builderForValue) {
        if (describedObjectBuilder_ == null) {
          describedObject_ = builderForValue.build();
          onChanged();
        } else {
          describedObjectBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 3;
       * </code>
       */
      public Builder mergeDescribedObject(
          io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference value) {
        if (describedObjectBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && describedObject_ != null
              && describedObject_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
                      .getDefaultInstance()) {
            describedObject_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
                    .newBuilder(describedObject_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            describedObject_ = value;
          }
          onChanged();
        } else {
          describedObjectBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 3;
       * </code>
       */
      public Builder clearDescribedObject() {
        if (describedObjectBuilder_ == null) {
          describedObject_ = null;
          onChanged();
        } else {
          describedObjectBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference.Builder
          getDescribedObjectBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getDescribedObjectFieldBuilder().getBuilder();
      }
      /**
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 3;
       * </code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReferenceOrBuilder
          getDescribedObjectOrBuilder() {
        if (describedObjectBuilder_ != null) {
          return describedObjectBuilder_.getMessageOrBuilder();
        } else {
          return describedObject_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference
                  .getDefaultInstance()
              : describedObject_;
        }
      }
      /**
       * <code>
       * optional .k8s.io.api.autoscaling.v2beta2.CrossVersionObjectReference describedObject = 3;
       * </code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference,
              io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReferenceOrBuilder>
          getDescribedObjectFieldBuilder() {
        if (describedObjectBuilder_ == null) {
          describedObjectBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference,
                  io.kubernetes.client.proto.V2beta2Autoscaling.CrossVersionObjectReference.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling
                      .CrossVersionObjectReferenceOrBuilder>(
                  getDescribedObject(), getParentForChildren(), isClean());
          describedObject_ = null;
        }
        return describedObjectBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta2.ObjectMetricStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta2.ObjectMetricStatus)
    private static final io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus();
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ObjectMetricStatus> PARSER =
        new com.google.protobuf.AbstractParser<ObjectMetricStatus>() {
          @java.lang.Override
          public ObjectMetricStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ObjectMetricStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ObjectMetricStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ObjectMetricStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta2Autoscaling.ObjectMetricStatus
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface PodsMetricSourceOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta2.PodsMetricSource)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    boolean hasMetric();
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier getMetric();
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder getMetricOrBuilder();

    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    boolean hasTarget();
    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget getTarget();
    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder getTargetOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * PodsMetricSource indicates how to scale on a metric describing each pod in
   * the current scale target (for example, transactions-processed-per-second).
   * The values will be averaged together before being compared to the target
   * value.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.PodsMetricSource}
   */
  public static final class PodsMetricSource extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta2.PodsMetricSource)
      PodsMetricSourceOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use PodsMetricSource.newBuilder() to construct.
    private PodsMetricSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PodsMetricSource() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private PodsMetricSource(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metric_.toBuilder();
                }
                metric_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metric_);
                  metric_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = target_.toBuilder();
                }
                target_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(target_);
                  target_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_PodsMetricSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_PodsMetricSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource.class,
              io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource.Builder.class);
    }

    private int bitField0_;
    public static final int METRIC_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier metric_;
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    public boolean hasMetric() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier getMetric() {
      return metric_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
          : metric_;
    }
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder
        getMetricOrBuilder() {
      return metric_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
          : metric_;
    }

    public static final int TARGET_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget target_;
    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    public boolean hasTarget() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget getTarget() {
      return target_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.getDefaultInstance()
          : target_;
    }
    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder
        getTargetOrBuilder() {
      return target_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.getDefaultInstance()
          : target_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetric());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getTarget());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetric());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getTarget());
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
      if (!(obj instanceof io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource other =
          (io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource) obj;

      boolean result = true;
      result = result && (hasMetric() == other.hasMetric());
      if (hasMetric()) {
        result = result && getMetric().equals(other.getMetric());
      }
      result = result && (hasTarget() == other.hasTarget());
      if (hasTarget()) {
        result = result && getTarget().equals(other.getTarget());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetric()) {
        hash = (37 * hash) + METRIC_FIELD_NUMBER;
        hash = (53 * hash) + getMetric().hashCode();
      }
      if (hasTarget()) {
        hash = (37 * hash) + TARGET_FIELD_NUMBER;
        hash = (53 * hash) + getTarget().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * PodsMetricSource indicates how to scale on a metric describing each pod in
     * the current scale target (for example, transactions-processed-per-second).
     * The values will be averaged together before being compared to the target
     * value.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.PodsMetricSource}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta2.PodsMetricSource)
        io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSourceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_PodsMetricSource_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_PodsMetricSource_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource.class,
                io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetricFieldBuilder();
          getTargetFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metricBuilder_ == null) {
          metric_ = null;
        } else {
          metricBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (targetBuilder_ == null) {
          target_ = null;
        } else {
          targetBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_PodsMetricSource_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource build() {
        io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource buildPartial() {
        io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource result =
            new io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metricBuilder_ == null) {
          result.metric_ = metric_;
        } else {
          result.metric_ = metricBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (targetBuilder_ == null) {
          result.target_ = target_;
        } else {
          result.target_ = targetBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource) {
          return mergeFrom((io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource other) {
        if (other
            == io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource.getDefaultInstance())
          return this;
        if (other.hasMetric()) {
          mergeMetric(other.getMetric());
        }
        if (other.hasTarget()) {
          mergeTarget(other.getTarget());
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
        io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier metric_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder>
          metricBuilder_;
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public boolean hasMetric() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier getMetric() {
        if (metricBuilder_ == null) {
          return metric_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
              : metric_;
        } else {
          return metricBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public Builder setMetric(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier value) {
        if (metricBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metric_ = value;
          onChanged();
        } else {
          metricBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public Builder setMetric(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder builderForValue) {
        if (metricBuilder_ == null) {
          metric_ = builderForValue.build();
          onChanged();
        } else {
          metricBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public Builder mergeMetric(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier value) {
        if (metricBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metric_ != null
              && metric_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier
                      .getDefaultInstance()) {
            metric_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.newBuilder(metric_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metric_ = value;
          }
          onChanged();
        } else {
          metricBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public Builder clearMetric() {
        if (metricBuilder_ == null) {
          metric_ = null;
          onChanged();
        } else {
          metricBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder
          getMetricBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetricFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder
          getMetricOrBuilder() {
        if (metricBuilder_ != null) {
          return metricBuilder_.getMessageOrBuilder();
        } else {
          return metric_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
              : metric_;
        }
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder>
          getMetricFieldBuilder() {
        if (metricBuilder_ == null) {
          metricBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder>(
                  getMetric(), getParentForChildren(), isClean());
          metric_ = null;
        }
        return metricBuilder_;
      }

      private io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget target_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder>
          targetBuilder_;
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public boolean hasTarget() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget getTarget() {
        if (targetBuilder_ == null) {
          return target_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.getDefaultInstance()
              : target_;
        } else {
          return targetBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public Builder setTarget(io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget value) {
        if (targetBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          target_ = value;
          onChanged();
        } else {
          targetBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public Builder setTarget(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder builderForValue) {
        if (targetBuilder_ == null) {
          target_ = builderForValue.build();
          onChanged();
        } else {
          targetBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public Builder mergeTarget(io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget value) {
        if (targetBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && target_ != null
              && target_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget
                      .getDefaultInstance()) {
            target_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.newBuilder(target_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            target_ = value;
          }
          onChanged();
        } else {
          targetBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public Builder clearTarget() {
        if (targetBuilder_ == null) {
          target_ = null;
          onChanged();
        } else {
          targetBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder getTargetBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getTargetFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder
          getTargetOrBuilder() {
        if (targetBuilder_ != null) {
          return targetBuilder_.getMessageOrBuilder();
        } else {
          return target_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.getDefaultInstance()
              : target_;
        }
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder>
          getTargetFieldBuilder() {
        if (targetBuilder_ == null) {
          targetBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder>(
                  getTarget(), getParentForChildren(), isClean());
          target_ = null;
        }
        return targetBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta2.PodsMetricSource)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta2.PodsMetricSource)
    private static final io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource();
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<PodsMetricSource> PARSER =
        new com.google.protobuf.AbstractParser<PodsMetricSource>() {
          @java.lang.Override
          public PodsMetricSource parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new PodsMetricSource(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<PodsMetricSource> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PodsMetricSource> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricSource
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface PodsMetricStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta2.PodsMetricStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    boolean hasMetric();
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier getMetric();
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder getMetricOrBuilder();

    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    boolean hasCurrent();
    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus getCurrent();
    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder getCurrentOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * PodsMetricStatus indicates the current value of a metric describing each pod in
   * the current scale target (for example, transactions-processed-per-second).
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.PodsMetricStatus}
   */
  public static final class PodsMetricStatus extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta2.PodsMetricStatus)
      PodsMetricStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use PodsMetricStatus.newBuilder() to construct.
    private PodsMetricStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PodsMetricStatus() {}

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private PodsMetricStatus(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metric_.toBuilder();
                }
                metric_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metric_);
                  metric_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = current_.toBuilder();
                }
                current_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(current_);
                  current_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_PodsMetricStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_PodsMetricStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus.class,
              io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus.Builder.class);
    }

    private int bitField0_;
    public static final int METRIC_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier metric_;
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    public boolean hasMetric() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier getMetric() {
      return metric_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
          : metric_;
    }
    /**
     *
     *
     * <pre>
     * metric identifies the target metric by name and selector
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder
        getMetricOrBuilder() {
      return metric_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
          : metric_;
    }

    public static final int CURRENT_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus current_;
    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    public boolean hasCurrent() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus getCurrent() {
      return current_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.getDefaultInstance()
          : current_;
    }
    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder
        getCurrentOrBuilder() {
      return current_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.getDefaultInstance()
          : current_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetric());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getCurrent());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetric());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getCurrent());
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
      if (!(obj instanceof io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus other =
          (io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus) obj;

      boolean result = true;
      result = result && (hasMetric() == other.hasMetric());
      if (hasMetric()) {
        result = result && getMetric().equals(other.getMetric());
      }
      result = result && (hasCurrent() == other.hasCurrent());
      if (hasCurrent()) {
        result = result && getCurrent().equals(other.getCurrent());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetric()) {
        hash = (37 * hash) + METRIC_FIELD_NUMBER;
        hash = (53 * hash) + getMetric().hashCode();
      }
      if (hasCurrent()) {
        hash = (37 * hash) + CURRENT_FIELD_NUMBER;
        hash = (53 * hash) + getCurrent().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * PodsMetricStatus indicates the current value of a metric describing each pod in
     * the current scale target (for example, transactions-processed-per-second).
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.PodsMetricStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta2.PodsMetricStatus)
        io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_PodsMetricStatus_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_PodsMetricStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus.class,
                io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetricFieldBuilder();
          getCurrentFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metricBuilder_ == null) {
          metric_ = null;
        } else {
          metricBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (currentBuilder_ == null) {
          current_ = null;
        } else {
          currentBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_PodsMetricStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus build() {
        io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus buildPartial() {
        io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus result =
            new io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metricBuilder_ == null) {
          result.metric_ = metric_;
        } else {
          result.metric_ = metricBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (currentBuilder_ == null) {
          result.current_ = current_;
        } else {
          result.current_ = currentBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus) {
          return mergeFrom((io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus other) {
        if (other
            == io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus.getDefaultInstance())
          return this;
        if (other.hasMetric()) {
          mergeMetric(other.getMetric());
        }
        if (other.hasCurrent()) {
          mergeCurrent(other.getCurrent());
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
        io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier metric_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder>
          metricBuilder_;
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public boolean hasMetric() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier getMetric() {
        if (metricBuilder_ == null) {
          return metric_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
              : metric_;
        } else {
          return metricBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public Builder setMetric(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier value) {
        if (metricBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metric_ = value;
          onChanged();
        } else {
          metricBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public Builder setMetric(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder builderForValue) {
        if (metricBuilder_ == null) {
          metric_ = builderForValue.build();
          onChanged();
        } else {
          metricBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public Builder mergeMetric(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier value) {
        if (metricBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metric_ != null
              && metric_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier
                      .getDefaultInstance()) {
            metric_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.newBuilder(metric_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metric_ = value;
          }
          onChanged();
        } else {
          metricBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public Builder clearMetric() {
        if (metricBuilder_ == null) {
          metric_ = null;
          onChanged();
        } else {
          metricBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder
          getMetricBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetricFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder
          getMetricOrBuilder() {
        if (metricBuilder_ != null) {
          return metricBuilder_.getMessageOrBuilder();
        } else {
          return metric_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.getDefaultInstance()
              : metric_;
        }
      }
      /**
       *
       *
       * <pre>
       * metric identifies the target metric by name and selector
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricIdentifier metric = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder>
          getMetricFieldBuilder() {
        if (metricBuilder_ == null) {
          metricBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifier.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricIdentifierOrBuilder>(
                  getMetric(), getParentForChildren(), isClean());
          metric_ = null;
        }
        return metricBuilder_;
      }

      private io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus current_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder>
          currentBuilder_;
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public boolean hasCurrent() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus getCurrent() {
        if (currentBuilder_ == null) {
          return current_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.getDefaultInstance()
              : current_;
        } else {
          return currentBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public Builder setCurrent(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus value) {
        if (currentBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          current_ = value;
          onChanged();
        } else {
          currentBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public Builder setCurrent(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder builderForValue) {
        if (currentBuilder_ == null) {
          current_ = builderForValue.build();
          onChanged();
        } else {
          currentBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public Builder mergeCurrent(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus value) {
        if (currentBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && current_ != null
              && current_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus
                      .getDefaultInstance()) {
            current_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.newBuilder(current_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            current_ = value;
          }
          onChanged();
        } else {
          currentBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public Builder clearCurrent() {
        if (currentBuilder_ == null) {
          current_ = null;
          onChanged();
        } else {
          currentBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder
          getCurrentBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getCurrentFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder
          getCurrentOrBuilder() {
        if (currentBuilder_ != null) {
          return currentBuilder_.getMessageOrBuilder();
        } else {
          return current_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.getDefaultInstance()
              : current_;
        }
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder>
          getCurrentFieldBuilder() {
        if (currentBuilder_ == null) {
          currentBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder>(
                  getCurrent(), getParentForChildren(), isClean());
          current_ = null;
        }
        return currentBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta2.PodsMetricStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta2.PodsMetricStatus)
    private static final io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus();
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<PodsMetricStatus> PARSER =
        new com.google.protobuf.AbstractParser<PodsMetricStatus>() {
          @java.lang.Override
          public PodsMetricStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new PodsMetricStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<PodsMetricStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PodsMetricStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta2Autoscaling.PodsMetricStatus
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ResourceMetricSourceOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta2.ResourceMetricSource)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    boolean hasName();
    /**
     *
     *
     * <pre>
     * name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    java.lang.String getName();
    /**
     *
     *
     * <pre>
     * name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    com.google.protobuf.ByteString getNameBytes();

    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    boolean hasTarget();
    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget getTarget();
    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder getTargetOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * ResourceMetricSource indicates how to scale on a resource metric known to
   * Kubernetes, as specified in requests and limits, describing each pod in the
   * current scale target (e.g. CPU or memory).  The values will be averaged
   * together before being compared to the target.  Such metrics are built in to
   * Kubernetes, and have special scaling options on top of those available to
   * normal per-pod metrics using the "pods" source.  Only one "target" type
   * should be set.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.ResourceMetricSource}
   */
  public static final class ResourceMetricSource extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta2.ResourceMetricSource)
      ResourceMetricSourceOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ResourceMetricSource.newBuilder() to construct.
    private ResourceMetricSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ResourceMetricSource() {
      name_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ResourceMetricSource(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                name_ = bs;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = target_.toBuilder();
                }
                target_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(target_);
                  target_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_ResourceMetricSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_ResourceMetricSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource.class,
              io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     *
     *
     * <pre>
     * name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TARGET_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget target_;
    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    public boolean hasTarget() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget getTarget() {
      return target_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.getDefaultInstance()
          : target_;
    }
    /**
     *
     *
     * <pre>
     * target specifies the target value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder
        getTargetOrBuilder() {
      return target_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.getDefaultInstance()
          : target_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getTarget());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getTarget());
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
      if (!(obj instanceof io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource other =
          (io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource) obj;

      boolean result = true;
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName().equals(other.getName());
      }
      result = result && (hasTarget() == other.hasTarget());
      if (hasTarget()) {
        result = result && getTarget().equals(other.getTarget());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasTarget()) {
        hash = (37 * hash) + TARGET_FIELD_NUMBER;
        hash = (53 * hash) + getTarget().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * ResourceMetricSource indicates how to scale on a resource metric known to
     * Kubernetes, as specified in requests and limits, describing each pod in the
     * current scale target (e.g. CPU or memory).  The values will be averaged
     * together before being compared to the target.  Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available to
     * normal per-pod metrics using the "pods" source.  Only one "target" type
     * should be set.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.ResourceMetricSource}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta2.ResourceMetricSource)
        io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSourceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_ResourceMetricSource_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_ResourceMetricSource_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource.class,
                io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getTargetFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (targetBuilder_ == null) {
          target_ = null;
        } else {
          targetBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_ResourceMetricSource_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource build() {
        io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource buildPartial() {
        io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource result =
            new io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (targetBuilder_ == null) {
          result.target_ = target_;
        } else {
          result.target_ = targetBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource other) {
        if (other
            == io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource
                .getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasTarget()) {
          mergeTarget(other.getTarget());
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
        io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       *
       *
       * <pre>
       * name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public com.google.protobuf.ByteString getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder setName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder setNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget target_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder>
          targetBuilder_;
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public boolean hasTarget() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget getTarget() {
        if (targetBuilder_ == null) {
          return target_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.getDefaultInstance()
              : target_;
        } else {
          return targetBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public Builder setTarget(io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget value) {
        if (targetBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          target_ = value;
          onChanged();
        } else {
          targetBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public Builder setTarget(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder builderForValue) {
        if (targetBuilder_ == null) {
          target_ = builderForValue.build();
          onChanged();
        } else {
          targetBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public Builder mergeTarget(io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget value) {
        if (targetBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && target_ != null
              && target_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget
                      .getDefaultInstance()) {
            target_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.newBuilder(target_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            target_ = value;
          }
          onChanged();
        } else {
          targetBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public Builder clearTarget() {
        if (targetBuilder_ == null) {
          target_ = null;
          onChanged();
        } else {
          targetBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder getTargetBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getTargetFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder
          getTargetOrBuilder() {
        if (targetBuilder_ != null) {
          return targetBuilder_.getMessageOrBuilder();
        } else {
          return target_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.getDefaultInstance()
              : target_;
        }
      }
      /**
       *
       *
       * <pre>
       * target specifies the target value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricTarget target = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder>
          getTargetFieldBuilder() {
        if (targetBuilder_ == null) {
          targetBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricTarget.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricTargetOrBuilder>(
                  getTarget(), getParentForChildren(), isClean());
          target_ = null;
        }
        return targetBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta2.ResourceMetricSource)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta2.ResourceMetricSource)
    private static final io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource();
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ResourceMetricSource> PARSER =
        new com.google.protobuf.AbstractParser<ResourceMetricSource>() {
          @java.lang.Override
          public ResourceMetricSource parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ResourceMetricSource(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ResourceMetricSource> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ResourceMetricSource> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricSource
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ResourceMetricStatusOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.autoscaling.v2beta2.ResourceMetricStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    boolean hasName();
    /**
     *
     *
     * <pre>
     * Name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    java.lang.String getName();
    /**
     *
     *
     * <pre>
     * Name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    com.google.protobuf.ByteString getNameBytes();

    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    boolean hasCurrent();
    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus getCurrent();
    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder getCurrentOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * ResourceMetricStatus indicates the current value of a resource metric known to
   * Kubernetes, as specified in requests and limits, describing each pod in the
   * current scale target (e.g. CPU or memory).  Such metrics are built in to
   * Kubernetes, and have special scaling options on top of those available to
   * normal per-pod metrics using the "pods" source.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.ResourceMetricStatus}
   */
  public static final class ResourceMetricStatus extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.autoscaling.v2beta2.ResourceMetricStatus)
      ResourceMetricStatusOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ResourceMetricStatus.newBuilder() to construct.
    private ResourceMetricStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ResourceMetricStatus() {
      name_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ResourceMetricStatus(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                name_ = bs;
                break;
              }
            case 18:
              {
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = current_.toBuilder();
                }
                current_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(current_);
                  current_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_ResourceMetricStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V2beta2Autoscaling
          .internal_static_k8s_io_api_autoscaling_v2beta2_ResourceMetricStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus.class,
              io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     *
     *
     * <pre>
     * Name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Name is the name of the resource in question.
     * </pre>
     *
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CURRENT_FIELD_NUMBER = 2;
    private io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus current_;
    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    public boolean hasCurrent() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus getCurrent() {
      return current_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.getDefaultInstance()
          : current_;
    }
    /**
     *
     *
     * <pre>
     * current contains the current value for the given metric
     * </pre>
     *
     * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
     */
    public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder
        getCurrentOrBuilder() {
      return current_ == null
          ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.getDefaultInstance()
          : current_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getCurrent());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getCurrent());
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
      if (!(obj instanceof io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus other =
          (io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus) obj;

      boolean result = true;
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName().equals(other.getName());
      }
      result = result && (hasCurrent() == other.hasCurrent());
      if (hasCurrent()) {
        result = result && getCurrent().equals(other.getCurrent());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasCurrent()) {
        hash = (37 * hash) + CURRENT_FIELD_NUMBER;
        hash = (53 * hash) + getCurrent().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus parseFrom(
        byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus
        parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus
        parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * ResourceMetricStatus indicates the current value of a resource metric known to
     * Kubernetes, as specified in requests and limits, describing each pod in the
     * current scale target (e.g. CPU or memory).  Such metrics are built in to
     * Kubernetes, and have special scaling options on top of those available to
     * normal per-pod metrics using the "pods" source.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.autoscaling.v2beta2.ResourceMetricStatus}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.autoscaling.v2beta2.ResourceMetricStatus)
        io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_ResourceMetricStatus_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_ResourceMetricStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus.class,
                io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus.Builder.class);
      }

      // Construct using
      // io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getCurrentFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (currentBuilder_ == null) {
          current_ = null;
        } else {
          currentBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling
            .internal_static_k8s_io_api_autoscaling_v2beta2_ResourceMetricStatus_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus
          getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus
            .getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus build() {
        io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus buildPartial() {
        io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus result =
            new io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (currentBuilder_ == null) {
          result.current_ = current_;
        } else {
          result.current_ = currentBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus) {
          return mergeFrom(
              (io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(
          io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus other) {
        if (other
            == io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus
                .getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasCurrent()) {
          mergeCurrent(other.getCurrent());
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
        io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus)
                  e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       *
       *
       * <pre>
       * Name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public com.google.protobuf.ByteString getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder setName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Name is the name of the resource in question.
       * </pre>
       *
       * <code>optional string name = 1;</code>
       */
      public Builder setNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      private io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus current_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder>
          currentBuilder_;
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public boolean hasCurrent() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus getCurrent() {
        if (currentBuilder_ == null) {
          return current_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.getDefaultInstance()
              : current_;
        } else {
          return currentBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public Builder setCurrent(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus value) {
        if (currentBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          current_ = value;
          onChanged();
        } else {
          currentBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public Builder setCurrent(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder builderForValue) {
        if (currentBuilder_ == null) {
          current_ = builderForValue.build();
          onChanged();
        } else {
          currentBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public Builder mergeCurrent(
          io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus value) {
        if (currentBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && current_ != null
              && current_
                  != io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus
                      .getDefaultInstance()) {
            current_ =
                io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.newBuilder(current_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            current_ = value;
          }
          onChanged();
        } else {
          currentBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public Builder clearCurrent() {
        if (currentBuilder_ == null) {
          current_ = null;
          onChanged();
        } else {
          currentBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder
          getCurrentBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getCurrentFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      public io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder
          getCurrentOrBuilder() {
        if (currentBuilder_ != null) {
          return currentBuilder_.getMessageOrBuilder();
        } else {
          return current_ == null
              ? io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.getDefaultInstance()
              : current_;
        }
      }
      /**
       *
       *
       * <pre>
       * current contains the current value for the given metric
       * </pre>
       *
       * <code>optional .k8s.io.api.autoscaling.v2beta2.MetricValueStatus current = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder,
              io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder>
          getCurrentFieldBuilder() {
        if (currentBuilder_ == null) {
          currentBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatus.Builder,
                  io.kubernetes.client.proto.V2beta2Autoscaling.MetricValueStatusOrBuilder>(
                  getCurrent(), getParentForChildren(), isClean());
          current_ = null;
        }
        return currentBuilder_;
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

      // @@protoc_insertion_point(builder_scope:k8s.io.api.autoscaling.v2beta2.ResourceMetricStatus)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.autoscaling.v2beta2.ResourceMetricStatus)
    private static final io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus
        DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus();
    }

    public static io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus
        getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ResourceMetricStatus> PARSER =
        new com.google.protobuf.AbstractParser<ResourceMetricStatus>() {
          @java.lang.Override
          public ResourceMetricStatus parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ResourceMetricStatus(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ResourceMetricStatus> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ResourceMetricStatus> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V2beta2Autoscaling.ResourceMetricStatus
        getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta2_CrossVersionObjectReference_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta2_CrossVersionObjectReference_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta2_ExternalMetricSource_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta2_ExternalMetricSource_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta2_ExternalMetricStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta2_ExternalMetricStatus_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscaler_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscaler_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerCondition_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerCondition_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerSpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerSpec_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerStatus_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta2_MetricIdentifier_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta2_MetricIdentifier_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta2_MetricSpec_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta2_MetricSpec_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta2_MetricStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta2_MetricStatus_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta2_MetricTarget_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta2_MetricTarget_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta2_MetricValueStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta2_MetricValueStatus_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta2_ObjectMetricSource_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta2_ObjectMetricSource_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta2_ObjectMetricStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta2_ObjectMetricStatus_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta2_PodsMetricSource_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta2_PodsMetricSource_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta2_PodsMetricStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta2_PodsMetricStatus_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta2_ResourceMetricSource_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta2_ResourceMetricSource_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_autoscaling_v2beta2_ResourceMetricStatus_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_autoscaling_v2beta2_ResourceMetricStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.k8s.io/api/autoscaling/v2beta2/generat"
          + "ed.proto\022\036k8s.io.api.autoscaling.v2beta2"
          + "\032\"k8s.io/api/core/v1/generated.proto\0324k8"
          + "s.io/apimachinery/pkg/api/resource/gener"
          + "ated.proto\0324k8s.io/apimachinery/pkg/apis"
          + "/meta/v1/generated.proto\032/k8s.io/apimach"
          + "inery/pkg/runtime/generated.proto\0326k8s.i"
          + "o/apimachinery/pkg/runtime/schema/genera"
          + "ted.proto\"M\n\033CrossVersionObjectReference"
          + "\022\014\n\004kind\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\022\n\napiVersi"
          + "on\030\003 \001(\t\"\226\001\n\024ExternalMetricSource\022@\n\006met"
          + "ric\030\001 \001(\01320.k8s.io.api.autoscaling.v2bet"
          + "a2.MetricIdentifier\022<\n\006target\030\002 \001(\0132,.k8"
          + "s.io.api.autoscaling.v2beta2.MetricTarge"
          + "t\"\234\001\n\024ExternalMetricStatus\022@\n\006metric\030\001 \001"
          + "(\01320.k8s.io.api.autoscaling.v2beta2.Metr"
          + "icIdentifier\022B\n\007current\030\002 \001(\01321.k8s.io.a"
          + "pi.autoscaling.v2beta2.MetricValueStatus"
          + "\"\367\001\n\027HorizontalPodAutoscaler\022B\n\010metadata"
          + "\030\001 \001(\01320.k8s.io.apimachinery.pkg.apis.me"
          + "ta.v1.ObjectMeta\022I\n\004spec\030\002 \001(\0132;.k8s.io."
          + "api.autoscaling.v2beta2.HorizontalPodAut"
          + "oscalerSpec\022M\n\006status\030\003 \001(\0132=.k8s.io.api"
          + ".autoscaling.v2beta2.HorizontalPodAutosc"
          + "alerStatus\"\251\001\n HorizontalPodAutoscalerCo"
          + "ndition\022\014\n\004type\030\001 \001(\t\022\016\n\006status\030\002 \001(\t\022F\n"
          + "\022lastTransitionTime\030\003 \001(\0132*.k8s.io.apima"
          + "chinery.pkg.apis.meta.v1.Time\022\016\n\006reason\030"
          + "\004 \001(\t\022\017\n\007message\030\005 \001(\t\"\247\001\n\033HorizontalPod"
          + "AutoscalerList\022@\n\010metadata\030\001 \001(\0132..k8s.i"
          + "o.apimachinery.pkg.apis.meta.v1.ListMeta"
          + "\022F\n\005items\030\002 \003(\01327.k8s.io.api.autoscaling"
          + ".v2beta2.HorizontalPodAutoscaler\"\331\001\n\033Hor"
          + "izontalPodAutoscalerSpec\022S\n\016scaleTargetR"
          + "ef\030\001 \001(\0132;.k8s.io.api.autoscaling.v2beta"
          + "2.CrossVersionObjectReference\022\023\n\013minRepl"
          + "icas\030\002 \001(\005\022\023\n\013maxReplicas\030\003 \001(\005\022;\n\007metri"
          + "cs\030\004 \003(\0132*.k8s.io.api.autoscaling.v2beta"
          + "2.MetricSpec\"\314\002\n\035HorizontalPodAutoscaler"
          + "Status\022\032\n\022observedGeneration\030\001 \001(\003\022A\n\rla"
          + "stScaleTime\030\002 \001(\0132*.k8s.io.apimachinery."
          + "pkg.apis.meta.v1.Time\022\027\n\017currentReplicas"
          + "\030\003 \001(\005\022\027\n\017desiredReplicas\030\004 \001(\005\022D\n\016curre"
          + "ntMetrics\030\005 \003(\0132,.k8s.io.api.autoscaling"
          + ".v2beta2.MetricStatus\022T\n\nconditions\030\006 \003("
          + "\0132@.k8s.io.api.autoscaling.v2beta2.Horiz"
          + "ontalPodAutoscalerCondition\"g\n\020MetricIde"
          + "ntifier\022\014\n\004name\030\001 \001(\t\022E\n\010selector\030\002 \001(\0132"
          + "3.k8s.io.apimachinery.pkg.apis.meta.v1.L"
          + "abelSelector\"\256\002\n\nMetricSpec\022\014\n\004type\030\001 \001("
          + "\t\022B\n\006object\030\002 \001(\01322.k8s.io.api.autoscali"
          + "ng.v2beta2.ObjectMetricSource\022>\n\004pods\030\003 "
          + "\001(\01320.k8s.io.api.autoscaling.v2beta2.Pod"
          + "sMetricSource\022F\n\010resource\030\004 \001(\01324.k8s.io"
          + ".api.autoscaling.v2beta2.ResourceMetricS"
          + "ource\022F\n\010external\030\005 \001(\01324.k8s.io.api.aut"
          + "oscaling.v2beta2.ExternalMetricSource\"\260\002"
          + "\n\014MetricStatus\022\014\n\004type\030\001 \001(\t\022B\n\006object\030\002"
          + " \001(\01322.k8s.io.api.autoscaling.v2beta2.Ob"
          + "jectMetricStatus\022>\n\004pods\030\003 \001(\01320.k8s.io."
          + "api.autoscaling.v2beta2.PodsMetricStatus"
          + "\022F\n\010resource\030\004 \001(\01324.k8s.io.api.autoscal"
          + "ing.v2beta2.ResourceMetricStatus\022F\n\010exte"
          + "rnal\030\005 \001(\01324.k8s.io.api.autoscaling.v2be"
          + "ta2.ExternalMetricStatus\"\275\001\n\014MetricTarge"
          + "t\022\014\n\004type\030\001 \001(\t\022=\n\005value\030\002 \001(\0132..k8s.io."
          + "apimachinery.pkg.api.resource.Quantity\022D"
          + "\n\014averageValue\030\003 \001(\0132..k8s.io.apimachine"
          + "ry.pkg.api.resource.Quantity\022\032\n\022averageU"
          + "tilization\030\004 \001(\005\"\264\001\n\021MetricValueStatus\022="
          + "\n\005value\030\001 \001(\0132..k8s.io.apimachinery.pkg."
          + "api.resource.Quantity\022D\n\014averageValue\030\002 "
          + "\001(\0132..k8s.io.apimachinery.pkg.api.resour"
          + "ce.Quantity\022\032\n\022averageUtilization\030\003 \001(\005\""
          + "\352\001\n\022ObjectMetricSource\022T\n\017describedObjec"
          + "t\030\001 \001(\0132;.k8s.io.api.autoscaling.v2beta2"
          + ".CrossVersionObjectReference\022<\n\006target\030\002"
          + " \001(\0132,.k8s.io.api.autoscaling.v2beta2.Me"
          + "tricTarget\022@\n\006metric\030\003 \001(\01320.k8s.io.api."
          + "autoscaling.v2beta2.MetricIdentifier\"\360\001\n"
          + "\022ObjectMetricStatus\022@\n\006metric\030\001 \001(\01320.k8"
          + "s.io.api.autoscaling.v2beta2.MetricIdent"
          + "ifier\022B\n\007current\030\002 \001(\01321.k8s.io.api.auto"
          + "scaling.v2beta2.MetricValueStatus\022T\n\017des"
          + "cribedObject\030\003 \001(\0132;.k8s.io.api.autoscal"
          + "ing.v2beta2.CrossVersionObjectReference\""
          + "\222\001\n\020PodsMetricSource\022@\n\006metric\030\001 \001(\01320.k"
          + "8s.io.api.autoscaling.v2beta2.MetricIden"
          + "tifier\022<\n\006target\030\002 \001(\0132,.k8s.io.api.auto"
          + "scaling.v2beta2.MetricTarget\"\230\001\n\020PodsMet"
          + "ricStatus\022@\n\006metric\030\001 \001(\01320.k8s.io.api.a"
          + "utoscaling.v2beta2.MetricIdentifier\022B\n\007c"
          + "urrent\030\002 \001(\01321.k8s.io.api.autoscaling.v2"
          + "beta2.MetricValueStatus\"b\n\024ResourceMetri"
          + "cSource\022\014\n\004name\030\001 \001(\t\022<\n\006target\030\002 \001(\0132,."
          + "k8s.io.api.autoscaling.v2beta2.MetricTar"
          + "get\"h\n\024ResourceMetricStatus\022\014\n\004name\030\001 \001("
          + "\t\022B\n\007current\030\002 \001(\01321.k8s.io.api.autoscal"
          + "ing.v2beta2.MetricValueStatusB9\n\032io.kube"
          + "rnetes.client.protoB\022V2beta2AutoscalingZ"
          + "\007v2beta2"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.kubernetes.client.proto.V1.getDescriptor(),
          io.kubernetes.client.proto.Resource.getDescriptor(),
          io.kubernetes.client.proto.Meta.getDescriptor(),
          io.kubernetes.client.proto.Runtime.getDescriptor(),
          io.kubernetes.client.proto.RuntimeSchema.getDescriptor(),
        },
        assigner);
    internal_static_k8s_io_api_autoscaling_v2beta2_CrossVersionObjectReference_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_k8s_io_api_autoscaling_v2beta2_CrossVersionObjectReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta2_CrossVersionObjectReference_descriptor,
            new java.lang.String[] {
              "Kind", "Name", "ApiVersion",
            });
    internal_static_k8s_io_api_autoscaling_v2beta2_ExternalMetricSource_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_k8s_io_api_autoscaling_v2beta2_ExternalMetricSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta2_ExternalMetricSource_descriptor,
            new java.lang.String[] {
              "Metric", "Target",
            });
    internal_static_k8s_io_api_autoscaling_v2beta2_ExternalMetricStatus_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_k8s_io_api_autoscaling_v2beta2_ExternalMetricStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta2_ExternalMetricStatus_descriptor,
            new java.lang.String[] {
              "Metric", "Current",
            });
    internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscaler_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscaler_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscaler_descriptor,
            new java.lang.String[] {
              "Metadata", "Spec", "Status",
            });
    internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerCondition_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerCondition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerCondition_descriptor,
            new java.lang.String[] {
              "Type", "Status", "LastTransitionTime", "Reason", "Message",
            });
    internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerList_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerSpec_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerSpec_descriptor,
            new java.lang.String[] {
              "ScaleTargetRef", "MinReplicas", "MaxReplicas", "Metrics",
            });
    internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerStatus_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta2_HorizontalPodAutoscalerStatus_descriptor,
            new java.lang.String[] {
              "ObservedGeneration",
              "LastScaleTime",
              "CurrentReplicas",
              "DesiredReplicas",
              "CurrentMetrics",
              "Conditions",
            });
    internal_static_k8s_io_api_autoscaling_v2beta2_MetricIdentifier_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_k8s_io_api_autoscaling_v2beta2_MetricIdentifier_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta2_MetricIdentifier_descriptor,
            new java.lang.String[] {
              "Name", "Selector",
            });
    internal_static_k8s_io_api_autoscaling_v2beta2_MetricSpec_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_k8s_io_api_autoscaling_v2beta2_MetricSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta2_MetricSpec_descriptor,
            new java.lang.String[] {
              "Type", "Object", "Pods", "Resource", "External",
            });
    internal_static_k8s_io_api_autoscaling_v2beta2_MetricStatus_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_k8s_io_api_autoscaling_v2beta2_MetricStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta2_MetricStatus_descriptor,
            new java.lang.String[] {
              "Type", "Object", "Pods", "Resource", "External",
            });
    internal_static_k8s_io_api_autoscaling_v2beta2_MetricTarget_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_k8s_io_api_autoscaling_v2beta2_MetricTarget_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta2_MetricTarget_descriptor,
            new java.lang.String[] {
              "Type", "Value", "AverageValue", "AverageUtilization",
            });
    internal_static_k8s_io_api_autoscaling_v2beta2_MetricValueStatus_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_k8s_io_api_autoscaling_v2beta2_MetricValueStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta2_MetricValueStatus_descriptor,
            new java.lang.String[] {
              "Value", "AverageValue", "AverageUtilization",
            });
    internal_static_k8s_io_api_autoscaling_v2beta2_ObjectMetricSource_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_k8s_io_api_autoscaling_v2beta2_ObjectMetricSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta2_ObjectMetricSource_descriptor,
            new java.lang.String[] {
              "DescribedObject", "Target", "Metric",
            });
    internal_static_k8s_io_api_autoscaling_v2beta2_ObjectMetricStatus_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_k8s_io_api_autoscaling_v2beta2_ObjectMetricStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta2_ObjectMetricStatus_descriptor,
            new java.lang.String[] {
              "Metric", "Current", "DescribedObject",
            });
    internal_static_k8s_io_api_autoscaling_v2beta2_PodsMetricSource_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_k8s_io_api_autoscaling_v2beta2_PodsMetricSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta2_PodsMetricSource_descriptor,
            new java.lang.String[] {
              "Metric", "Target",
            });
    internal_static_k8s_io_api_autoscaling_v2beta2_PodsMetricStatus_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_k8s_io_api_autoscaling_v2beta2_PodsMetricStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta2_PodsMetricStatus_descriptor,
            new java.lang.String[] {
              "Metric", "Current",
            });
    internal_static_k8s_io_api_autoscaling_v2beta2_ResourceMetricSource_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_k8s_io_api_autoscaling_v2beta2_ResourceMetricSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta2_ResourceMetricSource_descriptor,
            new java.lang.String[] {
              "Name", "Target",
            });
    internal_static_k8s_io_api_autoscaling_v2beta2_ResourceMetricStatus_descriptor =
        getDescriptor().getMessageTypes().get(18);
    internal_static_k8s_io_api_autoscaling_v2beta2_ResourceMetricStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_autoscaling_v2beta2_ResourceMetricStatus_descriptor,
            new java.lang.String[] {
              "Name", "Current",
            });
    io.kubernetes.client.proto.V1.getDescriptor();
    io.kubernetes.client.proto.Resource.getDescriptor();
    io.kubernetes.client.proto.Meta.getDescriptor();
    io.kubernetes.client.proto.Runtime.getDescriptor();
    io.kubernetes.client.proto.RuntimeSchema.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
