package com.bayor.froporec.annotation.client.data4_collectionsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.GenerateRecordProcessor",
    date = "2021-11-27T23:20:56.0989718-05:00",
    comments = "version: 1.1"
)
public record SchoolRecord(java.lang.String name) {
	public SchoolRecord(com.bayor.froporec.annotation.client.data4_collectionsannotated.School school) {
		this(school.getName());
	}
}
