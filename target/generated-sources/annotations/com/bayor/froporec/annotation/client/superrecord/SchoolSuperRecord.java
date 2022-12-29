package com.bayor.froporec.annotation.client.superrecord;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-12-28T21:36:09.549883-05:00",
    comments = "version: 1.4"
)
public record SchoolSuperRecord(java.lang.String nameSchool, java.lang.String lastnameStudent, int ageStudent, int markStudent, java.lang.String gradeStudent, com.bayor.froporec.annotation.client.superrecord.School schoolStudent)  {

	public SchoolSuperRecord(com.bayor.froporec.annotation.client.superrecord.School school, com.bayor.froporec.annotation.client.superrecord.Student student) {
		this(school.name(), student.getLastname(), student.getAge(), student.getMark(), student.getGrade(), student.getSchool());
	}
}