package com.bayor.froporec.annotation.client.generaterecord.data4_collectionsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T16:18:17.3749963-05:00",
    comments = "version: 1.2"
)
public record StudentRecord(java.lang.String lastname, int age, int mark, java.lang.String grade, java.util.Set<com.bayor.froporec.annotation.client.generaterecord.data4_collectionsannotated.SchoolRecord> schools, java.util.List<com.bayor.froporec.annotation.client.generaterecord.data4_collectionsannotated.PersonRecord> friends, java.util.Map<com.bayor.froporec.annotation.client.generaterecord.data4_collectionsannotated.SchoolRecord, com.bayor.froporec.annotation.client.generaterecord.data4_collectionsannotated.PersonRecord> bestFriendBySchool) {
	public StudentRecord(com.bayor.froporec.annotation.client.generaterecord.data4_collectionsannotated.Student student) {
		this(student.getLastname(), student.getAge(), student.getMark(), student.getGrade(), java.util.Optional.ofNullable(student.getSchools()).isEmpty() ? java.util.Set.of() : student.getSchools().stream().map(object -> new com.bayor.froporec.annotation.client.generaterecord.data4_collectionsannotated.SchoolRecord(object)).collect(java.util.stream.Collectors.toUnmodifiableSet()), java.util.Optional.ofNullable(student.getFriends()).isEmpty() ? java.util.List.of() : student.getFriends().stream().map(object -> new com.bayor.froporec.annotation.client.generaterecord.data4_collectionsannotated.PersonRecord(object)).collect(java.util.stream.Collectors.toUnmodifiableList()), java.util.Optional.ofNullable(student.getBestFriendBySchool()).isEmpty() ? java.util.Map.of() : student.getBestFriendBySchool().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> new com.bayor.froporec.annotation.client.generaterecord.data4_collectionsannotated.SchoolRecord(entry.getKey()), entry -> new com.bayor.froporec.annotation.client.generaterecord.data4_collectionsannotated.PersonRecord(entry.getValue()))));
	}
}
