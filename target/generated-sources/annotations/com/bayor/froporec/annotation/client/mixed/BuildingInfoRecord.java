package com.bayor.froporec.annotation.client.mixed;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T16:18:17.3660185-05:00",
    comments = "version: 1.2"
)
public record BuildingInfoRecord(int number, java.lang.String streetName) {
	public BuildingInfoRecord(com.bayor.froporec.annotation.client.mixed.BuildingInfo buildingInfo) {
		this(buildingInfo.getNumber(), buildingInfo.getStreetName());
	}
}