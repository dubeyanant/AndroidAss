package com.example.androidass;

public class Country {

    private int countryImageId;
    private String countryName;
    private String capitalName;


    public Country(int countryImageId, String countryName, String capitalName) {
        this.countryImageId = countryImageId;
        this.countryName = countryName;
        this.capitalName = capitalName;
    }

    public int getCountryImageId() {
        return countryImageId;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCapitalName() {
        return capitalName;
    }
}
