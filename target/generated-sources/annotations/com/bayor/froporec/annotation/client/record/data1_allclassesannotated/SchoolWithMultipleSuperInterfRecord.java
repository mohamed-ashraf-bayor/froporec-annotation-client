package com.bayor.froporec.annotation.client.record.data1_allclassesannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:03.9725623-04:00",
    comments = "version: 1.3"
)
public record SchoolWithMultipleSuperInterfRecord(java.lang.String name) implements com.bayor.froporec.annotation.client.testinterf.TestInterface1, com.bayor.froporec.annotation.client.testinterf.TestInterface2 {
	public SchoolWithMultipleSuperInterfRecord(com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolWithMultipleSuperInterf schoolWithMultipleSuperInterf) {
		this(schoolWithMultipleSuperInterf.getName());
	}
}
