package com.lambda.country;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountryApplication {
    static CountryList countries;
    public static void main(String[] args) {
        countries = new CountryList();
        SpringApplication.run(CountryApplication.class, args);
    }
}


