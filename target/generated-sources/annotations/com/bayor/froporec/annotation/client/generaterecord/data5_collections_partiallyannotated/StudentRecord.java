package com.bayor.froporec.annotation.client.generaterecord.data5_collections_partiallyannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T19:19:31.2001459-05:00",
    comments = "version: 1.2"
)
public record StudentRecord(java.lang.String lastname, int age, int mark, java.lang.String grade, java.util.Set<com.bayor.froporec.annotation.client.generaterecord.data5_collections_partiallyannotated.SchoolRecord> schools, java.util.List<com.bayor.froporec.annotation.client.generaterecord.data5_collections_partiallyannotated.Person> friends, java.util.Map<com.bayor.froporec.annotation.client.generaterecord.data5_collections_partiallyannotated.SchoolRecord, com.bayor.froporec.annotation.client.generaterecord.data5_collections_partiallyannotated.Person> bestFriendBySchool) {
	public StudentRecord(com.bayor.froporec.annotation.client.generaterecord.data5_collections_partiallyannotated.Student student) {
		this(student.getLastname(), student.getAge(), student.getMark(), student.getGrade(), java.util.Optional.ofNullable(student.getSchools()).isEmpty() ? java.util.Set.of() : student.getSchools().stream().map(object -> new com.bayor.froporec.annotation.client.generaterecord.data5_collections_partiallyannotated.SchoolRecord(object)).collect(java.util.stream.Collectors.toUnmodifiableSet()), java.util.Optional.ofNullable(student.getFriends()).isEmpty() ? java.util.List.of() : student.getFriends().stream().map(object -> (object)).collect(java.util.stream.Collectors.toUnmodifiableList()), java.util.Optional.ofNullable(student.getBestFriendBySchool()).isEmpty() ? java.util.Map.of() : student.getBestFriendBySchool().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> new com.bayor.froporec.annotation.client.generaterecord.data5_collections_partiallyannotated.SchoolRecord(entry.getKey()), entry -> (entry.getValue()))));
	}
}
