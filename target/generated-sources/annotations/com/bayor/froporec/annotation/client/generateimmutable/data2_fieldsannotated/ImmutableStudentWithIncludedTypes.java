package com.bayor.froporec.annotation.client.generateimmutable.data2_fieldsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T16:18:17.3820035-05:00",
    comments = "version: 1.2"
)
public record ImmutableStudentWithIncludedTypes(int mark, java.lang.String grade, com.bayor.froporec.annotation.client.generateimmutable.data2_fieldsannotated.ImmutableSchool school, java.lang.String lastname, int age) {
	public ImmutableStudentWithIncludedTypes(com.bayor.froporec.annotation.client.generateimmutable.data2_fieldsannotated.StudentWithIncludedTypes studentWithIncludedTypes) {
		this(studentWithIncludedTypes.mark(), studentWithIncludedTypes.grade(), new com.bayor.froporec.annotation.client.generateimmutable.data2_fieldsannotated.ImmutableSchool(studentWithIncludedTypes.school()), studentWithIncludedTypes.lastname(), studentWithIncludedTypes.age());
	}
}
