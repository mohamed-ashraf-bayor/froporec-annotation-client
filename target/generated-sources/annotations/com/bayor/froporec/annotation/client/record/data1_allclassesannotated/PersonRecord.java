package com.bayor.froporec.annotation.client.record.data1_allclassesannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:03.9585995-04:00",
    comments = "version: 1.3"
)
public record PersonRecord(java.lang.String lastname, int age)  {
	public PersonRecord(com.bayor.froporec.annotation.client.record.data1_allclassesannotated.Person person) {
		this(person.getLastname(), person.getAge());
	}
}
