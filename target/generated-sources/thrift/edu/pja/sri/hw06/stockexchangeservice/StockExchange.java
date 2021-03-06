/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.pja.sri.hw06.stockexchangeservice;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)", date = "2021-06-12")
public class StockExchange implements org.apache.thrift.TBase<StockExchange, StockExchange._Fields>, java.io.Serializable, Cloneable, Comparable<StockExchange> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StockExchange");

  private static final org.apache.thrift.protocol.TField SHORT_NAME_INTL_FIELD_DESC = new org.apache.thrift.protocol.TField("shortNameIntl", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField FULL_NAME_INTL_FIELD_DESC = new org.apache.thrift.protocol.TField("fullNameIntl", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SHORT_NAME_LOCAL_FIELD_DESC = new org.apache.thrift.protocol.TField("shortNameLocal", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("address", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField COORDINATES_FIELD_DESC = new org.apache.thrift.protocol.TField("coordinates", org.apache.thrift.protocol.TType.STRUCT, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new StockExchangeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new StockExchangeTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String shortNameIntl; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String fullNameIntl; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String shortNameLocal; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String address; // required
  public @org.apache.thrift.annotation.Nullable Coordinates coordinates; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SHORT_NAME_INTL((short)1, "shortNameIntl"),
    FULL_NAME_INTL((short)2, "fullNameIntl"),
    SHORT_NAME_LOCAL((short)3, "shortNameLocal"),
    ADDRESS((short)4, "address"),
    COORDINATES((short)5, "coordinates");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SHORT_NAME_INTL
          return SHORT_NAME_INTL;
        case 2: // FULL_NAME_INTL
          return FULL_NAME_INTL;
        case 3: // SHORT_NAME_LOCAL
          return SHORT_NAME_LOCAL;
        case 4: // ADDRESS
          return ADDRESS;
        case 5: // COORDINATES
          return COORDINATES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SHORT_NAME_INTL, new org.apache.thrift.meta_data.FieldMetaData("shortNameIntl", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FULL_NAME_INTL, new org.apache.thrift.meta_data.FieldMetaData("fullNameIntl", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SHORT_NAME_LOCAL, new org.apache.thrift.meta_data.FieldMetaData("shortNameLocal", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("address", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COORDINATES, new org.apache.thrift.meta_data.FieldMetaData("coordinates", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Coordinates.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StockExchange.class, metaDataMap);
  }

  public StockExchange() {
  }

  public StockExchange(
    java.lang.String shortNameIntl,
    java.lang.String fullNameIntl,
    java.lang.String shortNameLocal,
    java.lang.String address,
    Coordinates coordinates)
  {
    this();
    this.shortNameIntl = shortNameIntl;
    this.fullNameIntl = fullNameIntl;
    this.shortNameLocal = shortNameLocal;
    this.address = address;
    this.coordinates = coordinates;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StockExchange(StockExchange other) {
    if (other.isSetShortNameIntl()) {
      this.shortNameIntl = other.shortNameIntl;
    }
    if (other.isSetFullNameIntl()) {
      this.fullNameIntl = other.fullNameIntl;
    }
    if (other.isSetShortNameLocal()) {
      this.shortNameLocal = other.shortNameLocal;
    }
    if (other.isSetAddress()) {
      this.address = other.address;
    }
    if (other.isSetCoordinates()) {
      this.coordinates = new Coordinates(other.coordinates);
    }
  }

  public StockExchange deepCopy() {
    return new StockExchange(this);
  }

  @Override
  public void clear() {
    this.shortNameIntl = null;
    this.fullNameIntl = null;
    this.shortNameLocal = null;
    this.address = null;
    this.coordinates = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getShortNameIntl() {
    return this.shortNameIntl;
  }

  public StockExchange setShortNameIntl(@org.apache.thrift.annotation.Nullable java.lang.String shortNameIntl) {
    this.shortNameIntl = shortNameIntl;
    return this;
  }

  public void unsetShortNameIntl() {
    this.shortNameIntl = null;
  }

  /** Returns true if field shortNameIntl is set (has been assigned a value) and false otherwise */
  public boolean isSetShortNameIntl() {
    return this.shortNameIntl != null;
  }

  public void setShortNameIntlIsSet(boolean value) {
    if (!value) {
      this.shortNameIntl = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getFullNameIntl() {
    return this.fullNameIntl;
  }

  public StockExchange setFullNameIntl(@org.apache.thrift.annotation.Nullable java.lang.String fullNameIntl) {
    this.fullNameIntl = fullNameIntl;
    return this;
  }

  public void unsetFullNameIntl() {
    this.fullNameIntl = null;
  }

  /** Returns true if field fullNameIntl is set (has been assigned a value) and false otherwise */
  public boolean isSetFullNameIntl() {
    return this.fullNameIntl != null;
  }

  public void setFullNameIntlIsSet(boolean value) {
    if (!value) {
      this.fullNameIntl = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getShortNameLocal() {
    return this.shortNameLocal;
  }

  public StockExchange setShortNameLocal(@org.apache.thrift.annotation.Nullable java.lang.String shortNameLocal) {
    this.shortNameLocal = shortNameLocal;
    return this;
  }

  public void unsetShortNameLocal() {
    this.shortNameLocal = null;
  }

  /** Returns true if field shortNameLocal is set (has been assigned a value) and false otherwise */
  public boolean isSetShortNameLocal() {
    return this.shortNameLocal != null;
  }

  public void setShortNameLocalIsSet(boolean value) {
    if (!value) {
      this.shortNameLocal = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getAddress() {
    return this.address;
  }

  public StockExchange setAddress(@org.apache.thrift.annotation.Nullable java.lang.String address) {
    this.address = address;
    return this;
  }

  public void unsetAddress() {
    this.address = null;
  }

  /** Returns true if field address is set (has been assigned a value) and false otherwise */
  public boolean isSetAddress() {
    return this.address != null;
  }

  public void setAddressIsSet(boolean value) {
    if (!value) {
      this.address = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public Coordinates getCoordinates() {
    return this.coordinates;
  }

  public StockExchange setCoordinates(@org.apache.thrift.annotation.Nullable Coordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public void unsetCoordinates() {
    this.coordinates = null;
  }

  /** Returns true if field coordinates is set (has been assigned a value) and false otherwise */
  public boolean isSetCoordinates() {
    return this.coordinates != null;
  }

  public void setCoordinatesIsSet(boolean value) {
    if (!value) {
      this.coordinates = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case SHORT_NAME_INTL:
      if (value == null) {
        unsetShortNameIntl();
      } else {
        setShortNameIntl((java.lang.String)value);
      }
      break;

    case FULL_NAME_INTL:
      if (value == null) {
        unsetFullNameIntl();
      } else {
        setFullNameIntl((java.lang.String)value);
      }
      break;

    case SHORT_NAME_LOCAL:
      if (value == null) {
        unsetShortNameLocal();
      } else {
        setShortNameLocal((java.lang.String)value);
      }
      break;

    case ADDRESS:
      if (value == null) {
        unsetAddress();
      } else {
        setAddress((java.lang.String)value);
      }
      break;

    case COORDINATES:
      if (value == null) {
        unsetCoordinates();
      } else {
        setCoordinates((Coordinates)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SHORT_NAME_INTL:
      return getShortNameIntl();

    case FULL_NAME_INTL:
      return getFullNameIntl();

    case SHORT_NAME_LOCAL:
      return getShortNameLocal();

    case ADDRESS:
      return getAddress();

    case COORDINATES:
      return getCoordinates();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SHORT_NAME_INTL:
      return isSetShortNameIntl();
    case FULL_NAME_INTL:
      return isSetFullNameIntl();
    case SHORT_NAME_LOCAL:
      return isSetShortNameLocal();
    case ADDRESS:
      return isSetAddress();
    case COORDINATES:
      return isSetCoordinates();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof StockExchange)
      return this.equals((StockExchange)that);
    return false;
  }

  public boolean equals(StockExchange that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_shortNameIntl = true && this.isSetShortNameIntl();
    boolean that_present_shortNameIntl = true && that.isSetShortNameIntl();
    if (this_present_shortNameIntl || that_present_shortNameIntl) {
      if (!(this_present_shortNameIntl && that_present_shortNameIntl))
        return false;
      if (!this.shortNameIntl.equals(that.shortNameIntl))
        return false;
    }

    boolean this_present_fullNameIntl = true && this.isSetFullNameIntl();
    boolean that_present_fullNameIntl = true && that.isSetFullNameIntl();
    if (this_present_fullNameIntl || that_present_fullNameIntl) {
      if (!(this_present_fullNameIntl && that_present_fullNameIntl))
        return false;
      if (!this.fullNameIntl.equals(that.fullNameIntl))
        return false;
    }

    boolean this_present_shortNameLocal = true && this.isSetShortNameLocal();
    boolean that_present_shortNameLocal = true && that.isSetShortNameLocal();
    if (this_present_shortNameLocal || that_present_shortNameLocal) {
      if (!(this_present_shortNameLocal && that_present_shortNameLocal))
        return false;
      if (!this.shortNameLocal.equals(that.shortNameLocal))
        return false;
    }

    boolean this_present_address = true && this.isSetAddress();
    boolean that_present_address = true && that.isSetAddress();
    if (this_present_address || that_present_address) {
      if (!(this_present_address && that_present_address))
        return false;
      if (!this.address.equals(that.address))
        return false;
    }

    boolean this_present_coordinates = true && this.isSetCoordinates();
    boolean that_present_coordinates = true && that.isSetCoordinates();
    if (this_present_coordinates || that_present_coordinates) {
      if (!(this_present_coordinates && that_present_coordinates))
        return false;
      if (!this.coordinates.equals(that.coordinates))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetShortNameIntl()) ? 131071 : 524287);
    if (isSetShortNameIntl())
      hashCode = hashCode * 8191 + shortNameIntl.hashCode();

    hashCode = hashCode * 8191 + ((isSetFullNameIntl()) ? 131071 : 524287);
    if (isSetFullNameIntl())
      hashCode = hashCode * 8191 + fullNameIntl.hashCode();

    hashCode = hashCode * 8191 + ((isSetShortNameLocal()) ? 131071 : 524287);
    if (isSetShortNameLocal())
      hashCode = hashCode * 8191 + shortNameLocal.hashCode();

    hashCode = hashCode * 8191 + ((isSetAddress()) ? 131071 : 524287);
    if (isSetAddress())
      hashCode = hashCode * 8191 + address.hashCode();

    hashCode = hashCode * 8191 + ((isSetCoordinates()) ? 131071 : 524287);
    if (isSetCoordinates())
      hashCode = hashCode * 8191 + coordinates.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(StockExchange other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetShortNameIntl(), other.isSetShortNameIntl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShortNameIntl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.shortNameIntl, other.shortNameIntl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetFullNameIntl(), other.isSetFullNameIntl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFullNameIntl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fullNameIntl, other.fullNameIntl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetShortNameLocal(), other.isSetShortNameLocal());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShortNameLocal()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.shortNameLocal, other.shortNameLocal);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetAddress(), other.isSetAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.address, other.address);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCoordinates(), other.isSetCoordinates());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCoordinates()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.coordinates, other.coordinates);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("StockExchange(");
    boolean first = true;

    sb.append("shortNameIntl:");
    if (this.shortNameIntl == null) {
      sb.append("null");
    } else {
      sb.append(this.shortNameIntl);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("fullNameIntl:");
    if (this.fullNameIntl == null) {
      sb.append("null");
    } else {
      sb.append(this.fullNameIntl);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("shortNameLocal:");
    if (this.shortNameLocal == null) {
      sb.append("null");
    } else {
      sb.append(this.shortNameLocal);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("address:");
    if (this.address == null) {
      sb.append("null");
    } else {
      sb.append(this.address);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("coordinates:");
    if (this.coordinates == null) {
      sb.append("null");
    } else {
      sb.append(this.coordinates);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (shortNameIntl == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'shortNameIntl' was not present! Struct: " + toString());
    }
    if (fullNameIntl == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'fullNameIntl' was not present! Struct: " + toString());
    }
    if (shortNameLocal == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'shortNameLocal' was not present! Struct: " + toString());
    }
    if (address == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'address' was not present! Struct: " + toString());
    }
    if (coordinates == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'coordinates' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (coordinates != null) {
      coordinates.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StockExchangeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StockExchangeStandardScheme getScheme() {
      return new StockExchangeStandardScheme();
    }
  }

  private static class StockExchangeStandardScheme extends org.apache.thrift.scheme.StandardScheme<StockExchange> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StockExchange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SHORT_NAME_INTL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.shortNameIntl = iprot.readString();
              struct.setShortNameIntlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FULL_NAME_INTL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.fullNameIntl = iprot.readString();
              struct.setFullNameIntlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SHORT_NAME_LOCAL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.shortNameLocal = iprot.readString();
              struct.setShortNameLocalIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.address = iprot.readString();
              struct.setAddressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // COORDINATES
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.coordinates = new Coordinates();
              struct.coordinates.read(iprot);
              struct.setCoordinatesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, StockExchange struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.shortNameIntl != null) {
        oprot.writeFieldBegin(SHORT_NAME_INTL_FIELD_DESC);
        oprot.writeString(struct.shortNameIntl);
        oprot.writeFieldEnd();
      }
      if (struct.fullNameIntl != null) {
        oprot.writeFieldBegin(FULL_NAME_INTL_FIELD_DESC);
        oprot.writeString(struct.fullNameIntl);
        oprot.writeFieldEnd();
      }
      if (struct.shortNameLocal != null) {
        oprot.writeFieldBegin(SHORT_NAME_LOCAL_FIELD_DESC);
        oprot.writeString(struct.shortNameLocal);
        oprot.writeFieldEnd();
      }
      if (struct.address != null) {
        oprot.writeFieldBegin(ADDRESS_FIELD_DESC);
        oprot.writeString(struct.address);
        oprot.writeFieldEnd();
      }
      if (struct.coordinates != null) {
        oprot.writeFieldBegin(COORDINATES_FIELD_DESC);
        struct.coordinates.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StockExchangeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StockExchangeTupleScheme getScheme() {
      return new StockExchangeTupleScheme();
    }
  }

  private static class StockExchangeTupleScheme extends org.apache.thrift.scheme.TupleScheme<StockExchange> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StockExchange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.shortNameIntl);
      oprot.writeString(struct.fullNameIntl);
      oprot.writeString(struct.shortNameLocal);
      oprot.writeString(struct.address);
      struct.coordinates.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StockExchange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.shortNameIntl = iprot.readString();
      struct.setShortNameIntlIsSet(true);
      struct.fullNameIntl = iprot.readString();
      struct.setFullNameIntlIsSet(true);
      struct.shortNameLocal = iprot.readString();
      struct.setShortNameLocalIsSet(true);
      struct.address = iprot.readString();
      struct.setAddressIsSet(true);
      struct.coordinates = new Coordinates();
      struct.coordinates.read(iprot);
      struct.setCoordinatesIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

