package com.bayor.froporec.annotation.client.record.data2_fieldsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:03.9984955-04:00",
    comments = "version: 1.3"
)
public record StudentWithAlsoConvertRecord(java.lang.String lastname, int age, int mark, java.lang.String grade, com.bayor.froporec.annotation.client.record.data2_fieldsannotated.SchoolRecord school, com.bayor.froporec.annotation.client.record.data2_fieldsannotated.PersonRecord friend)  {
	public StudentWithAlsoConvertRecord(com.bayor.froporec.annotation.client.record.data2_fieldsannotated.StudentWithAlsoConvert studentWithAlsoConvert) {
		this(studentWithAlsoConvert.getLastname(), studentWithAlsoConvert.getAge(), studentWithAlsoConvert.getMark(), studentWithAlsoConvert.getGrade(), new com.bayor.froporec.annotation.client.record.data2_fieldsannotated.SchoolRecord(studentWithAlsoConvert.getSchool()), new com.bayor.froporec.annotation.client.record.data2_fieldsannotated.PersonRecord(studentWithAlsoConvert.getFriend()));
	}
}
