package com.example.androidass.mar1;

public class Country {

    private final int countryImageId;
    private final String countryName;
    private final String capitalName;

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