package com.maersk.Geography.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeographyAlternateCodes {
    private String CodeType;
    private String Code;
}
