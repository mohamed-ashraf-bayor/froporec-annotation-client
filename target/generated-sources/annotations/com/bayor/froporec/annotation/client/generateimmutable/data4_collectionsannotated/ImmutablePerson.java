package com.bayor.froporec.annotation.client.generateimmutable.data4_collectionsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T19:19:31.2131203-05:00",
    comments = "version: 1.2"
)
public record ImmutablePerson(java.lang.String lastname, int age) {
	public ImmutablePerson(com.bayor.froporec.annotation.client.generateimmutable.data4_collectionsannotated.Person person) {
		this(person.lastname(), person.age());
	}
}
