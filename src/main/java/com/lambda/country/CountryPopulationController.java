package com.lambda.country;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
@RequestMapping("/population")
public class CountryPopulationController {
    @RequestMapping("/max")
    public Country maxPopulation (){
        return CountryApplication.countries.maxPopulation();
    }
    @RequestMapping("/min")
    public Country minPopulation (){
        return CountryApplication.countries.minPopulation();
    }
    @RequestMapping("/size")
    public ArrayList<Country> sizePopulation (@RequestParam(value="people") long people){
        return CountryApplication.countries.filterCountry(e -> e.getPopulation() >= people);
    }
}
