package com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:04.028411-04:00",
    comments = "version: 1.3"
)
public record SchoolRecord(java.lang.String name)  {
	public SchoolRecord(com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.School school) {
		this(school.getName());
	}
}
