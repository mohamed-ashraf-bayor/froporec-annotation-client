package com.bayor.froporec.annotation.client.generaterecord.data6_complexpojos;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T16:18:17.4049186-05:00",
    comments = "version: 1.2"
)
public record AddressRecord(java.lang.String streetName, java.lang.String buildingNumber) {
	public AddressRecord(com.bayor.froporec.annotation.client.generaterecord.data6_complexpojos.Address address) {
		this(address.getStreetName(), address.getBuildingNumber());
	}
}
