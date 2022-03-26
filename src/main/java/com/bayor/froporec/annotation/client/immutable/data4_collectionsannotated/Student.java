package com.bayor.froporec.annotation.client.immutable.data4_collectionsannotated;

import org.froporec.annotations.Immutable;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Immutable
public record Student(int mark, String grade, Set<School> schools, List<Person> friends,
                     Map<School, Person> bestFriendBySchool, String lastname, int age) {
}