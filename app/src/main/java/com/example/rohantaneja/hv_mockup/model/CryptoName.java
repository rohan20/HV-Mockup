package com.example.rohantaneja.hv_mockup.model;

public class CryptoName {

    private String name;
    private boolean isSelected;

    public CryptoName(String name, boolean isSelected) {
        this.name = name;
        this.isSelected = isSelected;
    }

    public String getName() {
        return name;
    }

    public boolean isSelected() {
        return isSelected;
    }
}
