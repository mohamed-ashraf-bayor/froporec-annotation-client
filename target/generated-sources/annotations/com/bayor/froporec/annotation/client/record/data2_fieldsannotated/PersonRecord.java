package com.bayor.froporec.annotation.client.record.data2_fieldsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:04.0114584-04:00",
    comments = "version: 1.3"
)
public record PersonRecord(java.lang.String lastname, int age)  {
	public PersonRecord(com.bayor.froporec.annotation.client.record.data2_fieldsannotated.Person person) {
		this(person.getLastname(), person.getAge());
	}
}
