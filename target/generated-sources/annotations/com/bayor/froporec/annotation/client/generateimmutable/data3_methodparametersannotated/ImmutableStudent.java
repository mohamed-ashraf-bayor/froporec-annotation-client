package com.bayor.froporec.annotation.client.generateimmutable.data3_methodparametersannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T19:19:31.2480177-05:00",
    comments = "version: 1.2"
)
public record ImmutableStudent(int mark, java.lang.String grade, com.bayor.froporec.annotation.client.generateimmutable.data3_methodparametersannotated.ImmutableSchool school, java.lang.String lastname, int age) {
	public ImmutableStudent(com.bayor.froporec.annotation.client.generateimmutable.data3_methodparametersannotated.Student student) {
		this(student.mark(), student.grade(), new com.bayor.froporec.annotation.client.generateimmutable.data3_methodparametersannotated.ImmutableSchool(student.school()), student.lastname(), student.age());
	}
}
