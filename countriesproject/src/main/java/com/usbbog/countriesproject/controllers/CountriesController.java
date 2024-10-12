package com.usbbog.countriesproject.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/countries")
public class CountriesController {

    @GetMapping
    public String getCountries(){

    }

    @GetMapping("/{id}")
    public String getCountry(){

    }

    @PostMapping
    public String createCountry(){

    }

    @PutMapping("/{id}")
    public String updateCountry(){

    }

    @DeleteMapping("/{id}")
    public String deleteCountry(){

    }
}
