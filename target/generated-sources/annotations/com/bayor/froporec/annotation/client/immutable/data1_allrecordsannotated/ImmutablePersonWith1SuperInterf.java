package com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:04.198959-04:00",
    comments = "version: 1.3"
)
public record ImmutablePersonWith1SuperInterf(java.lang.String lastname, int age) implements com.bayor.froporec.annotation.client.testinterf.TestInterface2 {
	public ImmutablePersonWith1SuperInterf(com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated.PersonWith1SuperInterf personWith1SuperInterf) {
		this(personWith1SuperInterf.lastname(), personWith1SuperInterf.age());
	}
}
