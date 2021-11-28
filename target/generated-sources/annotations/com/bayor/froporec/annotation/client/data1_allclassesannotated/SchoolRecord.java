package com.bayor.froporec.annotation.client.data1_allclassesannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.GenerateRecordProcessor",
    date = "2021-11-27T23:20:55.9453846-05:00",
    comments = "version: 1.1"
)
public record SchoolRecord(java.lang.String name) {
	public SchoolRecord(com.bayor.froporec.annotation.client.data1_allclassesannotated.School school) {
		this(school.getName());
	}
}
