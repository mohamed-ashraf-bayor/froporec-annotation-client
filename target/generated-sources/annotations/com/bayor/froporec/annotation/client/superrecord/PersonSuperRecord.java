package com.bayor.froporec.annotation.client.superrecord;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:04.3794738-04:00",
    comments = "version: 1.3"
)
public record PersonSuperRecord(java.lang.String lastnamePerson, int agePerson, java.lang.String nameSchool, java.lang.String lastnameStudent, int ageStudent, int markStudent, java.lang.String gradeStudent, com.bayor.froporec.annotation.client.superrecord.School schoolStudent) implements com.bayor.froporec.annotation.client.testinterf.TestInterface1, com.bayor.froporec.annotation.client.testinterf.TestInterface2 {
	public PersonSuperRecord(com.bayor.froporec.annotation.client.superrecord.Person person, com.bayor.froporec.annotation.client.superrecord.School school, com.bayor.froporec.annotation.client.superrecord.Student student) {
		this(person.getLastname(), person.getAge(), school.name(), student.getLastname(), student.getAge(), student.getMark(), student.getGrade(), student.getSchool());
	}
}
