package com.bayor.froporec.annotation.client.immutable.data3_methodparametersannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:04.3485558-04:00",
    comments = "version: 1.3"
)
public record ImmutableStudent(int mark, java.lang.String grade, com.bayor.froporec.annotation.client.immutable.data3_methodparametersannotated.ImmutableSchool school, java.lang.String lastname, int age)  {
	public ImmutableStudent(com.bayor.froporec.annotation.client.immutable.data3_methodparametersannotated.Student student) {
		this(student.mark(), student.grade(), new com.bayor.froporec.annotation.client.immutable.data3_methodparametersannotated.ImmutableSchool(student.school()), student.lastname(), student.age());
	}
}
