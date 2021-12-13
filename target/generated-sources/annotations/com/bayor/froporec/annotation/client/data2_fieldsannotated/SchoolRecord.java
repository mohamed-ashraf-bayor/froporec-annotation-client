package com.bayor.froporec.annotation.client.data2_fieldsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.GenerateRecordProcessor",
    date = "2021-12-13T15:13:47.1652463-05:00",
    comments = "version: 1.1"
)
public record SchoolRecord(java.lang.String name) {
	public SchoolRecord(com.bayor.froporec.annotation.client.data2_fieldsannotated.School school) {
		this(school.getName());
	}
}
