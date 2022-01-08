package com.bayor.froporec.annotation.client.mixed;

public class BuildingInfo {

    private int number;

    private String streetName;

    public BuildingInfo(int number, String streetName) {
        this.number = number;
        this.streetName = streetName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}