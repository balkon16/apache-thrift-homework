/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.pja.sri.hw06.stockpriceservice;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)", date = "2021-06-13")
public class Price implements org.apache.thrift.TBase<Price, Price._Fields>, java.io.Serializable, Cloneable, Comparable<Price> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Price");

  private static final org.apache.thrift.protocol.TField PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("price", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField CURRENCY_FIELD_DESC = new org.apache.thrift.protocol.TField("currency", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PriceStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PriceTupleSchemeFactory();

  public double price; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String currency; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PRICE((short)1, "price"),
    CURRENCY((short)2, "currency");

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
        case 1: // PRICE
          return PRICE;
        case 2: // CURRENCY
          return CURRENCY;
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
  private static final int __PRICE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PRICE, new org.apache.thrift.meta_data.FieldMetaData("price", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.CURRENCY, new org.apache.thrift.meta_data.FieldMetaData("currency", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Price.class, metaDataMap);
  }

  public Price() {
  }

  public Price(
    double price,
    java.lang.String currency)
  {
    this();
    this.price = price;
    setPriceIsSet(true);
    this.currency = currency;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Price(Price other) {
    __isset_bitfield = other.__isset_bitfield;
    this.price = other.price;
    if (other.isSetCurrency()) {
      this.currency = other.currency;
    }
  }

  public Price deepCopy() {
    return new Price(this);
  }

  @Override
  public void clear() {
    setPriceIsSet(false);
    this.price = 0.0;
    this.currency = null;
  }

  public double getPrice() {
    return this.price;
  }

  public Price setPrice(double price) {
    this.price = price;
    setPriceIsSet(true);
    return this;
  }

  public void unsetPrice() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PRICE_ISSET_ID);
  }

  /** Returns true if field price is set (has been assigned a value) and false otherwise */
  public boolean isSetPrice() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PRICE_ISSET_ID);
  }

  public void setPriceIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PRICE_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCurrency() {
    return this.currency;
  }

  public Price setCurrency(@org.apache.thrift.annotation.Nullable java.lang.String currency) {
    this.currency = currency;
    return this;
  }

  public void unsetCurrency() {
    this.currency = null;
  }

  /** Returns true if field currency is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrency() {
    return this.currency != null;
  }

  public void setCurrencyIsSet(boolean value) {
    if (!value) {
      this.currency = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PRICE:
      if (value == null) {
        unsetPrice();
      } else {
        setPrice((java.lang.Double)value);
      }
      break;

    case CURRENCY:
      if (value == null) {
        unsetCurrency();
      } else {
        setCurrency((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PRICE:
      return getPrice();

    case CURRENCY:
      return getCurrency();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PRICE:
      return isSetPrice();
    case CURRENCY:
      return isSetCurrency();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof Price)
      return this.equals((Price)that);
    return false;
  }

  public boolean equals(Price that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_price = true;
    boolean that_present_price = true;
    if (this_present_price || that_present_price) {
      if (!(this_present_price && that_present_price))
        return false;
      if (this.price != that.price)
        return false;
    }

    boolean this_present_currency = true && this.isSetCurrency();
    boolean that_present_currency = true && that.isSetCurrency();
    if (this_present_currency || that_present_currency) {
      if (!(this_present_currency && that_present_currency))
        return false;
      if (!this.currency.equals(that.currency))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(price);

    hashCode = hashCode * 8191 + ((isSetCurrency()) ? 131071 : 524287);
    if (isSetCurrency())
      hashCode = hashCode * 8191 + currency.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Price other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetPrice(), other.isSetPrice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.price, other.price);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCurrency(), other.isSetCurrency());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrency()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.currency, other.currency);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Price(");
    boolean first = true;

    sb.append("price:");
    sb.append(this.price);
    first = false;
    if (!first) sb.append(", ");
    sb.append("currency:");
    if (this.currency == null) {
      sb.append("null");
    } else {
      sb.append(this.currency);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'price' because it's a primitive and you chose the non-beans generator.
    if (currency == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'currency' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PriceStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PriceStandardScheme getScheme() {
      return new PriceStandardScheme();
    }
  }

  private static class PriceStandardScheme extends org.apache.thrift.scheme.StandardScheme<Price> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Price struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.price = iprot.readDouble();
              struct.setPriceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CURRENCY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.currency = iprot.readString();
              struct.setCurrencyIsSet(true);
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
      if (!struct.isSetPrice()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'price' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Price struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PRICE_FIELD_DESC);
      oprot.writeDouble(struct.price);
      oprot.writeFieldEnd();
      if (struct.currency != null) {
        oprot.writeFieldBegin(CURRENCY_FIELD_DESC);
        oprot.writeString(struct.currency);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PriceTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PriceTupleScheme getScheme() {
      return new PriceTupleScheme();
    }
  }

  private static class PriceTupleScheme extends org.apache.thrift.scheme.TupleScheme<Price> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Price struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeDouble(struct.price);
      oprot.writeString(struct.currency);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Price struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.price = iprot.readDouble();
      struct.setPriceIsSet(true);
      struct.currency = iprot.readString();
      struct.setCurrencyIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

