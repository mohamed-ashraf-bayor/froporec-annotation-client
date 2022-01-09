package com.bayor.froporec.annotation.client.mixed;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T19:19:31.259985-05:00",
    comments = "version: 1.2"
)
public record ImmutableStudent(int mark, java.lang.String grade, java.lang.String lastname, int age, java.util.Set<com.bayor.froporec.annotation.client.mixed.ImmutableSchool> schools, java.util.List<com.bayor.froporec.annotation.client.mixed.PersonRecord> friends, java.util.Map<com.bayor.froporec.annotation.client.mixed.ImmutableSchool, com.bayor.froporec.annotation.client.mixed.PersonRecord> bestFriendBySchool) {
	public ImmutableStudent(com.bayor.froporec.annotation.client.mixed.Student student) {
		this(student.mark(), student.grade(), student.lastname(), student.age(), java.util.Optional.ofNullable(student.schools()).isEmpty() ? java.util.Set.of() : student.schools().stream().map(object -> new com.bayor.froporec.annotation.client.mixed.ImmutableSchool(object)).collect(java.util.stream.Collectors.toUnmodifiableSet()), java.util.Optional.ofNullable(student.friends()).isEmpty() ? java.util.List.of() : student.friends().stream().map(object -> new com.bayor.froporec.annotation.client.mixed.PersonRecord(object)).collect(java.util.stream.Collectors.toUnmodifiableList()), java.util.Optional.ofNullable(student.bestFriendBySchool()).isEmpty() ? java.util.Map.of() : student.bestFriendBySchool().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> new com.bayor.froporec.annotation.client.mixed.ImmutableSchool(entry.getKey()), entry -> new com.bayor.froporec.annotation.client.mixed.PersonRecord(entry.getValue()))));
	}
}
