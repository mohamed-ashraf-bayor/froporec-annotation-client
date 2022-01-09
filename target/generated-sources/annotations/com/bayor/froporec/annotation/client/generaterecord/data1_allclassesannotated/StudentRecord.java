package com.bayor.froporec.annotation.client.generaterecord.data1_allclassesannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T19:19:31.1782047-05:00",
    comments = "version: 1.2"
)
public record StudentRecord(java.lang.String lastname, int age, int mark, java.lang.String grade, com.bayor.froporec.annotation.client.generaterecord.data1_allclassesannotated.SchoolRecord school) {
	public StudentRecord(com.bayor.froporec.annotation.client.generaterecord.data1_allclassesannotated.Student student) {
		this(student.getLastname(), student.getAge(), student.getMark(), student.getGrade(), new com.bayor.froporec.annotation.client.generaterecord.data1_allclassesannotated.SchoolRecord(student.getSchool()));
	}
}
