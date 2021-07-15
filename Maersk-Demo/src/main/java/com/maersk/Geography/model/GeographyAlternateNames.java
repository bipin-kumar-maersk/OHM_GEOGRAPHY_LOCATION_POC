package com.maersk.Geography.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeographyAlternateNames {

    private String Name;
    private String Description;
    private String Status;

}
