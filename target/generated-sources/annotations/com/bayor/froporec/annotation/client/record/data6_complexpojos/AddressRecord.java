package com.bayor.froporec.annotation.client.record.data6_complexpojos;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:04.0363924-04:00",
    comments = "version: 1.3"
)
public record AddressRecord(java.lang.String streetName, java.lang.String buildingNumber)  {
	public AddressRecord(com.bayor.froporec.annotation.client.record.data6_complexpojos.Address address) {
		this(address.getStreetName(), address.getBuildingNumber());
	}
}
