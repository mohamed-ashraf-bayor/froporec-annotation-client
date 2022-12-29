package com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-12-28T21:36:09.4058807-05:00",
    comments = "version: 1.4"
)
public record StudentRecord(java.lang.String lastname, int age, int mark, java.lang.String grade, java.util.Set<com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.SchoolRecord> schools, java.util.List<com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.Person> friends, java.util.Map<com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.SchoolRecord, com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.Person> bestFriendBySchool)  {

	public static final String LASTNAME = "lastname"; // type: java.lang.String
	public static final String AGE = "age"; // type: int
	public static final String MARK = "mark"; // type: int
	public static final String GRADE = "grade"; // type: java.lang.String
	public static final String SCHOOLS = "schools"; // type: java.util.Set<com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.SchoolRecord>
	public static final String FRIENDS = "friends"; // type: java.util.List<com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.Person>
	public static final String BEST_FRIEND_BY_SCHOOL = "bestFriendBySchool"; // type: java.util.Map<com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.SchoolRecord, com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.Person>
	
	public StudentRecord(com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.Student student) {
		this(student.getLastname(), student.getAge(), student.getMark(), student.getGrade(), java.util.Optional.ofNullable(student.getSchools()).isEmpty() ? java.util.Set.of() : student.getSchools().stream().map(object -> new com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.SchoolRecord(object)).collect(java.util.stream.Collectors.toUnmodifiableSet()), java.util.Optional.ofNullable(student.getFriends()).isEmpty() ? java.util.List.of() : student.getFriends().stream().map(object -> (object)).collect(java.util.stream.Collectors.toUnmodifiableList()), java.util.Optional.ofNullable(student.getBestFriendBySchool()).isEmpty() ? java.util.Map.of() : student.getBestFriendBySchool().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> new com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.SchoolRecord(entry.getKey()), entry -> (entry.getValue()))));
	}

	public static StudentRecord buildWith(com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.Student student) {
		return new StudentRecord(student.getLastname(), student.getAge(), student.getMark(), student.getGrade(), java.util.Optional.ofNullable(student.getSchools()).isEmpty() ? java.util.Set.of() : student.getSchools().stream().map(object -> new com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.SchoolRecord(object)).collect(java.util.stream.Collectors.toUnmodifiableSet()), java.util.Optional.ofNullable(student.getFriends()).isEmpty() ? java.util.List.of() : student.getFriends().stream().map(object -> (object)).collect(java.util.stream.Collectors.toUnmodifiableList()), java.util.Optional.ofNullable(student.getBestFriendBySchool()).isEmpty() ? java.util.Map.of() : student.getBestFriendBySchool().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> new com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.SchoolRecord(entry.getKey()), entry -> (entry.getValue()))));
	}

	public static StudentRecord buildWith(com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.StudentRecord studentRecord) {
		return new StudentRecord(studentRecord.lastname(), studentRecord.age(), studentRecord.mark(), studentRecord.grade(), studentRecord.schools(), studentRecord.friends(), studentRecord.bestFriendBySchool());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static StudentRecord buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new StudentRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, null), (int) fieldsNameValuePairs.getOrDefault(AGE, 0), (int) fieldsNameValuePairs.getOrDefault(MARK, 0), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, null), (java.util.Set<com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.SchoolRecord>) fieldsNameValuePairs.getOrDefault(SCHOOLS, null), (java.util.List<com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.Person>) fieldsNameValuePairs.getOrDefault(FRIENDS, null), (java.util.Map<com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.SchoolRecord, com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.Person>) fieldsNameValuePairs.getOrDefault(BEST_FRIEND_BY_SCHOOL, null));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static StudentRecord buildWith(com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.Student student, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new StudentRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, student.getLastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, student.getAge()), (int) fieldsNameValuePairs.getOrDefault(MARK, student.getMark()), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, student.getGrade()), (java.util.Set<com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.SchoolRecord>) fieldsNameValuePairs.getOrDefault(SCHOOLS, java.util.Optional.ofNullable(student.getSchools()).isEmpty() ? java.util.Set.of() : student.getSchools().stream().map(object -> new com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.SchoolRecord(object)).collect(java.util.stream.Collectors.toUnmodifiableSet())), (java.util.List<com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.Person>) fieldsNameValuePairs.getOrDefault(FRIENDS, java.util.Optional.ofNullable(student.getFriends()).isEmpty() ? java.util.List.of() : student.getFriends().stream().map(object -> (object)).collect(java.util.stream.Collectors.toUnmodifiableList())), (java.util.Map<com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.SchoolRecord, com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.Person>) fieldsNameValuePairs.getOrDefault(BEST_FRIEND_BY_SCHOOL, java.util.Optional.ofNullable(student.getBestFriendBySchool()).isEmpty() ? java.util.Map.of() : student.getBestFriendBySchool().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> new com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.SchoolRecord(entry.getKey()), entry -> (entry.getValue())))));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static StudentRecord buildWith(com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.StudentRecord studentRecord, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new StudentRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, studentRecord.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, studentRecord.age()), (int) fieldsNameValuePairs.getOrDefault(MARK, studentRecord.mark()), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, studentRecord.grade()), (java.util.Set<com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.SchoolRecord>) fieldsNameValuePairs.getOrDefault(SCHOOLS, studentRecord.schools()), (java.util.List<com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.Person>) fieldsNameValuePairs.getOrDefault(FRIENDS, studentRecord.friends()), (java.util.Map<com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.SchoolRecord, com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.Person>) fieldsNameValuePairs.getOrDefault(BEST_FRIEND_BY_SCHOOL, studentRecord.bestFriendBySchool()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public StudentRecord with(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new StudentRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, this.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, this.age()), (int) fieldsNameValuePairs.getOrDefault(MARK, this.mark()), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, this.grade()), (java.util.Set<com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.SchoolRecord>) fieldsNameValuePairs.getOrDefault(SCHOOLS, this.schools()), (java.util.List<com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.Person>) fieldsNameValuePairs.getOrDefault(FRIENDS, this.friends()), (java.util.Map<com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.SchoolRecord, com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.Person>) fieldsNameValuePairs.getOrDefault(BEST_FRIEND_BY_SCHOOL, this.bestFriendBySchool()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public <T> StudentRecord with(String fieldName, T fieldValue) {
		return new StudentRecord(fieldName.equals(LASTNAME) ? (java.lang.String) fieldValue : this.lastname(), fieldName.equals(AGE) ? (int) fieldValue : this.age(), fieldName.equals(MARK) ? (int) fieldValue : this.mark(), fieldName.equals(GRADE) ? (java.lang.String) fieldValue : this.grade(), fieldName.equals(SCHOOLS) ? (java.util.Set<com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.SchoolRecord>) fieldValue : this.schools(), fieldName.equals(FRIENDS) ? (java.util.List<com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.Person>) fieldValue : this.friends(), fieldName.equals(BEST_FRIEND_BY_SCHOOL) ? (java.util.Map<com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.SchoolRecord, com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.Person>) fieldValue : this.bestFriendBySchool());
	}
}