package com.bayor.froporec.annotation.client.mixed;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:04.1211642-04:00",
    comments = "version: 1.3"
)
public record PersonRecord(java.lang.String lastname, int age)  {
	public PersonRecord(com.bayor.froporec.annotation.client.mixed.Person person) {
		this(person.getLastname(), person.getAge());
	}
}
