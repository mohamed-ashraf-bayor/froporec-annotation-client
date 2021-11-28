package com.bayor.froporec.annotation.client.data4_collectionsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.GenerateRecordProcessor",
    date = "2021-11-27T23:20:55.6621358-05:00",
    comments = "version: 1.1"
)
public record StudentRecord(java.lang.String lastname, int age, int mark, java.lang.String grade, java.util.Set<com.bayor.froporec.annotation.client.data4_collectionsannotated.SchoolRecord> schools, java.util.List<com.bayor.froporec.annotation.client.data4_collectionsannotated.PersonRecord> friends, java.util.Map<com.bayor.froporec.annotation.client.data4_collectionsannotated.SchoolRecord, com.bayor.froporec.annotation.client.data4_collectionsannotated.PersonRecord> bestFriendBySchool) {
	public StudentRecord(com.bayor.froporec.annotation.client.data4_collectionsannotated.Student student) {
		this(student.getLastname(), student.getAge(), student.getMark(), student.getGrade(), student.getSchools().stream().map(object -> new com.bayor.froporec.annotation.client.data4_collectionsannotated.SchoolRecord(object)).collect(java.util.stream.Collectors.toUnmodifiableSet()), student.getFriends().stream().map(object -> new com.bayor.froporec.annotation.client.data4_collectionsannotated.PersonRecord(object)).collect(java.util.stream.Collectors.toUnmodifiableList()), student.getBestFriendBySchool().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> new com.bayor.froporec.annotation.client.data4_collectionsannotated.SchoolRecord(entry.getKey()), entry -> new com.bayor.froporec.annotation.client.data4_collectionsannotated.PersonRecord(entry.getValue()))));
	}
}
