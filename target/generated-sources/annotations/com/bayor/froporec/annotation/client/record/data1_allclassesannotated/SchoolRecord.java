package com.bayor.froporec.annotation.client.record.data1_allclassesannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:03.9915138-04:00",
    comments = "version: 1.3"
)
public record SchoolRecord(java.lang.String name)  {
	public SchoolRecord(com.bayor.froporec.annotation.client.record.data1_allclassesannotated.School school) {
		this(school.getName());
	}
}
