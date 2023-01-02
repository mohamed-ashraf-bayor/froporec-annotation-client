package com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2023-01-02T14:58:47.6190304-05:00",
    comments = "version: 1.4"
)
public record ImmutableStudent(int mark, java.lang.String grade, com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool school, java.lang.String lastname, int age)  {

	public static final String MARK = "mark"; // type: int
	public static final String GRADE = "grade"; // type: java.lang.String
	public static final String SCHOOL = "school"; // type: com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool
	public static final String LASTNAME = "lastname"; // type: java.lang.String
	public static final String AGE = "age"; // type: int
	
	public ImmutableStudent(com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.Student student) {
		this(student.mark(), student.grade(), new com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool(student.school()), student.lastname(), student.age());
	}

	public static ImmutableStudent buildWith(com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.Student student) {
		return new ImmutableStudent(student.mark(), student.grade(), new com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool(student.school()), student.lastname(), student.age());
	}

	public static ImmutableStudent buildWith(com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableStudent immutableStudent) {
		return new ImmutableStudent(immutableStudent.mark(), immutableStudent.grade(), immutableStudent.school(), immutableStudent.lastname(), immutableStudent.age());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableStudent buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableStudent((int) fieldsNameValuePairs.getOrDefault(MARK, 0), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, null), (com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool) fieldsNameValuePairs.getOrDefault(SCHOOL, null), (java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, null), (int) fieldsNameValuePairs.getOrDefault(AGE, 0));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableStudent buildWith(com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.Student student, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableStudent((int) fieldsNameValuePairs.getOrDefault(MARK, student.mark()), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, student.grade()), (com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool) fieldsNameValuePairs.getOrDefault(SCHOOL, new com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool(student.school())), (java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, student.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, student.age()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableStudent buildWith(com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableStudent immutableStudent, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableStudent((int) fieldsNameValuePairs.getOrDefault(MARK, immutableStudent.mark()), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, immutableStudent.grade()), (com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool) fieldsNameValuePairs.getOrDefault(SCHOOL, immutableStudent.school()), (java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, immutableStudent.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, immutableStudent.age()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public ImmutableStudent with(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableStudent((int) fieldsNameValuePairs.getOrDefault(MARK, this.mark()), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, this.grade()), (com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool) fieldsNameValuePairs.getOrDefault(SCHOOL, this.school()), (java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, this.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, this.age()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public <T> ImmutableStudent with(String fieldName, T fieldValue) {
		return new ImmutableStudent(fieldName.equals(MARK) ? (int) fieldValue : this.mark(), fieldName.equals(GRADE) ? (java.lang.String) fieldValue : this.grade(), fieldName.equals(SCHOOL) ? (com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool) fieldValue : this.school(), fieldName.equals(LASTNAME) ? (java.lang.String) fieldValue : this.lastname(), fieldName.equals(AGE) ? (int) fieldValue : this.age());
	}
}