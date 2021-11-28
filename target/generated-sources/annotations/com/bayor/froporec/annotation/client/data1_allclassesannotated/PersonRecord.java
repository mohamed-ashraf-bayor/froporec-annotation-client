package com.bayor.froporec.annotation.client.data1_allclassesannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.GenerateRecordProcessor",
    date = "2021-11-27T23:20:55.8486387-05:00",
    comments = "version: 1.1"
)
public record PersonRecord(java.lang.String lastname, int age) {
	public PersonRecord(com.bayor.froporec.annotation.client.data1_allclassesannotated.Person person) {
		this(person.getLastname(), person.getAge());
	}
}
