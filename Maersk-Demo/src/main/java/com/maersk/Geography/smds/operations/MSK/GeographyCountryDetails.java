/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.maersk.Geography.smds.operations.MSK;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** Geography Country details */
@org.apache.avro.specific.AvroGenerated
public class GeographyCountryDetails extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8327334392005670111L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GeographyCountryDetails\",\"namespace\":\"com.maersk.Geography.smds.operations.MSK\",\"doc\":\"Geography Country details\",\"fields\":[{\"name\":\"countryRowid\",\"type\":[\"null\",\"string\"]},{\"name\":\"Name\",\"type\":[\"null\",\"string\"]},{\"name\":\"Type\",\"type\":[\"null\",\"string\"]},{\"name\":\"GeographyCountryAlternateCodeDetails\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"GeographyCountryAlternateCode\",\"doc\":\"Geography Country AlternateCode details\",\"fields\":[{\"name\":\"CodeType\",\"type\":[\"null\",\"string\"]},{\"name\":\"Code\",\"type\":[\"null\",\"string\"]}]}}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<GeographyCountryDetails> ENCODER =
      new BinaryMessageEncoder<GeographyCountryDetails>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<GeographyCountryDetails> DECODER =
      new BinaryMessageDecoder<GeographyCountryDetails>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<GeographyCountryDetails> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<GeographyCountryDetails> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<GeographyCountryDetails>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this GeographyCountryDetails to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a GeographyCountryDetails from a ByteBuffer. */
  public static GeographyCountryDetails fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence countryRowid;
  @Deprecated public java.lang.CharSequence Name;
  @Deprecated public java.lang.CharSequence Type;
  @Deprecated public java.util.List<com.maersk.Geography.smds.operations.MSK.GeographyCountryAlternateCode> GeographyCountryAlternateCodeDetails;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GeographyCountryDetails() {}

  /**
   * All-args constructor.
   * @param countryRowid The new value for countryRowid
   * @param Name The new value for Name
   * @param Type The new value for Type
   * @param GeographyCountryAlternateCodeDetails The new value for GeographyCountryAlternateCodeDetails
   */
  public GeographyCountryDetails(java.lang.CharSequence countryRowid, java.lang.CharSequence Name, java.lang.CharSequence Type, java.util.List<com.maersk.Geography.smds.operations.MSK.GeographyCountryAlternateCode> GeographyCountryAlternateCodeDetails) {
    this.countryRowid = countryRowid;
    this.Name = Name;
    this.Type = Type;
    this.GeographyCountryAlternateCodeDetails = GeographyCountryAlternateCodeDetails;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return countryRowid;
    case 1: return Name;
    case 2: return Type;
    case 3: return GeographyCountryAlternateCodeDetails;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: countryRowid = (java.lang.CharSequence)value$; break;
    case 1: Name = (java.lang.CharSequence)value$; break;
    case 2: Type = (java.lang.CharSequence)value$; break;
    case 3: GeographyCountryAlternateCodeDetails = (java.util.List<com.maersk.Geography.smds.operations.MSK.GeographyCountryAlternateCode>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'countryRowid' field.
   * @return The value of the 'countryRowid' field.
   */
  public java.lang.CharSequence getCountryRowid() {
    return countryRowid;
  }

  /**
   * Sets the value of the 'countryRowid' field.
   * @param value the value to set.
   */
  public void setCountryRowid(java.lang.CharSequence value) {
    this.countryRowid = value;
  }

  /**
   * Gets the value of the 'Name' field.
   * @return The value of the 'Name' field.
   */
  public java.lang.CharSequence getName() {
    return Name;
  }

  /**
   * Sets the value of the 'Name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.Name = value;
  }

  /**
   * Gets the value of the 'Type' field.
   * @return The value of the 'Type' field.
   */
  public java.lang.CharSequence getType() {
    return Type;
  }

  /**
   * Sets the value of the 'Type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.CharSequence value) {
    this.Type = value;
  }

  /**
   * Gets the value of the 'GeographyCountryAlternateCodeDetails' field.
   * @return The value of the 'GeographyCountryAlternateCodeDetails' field.
   */
  public java.util.List<com.maersk.Geography.smds.operations.MSK.GeographyCountryAlternateCode> getGeographyCountryAlternateCodeDetails() {
    return GeographyCountryAlternateCodeDetails;
  }

  /**
   * Sets the value of the 'GeographyCountryAlternateCodeDetails' field.
   * @param value the value to set.
   */
  public void setGeographyCountryAlternateCodeDetails(java.util.List<com.maersk.Geography.smds.operations.MSK.GeographyCountryAlternateCode> value) {
    this.GeographyCountryAlternateCodeDetails = value;
  }

  /**
   * Creates a new GeographyCountryDetails RecordBuilder.
   * @return A new GeographyCountryDetails RecordBuilder
   */
  public static com.maersk.Geography.smds.operations.MSK.GeographyCountryDetails.Builder newBuilder() {
    return new com.maersk.Geography.smds.operations.MSK.GeographyCountryDetails.Builder();
  }

  /**
   * Creates a new GeographyCountryDetails RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GeographyCountryDetails RecordBuilder
   */
  public static com.maersk.Geography.smds.operations.MSK.GeographyCountryDetails.Builder newBuilder(com.maersk.Geography.smds.operations.MSK.GeographyCountryDetails.Builder other) {
    return new com.maersk.Geography.smds.operations.MSK.GeographyCountryDetails.Builder(other);
  }

  /**
   * Creates a new GeographyCountryDetails RecordBuilder by copying an existing GeographyCountryDetails instance.
   * @param other The existing instance to copy.
   * @return A new GeographyCountryDetails RecordBuilder
   */
  public static com.maersk.Geography.smds.operations.MSK.GeographyCountryDetails.Builder newBuilder(com.maersk.Geography.smds.operations.MSK.GeographyCountryDetails other) {
    return new com.maersk.Geography.smds.operations.MSK.GeographyCountryDetails.Builder(other);
  }

  /**
   * RecordBuilder for GeographyCountryDetails instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GeographyCountryDetails>
    implements org.apache.avro.data.RecordBuilder<GeographyCountryDetails> {

    private java.lang.CharSequence countryRowid;
    private java.lang.CharSequence Name;
    private java.lang.CharSequence Type;
    private java.util.List<com.maersk.Geography.smds.operations.MSK.GeographyCountryAlternateCode> GeographyCountryAlternateCodeDetails;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.maersk.Geography.smds.operations.MSK.GeographyCountryDetails.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.countryRowid)) {
        this.countryRowid = data().deepCopy(fields()[0].schema(), other.countryRowid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Name)) {
        this.Name = data().deepCopy(fields()[1].schema(), other.Name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.Type)) {
        this.Type = data().deepCopy(fields()[2].schema(), other.Type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.GeographyCountryAlternateCodeDetails)) {
        this.GeographyCountryAlternateCodeDetails = data().deepCopy(fields()[3].schema(), other.GeographyCountryAlternateCodeDetails);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing GeographyCountryDetails instance
     * @param other The existing instance to copy.
     */
    private Builder(com.maersk.Geography.smds.operations.MSK.GeographyCountryDetails other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.countryRowid)) {
        this.countryRowid = data().deepCopy(fields()[0].schema(), other.countryRowid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Name)) {
        this.Name = data().deepCopy(fields()[1].schema(), other.Name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.Type)) {
        this.Type = data().deepCopy(fields()[2].schema(), other.Type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.GeographyCountryAlternateCodeDetails)) {
        this.GeographyCountryAlternateCodeDetails = data().deepCopy(fields()[3].schema(), other.GeographyCountryAlternateCodeDetails);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'countryRowid' field.
      * @return The value.
      */
    public java.lang.CharSequence getCountryRowid() {
      return countryRowid;
    }

    /**
      * Sets the value of the 'countryRowid' field.
      * @param value The value of 'countryRowid'.
      * @return This builder.
      */
    public com.maersk.Geography.smds.operations.MSK.GeographyCountryDetails.Builder setCountryRowid(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.countryRowid = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'countryRowid' field has been set.
      * @return True if the 'countryRowid' field has been set, false otherwise.
      */
    public boolean hasCountryRowid() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'countryRowid' field.
      * @return This builder.
      */
    public com.maersk.Geography.smds.operations.MSK.GeographyCountryDetails.Builder clearCountryRowid() {
      countryRowid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'Name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return Name;
    }

    /**
      * Sets the value of the 'Name' field.
      * @param value The value of 'Name'.
      * @return This builder.
      */
    public com.maersk.Geography.smds.operations.MSK.GeographyCountryDetails.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.Name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'Name' field has been set.
      * @return True if the 'Name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'Name' field.
      * @return This builder.
      */
    public com.maersk.Geography.smds.operations.MSK.GeographyCountryDetails.Builder clearName() {
      Name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'Type' field.
      * @return The value.
      */
    public java.lang.CharSequence getType() {
      return Type;
    }

    /**
      * Sets the value of the 'Type' field.
      * @param value The value of 'Type'.
      * @return This builder.
      */
    public com.maersk.Geography.smds.operations.MSK.GeographyCountryDetails.Builder setType(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.Type = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'Type' field has been set.
      * @return True if the 'Type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'Type' field.
      * @return This builder.
      */
    public com.maersk.Geography.smds.operations.MSK.GeographyCountryDetails.Builder clearType() {
      Type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'GeographyCountryAlternateCodeDetails' field.
      * @return The value.
      */
    public java.util.List<com.maersk.Geography.smds.operations.MSK.GeographyCountryAlternateCode> getGeographyCountryAlternateCodeDetails() {
      return GeographyCountryAlternateCodeDetails;
    }

    /**
      * Sets the value of the 'GeographyCountryAlternateCodeDetails' field.
      * @param value The value of 'GeographyCountryAlternateCodeDetails'.
      * @return This builder.
      */
    public com.maersk.Geography.smds.operations.MSK.GeographyCountryDetails.Builder setGeographyCountryAlternateCodeDetails(java.util.List<com.maersk.Geography.smds.operations.MSK.GeographyCountryAlternateCode> value) {
      validate(fields()[3], value);
      this.GeographyCountryAlternateCodeDetails = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'GeographyCountryAlternateCodeDetails' field has been set.
      * @return True if the 'GeographyCountryAlternateCodeDetails' field has been set, false otherwise.
      */
    public boolean hasGeographyCountryAlternateCodeDetails() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'GeographyCountryAlternateCodeDetails' field.
      * @return This builder.
      */
    public com.maersk.Geography.smds.operations.MSK.GeographyCountryDetails.Builder clearGeographyCountryAlternateCodeDetails() {
      GeographyCountryAlternateCodeDetails = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public GeographyCountryDetails build() {
      try {
        GeographyCountryDetails record = new GeographyCountryDetails();
        record.countryRowid = fieldSetFlags()[0] ? this.countryRowid : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.Name = fieldSetFlags()[1] ? this.Name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.Type = fieldSetFlags()[2] ? this.Type : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.GeographyCountryAlternateCodeDetails = fieldSetFlags()[3] ? this.GeographyCountryAlternateCodeDetails : (java.util.List<com.maersk.Geography.smds.operations.MSK.GeographyCountryAlternateCode>) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<GeographyCountryDetails>
    WRITER$ = (org.apache.avro.io.DatumWriter<GeographyCountryDetails>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<GeographyCountryDetails>
    READER$ = (org.apache.avro.io.DatumReader<GeographyCountryDetails>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}