package com.usbbog.countriesproject.entities;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CountriesEntity {

    private UUID Id;
    private String countryName;
    private String countryCapital;
    private String countryRegion;

//    public  CountriesEntity(UUID id, String countryName, String countryCapital, String countryRegion){
//        this.id = id;
//        this.countryName = countryName;
//        this.countryCapital = countryCapital;
//        this.countryRegion = countryRegion;
//
//    }
}
