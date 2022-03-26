package com.bayor.froporec.annotation.client.record.data1_allclassesannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:04.1131853-04:00",
    comments = "version: 1.3"
)
public record SchoolWith1SuperInterfRecord(java.lang.String name) implements com.bayor.froporec.annotation.client.testinterf.TestInterface1 {
	public SchoolWith1SuperInterfRecord(com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolWith1SuperInterf schoolWith1SuperInterf) {
		this(schoolWith1SuperInterf.getName());
	}
}
