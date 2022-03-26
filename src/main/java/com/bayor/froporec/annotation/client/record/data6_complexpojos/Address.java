package com.bayor.froporec.annotation.client.record.data6_complexpojos;

import org.froporec.annotations.Record;

@Record
public class Address {

    private String streetName;

    private String buildingNumber;

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }
}
