package com.bayor.froporec.annotation.client.mixed;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:04.3246219-04:00",
    comments = "version: 1.3"
)
public record ImmutableSchool(java.lang.String name, com.bayor.froporec.annotation.client.mixed.BuildingInfoRecord buildingInfo)  {
	public ImmutableSchool(com.bayor.froporec.annotation.client.mixed.School school) {
		this(school.name(), new com.bayor.froporec.annotation.client.mixed.BuildingInfoRecord(school.buildingInfo()));
	}
}
