package com.bayor.froporec.annotation.client.generaterecord.data5_collections_partiallyannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T16:18:17.4916827-05:00",
    comments = "version: 1.2"
)
public record SchoolRecord(java.lang.String name) {
	public SchoolRecord(com.bayor.froporec.annotation.client.generaterecord.data5_collections_partiallyannotated.School school) {
		this(school.getName());
	}
}
