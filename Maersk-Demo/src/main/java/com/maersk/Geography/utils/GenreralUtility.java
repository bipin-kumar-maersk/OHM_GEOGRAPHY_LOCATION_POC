package com.maersk.Geography.utils;

import com.maersk.Geography.model.*;
import com.maersk.Geography.smds.operations.MSK.GeographyBDAAlternateCode;
import com.maersk.Geography.smds.operations.MSK.GeographyCountryAlternateCode;
import com.maersk.Geography.smds.operations.MSK.GeographyEntity;
import com.maersk.Geography.smds.operations.MSK.GeographySubCityParentAlternateCode;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class GenreralUtility {

    protected static final Map<String, String> GeoTypeMap=new HashMap<>();
    static{
        GeoTypeMap.put("Business Defined Area","GEO_BUSINESS_DEFINED_AREA");
        GeoTypeMap.put("City","GEO_CITY");
        GeoTypeMap.put("CitySubArea","GEO_CITY_SUB_AREA");
        GeoTypeMap.put("Continent","GEO_CONTINENT");
        GeoTypeMap.put("Country","GEO_COUNTRY");
        GeoTypeMap.put("Postal Code","GEO_POSTAL_CODE");
        GeoTypeMap.put("State/Prov","GEO_STATE_PROV");
    }

    public static Map<String, String> getGeoTypeMap(){
        return GeoTypeMap;
    }




    public static Geography buildFinalMongoObject(GeographyEntity message) {
        Geography geo=new Geography();
        String idValue=message.getGeography().getGeographyAlternateCodes().stream().filter(x->x.getCodeType().toString().equals("GEOID"))
                .collect(Collectors.toList()).get(0).getCode().toString();
        geo.set_id(idValue);
        geo.setDescription(message.getGeography().getGeoRowID().toString());
        geo.setGeoRowID(message.getGeography().getGeoRowID().toString());
        geo.setGeoType(message.getGeography().getGeoType().toString());
        geo.setName(message.getGeography().getName().toString());
        geo.setStatus(message.getGeography().getStatus().toString());
        geo.setValidFrom(message.getGeography().getValidFrom().toString());
        geo.setValidTo(message.getGeography().getValidTo().toString());
        if(Objects.nonNull(message.getGeography().getLatitude()))
            geo.setLatitude(message.getGeography().getLatitude().toString());
        if(Objects.nonNull(message.getGeography().getLongitude()))
            geo.setLongitude(message.getGeography().getLongitude().toString());
        if(Objects.nonNull(message.getGeography().getDescription()))
            geo.setDescription(message.getGeography().getDescription().toString());
        if(Objects.nonNull(message.getGeography().getDaylightSavingEnd()))
            geo.setDaylightSavingEnd(message.getGeography().getDaylightSavingEnd().toString());
        if(Objects.nonNull(message.getGeography().getDaylightSavingStart()))
            geo.setDaylightSavingStart(message.getGeography().getDaylightSavingStart().toString());
        if(Objects.nonNull(message.getGeography().getDaylightSavingShiftMinutes()))
            geo.setDaylightSavingShiftMinutes(message.getGeography().getDaylightSavingShiftMinutes().toString());
        if(Objects.nonNull(message.getGeography().getDaylightSavingTime()))
            geo.setDaylightSavingTime(message.getGeography().getDaylightSavingTime().toString());
        if(Objects.nonNull(message.getGeography().getDialingCodedescription()))
            geo.setDialingCodedescription(message.getGeography().getDialingCodedescription().toString());
        if(Objects.nonNull(message.getGeography().getDialingCode()))
            geo.setDialingCode(message.getGeography().getDialingCode().toString());
        if(Objects.nonNull(message.getGeography().getOlsonTimezone()))
            geo.setOlsonTimezone(message.getGeography().getOlsonTimezone().toString());
        if(Objects.nonNull(message.getGeography().getPortFlag()))
            geo.setPortFlag(message.getGeography().getPortFlag().toString());
        if(Objects.nonNull(message.getGeography().getPostalCodeMandatoryFlag()))
            geo.setPostalCodeMandatoryFlag(message.getGeography().getPostalCodeMandatoryFlag().toString());
        if(Objects.nonNull(message.getGeography().getUTCOffsetMinutes()))
            geo.setUTCOffsetMinutes(message.getGeography().getUTCOffsetMinutes().toString());
        if(Objects.nonNull(message.getGeography().getRestricted()))
            geo.setRestricted(message.getGeography().getRestricted().toString());
        if(Objects.nonNull(message.getGeography().getLongitude()))
            geo.setLocation(new GeoJsonPoint(Double.parseDouble(message.getGeography().getLongitude().toString()),Double.parseDouble(message.getGeography().getLatitude().toString())));
        if(Objects.nonNull(message.getGeography().getTimeZone()))
            geo.setTimezone(message.getGeography().getTimeZone().toString());
        if(Objects.nonNull(message.getGeography().getBDAType())) {
            geo.setBDAType(message.getGeography().getBDAType().toString());
        }
        setGeographyAlternateCodes(message, geo);
        setGeographyAlternateNames(message, geo);
        setGeographyBDALocationDetails(message, geo);
        setGeographyParentDetails(message, geo);
        setGeographyCountryDetails(message, geo);
        setGeographySubCityParentDetails(message, geo);
        setGeographyBDADetails(message, geo);
        return geo;
    }

    private static void setGeographyBDALocationDetails(GeographyEntity message, Geography g) {
        List<GeographyBDALocationsDetails> l1= new ArrayList<>();
        if(Objects.nonNull(message.getGeography().getGeographyBDALocationsDetails())){
            message.getGeography().getGeographyBDALocationsDetails().forEach(x->
                    {
                        GeographyBDALocationsDetails bdaLocation=new GeographyBDALocationsDetails();
                        bdaLocation.setName(x.getName().toString());
                        bdaLocation.setType(x.getType().toString());
                        bdaLocation.setBdaLocRowid(x.getBdaLocRowid().toString());
                        List<GeographyBDALocationAlternateCodeDetails> geographyBDALocationAlternateCodeDetailsList= new ArrayList<>();
                        x.getGeographyBDALocationAlternateCodeDetails().forEach(y-> {
                            GeographyBDALocationAlternateCodeDetails geographyBDALocationAlternateCodeDetails=new GeographyBDALocationAlternateCodeDetails();
                            geographyBDALocationAlternateCodeDetails.setCode(y.getCode().toString());
                            geographyBDALocationAlternateCodeDetails.setCodeType(y.getCodeType().toString());
                            geographyBDALocationAlternateCodeDetailsList.add(geographyBDALocationAlternateCodeDetails);
                        });
                        bdaLocation.setGeographyBDALocationAlternateCodeDetails(geographyBDALocationAlternateCodeDetailsList);
                        l1.add(bdaLocation);
                    }
            );
        }
        g.setGeographyBDALocationsDetails(l1);
    }

    private static void setGeographyAlternateCodes(GeographyEntity message, Geography g) {
        List<GeographyAlternateCodes> geographyAlternateCodesList= new ArrayList<>();
        if(Objects.nonNull(message.getGeography().getGeographyAlternateCodes())) {
            for (com.maersk.Geography.smds.operations.MSK.GeographyAlternateCodes x : message.getGeography().getGeographyAlternateCodes()) {
                GeographyAlternateCodes geoAlternateCode = new GeographyAlternateCodes();
                geoAlternateCode.setCode(x.getCode().toString());
                geoAlternateCode.setCodeType(x.getCodeType().toString());
                geographyAlternateCodesList.add(geoAlternateCode);
            }
        }
        g.setGeographyAlternateCodes(geographyAlternateCodesList);
    }
    private static void setGeographyAlternateNames(GeographyEntity message, Geography g) {
        List<GeographyAlternateNames> l= new ArrayList<>();
        if(Objects.nonNull(message.getGeography().getGeographyAlternateNames())) {
            for (com.maersk.Geography.smds.operations.MSK.GeographyAlternateNames alternativeNames : message.getGeography().getGeographyAlternateNames()) {
                GeographyAlternateNames geoAlternativeNamesVar = new GeographyAlternateNames();
                geoAlternativeNamesVar.setName(alternativeNames.getName().toString());
                if (Objects.nonNull(alternativeNames.getDescription())) {
                    geoAlternativeNamesVar.setDescription(alternativeNames.getDescription().toString());
                }
                geoAlternativeNamesVar.setStatus(alternativeNames.getStatus().toString());
                l.add(geoAlternativeNamesVar);
            }
        }
        g.setGeographyAlternateNames(l);
    }

    private static void setGeographyParentDetails(GeographyEntity message, Geography g) {
        List<GeographyParentDetails> l1= new ArrayList<>();
        if(Objects.nonNull(message.getGeography().getGeographyParentDetails())){
            for (com.maersk.Geography.smds.operations.MSK.GeographyParentDetails x : message.getGeography().getGeographyParentDetails()) {
                GeographyParentDetails parentDetails = new GeographyParentDetails();
                parentDetails.setName(x.getName().toString());
                parentDetails.setType(x.getType().toString());
                List<GeographyParentAlternateCodeDetails> m = new ArrayList<>();
                x.getGeographyParentAlternateCodeDetails().parallelStream().forEach(y -> {
                    GeographyParentAlternateCodeDetails parentAlternateCode = new GeographyParentAlternateCodeDetails();
                    parentAlternateCode.setCode(y.getCode().toString());
                    parentAlternateCode.setCodeType(y.getCodeType().toString());
                    m.add(parentAlternateCode);
                });
                parentDetails.setGeographyParentAlternateCodeDetails(m);
                l1.add(parentDetails);
            }
        }
        g.setGeographyParentDetails(l1);
    }

    private static void setGeographyCountryDetails(GeographyEntity message, Geography g) {
        List<GeographyCountryDetails> l1= new ArrayList<>();
        if(Objects.nonNull(message.getGeography().getGeographyCountryDetails())){
            message.getGeography().getGeographyCountryDetails().forEach(x->
                    {
                        GeographyCountryDetails geoCountryDetails=new GeographyCountryDetails();
                        geoCountryDetails.setName(x.getName().toString());
                        geoCountryDetails.setType(x.getType().toString());
                        List<GeographyCountryAlternateCodeDetails> m= new ArrayList<>();
                        for (GeographyCountryAlternateCode y : x.getGeographyCountryAlternateCodeDetails()) {
                            GeographyCountryAlternateCodeDetails countryAlternateCode = new GeographyCountryAlternateCodeDetails();
                            countryAlternateCode.setCode(y.getCode().toString());
                            countryAlternateCode.setCodeType(y.getCodeType().toString());
                            m.add(countryAlternateCode);
                        }
                        geoCountryDetails.setGeographyCountryAlternateCodeDetails(m);
                        l1.add(geoCountryDetails);
                    }
            );
        }
        g.setGeographyCountryDetails(l1);
    }


    private static void setGeographySubCityParentDetails(GeographyEntity message, Geography g) {
        List<GeographySubCityParentDetails> geographySubCityParentDetailsList= new ArrayList<>();
        if(Objects.nonNull(message.getGeography().getGeographySubCityParentDetails())){
            for (com.maersk.Geography.smds.operations.MSK.GeographySubCityParentDetails x : message.getGeography().getGeographySubCityParentDetails()) {
                GeographySubCityParentDetails subCityParentList = new GeographySubCityParentDetails();
                subCityParentList.setName(x.getName().toString());
                subCityParentList.setType(x.getType().toString());
                subCityParentList.setGetSubCityParentRowId(x.getGetSubCityParentRowId().toString());
                List<GeographySubCityParentAlternateCodeDetails> geographySubCityParentAlternateCodeDetailsList = new ArrayList<>();
                for (GeographySubCityParentAlternateCode y : x.getGeographySubCityParentAlternateCodeDetails()) {
                    GeographySubCityParentAlternateCodeDetails subCityParentAlterCode = new GeographySubCityParentAlternateCodeDetails();
                    subCityParentAlterCode.setCode(y.getCode().toString());
                    subCityParentAlterCode.setCodeType(y.getCodeType().toString());
                    geographySubCityParentAlternateCodeDetailsList.add(subCityParentAlterCode);
                }
                subCityParentList.setGeographySubCityParentAlternateCodeDetails(geographySubCityParentAlternateCodeDetailsList);
                geographySubCityParentDetailsList.add(subCityParentList);
            }
        }
        g.setGeographySubCityParentDetails(geographySubCityParentDetailsList);
    }

    private static void setGeographyBDADetails(GeographyEntity message, Geography g) {
        List<GeographyBDADetails> l1= new ArrayList<>();
        if(Objects.nonNull(message.getGeography().getGeographyBDADetails())){
            for (com.maersk.Geography.smds.operations.MSK.GeographyBDADetails x : message.getGeography().getGeographyBDADetails()) {
                GeographyBDADetails bdaVar;
                bdaVar = new GeographyBDADetails();
                bdaVar.setName(x.getName().toString());
                bdaVar.setType(x.getType().toString());
                bdaVar.setBdaRowid(x.getBdaRowid().toString());
                bdaVar.setBDAType(x.getType().toString());
                List<GeographyBDAAlternateCodeDetails> m = new ArrayList<>();
                for (GeographyBDAAlternateCode y : x.getGeographyBDAAlternateCodeDetails()) {
                    GeographyBDAAlternateCodeDetails bdaAlterNateCode;
                    bdaAlterNateCode = new GeographyBDAAlternateCodeDetails();
                    bdaAlterNateCode.setCode(y.getCode().toString());
                    bdaAlterNateCode.setCodeType(y.getCodeType().toString());
                    m.add(bdaAlterNateCode);
                }
                bdaVar.setGeographyBDAAlternateCodeDetails(m);
                l1.add(bdaVar);
            }
        }
        g.setGeographyBDADetails(l1);
    }

    private GenreralUtility() {
        //not called
    }
}
