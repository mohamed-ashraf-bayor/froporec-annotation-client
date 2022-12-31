package com.bayor.froporec.annotation.client.record.data1_allclassesannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-12-30T21:03:44.0635551-05:00",
    comments = "version: 1.4"
)
public record StudentRecord(java.lang.String lastname, int age, int mark, java.lang.String grade, com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolRecord school)  {

	public static final String LASTNAME = "lastname"; // type: java.lang.String
	public static final String AGE = "age"; // type: int
	public static final String MARK = "mark"; // type: int
	public static final String GRADE = "grade"; // type: java.lang.String
	public static final String SCHOOL = "school"; // type: com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolRecord
	
	public StudentRecord(com.bayor.froporec.annotation.client.record.data1_allclassesannotated.Student student) {
		this(student.getLastname(), student.getAge(), student.getMark(), student.getGrade(), new com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolRecord(student.getSchool()));
	}

	public static StudentRecord buildWith(com.bayor.froporec.annotation.client.record.data1_allclassesannotated.Student student) {
		return new StudentRecord(student.getLastname(), student.getAge(), student.getMark(), student.getGrade(), new com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolRecord(student.getSchool()));
	}

	public static StudentRecord buildWith(com.bayor.froporec.annotation.client.record.data1_allclassesannotated.StudentRecord studentRecord) {
		return new StudentRecord(studentRecord.lastname(), studentRecord.age(), studentRecord.mark(), studentRecord.grade(), studentRecord.school());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static StudentRecord buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new StudentRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, null), (int) fieldsNameValuePairs.getOrDefault(AGE, 0), (int) fieldsNameValuePairs.getOrDefault(MARK, 0), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, null), (com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolRecord) fieldsNameValuePairs.getOrDefault(SCHOOL, null));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static StudentRecord buildWith(com.bayor.froporec.annotation.client.record.data1_allclassesannotated.Student student, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new StudentRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, student.getLastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, student.getAge()), (int) fieldsNameValuePairs.getOrDefault(MARK, student.getMark()), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, student.getGrade()), (com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolRecord) fieldsNameValuePairs.getOrDefault(SCHOOL, new com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolRecord(student.getSchool())));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static StudentRecord buildWith(com.bayor.froporec.annotation.client.record.data1_allclassesannotated.StudentRecord studentRecord, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new StudentRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, studentRecord.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, studentRecord.age()), (int) fieldsNameValuePairs.getOrDefault(MARK, studentRecord.mark()), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, studentRecord.grade()), (com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolRecord) fieldsNameValuePairs.getOrDefault(SCHOOL, studentRecord.school()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public StudentRecord with(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new StudentRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, this.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, this.age()), (int) fieldsNameValuePairs.getOrDefault(MARK, this.mark()), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, this.grade()), (com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolRecord) fieldsNameValuePairs.getOrDefault(SCHOOL, this.school()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public <T> StudentRecord with(String fieldName, T fieldValue) {
		return new StudentRecord(fieldName.equals(LASTNAME) ? (java.lang.String) fieldValue : this.lastname(), fieldName.equals(AGE) ? (int) fieldValue : this.age(), fieldName.equals(MARK) ? (int) fieldValue : this.mark(), fieldName.equals(GRADE) ? (java.lang.String) fieldValue : this.grade(), fieldName.equals(SCHOOL) ? (com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolRecord) fieldValue : this.school());
	}
}