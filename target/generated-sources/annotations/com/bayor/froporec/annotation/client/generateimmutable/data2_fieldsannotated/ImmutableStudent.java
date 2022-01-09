package com.bayor.froporec.annotation.client.generateimmutable.data2_fieldsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T19:19:31.1642685-05:00",
    comments = "version: 1.2"
)
public record ImmutableStudent(int mark, java.lang.String grade, com.bayor.froporec.annotation.client.generateimmutable.data2_fieldsannotated.ImmutableSchool school, java.lang.String lastname, int age) {
	public ImmutableStudent(com.bayor.froporec.annotation.client.generateimmutable.data2_fieldsannotated.Student student) {
		this(student.mark(), student.grade(), new com.bayor.froporec.annotation.client.generateimmutable.data2_fieldsannotated.ImmutableSchool(student.school()), student.lastname(), student.age());
	}
}
