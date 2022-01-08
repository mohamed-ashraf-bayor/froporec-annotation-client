package com.bayor.froporec.annotation.client.generaterecord.data1_allclassesannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T16:18:17.5196074-05:00",
    comments = "version: 1.2"
)
public record SchoolRecord(java.lang.String name) {
	public SchoolRecord(com.bayor.froporec.annotation.client.generaterecord.data1_allclassesannotated.School school) {
		this(school.getName());
	}
}
