package com.bayor.froporec.annotation.client.generateimmutable.data5_collections_partiallyannotated;

import org.froporec.GenerateImmutable;

import java.util.List;
import java.util.Map;
import java.util.Set;

@GenerateImmutable
public record Student(String name, int age, int mark, String grade, Set<School> schools, List<Person> friends,
                      Map<School, Person> bestFriendBySchool) {
}