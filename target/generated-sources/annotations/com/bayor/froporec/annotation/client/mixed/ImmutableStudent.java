package com.bayor.froporec.annotation.client.mixed;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2023-01-02T14:58:47.5650271-05:00",
    comments = "version: 1.4"
)
public record ImmutableStudent(int mark, java.lang.String grade, java.lang.String lastname, int age, java.util.Set<com.bayor.froporec.annotation.client.mixed.ImmutableSchool> schools, java.util.List<com.bayor.froporec.annotation.client.mixed.PersonRecord> friends, java.util.Map<com.bayor.froporec.annotation.client.mixed.ImmutableSchool, com.bayor.froporec.annotation.client.mixed.PersonRecord> bestFriendBySchool)  {

	public static final String MARK = "mark"; // type: int
	public static final String GRADE = "grade"; // type: java.lang.String
	public static final String LASTNAME = "lastname"; // type: java.lang.String
	public static final String AGE = "age"; // type: int
	public static final String SCHOOLS = "schools"; // type: java.util.Set<com.bayor.froporec.annotation.client.mixed.ImmutableSchool>
	public static final String FRIENDS = "friends"; // type: java.util.List<com.bayor.froporec.annotation.client.mixed.PersonRecord>
	public static final String BEST_FRIEND_BY_SCHOOL = "bestFriendBySchool"; // type: java.util.Map<com.bayor.froporec.annotation.client.mixed.ImmutableSchool, com.bayor.froporec.annotation.client.mixed.PersonRecord>
	
