package com.bayor.froporec.annotation.client.generaterecord.data2_fieldsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T19:19:31.1422992-05:00",
    comments = "version: 1.2"
)
public record SchoolRecord(java.lang.String name) {
	public SchoolRecord(com.bayor.froporec.annotation.client.generaterecord.data2_fieldsannotated.School school) {
		this(school.getName());
	}
}
