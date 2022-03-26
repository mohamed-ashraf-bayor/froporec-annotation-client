package com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:04.2388504-04:00",
    comments = "version: 1.3"
)
public record ImmutableStudentWithAlsoConvert(int mark, java.lang.String grade, com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool school, java.lang.String lastname, int age)  {
	public ImmutableStudentWithAlsoConvert(com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.StudentWithAlsoConvert studentWithAlsoConvert) {
		this(studentWithAlsoConvert.mark(), studentWithAlsoConvert.grade(), new com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool(studentWithAlsoConvert.school()), studentWithAlsoConvert.lastname(), studentWithAlsoConvert.age());
	}
}
