package com.bayor.froporec.annotation.client.generateimmutable.data4_collectionsannotated;

import org.froporec.GenerateImmutable;

import java.util.List;
import java.util.Map;
import java.util.Set;

@GenerateImmutable
public record Student(int mark, String grade, Set<School> schools, List<Person> friends,
                     Map<School, Person> bestFriendBySchool, String lastname, int age) {
}