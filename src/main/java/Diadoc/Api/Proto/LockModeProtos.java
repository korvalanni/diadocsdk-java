// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: LockMode.proto
// Protobuf Java Version: 4.28.1

package Diadoc.Api.Proto;

public final class LockModeProtos {
  private LockModeProtos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      LockModeProtos.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code Diadoc.Api.Proto.LockMode}
   */
  public enum LockMode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Unknown = 0;</code>
     */
    Unknown(0),
    /**
     * <code>None = 1;</code>
     */
    None(1),
    /**
     * <code>Send = 2;</code>
     */
    Send(2),
    /**
     * <code>Full = 3;</code>
     */
    Full(3),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 1,
        /* suffix= */ "",
        LockMode.class.getName());
    }
    /**
     * <code>Unknown = 0;</code>
     */
    public static final int Unknown_VALUE = 0;
    /**
     * <code>None = 1;</code>
     */
    public static final int None_VALUE = 1;
    /**
     * <code>Send = 2;</code>
     */
    public static final int Send_VALUE = 2;
    /**
     * <code>Full = 3;</code>
     */
    public static final int Full_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LockMode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LockMode forNumber(int value) {
      switch (value) {
        case 0: return Unknown;
        case 1: return None;
        case 2: return Send;
        case 3: return Full;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LockMode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        LockMode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LockMode>() {
            public LockMode findValueByNumber(int number) {
              return LockMode.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return Diadoc.Api.Proto.LockModeProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final LockMode[] VALUES = values();

    public static LockMode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private LockMode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Diadoc.Api.Proto.LockMode)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016LockMode.proto\022\020Diadoc.Api.Proto*5\n\010Lo" +
      "ckMode\022\013\n\007Unknown\020\000\022\010\n\004None\020\001\022\010\n\004Send\020\002\022" +
      "\010\n\004Full\020\003B\020B\016LockModeProtos"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
