package com.lambda.country;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/names")
public class CountryListController {
    @RequestMapping("/all")
    public ArrayList<Country> countries (){
//        return  CountryApplication.countries();
         CountryApplication.countries.countryList.sort((c1, c2) ->
                c1.getName().compareToIgnoreCase(c2.getName()));
         return CountryApplication.countries.countryList;
    }
    @RequestMapping("/begin")
    public ArrayList<Country> CountriesBeginWith (@RequestParam(value="letter") String letter){
        return CountryApplication.countries.filterCountry(e -> e.getName().startsWith(letter.toUpperCase()));
    }
    @RequestMapping("/size")
    public ArrayList<Country> CountriesSizeWith (@RequestParam(value="letters", required = false) int letters){
       return CountryApplication.countries.filterCountry(e -> e.getName().length() >= letters);
    }

}


