/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.pja.sri.hw06.exchangerateservice;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)", date = "2021-06-12")
public class ExchangeRate implements org.apache.thrift.TBase<ExchangeRate, ExchangeRate._Fields>, java.io.Serializable, Cloneable, Comparable<ExchangeRate> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ExchangeRate");

  private static final org.apache.thrift.protocol.TField BASE_CURRENCY_FIELD_DESC = new org.apache.thrift.protocol.TField("baseCurrency", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField QUOTE_CURRENCY_FIELD_DESC = new org.apache.thrift.protocol.TField("quoteCurrency", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField MULTIPLIER_FIELD_DESC = new org.apache.thrift.protocol.TField("multiplier", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField RATE_FIELD_DESC = new org.apache.thrift.protocol.TField("rate", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ExchangeRateStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ExchangeRateTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String baseCurrency; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String quoteCurrency; // required
  public long multiplier; // required
  public double rate; // required
  public long timestamp; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BASE_CURRENCY((short)1, "baseCurrency"),
    QUOTE_CURRENCY((short)2, "quoteCurrency"),
    MULTIPLIER((short)3, "multiplier"),
    RATE((short)4, "rate"),
    TIMESTAMP((short)5, "timestamp");

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
        case 1: // BASE_CURRENCY
          return BASE_CURRENCY;
        case 2: // QUOTE_CURRENCY
          return QUOTE_CURRENCY;
        case 3: // MULTIPLIER
          return MULTIPLIER;
        case 4: // RATE
          return RATE;
        case 5: // TIMESTAMP
          return TIMESTAMP;
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
  private static final int __MULTIPLIER_ISSET_ID = 0;
  private static final int __RATE_ISSET_ID = 1;
  private static final int __TIMESTAMP_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BASE_CURRENCY, new org.apache.thrift.meta_data.FieldMetaData("baseCurrency", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.QUOTE_CURRENCY, new org.apache.thrift.meta_data.FieldMetaData("quoteCurrency", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MULTIPLIER, new org.apache.thrift.meta_data.FieldMetaData("multiplier", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.RATE, new org.apache.thrift.meta_data.FieldMetaData("rate", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("timestamp", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ExchangeRate.class, metaDataMap);
  }

  public ExchangeRate() {
  }

  public ExchangeRate(
    java.lang.String baseCurrency,
    java.lang.String quoteCurrency,
    long multiplier,
    double rate,
    long timestamp)
  {
    this();
    this.baseCurrency = baseCurrency;
    this.quoteCurrency = quoteCurrency;
    this.multiplier = multiplier;
    setMultiplierIsSet(true);
    this.rate = rate;
    setRateIsSet(true);
    this.timestamp = timestamp;
    setTimestampIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExchangeRate(ExchangeRate other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetBaseCurrency()) {
      this.baseCurrency = other.baseCurrency;
    }
    if (other.isSetQuoteCurrency()) {
      this.quoteCurrency = other.quoteCurrency;
    }
    this.multiplier = other.multiplier;
    this.rate = other.rate;
    this.timestamp = other.timestamp;
  }

  public ExchangeRate deepCopy() {
    return new ExchangeRate(this);
  }

  @Override
  public void clear() {
    this.baseCurrency = null;
    this.quoteCurrency = null;
    setMultiplierIsSet(false);
    this.multiplier = 0;
    setRateIsSet(false);
    this.rate = 0.0;
    setTimestampIsSet(false);
    this.timestamp = 0;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getBaseCurrency() {
    return this.baseCurrency;
  }

  public ExchangeRate setBaseCurrency(@org.apache.thrift.annotation.Nullable java.lang.String baseCurrency) {
    this.baseCurrency = baseCurrency;
    return this;
  }

  public void unsetBaseCurrency() {
    this.baseCurrency = null;
  }

  /** Returns true if field baseCurrency is set (has been assigned a value) and false otherwise */
  public boolean isSetBaseCurrency() {
    return this.baseCurrency != null;
  }

  public void setBaseCurrencyIsSet(boolean value) {
    if (!value) {
      this.baseCurrency = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getQuoteCurrency() {
    return this.quoteCurrency;
  }

  public ExchangeRate setQuoteCurrency(@org.apache.thrift.annotation.Nullable java.lang.String quoteCurrency) {
    this.quoteCurrency = quoteCurrency;
    return this;
  }

  public void unsetQuoteCurrency() {
    this.quoteCurrency = null;
  }

  /** Returns true if field quoteCurrency is set (has been assigned a value) and false otherwise */
  public boolean isSetQuoteCurrency() {
    return this.quoteCurrency != null;
  }

  public void setQuoteCurrencyIsSet(boolean value) {
    if (!value) {
      this.quoteCurrency = null;
    }
  }

  public long getMultiplier() {
    return this.multiplier;
  }

  public ExchangeRate setMultiplier(long multiplier) {
    this.multiplier = multiplier;
    setMultiplierIsSet(true);
    return this;
  }

  public void unsetMultiplier() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MULTIPLIER_ISSET_ID);
  }

  /** Returns true if field multiplier is set (has been assigned a value) and false otherwise */
  public boolean isSetMultiplier() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MULTIPLIER_ISSET_ID);
  }

  public void setMultiplierIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MULTIPLIER_ISSET_ID, value);
  }

  public double getRate() {
    return this.rate;
  }

  public ExchangeRate setRate(double rate) {
    this.rate = rate;
    setRateIsSet(true);
    return this;
  }

  public void unsetRate() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RATE_ISSET_ID);
  }

  /** Returns true if field rate is set (has been assigned a value) and false otherwise */
  public boolean isSetRate() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RATE_ISSET_ID);
  }

  public void setRateIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RATE_ISSET_ID, value);
  }

  public long getTimestamp() {
    return this.timestamp;
  }

  public ExchangeRate setTimestamp(long timestamp) {
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    return this;
  }

  public void unsetTimestamp() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field timestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestamp() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  public void setTimestampIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TIMESTAMP_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case BASE_CURRENCY:
      if (value == null) {
        unsetBaseCurrency();
      } else {
        setBaseCurrency((java.lang.String)value);
      }
      break;

    case QUOTE_CURRENCY:
      if (value == null) {
        unsetQuoteCurrency();
      } else {
        setQuoteCurrency((java.lang.String)value);
      }
      break;

    case MULTIPLIER:
      if (value == null) {
        unsetMultiplier();
      } else {
        setMultiplier((java.lang.Long)value);
      }
      break;

    case RATE:
      if (value == null) {
        unsetRate();
      } else {
        setRate((java.lang.Double)value);
      }
      break;

    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case BASE_CURRENCY:
      return getBaseCurrency();

    case QUOTE_CURRENCY:
      return getQuoteCurrency();

    case MULTIPLIER:
      return getMultiplier();

    case RATE:
      return getRate();

    case TIMESTAMP:
      return getTimestamp();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case BASE_CURRENCY:
      return isSetBaseCurrency();
    case QUOTE_CURRENCY:
      return isSetQuoteCurrency();
    case MULTIPLIER:
      return isSetMultiplier();
    case RATE:
      return isSetRate();
    case TIMESTAMP:
      return isSetTimestamp();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof ExchangeRate)
      return this.equals((ExchangeRate)that);
    return false;
  }

  public boolean equals(ExchangeRate that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_baseCurrency = true && this.isSetBaseCurrency();
    boolean that_present_baseCurrency = true && that.isSetBaseCurrency();
    if (this_present_baseCurrency || that_present_baseCurrency) {
      if (!(this_present_baseCurrency && that_present_baseCurrency))
        return false;
      if (!this.baseCurrency.equals(that.baseCurrency))
        return false;
    }

    boolean this_present_quoteCurrency = true && this.isSetQuoteCurrency();
    boolean that_present_quoteCurrency = true && that.isSetQuoteCurrency();
    if (this_present_quoteCurrency || that_present_quoteCurrency) {
      if (!(this_present_quoteCurrency && that_present_quoteCurrency))
        return false;
      if (!this.quoteCurrency.equals(that.quoteCurrency))
        return false;
    }

    boolean this_present_multiplier = true;
    boolean that_present_multiplier = true;
    if (this_present_multiplier || that_present_multiplier) {
      if (!(this_present_multiplier && that_present_multiplier))
        return false;
      if (this.multiplier != that.multiplier)
        return false;
    }

    boolean this_present_rate = true;
    boolean that_present_rate = true;
    if (this_present_rate || that_present_rate) {
      if (!(this_present_rate && that_present_rate))
        return false;
      if (this.rate != that.rate)
        return false;
    }

    boolean this_present_timestamp = true;
    boolean that_present_timestamp = true;
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (this.timestamp != that.timestamp)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetBaseCurrency()) ? 131071 : 524287);
    if (isSetBaseCurrency())
      hashCode = hashCode * 8191 + baseCurrency.hashCode();

    hashCode = hashCode * 8191 + ((isSetQuoteCurrency()) ? 131071 : 524287);
    if (isSetQuoteCurrency())
      hashCode = hashCode * 8191 + quoteCurrency.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(multiplier);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(rate);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(timestamp);

    return hashCode;
  }

  @Override
  public int compareTo(ExchangeRate other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetBaseCurrency(), other.isSetBaseCurrency());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBaseCurrency()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.baseCurrency, other.baseCurrency);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetQuoteCurrency(), other.isSetQuoteCurrency());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQuoteCurrency()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.quoteCurrency, other.quoteCurrency);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMultiplier(), other.isSetMultiplier());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMultiplier()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.multiplier, other.multiplier);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetRate(), other.isSetRate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rate, other.rate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTimestamp(), other.isSetTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestamp, other.timestamp);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ExchangeRate(");
    boolean first = true;

    sb.append("baseCurrency:");
    if (this.baseCurrency == null) {
      sb.append("null");
    } else {
      sb.append(this.baseCurrency);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("quoteCurrency:");
    if (this.quoteCurrency == null) {
      sb.append("null");
    } else {
      sb.append(this.quoteCurrency);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("multiplier:");
    sb.append(this.multiplier);
    first = false;
    if (!first) sb.append(", ");
    sb.append("rate:");
    sb.append(this.rate);
    first = false;
    if (!first) sb.append(", ");
    sb.append("timestamp:");
    sb.append(this.timestamp);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (baseCurrency == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'baseCurrency' was not present! Struct: " + toString());
    }
    if (quoteCurrency == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'quoteCurrency' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'multiplier' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'rate' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'timestamp' because it's a primitive and you chose the non-beans generator.
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

  private static class ExchangeRateStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ExchangeRateStandardScheme getScheme() {
      return new ExchangeRateStandardScheme();
    }
  }

  private static class ExchangeRateStandardScheme extends org.apache.thrift.scheme.StandardScheme<ExchangeRate> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ExchangeRate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BASE_CURRENCY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.baseCurrency = iprot.readString();
              struct.setBaseCurrencyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // QUOTE_CURRENCY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.quoteCurrency = iprot.readString();
              struct.setQuoteCurrencyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MULTIPLIER
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.multiplier = iprot.readI64();
              struct.setMultiplierIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // RATE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.rate = iprot.readDouble();
              struct.setRateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timestamp = iprot.readI64();
              struct.setTimestampIsSet(true);
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
      if (!struct.isSetMultiplier()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'multiplier' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetRate()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'rate' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetTimestamp()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'timestamp' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ExchangeRate struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.baseCurrency != null) {
        oprot.writeFieldBegin(BASE_CURRENCY_FIELD_DESC);
        oprot.writeString(struct.baseCurrency);
        oprot.writeFieldEnd();
      }
      if (struct.quoteCurrency != null) {
        oprot.writeFieldBegin(QUOTE_CURRENCY_FIELD_DESC);
        oprot.writeString(struct.quoteCurrency);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MULTIPLIER_FIELD_DESC);
      oprot.writeI64(struct.multiplier);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RATE_FIELD_DESC);
      oprot.writeDouble(struct.rate);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
      oprot.writeI64(struct.timestamp);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ExchangeRateTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ExchangeRateTupleScheme getScheme() {
      return new ExchangeRateTupleScheme();
    }
  }

  private static class ExchangeRateTupleScheme extends org.apache.thrift.scheme.TupleScheme<ExchangeRate> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ExchangeRate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.baseCurrency);
      oprot.writeString(struct.quoteCurrency);
      oprot.writeI64(struct.multiplier);
      oprot.writeDouble(struct.rate);
      oprot.writeI64(struct.timestamp);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ExchangeRate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.baseCurrency = iprot.readString();
      struct.setBaseCurrencyIsSet(true);
      struct.quoteCurrency = iprot.readString();
      struct.setQuoteCurrencyIsSet(true);
      struct.multiplier = iprot.readI64();
      struct.setMultiplierIsSet(true);
      struct.rate = iprot.readDouble();
      struct.setRateIsSet(true);
      struct.timestamp = iprot.readI64();
      struct.setTimestampIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

