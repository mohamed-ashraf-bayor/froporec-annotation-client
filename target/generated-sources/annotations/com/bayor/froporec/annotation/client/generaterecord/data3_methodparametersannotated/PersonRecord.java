package com.bayor.froporec.annotation.client.generaterecord.data3_methodparametersannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T19:19:31.2310623-05:00",
    comments = "version: 1.2"
)
public record PersonRecord(java.lang.String lastname, int age) {
	public PersonRecord(com.bayor.froporec.annotation.client.generaterecord.data3_methodparametersannotated.Person person) {
		this(person.getLastname(), person.getAge());
	}
}
