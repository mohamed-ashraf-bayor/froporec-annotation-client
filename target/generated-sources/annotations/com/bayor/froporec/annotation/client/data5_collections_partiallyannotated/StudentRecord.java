package com.bayor.froporec.annotation.client.data5_collections_partiallyannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.GenerateRecordProcessor",
    date = "2021-12-13T15:13:47.0465629-05:00",
    comments = "version: 1.1"
)
public record StudentRecord(java.lang.String lastname, int age, int mark, java.lang.String grade, java.util.Set<com.bayor.froporec.annotation.client.data5_collections_partiallyannotated.SchoolRecord> schools, java.util.List<com.bayor.froporec.annotation.client.data5_collections_partiallyannotated.Person> friends, java.util.Map<com.bayor.froporec.annotation.client.data5_collections_partiallyannotated.SchoolRecord, com.bayor.froporec.annotation.client.data5_collections_partiallyannotated.Person> bestFriendBySchool) {
	public StudentRecord(com.bayor.froporec.annotation.client.data5_collections_partiallyannotated.Student student) {
		this(student.getLastname(), student.getAge(), student.getMark(), student.getGrade(), student.getSchools().stream().map(object -> new com.bayor.froporec.annotation.client.data5_collections_partiallyannotated.SchoolRecord(object)).collect(java.util.stream.Collectors.toUnmodifiableSet()), student.getFriends().stream().map(object -> (object)).collect(java.util.stream.Collectors.toUnmodifiableList()), student.getBestFriendBySchool().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> new com.bayor.froporec.annotation.client.data5_collections_partiallyannotated.SchoolRecord(entry.getKey()), entry -> (entry.getValue()))));
	}
}
