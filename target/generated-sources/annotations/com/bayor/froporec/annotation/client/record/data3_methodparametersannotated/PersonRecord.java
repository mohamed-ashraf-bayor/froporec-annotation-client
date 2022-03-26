package com.bayor.froporec.annotation.client.record.data3_methodparametersannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:04.0194372-04:00",
    comments = "version: 1.3"
)
public record PersonRecord(java.lang.String lastname, int age)  {
	public PersonRecord(com.bayor.froporec.annotation.client.record.data3_methodparametersannotated.Person person) {
		this(person.getLastname(), person.getAge());
	}
}
