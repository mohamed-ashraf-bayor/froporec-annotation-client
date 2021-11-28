package com.bayor.froporec.annotation.client.data3_methodparametersannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.GenerateRecordProcessor",
    date = "2021-11-27T23:20:56.2764977-05:00",
    comments = "version: 1.1"
)
public record StudentRecord(java.lang.String lastname, int age, int mark, java.lang.String grade, com.bayor.froporec.annotation.client.data3_methodparametersannotated.SchoolRecord school) {
	public StudentRecord(com.bayor.froporec.annotation.client.data3_methodparametersannotated.Student student) {
		this(student.getLastname(), student.getAge(), student.getMark(), student.getGrade(), new com.bayor.froporec.annotation.client.data3_methodparametersannotated.SchoolRecord(student.getSchool()));
	}
}
