package com.bayor.froporec.annotation.client.mixed;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T19:19:31.1732169-05:00",
    comments = "version: 1.2"
)
public record ImmutableSchool(java.lang.String name, com.bayor.froporec.annotation.client.mixed.BuildingInfoRecord buildingInfo) {
	public ImmutableSchool(com.bayor.froporec.annotation.client.mixed.School school) {
		this(school.name(), new com.bayor.froporec.annotation.client.mixed.BuildingInfoRecord(school.buildingInfo()));
	}
}
