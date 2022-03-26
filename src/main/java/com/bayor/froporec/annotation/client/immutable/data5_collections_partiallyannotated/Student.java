package com.bayor.froporec.annotation.client.immutable.data5_collections_partiallyannotated;

import org.froporec.annotations.Immutable;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Immutable
public record Student(String name, int age, int mark, String grade, Set<School> schools, List<Person> friends,
                      Map<School, Person> bestFriendBySchool) {
}