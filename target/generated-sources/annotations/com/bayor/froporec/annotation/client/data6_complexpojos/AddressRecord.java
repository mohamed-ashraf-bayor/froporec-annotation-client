package com.bayor.froporec.annotation.client.data6_complexpojos;

@javax.annotation.processing.Generated(
    value = "org.froporec.GenerateRecordProcessor",
    date = "2021-12-13T15:13:47.0974255-05:00",
    comments = "version: 1.1"
)
public record AddressRecord(java.lang.String streetName, java.lang.String buildingNumber) {
	public AddressRecord(com.bayor.froporec.annotation.client.data6_complexpojos.Address address) {
		this(address.getStreetName(), address.getBuildingNumber());
	}
}
