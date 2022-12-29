package com.bayor.froporec.annotation.client.immutable.data5_collections_partiallyannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-12-28T21:36:09.4908821-05:00",
    comments = "version: 1.4"
)
public record ImmutableStudent(java.lang.String name, int age, int mark, java.lang.String grade, java.util.Set<?> schools, java.util.List<?> friends, java.util.Map<?, ?> bestFriendBySchool)  {

	public static final String NAME = "name"; // type: java.lang.String
	public static final String AGE = "age"; // type: int
	public static final String MARK = "mark"; // type: int
	public static final String GRADE = "grade"; // type: java.lang.String
	public static final String SCHOOLS = "schools"; // type: java.util.Set<?>
	public static final String FRIENDS = "friends"; // type: java.util.List<?>
	public static final String BEST_FRIEND_BY_SCHOOL = "bestFriendBySchool"; // type: java.util.Map<?, ?>
	
	public ImmutableStudent(com.bayor.froporec.annotation.client.immutable.data5_collections_partiallyannotated.Student student) {
		this(student.name(), student.age(), student.mark(), student.grade(), java.util.Optional.ofNullable(student.schools()).isEmpty() ? java.util.Set.of() : student.schools().stream().map(object -> (object)).collect(java.util.stream.Collectors.toUnmodifiableSet()), java.util.Optional.ofNullable(student.friends()).isEmpty() ? java.util.List.of() : student.friends().stream().map(object -> (object)).collect(java.util.stream.Collectors.toUnmodifiableList()), java.util.Optional.ofNullable(student.bestFriendBySchool()).isEmpty() ? java.util.Map.of() : student.bestFriendBySchool().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> (entry.getKey()), entry -> (entry.getValue()))));
	}

	public static ImmutableStudent buildWith(com.bayor.froporec.annotation.client.immutable.data5_collections_partiallyannotated.Student student) {
		return new ImmutableStudent(student.name(), student.age(), student.mark(), student.grade(), java.util.Optional.ofNullable(student.schools()).isEmpty() ? java.util.Set.of() : student.schools().stream().map(object -> (object)).collect(java.util.stream.Collectors.toUnmodifiableSet()), java.util.Optional.ofNullable(student.friends()).isEmpty() ? java.util.List.of() : student.friends().stream().map(object -> (object)).collect(java.util.stream.Collectors.toUnmodifiableList()), java.util.Optional.ofNullable(student.bestFriendBySchool()).isEmpty() ? java.util.Map.of() : student.bestFriendBySchool().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> (entry.getKey()), entry -> (entry.getValue()))));
	}

	public static ImmutableStudent buildWith(com.bayor.froporec.annotation.client.immutable.data5_collections_partiallyannotated.ImmutableStudent immutableStudent) {
		return new ImmutableStudent(immutableStudent.name(), immutableStudent.age(), immutableStudent.mark(), immutableStudent.grade(), immutableStudent.schools(), immutableStudent.friends(), immutableStudent.bestFriendBySchool());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableStudent buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableStudent((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, null), (int) fieldsNameValuePairs.getOrDefault(AGE, 0), (int) fieldsNameValuePairs.getOrDefault(MARK, 0), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, null), (java.util.Set<?>) fieldsNameValuePairs.getOrDefault(SCHOOLS, null), (java.util.List<?>) fieldsNameValuePairs.getOrDefault(FRIENDS, null), (java.util.Map<?, ?>) fieldsNameValuePairs.getOrDefault(BEST_FRIEND_BY_SCHOOL, null));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableStudent buildWith(com.bayor.froporec.annotation.client.immutable.data5_collections_partiallyannotated.Student student, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableStudent((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, student.name()), (int) fieldsNameValuePairs.getOrDefault(AGE, student.age()), (int) fieldsNameValuePairs.getOrDefault(MARK, student.mark()), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, student.grade()), (java.util.Set<?>) fieldsNameValuePairs.getOrDefault(SCHOOLS, java.util.Optional.ofNullable(student.schools()).isEmpty() ? java.util.Set.of() : student.schools().stream().map(object -> (object)).collect(java.util.stream.Collectors.toUnmodifiableSet())), (java.util.List<?>) fieldsNameValuePairs.getOrDefault(FRIENDS, java.util.Optional.ofNullable(student.friends()).isEmpty() ? java.util.List.of() : student.friends().stream().map(object -> (object)).collect(java.util.stream.Collectors.toUnmodifiableList())), (java.util.Map<?, ?>) fieldsNameValuePairs.getOrDefault(BEST_FRIEND_BY_SCHOOL, java.util.Optional.ofNullable(student.bestFriendBySchool()).isEmpty() ? java.util.Map.of() : student.bestFriendBySchool().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> (entry.getKey()), entry -> (entry.getValue())))));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableStudent buildWith(com.bayor.froporec.annotation.client.immutable.data5_collections_partiallyannotated.ImmutableStudent immutableStudent, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableStudent((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, immutableStudent.name()), (int) fieldsNameValuePairs.getOrDefault(AGE, immutableStudent.age()), (int) fieldsNameValuePairs.getOrDefault(MARK, immutableStudent.mark()), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, immutableStudent.grade()), (java.util.Set<?>) fieldsNameValuePairs.getOrDefault(SCHOOLS, immutableStudent.schools()), (java.util.List<?>) fieldsNameValuePairs.getOrDefault(FRIENDS, immutableStudent.friends()), (java.util.Map<?, ?>) fieldsNameValuePairs.getOrDefault(BEST_FRIEND_BY_SCHOOL, immutableStudent.bestFriendBySchool()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public ImmutableStudent with(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableStudent((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, this.name()), (int) fieldsNameValuePairs.getOrDefault(AGE, this.age()), (int) fieldsNameValuePairs.getOrDefault(MARK, this.mark()), (java.lang.String) fieldsNameValuePairs.getOrDefault(GRADE, this.grade()), (java.util.Set<?>) fieldsNameValuePairs.getOrDefault(SCHOOLS, this.schools()), (java.util.List<?>) fieldsNameValuePairs.getOrDefault(FRIENDS, this.friends()), (java.util.Map<?, ?>) fieldsNameValuePairs.getOrDefault(BEST_FRIEND_BY_SCHOOL, this.bestFriendBySchool()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public <T> ImmutableStudent with(String fieldName, T fieldValue) {
		return new ImmutableStudent(fieldName.equals(NAME) ? (java.lang.String) fieldValue : this.name(), fieldName.equals(AGE) ? (int) fieldValue : this.age(), fieldName.equals(MARK) ? (int) fieldValue : this.mark(), fieldName.equals(GRADE) ? (java.lang.String) fieldValue : this.grade(), fieldName.equals(SCHOOLS) ? (java.util.Set<?>) fieldValue : this.schools(), fieldName.equals(FRIENDS) ? (java.util.List<?>) fieldValue : this.friends(), fieldName.equals(BEST_FRIEND_BY_SCHOOL) ? (java.util.Map<?, ?>) fieldValue : this.bestFriendBySchool());
	}
}