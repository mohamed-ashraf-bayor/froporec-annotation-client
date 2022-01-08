package com.bayor.froporec.annotation.client.generateimmutable.data5_collections_partiallyannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T16:18:17.4487975-05:00",
    comments = "version: 1.2"
)
public record ImmutableStudent(java.lang.String name, int age, int mark, java.lang.String grade, java.util.Set<com.bayor.froporec.annotation.client.generateimmutable.data5_collections_partiallyannotated.ImmutableSchool> schools, java.util.List<com.bayor.froporec.annotation.client.generateimmutable.data5_collections_partiallyannotated.Person> friends, java.util.Map<com.bayor.froporec.annotation.client.generateimmutable.data5_collections_partiallyannotated.ImmutableSchool, com.bayor.froporec.annotation.client.generateimmutable.data5_collections_partiallyannotated.Person> bestFriendBySchool) {
	public ImmutableStudent(com.bayor.froporec.annotation.client.generateimmutable.data5_collections_partiallyannotated.Student student) {
		this(student.name(), student.age(), student.mark(), student.grade(), java.util.Optional.ofNullable(student.schools()).isEmpty() ? java.util.Set.of() : student.schools().stream().map(object -> new com.bayor.froporec.annotation.client.generateimmutable.data5_collections_partiallyannotated.ImmutableSchool(object)).collect(java.util.stream.Collectors.toUnmodifiableSet()), java.util.Optional.ofNullable(student.friends()).isEmpty() ? java.util.List.of() : student.friends().stream().map(object -> (object)).collect(java.util.stream.Collectors.toUnmodifiableList()), java.util.Optional.ofNullable(student.bestFriendBySchool()).isEmpty() ? java.util.Map.of() : student.bestFriendBySchool().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> new com.bayor.froporec.annotation.client.generateimmutable.data5_collections_partiallyannotated.ImmutableSchool(entry.getKey()), entry -> (entry.getValue()))));
	}
}
