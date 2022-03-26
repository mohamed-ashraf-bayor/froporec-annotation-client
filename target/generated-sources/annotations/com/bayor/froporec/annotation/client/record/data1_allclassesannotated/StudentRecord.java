package com.bayor.froporec.annotation.client.record.data1_allclassesannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:03.9655802-04:00",
    comments = "version: 1.3"
)
public record StudentRecord(java.lang.String lastname, int age, int mark, java.lang.String grade, com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolRecord school)  {
	public StudentRecord(com.bayor.froporec.annotation.client.record.data1_allclassesannotated.Student student) {
		this(student.getLastname(), student.getAge(), student.getMark(), student.getGrade(), new com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolRecord(student.getSchool()));
	}
}
