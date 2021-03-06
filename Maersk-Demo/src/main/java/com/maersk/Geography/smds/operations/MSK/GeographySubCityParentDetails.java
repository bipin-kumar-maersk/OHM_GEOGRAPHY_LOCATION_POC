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
/** Geography SubCityParent details */
@org.apache.avro.specific.AvroGenerated
public class GeographySubCityParentDetails extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7156966874476850602L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GeographySubCityParentDetails\",\"namespace\":\"com.maersk.Geography.smds.operations.MSK\",\"doc\":\"Geography SubCityParent details\",\"fields\":[{\"name\":\"getSubCityParentRowId\",\"type\":[\"null\",\"string\"]},{\"name\":\"Name\",\"type\":[\"null\",\"string\"]},{\"name\":\"Type\",\"type\":[\"null\",\"string\"]},{\"name\":\"GeographySubCityParentAlternateCodeDetails\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"GeographySubCityParentAlternateCode\",\"doc\":\"Geography SubCityParent AlternateCode details\",\"fields\":[{\"name\":\"CodeType\",\"type\":[\"null\",\"string\"]},{\"name\":\"Code\",\"type\":[\"null\",\"string\"]}]}}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<GeographySubCityParentDetails> ENCODER =
      new BinaryMessageEncoder<GeographySubCityParentDetails>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<GeographySubCityParentDetails> DECODER =
      new BinaryMessageDecoder<GeographySubCityParentDetails>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<GeographySubCityParentDetails> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<GeographySubCityParentDetails> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<GeographySubCityParentDetails>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this GeographySubCityParentDetails to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a GeographySubCityParentDetails from a ByteBuffer. */
  public static GeographySubCityParentDetails fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence getSubCityParentRowId;
  @Deprecated public java.lang.CharSequence Name;
  @Deprecated public java.lang.CharSequence Type;
  @Deprecated public java.util.List<com.maersk.Geography.smds.operations.MSK.GeographySubCityParentAlternateCode> GeographySubCityParentAlternateCodeDetails;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GeographySubCityParentDetails() {}

  /**
   * All-args constructor.
   * @param getSubCityParentRowId The new value for getSubCityParentRowId
   * @param Name The new value for Name
   * @param Type The new value for Type
   * @param GeographySubCityParentAlternateCodeDetails The new value for GeographySubCityParentAlternateCodeDetails
   */
  public GeographySubCityParentDetails(java.lang.CharSequence getSubCityParentRowId, java.lang.CharSequence Name, java.lang.CharSequence Type, java.util.List<com.maersk.Geography.smds.operations.MSK.GeographySubCityParentAlternateCode> GeographySubCityParentAlternateCodeDetails) {
    this.getSubCityParentRowId = getSubCityParentRowId;
    this.Name = Name;
    this.Type = Type;
    this.GeographySubCityParentAlternateCodeDetails = GeographySubCityParentAlternateCodeDetails;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return getSubCityParentRowId;
    case 1: return Name;
    case 2: return Type;
    case 3: return GeographySubCityParentAlternateCodeDetails;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: getSubCityParentRowId = (java.lang.CharSequence)value$; break;
    case 1: Name = (java.lang.CharSequence)value$; break;
    case 2: Type = (java.lang.CharSequence)value$; break;
    case 3: GeographySubCityParentAlternateCodeDetails = (java.util.List<com.maersk.Geography.smds.operations.MSK.GeographySubCityParentAlternateCode>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'getSubCityParentRowId' field.
   * @return The value of the 'getSubCityParentRowId' field.
   */
  public java.lang.CharSequence getGetSubCityParentRowId() {
    return getSubCityParentRowId;
  }

  /**
   * Sets the value of the 'getSubCityParentRowId' field.
   * @param value the value to set.
   */
  public void setGetSubCityParentRowId(java.lang.CharSequence value) {
    this.getSubCityParentRowId = value;
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
   * Gets the value of the 'GeographySubCityParentAlternateCodeDetails' field.
   * @return The value of the 'GeographySubCityParentAlternateCodeDetails' field.
   */
  public java.util.List<com.maersk.Geography.smds.operations.MSK.GeographySubCityParentAlternateCode> getGeographySubCityParentAlternateCodeDetails() {
    return GeographySubCityParentAlternateCodeDetails;
  }

  /**
   * Sets the value of the 'GeographySubCityParentAlternateCodeDetails' field.
   * @param value the value to set.
   */
  public void setGeographySubCityParentAlternateCodeDetails(java.util.List<com.maersk.Geography.smds.operations.MSK.GeographySubCityParentAlternateCode> value) {
    this.GeographySubCityParentAlternateCodeDetails = value;
  }

  /**
   * Creates a new GeographySubCityParentDetails RecordBuilder.
   * @return A new GeographySubCityParentDetails RecordBuilder
   */
  public static com.maersk.Geography.smds.operations.MSK.GeographySubCityParentDetails.Builder newBuilder() {
    return new com.maersk.Geography.smds.operations.MSK.GeographySubCityParentDetails.Builder();
  }

  /**
   * Creates a new GeographySubCityParentDetails RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GeographySubCityParentDetails RecordBuilder
   */
  public static com.maersk.Geography.smds.operations.MSK.GeographySubCityParentDetails.Builder newBuilder(com.maersk.Geography.smds.operations.MSK.GeographySubCityParentDetails.Builder other) {
    return new com.maersk.Geography.smds.operations.MSK.GeographySubCityParentDetails.Builder(other);
  }

  /**
   * Creates a new GeographySubCityParentDetails RecordBuilder by copying an existing GeographySubCityParentDetails instance.
   * @param other The existing instance to copy.
   * @return A new GeographySubCityParentDetails RecordBuilder
   */
  public static com.maersk.Geography.smds.operations.MSK.GeographySubCityParentDetails.Builder newBuilder(com.maersk.Geography.smds.operations.MSK.GeographySubCityParentDetails other) {
    return new com.maersk.Geography.smds.operations.MSK.GeographySubCityParentDetails.Builder(other);
  }

  /**
   * RecordBuilder for GeographySubCityParentDetails instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GeographySubCityParentDetails>
    implements org.apache.avro.data.RecordBuilder<GeographySubCityParentDetails> {

    private java.lang.CharSequence getSubCityParentRowId;
    private java.lang.CharSequence Name;
    private java.lang.CharSequence Type;
    private java.util.List<com.maersk.Geography.smds.operations.MSK.GeographySubCityParentAlternateCode> GeographySubCityParentAlternateCodeDetails;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.maersk.Geography.smds.operations.MSK.GeographySubCityParentDetails.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.getSubCityParentRowId)) {
        this.getSubCityParentRowId = data().deepCopy(fields()[0].schema(), other.getSubCityParentRowId);
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
      if (isValidValue(fields()[3], other.GeographySubCityParentAlternateCodeDetails)) {
        this.GeographySubCityParentAlternateCodeDetails = data().deepCopy(fields()[3].schema(), other.GeographySubCityParentAlternateCodeDetails);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing GeographySubCityParentDetails instance
     * @param other The existing instance to copy.
     */
    private Builder(com.maersk.Geography.smds.operations.MSK.GeographySubCityParentDetails other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.getSubCityParentRowId)) {
        this.getSubCityParentRowId = data().deepCopy(fields()[0].schema(), other.getSubCityParentRowId);
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
      if (isValidValue(fields()[3], other.GeographySubCityParentAlternateCodeDetails)) {
        this.GeographySubCityParentAlternateCodeDetails = data().deepCopy(fields()[3].schema(), other.GeographySubCityParentAlternateCodeDetails);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'getSubCityParentRowId' field.
      * @return The value.
      */
    public java.lang.CharSequence getGetSubCityParentRowId() {
      return getSubCityParentRowId;
    }

    /**
      * Sets the value of the 'getSubCityParentRowId' field.
      * @param value The value of 'getSubCityParentRowId'.
      * @return This builder.
      */
    public com.maersk.Geography.smds.operations.MSK.GeographySubCityParentDetails.Builder setGetSubCityParentRowId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.getSubCityParentRowId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'getSubCityParentRowId' field has been set.
      * @return True if the 'getSubCityParentRowId' field has been set, false otherwise.
      */
    public boolean hasGetSubCityParentRowId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'getSubCityParentRowId' field.
      * @return This builder.
      */
    public com.maersk.Geography.smds.operations.MSK.GeographySubCityParentDetails.Builder clearGetSubCityParentRowId() {
      getSubCityParentRowId = null;
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
    public com.maersk.Geography.smds.operations.MSK.GeographySubCityParentDetails.Builder setName(java.lang.CharSequence value) {
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
    public com.maersk.Geography.smds.operations.MSK.GeographySubCityParentDetails.Builder clearName() {
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
    public com.maersk.Geography.smds.operations.MSK.GeographySubCityParentDetails.Builder setType(java.lang.CharSequence value) {
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
    public com.maersk.Geography.smds.operations.MSK.GeographySubCityParentDetails.Builder clearType() {
      Type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'GeographySubCityParentAlternateCodeDetails' field.
      * @return The value.
      */
    public java.util.List<com.maersk.Geography.smds.operations.MSK.GeographySubCityParentAlternateCode> getGeographySubCityParentAlternateCodeDetails() {
      return GeographySubCityParentAlternateCodeDetails;
    }

    /**
      * Sets the value of the 'GeographySubCityParentAlternateCodeDetails' field.
      * @param value The value of 'GeographySubCityParentAlternateCodeDetails'.
      * @return This builder.
      */
    public com.maersk.Geography.smds.operations.MSK.GeographySubCityParentDetails.Builder setGeographySubCityParentAlternateCodeDetails(java.util.List<com.maersk.Geography.smds.operations.MSK.GeographySubCityParentAlternateCode> value) {
      validate(fields()[3], value);
      this.GeographySubCityParentAlternateCodeDetails = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'GeographySubCityParentAlternateCodeDetails' field has been set.
      * @return True if the 'GeographySubCityParentAlternateCodeDetails' field has been set, false otherwise.
      */
    public boolean hasGeographySubCityParentAlternateCodeDetails() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'GeographySubCityParentAlternateCodeDetails' field.
      * @return This builder.
      */
    public com.maersk.Geography.smds.operations.MSK.GeographySubCityParentDetails.Builder clearGeographySubCityParentAlternateCodeDetails() {
      GeographySubCityParentAlternateCodeDetails = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public GeographySubCityParentDetails build() {
      try {
        GeographySubCityParentDetails record = new GeographySubCityParentDetails();
        record.getSubCityParentRowId = fieldSetFlags()[0] ? this.getSubCityParentRowId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.Name = fieldSetFlags()[1] ? this.Name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.Type = fieldSetFlags()[2] ? this.Type : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.GeographySubCityParentAlternateCodeDetails = fieldSetFlags()[3] ? this.GeographySubCityParentAlternateCodeDetails : (java.util.List<com.maersk.Geography.smds.operations.MSK.GeographySubCityParentAlternateCode>) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<GeographySubCityParentDetails>
    WRITER$ = (org.apache.avro.io.DatumWriter<GeographySubCityParentDetails>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<GeographySubCityParentDetails>
    READER$ = (org.apache.avro.io.DatumReader<GeographySubCityParentDetails>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
