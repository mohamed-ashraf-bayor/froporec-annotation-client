package com.bayor.froporec.annotation.client.data5_collections_partiallyannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.GenerateRecordProcessor",
    date = "2021-12-13T15:13:46.8052013-05:00",
    comments = "version: 1.1"
)
public record SchoolRecord(java.lang.String name) {
	public SchoolRecord(com.bayor.froporec.annotation.client.data5_collections_partiallyannotated.School school) {
		this(school.getName());
	}
}
