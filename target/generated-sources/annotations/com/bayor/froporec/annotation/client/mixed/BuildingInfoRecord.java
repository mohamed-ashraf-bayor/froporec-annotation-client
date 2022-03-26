package com.bayor.froporec.annotation.client.mixed;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:04.3296117-04:00",
    comments = "version: 1.3"
)
public record BuildingInfoRecord(int number, java.lang.String streetName)  {
	public BuildingInfoRecord(com.bayor.froporec.annotation.client.mixed.BuildingInfo buildingInfo) {
		this(buildingInfo.getNumber(), buildingInfo.getStreetName());
	}
}
