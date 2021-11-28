package com.bayor.froporec.annotation.client.data5_collections_partiallyannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.GenerateRecordProcessor",
    date = "2021-11-27T23:20:55.8875393-05:00",
    comments = "version: 1.1"
)
public record SchoolRecord(java.lang.String name) {
	public SchoolRecord(com.bayor.froporec.annotation.client.data5_collections_partiallyannotated.School school) {
		this(school.getName());
	}
}
