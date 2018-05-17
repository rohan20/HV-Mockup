package com.example.rohantaneja.hv_mockup.model;

public class CryptoDetails {

    private String name;
    private String numUnits;
    private String state;
    private String price;

    public CryptoDetails(String name, String numUnits, String state, String price) {
        this.name = name;
        this.numUnits = numUnits;
        this.state = state;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getNumUnits() {
        return numUnits;
    }

    public String getState() {
        return state;
    }

    public String getPrice() {
        return price;
    }
}