	public ImmutableStudent(com.bayor.froporec.annotation.client.mixed.Student student) {
		this(student.mark(), student.grade(), student.lastname(), student.age(), java.util.Optional.ofNullable(student.schools()).isEmpty() ? java.util.Set.of() : student.schools().stream().map(object -> new com.bayor.froporec.annotation.client.mixed.ImmutableSchool(object)).collect(java.util.stream.Collectors.toUnmodifiableSet()), java.util.Optional.ofNullable(student.friends()).isEmpty() ? java.util.List.of() : student.friends().stream().map(object -> new com.bayor.froporec.annotation.client.mixed.PersonRecord(object)).collect(java.util.stream.Collectors.toUnmodifiableList()), java.util.Optional.ofNullable(student.bestFriendBySchool()).isEmpty() ? java.util.Map.of() : student.bestFriendBySchool().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> new com.bayor.froporec.annotation.client.mixed.ImmutableSchool(entry.getKey()), entry -> new com.bayor.froporec.annotation.client.mixed.PersonRecord(entry.getValue()))));
	}

	public static ImmutableStudent buildWith(com.bayor.froporec.annotation.client.mixed.Student student) {
		return new ImmutableStudent(student.mark(), student.grade(), student.lastname(), student.age(), java.util.Optional.ofNullable(student.schools()).isEmpty() ? java.util.Set.of() : student.schools().stream().map(object -> new com.bayor.froporec.annotation.client.mixed.ImmutableSchool(object)).collect(java.util.stream.Collectors.toUnmodifiableSet()), java.util.Optional.ofNullable(student.friends()).isEmpty() ? java.util.List.of() : student.friends().stream().map(object -> new com.bayor.froporec.annotation.client.mixed.PersonRecord(object)).collect(java.util.stream.Collectors.toUnmodifiableList()), java.util.Optional.ofNullable(student.bestFriendBySchool()).isEmpty() ? java.util.Map.of() : student.bestFriendBySchool().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> new com.bayor.froporec.annotation.client.mixed.ImmutableSchool(entry.getKey()), entry -> new com.bayor.froporec.annotation.client.mixed.PersonRecord(entry.getValue()))));
	}

	public static ImmutableStudent buildWith(com.bayor.froporec.annotation.client.mixed.ImmutableStudent immutableStudent) {
		return new ImmutableStudent(immutableStudent.mark(), immutableStudent.grade(), immutableStudent.lastname(), immutableStudent.age(), immutableStudent.schools(), immutableStudent.friends(), immutableStudent.bestFriendBySchool());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableStudent buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableStudent((int) fieldsNameValuePairs.getOrDefault(MARK, 0), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, null), (java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, null), (int) fieldsNameValuePairs.getOrDefault(AGE, 0), (java.util.Set<com.bayor.froporec.annotation.client.mixed.ImmutableSchool>) fieldsNameValuePairs.getOrDefault(SCHOOLS, null), (java.util.List<com.bayor.froporec.annotation.client.mixed.PersonRecord>) fieldsNameValuePairs.getOrDefault(FRIENDS, null), (java.util.Map<com.bayor.froporec.annotation.client.mixed.ImmutableSchool, com.bayor.froporec.annotation.client.mixed.PersonRecord>) fieldsNameValuePairs.getOrDefault(BEST_FRIEND_BY_SCHOOL, null));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableStudent buildWith(com.bayor.froporec.annotation.client.mixed.Student student, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableStudent((int) fieldsNameValuePairs.getOrDefault(MARK, student.mark()), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, student.grade()), (java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, student.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, student.age()), (java.util.Set<com.bayor.froporec.annotation.client.mixed.ImmutableSchool>) fieldsNameValuePairs.getOrDefault(SCHOOLS, java.util.Optional.ofNullable(student.schools()).isEmpty() ? java.util.Set.of() : student.schools().stream().map(object -> new com.bayor.froporec.annotation.client.mixed.ImmutableSchool(object)).collect(java.util.stream.Collectors.toUnmodifiableSet())), (java.util.List<com.bayor.froporec.annotation.client.mixed.PersonRecord>) fieldsNameValuePairs.getOrDefault(FRIENDS, java.util.Optional.ofNullable(student.friends()).isEmpty() ? java.util.List.of() : student.friends().stream().map(object -> new com.bayor.froporec.annotation.client.mixed.PersonRecord(object)).collect(java.util.stream.Collectors.toUnmodifiableList())), (java.util.Map<com.bayor.froporec.annotation.client.mixed.ImmutableSchool, com.bayor.froporec.annotation.client.mixed.PersonRecord>) fieldsNameValuePairs.getOrDefault(BEST_FRIEND_BY_SCHOOL, java.util.Optional.ofNullable(student.bestFriendBySchool()).isEmpty() ? java.util.Map.of() : student.bestFriendBySchool().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> new com.bayor.froporec.annotation.client.mixed.ImmutableSchool(entry.getKey()), entry -> new com.bayor.froporec.annotation.client.mixed.PersonRecord(entry.getValue())))));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableStudent buildWith(com.bayor.froporec.annotation.client.mixed.ImmutableStudent immutableStudent, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableStudent((int) fieldsNameValuePairs.getOrDefault(MARK, immutableStudent.mark()), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, immutableStudent.grade()), (java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, immutableStudent.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, immutableStudent.age()), (java.util.Set<com.bayor.froporec.annotation.client.mixed.ImmutableSchool>) fieldsNameValuePairs.getOrDefault(SCHOOLS, immutableStudent.schools()), (java.util.List<com.bayor.froporec.annotation.client.mixed.PersonRecord>) fieldsNameValuePairs.getOrDefault(FRIENDS, immutableStudent.friends()), (java.util.Map<com.bayor.froporec.annotation.client.mixed.ImmutableSchool, com.bayor.froporec.annotation.client.mixed.PersonRecord>) fieldsNameValuePairs.getOrDefault(BEST_FRIEND_BY_SCHOOL, immutableStudent.bestFriendBySchool()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public ImmutableStudent with(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableStudent((int) fieldsNameValuePairs.getOrDefault(MARK, this.mark()), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, this.grade()), (java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, this.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, this.age()), (java.util.Set<com.bayor.froporec.annotation.client.mixed.ImmutableSchool>) fieldsNameValuePairs.getOrDefault(SCHOOLS, this.schools()), (java.util.List<com.bayor.froporec.annotation.client.mixed.PersonRecord>) fieldsNameValuePairs.getOrDefault(FRIENDS, this.friends()), (java.util.Map<com.bayor.froporec.annotation.client.mixed.ImmutableSchool, com.bayor.froporec.annotation.client.mixed.PersonRecord>) fieldsNameValuePairs.getOrDefault(BEST_FRIEND_BY_SCHOOL, this.bestFriendBySchool()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public <T> ImmutableStudent with(String fieldName, T fieldValue) {
		return new ImmutableStudent(fieldName.equals(MARK) ? (int) fieldValue : this.mark(), fieldName.equals(GRADE) ? (java.lang.String) fieldValue : this.grade(), fieldName.equals(LASTNAME) ? (java.lang.String) fieldValue : this.lastname(), fieldName.equals(AGE) ? (int) fieldValue : this.age(), fieldName.equals(SCHOOLS) ? (java.util.Set<com.bayor.froporec.annotation.client.mixed.ImmutableSchool>) fieldValue : this.schools(), fieldName.equals(FRIENDS) ? (java.util.List<com.bayor.froporec.annotation.client.mixed.PersonRecord>) fieldValue : this.friends(), fieldName.equals(BEST_FRIEND_BY_SCHOOL) ? (java.util.Map<com.bayor.froporec.annotation.client.mixed.ImmutableSchool, com.bayor.froporec.annotation.client.mixed.PersonRecord>) fieldValue : this.bestFriendBySchool());
	}
}