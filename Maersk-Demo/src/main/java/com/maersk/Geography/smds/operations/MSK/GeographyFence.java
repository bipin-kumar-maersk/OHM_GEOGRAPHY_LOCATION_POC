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
/** Geography Fence details */
@org.apache.avro.specific.AvroGenerated
public class GeographyFence extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7288177691353374032L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GeographyFence\",\"namespace\":\"com.maersk.Geography.smds.operations.MSK\",\"doc\":\"Geography Fence details\",\"fields\":[{\"name\":\"Name\",\"type\":[\"null\",\"string\"]},{\"name\":\"GeoFenceType\",\"type\":[\"null\",\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<GeographyFence> ENCODER =
      new BinaryMessageEncoder<GeographyFence>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<GeographyFence> DECODER =
      new BinaryMessageDecoder<GeographyFence>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<GeographyFence> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<GeographyFence> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<GeographyFence>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this GeographyFence to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a GeographyFence from a ByteBuffer. */
  public static GeographyFence fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence Name;
  @Deprecated public java.lang.CharSequence GeoFenceType;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GeographyFence() {}

  /**
   * All-args constructor.
   * @param Name The new value for Name
   * @param GeoFenceType The new value for GeoFenceType
   */
  public GeographyFence(java.lang.CharSequence Name, java.lang.CharSequence GeoFenceType) {
    this.Name = Name;
    this.GeoFenceType = GeoFenceType;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Name;
    case 1: return GeoFenceType;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Name = (java.lang.CharSequence)value$; break;
    case 1: GeoFenceType = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
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
   * Gets the value of the 'GeoFenceType' field.
   * @return The value of the 'GeoFenceType' field.
   */
  public java.lang.CharSequence getGeoFenceType() {
    return GeoFenceType;
  }

  /**
   * Sets the value of the 'GeoFenceType' field.
   * @param value the value to set.
   */
  public void setGeoFenceType(java.lang.CharSequence value) {
    this.GeoFenceType = value;
  }

  /**
   * Creates a new GeographyFence RecordBuilder.
   * @return A new GeographyFence RecordBuilder
   */
  public static com.maersk.Geography.smds.operations.MSK.GeographyFence.Builder newBuilder() {
    return new com.maersk.Geography.smds.operations.MSK.GeographyFence.Builder();
  }

  /**
   * Creates a new GeographyFence RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GeographyFence RecordBuilder
   */
  public static com.maersk.Geography.smds.operations.MSK.GeographyFence.Builder newBuilder(com.maersk.Geography.smds.operations.MSK.GeographyFence.Builder other) {
    return new com.maersk.Geography.smds.operations.MSK.GeographyFence.Builder(other);
  }

  /**
   * Creates a new GeographyFence RecordBuilder by copying an existing GeographyFence instance.
   * @param other The existing instance to copy.
   * @return A new GeographyFence RecordBuilder
   */
  public static com.maersk.Geography.smds.operations.MSK.GeographyFence.Builder newBuilder(com.maersk.Geography.smds.operations.MSK.GeographyFence other) {
    return new com.maersk.Geography.smds.operations.MSK.GeographyFence.Builder(other);
  }

  /**
   * RecordBuilder for GeographyFence instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GeographyFence>
    implements org.apache.avro.data.RecordBuilder<GeographyFence> {

    private java.lang.CharSequence Name;
    private java.lang.CharSequence GeoFenceType;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.maersk.Geography.smds.operations.MSK.GeographyFence.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Name)) {
        this.Name = data().deepCopy(fields()[0].schema(), other.Name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.GeoFenceType)) {
        this.GeoFenceType = data().deepCopy(fields()[1].schema(), other.GeoFenceType);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing GeographyFence instance
     * @param other The existing instance to copy.
     */
    private Builder(com.maersk.Geography.smds.operations.MSK.GeographyFence other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.Name)) {
        this.Name = data().deepCopy(fields()[0].schema(), other.Name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.GeoFenceType)) {
        this.GeoFenceType = data().deepCopy(fields()[1].schema(), other.GeoFenceType);
        fieldSetFlags()[1] = true;
      }
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
    public com.maersk.Geography.smds.operations.MSK.GeographyFence.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.Name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'Name' field has been set.
      * @return True if the 'Name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'Name' field.
      * @return This builder.
      */
    public com.maersk.Geography.smds.operations.MSK.GeographyFence.Builder clearName() {
      Name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'GeoFenceType' field.
      * @return The value.
      */
    public java.lang.CharSequence getGeoFenceType() {
      return GeoFenceType;
    }

    /**
      * Sets the value of the 'GeoFenceType' field.
      * @param value The value of 'GeoFenceType'.
      * @return This builder.
      */
    public com.maersk.Geography.smds.operations.MSK.GeographyFence.Builder setGeoFenceType(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.GeoFenceType = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'GeoFenceType' field has been set.
      * @return True if the 'GeoFenceType' field has been set, false otherwise.
      */
    public boolean hasGeoFenceType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'GeoFenceType' field.
      * @return This builder.
      */
    public com.maersk.Geography.smds.operations.MSK.GeographyFence.Builder clearGeoFenceType() {
      GeoFenceType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public GeographyFence build() {
      try {
        GeographyFence record = new GeographyFence();
        record.Name = fieldSetFlags()[0] ? this.Name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.GeoFenceType = fieldSetFlags()[1] ? this.GeoFenceType : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<GeographyFence>
    WRITER$ = (org.apache.avro.io.DatumWriter<GeographyFence>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<GeographyFence>
    READER$ = (org.apache.avro.io.DatumReader<GeographyFence>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
