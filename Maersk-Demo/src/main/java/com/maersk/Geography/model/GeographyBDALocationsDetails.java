package com.maersk.Geography.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeographyBDALocationsDetails {

    private String bdaLocRowid;
    private String Name;
    private String Type;
    private List<GeographyBDALocationAlternateCodeDetails> GeographyBDALocationAlternateCodeDetails;
}
