package com.bayor.froporec.annotation.client.generaterecord.data2_fieldsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T19:19:31.2709904-05:00",
    comments = "version: 1.2"
)
public record StudentWithIncludedTypesRecord(java.lang.String lastname, int age, int mark, java.lang.String grade, com.bayor.froporec.annotation.client.generaterecord.data2_fieldsannotated.SchoolRecord school, com.bayor.froporec.annotation.client.generaterecord.data2_fieldsannotated.PersonRecord friend) {
	public StudentWithIncludedTypesRecord(com.bayor.froporec.annotation.client.generaterecord.data2_fieldsannotated.StudentWithIncludedTypes studentWithIncludedTypes) {
		this(studentWithIncludedTypes.getLastname(), studentWithIncludedTypes.getAge(), studentWithIncludedTypes.getMark(), studentWithIncludedTypes.getGrade(), new com.bayor.froporec.annotation.client.generaterecord.data2_fieldsannotated.SchoolRecord(studentWithIncludedTypes.getSchool()), new com.bayor.froporec.annotation.client.generaterecord.data2_fieldsannotated.PersonRecord(studentWithIncludedTypes.getFriend()));
	}
}
