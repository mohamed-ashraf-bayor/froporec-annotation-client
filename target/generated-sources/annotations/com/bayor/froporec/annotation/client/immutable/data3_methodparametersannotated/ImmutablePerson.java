package com.bayor.froporec.annotation.client.immutable.data3_methodparametersannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:04.2707655-04:00",
    comments = "version: 1.3"
)
public record ImmutablePerson(java.lang.String lastname, int age)  {
	public ImmutablePerson(com.bayor.froporec.annotation.client.immutable.data3_methodparametersannotated.Person person) {
		this(person.lastname(), person.age());
	}
}
