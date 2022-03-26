package com.bayor.froporec.annotation.client.record.data3_methodparametersannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:04.0503529-04:00",
    comments = "version: 1.3"
)
public record SchoolRecord(java.lang.String name)  {
	public SchoolRecord(com.bayor.froporec.annotation.client.record.data3_methodparametersannotated.School school) {
		this(school.getName());
	}
}
