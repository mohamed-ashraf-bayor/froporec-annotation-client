package com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:04.2288788-04:00",
    comments = "version: 1.3"
)
public record ImmutablePersonWithMultipleSuperInterf(java.lang.String lastname, int age) implements com.bayor.froporec.annotation.client.testinterf.TestInterface1, com.bayor.froporec.annotation.client.testinterf.TestInterface2 {
	public ImmutablePersonWithMultipleSuperInterf(com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated.PersonWithMultipleSuperInterf personWithMultipleSuperInterf) {
		this(personWithMultipleSuperInterf.lastname(), personWithMultipleSuperInterf.age());
	}
}
