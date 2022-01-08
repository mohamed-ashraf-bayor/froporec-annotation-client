package com.bayor.froporec.annotation.client.generaterecord.data2_fieldsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T16:18:17.5026535-05:00",
    comments = "version: 1.2"
)
public record StudentRecord(java.lang.String lastname, int age, int mark, java.lang.String grade, com.bayor.froporec.annotation.client.generaterecord.data2_fieldsannotated.SchoolRecord school, com.bayor.froporec.annotation.client.generaterecord.data2_fieldsannotated.PersonRecord friend) {
	public StudentRecord(com.bayor.froporec.annotation.client.generaterecord.data2_fieldsannotated.Student student) {
		this(student.getLastname(), student.getAge(), student.getMark(), student.getGrade(), new com.bayor.froporec.annotation.client.generaterecord.data2_fieldsannotated.SchoolRecord(student.getSchool()), new com.bayor.froporec.annotation.client.generaterecord.data2_fieldsannotated.PersonRecord(student.getFriend()));
	}
}
