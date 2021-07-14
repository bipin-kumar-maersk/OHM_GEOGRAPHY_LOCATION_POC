package com.maersk.Geography.utils;

import com.maersk.Geography.model.Geography;
import com.maersk.Geography.model.GeographyAlternateCodes;
import com.maersk.Geography.model.GeographyBDALocationAlternateCodeDetails;
import com.maersk.Geography.model.GeographyBDALocationsDetails;
import com.maersk.Geography.smds.operations.MSK.GeographyEntity;

import java.util.*;

public class GenreralUtility {

    public static Map<String, String> GeoTypeMap=new HashMap<String ,String>();
    static{
        GeoTypeMap.put("Business Defined Area","GEO_BUSINESS_DEFINED_AREA");
        GeoTypeMap.put("City","GEO_CITY");
        GeoTypeMap.put("CitySubArea","GEO_CITY_SUB_AREA");
        GeoTypeMap.put("Continent","GEO_CONTINENT");
        GeoTypeMap.put("Country","GEO_COUNTRY");
        GeoTypeMap.put("Postal Code","GEO_POSTAL_CODE");
        GeoTypeMap.put("State/Prov","GEO_STATE_PROV");
    }




    public static Geography buildFinalObject(GeographyEntity message) {
        Geography g=new Geography();
        g.setDescription(message.getGeography().getGeoRowID().toString());
        g.setGeoRowID(message.getGeography().getGeoRowID().toString());
        g.setGeoType(message.getGeography().getGeoType().toString());
        g.setName(message.getGeography().getName().toString());
        g.setStatus(message.getGeography().getStatus().toString());
        g.setValidFrom(message.getGeography().getValidFrom().toString());
        g.setValidTo(message.getGeography().getValidTo().toString());
        if(Objects.nonNull(message.getGeography().getBDAType()))
        g.setBDAType(message.getGeography().getBDAType().toString());
        List<GeographyAlternateCodes> l=new ArrayList<GeographyAlternateCodes>();
        if(Objects.nonNull(message.getGeography().getGeographyAlternateCodes()))
        message.getGeography().getGeographyAlternateCodes().forEach(x->
                {
                    GeographyAlternateCodes a=new GeographyAlternateCodes();
                    a.setCode(x.getCode().toString());
                    a.setCodeType(x.getCodeType().toString());
                    l.add(a);
                }
        );
        g.setGeographyAlternateCodes(l);

        List<GeographyBDALocationsDetails> l1=new ArrayList<GeographyBDALocationsDetails>();
        if(Objects.nonNull(message.getGeography().getGeographyBDALocationsDetails())){
            message.getGeography().getGeographyBDALocationsDetails().forEach(x->
                    {
                        GeographyBDALocationsDetails a=new GeographyBDALocationsDetails();
                        a.setName(x.getName().toString());
                        a.setType(x.getType().toString());
                        a.setBdaLocRowid(x.getBdaLocRowid().toString());
                        List<GeographyBDALocationAlternateCodeDetails> m=new ArrayList<GeographyBDALocationAlternateCodeDetails>();
                        x.getGeographyBDALocationAlternateCodeDetails().forEach(y-> {
                            GeographyBDALocationAlternateCodeDetails w=new GeographyBDALocationAlternateCodeDetails();
                            w.setCode(y.getCode().toString());
                            w.setCodeType(y.getCodeType().toString());
                            m.add(w);
                        });
                        a.setGeographyBDALocationAlternateCodeDetails(m);
                        l1.add(a);
                    }
            );
        }
        g.setGeographyBDALocationsDetails(l1);
        return g;
    }



}
