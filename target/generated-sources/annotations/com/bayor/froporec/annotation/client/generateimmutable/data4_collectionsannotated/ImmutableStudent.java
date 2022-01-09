package com.bayor.froporec.annotation.client.generateimmutable.data4_collectionsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T19:19:31.2180959-05:00",
    comments = "version: 1.2"
)
public record ImmutableStudent(int mark, java.lang.String grade, java.util.Set<com.bayor.froporec.annotation.client.generateimmutable.data4_collectionsannotated.ImmutableSchool> schools, java.util.List<com.bayor.froporec.annotation.client.generateimmutable.data4_collectionsannotated.ImmutablePerson> friends, java.util.Map<com.bayor.froporec.annotation.client.generateimmutable.data4_collectionsannotated.ImmutableSchool, com.bayor.froporec.annotation.client.generateimmutable.data4_collectionsannotated.ImmutablePerson> bestFriendBySchool, java.lang.String lastname, int age) {
	public ImmutableStudent(com.bayor.froporec.annotation.client.generateimmutable.data4_collectionsannotated.Student student) {
		this(student.mark(), student.grade(), java.util.Optional.ofNullable(student.schools()).isEmpty() ? java.util.Set.of() : student.schools().stream().map(object -> new com.bayor.froporec.annotation.client.generateimmutable.data4_collectionsannotated.ImmutableSchool(object)).collect(java.util.stream.Collectors.toUnmodifiableSet()), java.util.Optional.ofNullable(student.friends()).isEmpty() ? java.util.List.of() : student.friends().stream().map(object -> new com.bayor.froporec.annotation.client.generateimmutable.data4_collectionsannotated.ImmutablePerson(object)).collect(java.util.stream.Collectors.toUnmodifiableList()), java.util.Optional.ofNullable(student.bestFriendBySchool()).isEmpty() ? java.util.Map.of() : student.bestFriendBySchool().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> new com.bayor.froporec.annotation.client.generateimmutable.data4_collectionsannotated.ImmutableSchool(entry.getKey()), entry -> new com.bayor.froporec.annotation.client.generateimmutable.data4_collectionsannotated.ImmutablePerson(entry.getValue()))), student.lastname(), student.age());
	}
}
