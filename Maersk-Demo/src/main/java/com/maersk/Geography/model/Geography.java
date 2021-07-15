package com.maersk.Geography.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

import java.util.List;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Geography {
    @Id
    private String _id;
    private String GeoRowID;
    private String GeoType;
    private String Name;
    private String Status;
    private String ValidFrom;
    private String ValidTo;
    private String Description;
    private String BDAType;
    private String Latitude;
    private String Longitude;
    private GeoJsonPoint Location;
    private String Timezone;
    private String DaylightSavingTime;
    private String DaylightSavingStart;
    private String DaylightSavingEnd;
    private String DaylightSavingShiftMinutes;
    private String PortFlag;
    private String OlsonTimezone;
    private String UTCOffsetMinutes;
    private String Restricted;
    private String postalCodeMandatoryFlag;
    private String DialingCode;
    private String DialingCodedescription;
    private List<GeographyAlternateNames> GeographyAlternateNames;
    private List<GeographyAlternateCodes> GeographyAlternateCodes;
    private List<GeographyBDALocationsDetails> GeographyBDALocationsDetails;
    private List<GeographyCountryDetails> GeographyCountryDetails;
    private List<GeographyParentDetails> GeographyParentDetails;
    private List<GeographySubCityParentDetails> GeographySubCityParentDetails;
    private List<GeographyBDADetails> GeographyBDADetails;


}
