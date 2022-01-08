package com.bayor.froporec.annotation.client.generateimmutable.data4_collectionsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T16:18:17.4279115-05:00",
    comments = "version: 1.2"
)
public record ImmutablePerson(java.lang.String lastname, int age) {
	public ImmutablePerson(com.bayor.froporec.annotation.client.generateimmutable.data4_collectionsannotated.Person person) {
		this(person.lastname(), person.age());
	}
}
