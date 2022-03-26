package com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:04.2917073-04:00",
    comments = "version: 1.3"
)
public record ImmutableStudent(int mark, java.lang.String grade, com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool school, java.lang.String lastname, int age)  {
	public ImmutableStudent(com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.Student student) {
		this(student.mark(), student.grade(), new com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool(student.school()), student.lastname(), student.age());
	}
}
