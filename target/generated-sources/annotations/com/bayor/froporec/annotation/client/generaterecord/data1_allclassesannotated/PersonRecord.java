package com.bayor.froporec.annotation.client.generaterecord.data1_allclassesannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T19:19:31.2789401-05:00",
    comments = "version: 1.2"
)
public record PersonRecord(java.lang.String lastname, int age) {
	public PersonRecord(com.bayor.froporec.annotation.client.generaterecord.data1_allclassesannotated.Person person) {
		this(person.getLastname(), person.getAge());
	}
}
