package com.bayor.froporec.annotation.client.data2_fieldsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.GenerateRecordProcessor",
    date = "2021-11-27T23:20:56.0301585-05:00",
    comments = "version: 1.1"
)
public record StudentRecord(java.lang.String lastname, int age, int mark, java.lang.String grade, com.bayor.froporec.annotation.client.data2_fieldsannotated.SchoolRecord school, com.bayor.froporec.annotation.client.data2_fieldsannotated.PersonRecord friend) {
	public StudentRecord(com.bayor.froporec.annotation.client.data2_fieldsannotated.Student student) {
		this(student.getLastname(), student.getAge(), student.getMark(), student.getGrade(), new com.bayor.froporec.annotation.client.data2_fieldsannotated.SchoolRecord(student.getSchool()), new com.bayor.froporec.annotation.client.data2_fieldsannotated.PersonRecord(student.getFriend()));
	}
}
