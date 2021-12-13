package com.bayor.froporec.annotation.client.data1_allclassesannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.GenerateRecordProcessor",
    date = "2021-12-13T15:13:46.872025-05:00",
    comments = "version: 1.1"
)
public record StudentRecord(java.lang.String lastname, int age, int mark, java.lang.String grade, com.bayor.froporec.annotation.client.data1_allclassesannotated.SchoolRecord school) {
	public StudentRecord(com.bayor.froporec.annotation.client.data1_allclassesannotated.Student student) {
		this(student.getLastname(), student.getAge(), student.getMark(), student.getGrade(), new com.bayor.froporec.annotation.client.data1_allclassesannotated.SchoolRecord(student.getSchool()));
	}
}
