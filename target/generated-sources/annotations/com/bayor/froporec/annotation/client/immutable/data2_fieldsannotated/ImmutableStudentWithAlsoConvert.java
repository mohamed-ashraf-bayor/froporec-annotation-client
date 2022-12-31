package com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-12-30T21:03:44.1585553-05:00",
    comments = "version: 1.4"
)
public record ImmutableStudentWithAlsoConvert(int mark, java.lang.String grade, com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool school, java.lang.String lastname, int age)  {

	public static final String MARK = "mark"; // type: int
	public static final String GRADE = "grade"; // type: java.lang.String
	public static final String SCHOOL = "school"; // type: com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool
	public static final String LASTNAME = "lastname"; // type: java.lang.String
	public static final String AGE = "age"; // type: int
	
	public ImmutableStudentWithAlsoConvert(com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.StudentWithAlsoConvert studentWithAlsoConvert) {
		this(studentWithAlsoConvert.mark(), studentWithAlsoConvert.grade(), new com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool(studentWithAlsoConvert.school()), studentWithAlsoConvert.lastname(), studentWithAlsoConvert.age());
	}

	public static ImmutableStudentWithAlsoConvert buildWith(com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.StudentWithAlsoConvert studentWithAlsoConvert) {
		return new ImmutableStudentWithAlsoConvert(studentWithAlsoConvert.mark(), studentWithAlsoConvert.grade(), new com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool(studentWithAlsoConvert.school()), studentWithAlsoConvert.lastname(), studentWithAlsoConvert.age());
	}

	public static ImmutableStudentWithAlsoConvert buildWith(com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableStudentWithAlsoConvert immutableStudentWithAlsoConvert) {
		return new ImmutableStudentWithAlsoConvert(immutableStudentWithAlsoConvert.mark(), immutableStudentWithAlsoConvert.grade(), immutableStudentWithAlsoConvert.school(), immutableStudentWithAlsoConvert.lastname(), immutableStudentWithAlsoConvert.age());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableStudentWithAlsoConvert buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableStudentWithAlsoConvert((int) fieldsNameValuePairs.getOrDefault(MARK, 0), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, null), (com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool) fieldsNameValuePairs.getOrDefault(SCHOOL, null), (java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, null), (int) fieldsNameValuePairs.getOrDefault(AGE, 0));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableStudentWithAlsoConvert buildWith(com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.StudentWithAlsoConvert studentWithAlsoConvert, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableStudentWithAlsoConvert((int) fieldsNameValuePairs.getOrDefault(MARK, studentWithAlsoConvert.mark()), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, studentWithAlsoConvert.grade()), (com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool) fieldsNameValuePairs.getOrDefault(SCHOOL, new com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool(studentWithAlsoConvert.school())), (java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, studentWithAlsoConvert.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, studentWithAlsoConvert.age()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableStudentWithAlsoConvert buildWith(com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableStudentWithAlsoConvert immutableStudentWithAlsoConvert, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableStudentWithAlsoConvert((int) fieldsNameValuePairs.getOrDefault(MARK, immutableStudentWithAlsoConvert.mark()), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, immutableStudentWithAlsoConvert.grade()), (com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool) fieldsNameValuePairs.getOrDefault(SCHOOL, immutableStudentWithAlsoConvert.school()), (java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, immutableStudentWithAlsoConvert.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, immutableStudentWithAlsoConvert.age()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public ImmutableStudentWithAlsoConvert with(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableStudentWithAlsoConvert((int) fieldsNameValuePairs.getOrDefault(MARK, this.mark()), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, this.grade()), (com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool) fieldsNameValuePairs.getOrDefault(SCHOOL, this.school()), (java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, this.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, this.age()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public <T> ImmutableStudentWithAlsoConvert with(String fieldName, T fieldValue) {
		return new ImmutableStudentWithAlsoConvert(fieldName.equals(MARK) ? (int) fieldValue : this.mark(), fieldName.equals(GRADE) ? (java.lang.String) fieldValue : this.grade(), fieldName.equals(SCHOOL) ? (com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool) fieldValue : this.school(), fieldName.equals(LASTNAME) ? (java.lang.String) fieldValue : this.lastname(), fieldName.equals(AGE) ? (int) fieldValue : this.age());
	}
}