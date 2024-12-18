// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: Events/CancellationInfo.proto
// Protobuf Java Version: 4.28.1

package Diadoc.Api.Proto.Events;

public final class CancellationInfoProtos {
  private CancellationInfoProtos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      CancellationInfoProtos.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CancellationInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Diadoc.Api.Proto.Events.CancellationInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string Author = 1;</code>
     * @return Whether the author field is set.
     */
    boolean hasAuthor();
    /**
     * <code>required string Author = 1;</code>
     * @return The author.
     */
    java.lang.String getAuthor();
    /**
     * <code>required string Author = 1;</code>
     * @return The bytes for author.
     */
    com.google.protobuf.ByteString
        getAuthorBytes();
  }
  /**
   * Protobuf type {@code Diadoc.Api.Proto.Events.CancellationInfo}
   */
  public static final class CancellationInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Diadoc.Api.Proto.Events.CancellationInfo)
      CancellationInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 1,
        /* suffix= */ "",
        CancellationInfo.class.getName());
    }
    // Use CancellationInfo.newBuilder() to construct.
    private CancellationInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private CancellationInfo() {
      author_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.Events.CancellationInfoProtos.internal_static_Diadoc_Api_Proto_Events_CancellationInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.Events.CancellationInfoProtos.internal_static_Diadoc_Api_Proto_Events_CancellationInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo.class, Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo.Builder.class);
    }

    private int bitField0_;
    public static final int AUTHOR_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object author_ = "";
    /**
     * <code>required string Author = 1;</code>
     * @return Whether the author field is set.
     */
    @java.lang.Override
    public boolean hasAuthor() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string Author = 1;</code>
     * @return The author.
     */
    @java.lang.Override
    public java.lang.String getAuthor() {
      java.lang.Object ref = author_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          author_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string Author = 1;</code>
     * @return The bytes for author.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAuthorBytes() {
      java.lang.Object ref = author_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        author_ = b;
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

      if (!hasAuthor()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, author_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, author_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo)) {
        return super.equals(obj);
      }
      Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo other = (Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo) obj;

      if (hasAuthor() != other.hasAuthor()) return false;
      if (hasAuthor()) {
        if (!getAuthor()
            .equals(other.getAuthor())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasAuthor()) {
        hash = (37 * hash) + AUTHOR_FIELD_NUMBER;
        hash = (53 * hash) + getAuthor().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Diadoc.Api.Proto.Events.CancellationInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Diadoc.Api.Proto.Events.CancellationInfo)
        Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.Events.CancellationInfoProtos.internal_static_Diadoc_Api_Proto_Events_CancellationInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.Events.CancellationInfoProtos.internal_static_Diadoc_Api_Proto_Events_CancellationInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo.class, Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo.Builder.class);
      }

      // Construct using Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        author_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.Events.CancellationInfoProtos.internal_static_Diadoc_Api_Proto_Events_CancellationInfo_descriptor;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo getDefaultInstanceForType() {
        return Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo.getDefaultInstance();
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo build() {
        Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo buildPartial() {
        Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo result = new Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.author_ = author_;
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo) {
          return mergeFrom((Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo other) {
        if (other == Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo.getDefaultInstance()) return this;
        if (other.hasAuthor()) {
          author_ = other.author_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasAuthor()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                author_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object author_ = "";
      /**
       * <code>required string Author = 1;</code>
       * @return Whether the author field is set.
       */
      public boolean hasAuthor() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string Author = 1;</code>
       * @return The author.
       */
      public java.lang.String getAuthor() {
        java.lang.Object ref = author_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            author_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string Author = 1;</code>
       * @return The bytes for author.
       */
      public com.google.protobuf.ByteString
          getAuthorBytes() {
        java.lang.Object ref = author_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          author_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string Author = 1;</code>
       * @param value The author to set.
       * @return This builder for chaining.
       */
      public Builder setAuthor(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        author_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>required string Author = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAuthor() {
        author_ = getDefaultInstance().getAuthor();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>required string Author = 1;</code>
       * @param value The bytes for author to set.
       * @return This builder for chaining.
       */
      public Builder setAuthorBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        author_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.Events.CancellationInfo)
    }

    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.Events.CancellationInfo)
    private static final Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo();
    }

    public static Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CancellationInfo>
        PARSER = new com.google.protobuf.AbstractParser<CancellationInfo>() {
      @java.lang.Override
      public CancellationInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<CancellationInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CancellationInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public Diadoc.Api.Proto.Events.CancellationInfoProtos.CancellationInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_Events_CancellationInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_Events_CancellationInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035Events/CancellationInfo.proto\022\027Diadoc." +
      "Api.Proto.Events\"\"\n\020CancellationInfo\022\016\n\006" +
      "Author\030\001 \002(\tB\030B\026CancellationInfoProtos"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Diadoc_Api_Proto_Events_CancellationInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Diadoc_Api_Proto_Events_CancellationInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Diadoc_Api_Proto_Events_CancellationInfo_descriptor,
        new java.lang.String[] { "Author", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
