package com.bayor.froporec.annotation.client.data3_methodparametersannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.GenerateRecordProcessor",
    date = "2021-11-27T23:20:56.2326154-05:00",
    comments = "version: 1.1"
)
public record SchoolRecord(java.lang.String name) {
	public SchoolRecord(com.bayor.froporec.annotation.client.data3_methodparametersannotated.School school) {
		this(school.getName());
	}
}
