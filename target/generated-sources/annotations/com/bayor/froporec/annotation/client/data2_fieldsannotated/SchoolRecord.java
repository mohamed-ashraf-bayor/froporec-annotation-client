package com.bayor.froporec.annotation.client.data2_fieldsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.GenerateRecordProcessor",
    date = "2021-11-27T23:20:56.1428534-05:00",
    comments = "version: 1.1"
)
public record SchoolRecord(java.lang.String name) {
	public SchoolRecord(com.bayor.froporec.annotation.client.data2_fieldsannotated.School school) {
		this(school.getName());
	}
}
