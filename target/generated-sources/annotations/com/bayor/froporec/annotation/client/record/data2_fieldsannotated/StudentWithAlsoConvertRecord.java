package com.bayor.froporec.annotation.client.record.data2_fieldsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-12-30T21:03:44.0445569-05:00",
    comments = "version: 1.4"
)
public record StudentWithAlsoConvertRecord(java.lang.String lastname, int age, int mark, java.lang.String grade, com.bayor.froporec.annotation.client.record.data2_fieldsannotated.SchoolRecord school, com.bayor.froporec.annotation.client.record.data2_fieldsannotated.PersonRecord friend)  {

	public static final String LASTNAME = "lastname"; // type: java.lang.String
	public static final String AGE = "age"; // type: int
	public static final String MARK = "mark"; // type: int
	public static final String GRADE = "grade"; // type: java.lang.String
	public static final String SCHOOL = "school"; // type: com.bayor.froporec.annotation.client.record.data2_fieldsannotated.SchoolRecord
	public static final String FRIEND = "friend"; // type: com.bayor.froporec.annotation.client.record.data2_fieldsannotated.PersonRecord
	
	public StudentWithAlsoConvertRecord(com.bayor.froporec.annotation.client.record.data2_fieldsannotated.StudentWithAlsoConvert studentWithAlsoConvert) {
		this(studentWithAlsoConvert.getLastname(), studentWithAlsoConvert.getAge(), studentWithAlsoConvert.getMark(), studentWithAlsoConvert.getGrade(), new com.bayor.froporec.annotation.client.record.data2_fieldsannotated.SchoolRecord(studentWithAlsoConvert.getSchool()), new com.bayor.froporec.annotation.client.record.data2_fieldsannotated.PersonRecord(studentWithAlsoConvert.getFriend()));
	}

	public static StudentWithAlsoConvertRecord buildWith(com.bayor.froporec.annotation.client.record.data2_fieldsannotated.StudentWithAlsoConvert studentWithAlsoConvert) {
		return new StudentWithAlsoConvertRecord(studentWithAlsoConvert.getLastname(), studentWithAlsoConvert.getAge(), studentWithAlsoConvert.getMark(), studentWithAlsoConvert.getGrade(), new com.bayor.froporec.annotation.client.record.data2_fieldsannotated.SchoolRecord(studentWithAlsoConvert.getSchool()), new com.bayor.froporec.annotation.client.record.data2_fieldsannotated.PersonRecord(studentWithAlsoConvert.getFriend()));
	}

	public static StudentWithAlsoConvertRecord buildWith(com.bayor.froporec.annotation.client.record.data2_fieldsannotated.StudentWithAlsoConvertRecord studentWithAlsoConvertRecord) {
		return new StudentWithAlsoConvertRecord(studentWithAlsoConvertRecord.lastname(), studentWithAlsoConvertRecord.age(), studentWithAlsoConvertRecord.mark(), studentWithAlsoConvertRecord.grade(), studentWithAlsoConvertRecord.school(), studentWithAlsoConvertRecord.friend());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static StudentWithAlsoConvertRecord buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new StudentWithAlsoConvertRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, null), (int) fieldsNameValuePairs.getOrDefault(AGE, 0), (int) fieldsNameValuePairs.getOrDefault(MARK, 0), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, null), (com.bayor.froporec.annotation.client.record.data2_fieldsannotated.SchoolRecord) fieldsNameValuePairs.getOrDefault(SCHOOL, null), (com.bayor.froporec.annotation.client.record.data2_fieldsannotated.PersonRecord) fieldsNameValuePairs.getOrDefault(FRIEND, null));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static StudentWithAlsoConvertRecord buildWith(com.bayor.froporec.annotation.client.record.data2_fieldsannotated.StudentWithAlsoConvert studentWithAlsoConvert, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new StudentWithAlsoConvertRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, studentWithAlsoConvert.getLastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, studentWithAlsoConvert.getAge()), (int) fieldsNameValuePairs.getOrDefault(MARK, studentWithAlsoConvert.getMark()), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, studentWithAlsoConvert.getGrade()), (com.bayor.froporec.annotation.client.record.data2_fieldsannotated.SchoolRecord) fieldsNameValuePairs.getOrDefault(SCHOOL, new com.bayor.froporec.annotation.client.record.data2_fieldsannotated.SchoolRecord(studentWithAlsoConvert.getSchool())), (com.bayor.froporec.annotation.client.record.data2_fieldsannotated.PersonRecord) fieldsNameValuePairs.getOrDefault(FRIEND, new com.bayor.froporec.annotation.client.record.data2_fieldsannotated.PersonRecord(studentWithAlsoConvert.getFriend())));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static StudentWithAlsoConvertRecord buildWith(com.bayor.froporec.annotation.client.record.data2_fieldsannotated.StudentWithAlsoConvertRecord studentWithAlsoConvertRecord, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new StudentWithAlsoConvertRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, studentWithAlsoConvertRecord.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, studentWithAlsoConvertRecord.age()), (int) fieldsNameValuePairs.getOrDefault(MARK, studentWithAlsoConvertRecord.mark()), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, studentWithAlsoConvertRecord.grade()), (com.bayor.froporec.annotation.client.record.data2_fieldsannotated.SchoolRecord) fieldsNameValuePairs.getOrDefault(SCHOOL, studentWithAlsoConvertRecord.school()), (com.bayor.froporec.annotation.client.record.data2_fieldsannotated.PersonRecord) fieldsNameValuePairs.getOrDefault(FRIEND, studentWithAlsoConvertRecord.friend()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public StudentWithAlsoConvertRecord with(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new StudentWithAlsoConvertRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, this.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, this.age()), (int) fieldsNameValuePairs.getOrDefault(MARK, this.mark()), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, this.grade()), (com.bayor.froporec.annotation.client.record.data2_fieldsannotated.SchoolRecord) fieldsNameValuePairs.getOrDefault(SCHOOL, this.school()), (com.bayor.froporec.annotation.client.record.data2_fieldsannotated.PersonRecord) fieldsNameValuePairs.getOrDefault(FRIEND, this.friend()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public <T> StudentWithAlsoConvertRecord with(String fieldName, T fieldValue) {
		return new StudentWithAlsoConvertRecord(fieldName.equals(LASTNAME) ? (java.lang.String) fieldValue : this.lastname(), fieldName.equals(AGE) ? (int) fieldValue : this.age(), fieldName.equals(MARK) ? (int) fieldValue : this.mark(), fieldName.equals(GRADE) ? (java.lang.String) fieldValue : this.grade(), fieldName.equals(SCHOOL) ? (com.bayor.froporec.annotation.client.record.data2_fieldsannotated.SchoolRecord) fieldValue : this.school(), fieldName.equals(FRIEND) ? (com.bayor.froporec.annotation.client.record.data2_fieldsannotated.PersonRecord) fieldValue : this.friend());
	}
}