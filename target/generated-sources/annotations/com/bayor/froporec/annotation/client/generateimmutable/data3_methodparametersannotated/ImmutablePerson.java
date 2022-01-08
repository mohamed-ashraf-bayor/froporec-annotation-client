package com.bayor.froporec.annotation.client.generateimmutable.data3_methodparametersannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T16:18:17.4727382-05:00",
    comments = "version: 1.2"
)
public record ImmutablePerson(java.lang.String lastname, int age) {
	public ImmutablePerson(com.bayor.froporec.annotation.client.generateimmutable.data3_methodparametersannotated.Person person) {
		this(person.lastname(), person.age());
	}
}
