package com.bayor.froporec.annotation.client.record.data2_fieldsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:03.9137184-04:00",
    comments = "version: 1.3"
)
public record StudentRecord(java.lang.String lastname, int age, int mark, java.lang.String grade, com.bayor.froporec.annotation.client.record.data2_fieldsannotated.SchoolRecord school, com.bayor.froporec.annotation.client.record.data2_fieldsannotated.PersonRecord friend)  {
	public StudentRecord(com.bayor.froporec.annotation.client.record.data2_fieldsannotated.Student student) {
		this(student.getLastname(), student.getAge(), student.getMark(), student.getGrade(), new com.bayor.froporec.annotation.client.record.data2_fieldsannotated.SchoolRecord(student.getSchool()), new com.bayor.froporec.annotation.client.record.data2_fieldsannotated.PersonRecord(student.getFriend()));
	}
}
