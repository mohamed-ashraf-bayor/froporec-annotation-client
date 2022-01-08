package com.bayor.froporec.annotation.client.mixed;

import java.util.List;
import java.util.Map;
import java.util.Set;

public record Student(int mark, String grade, String lastname, int age, Set<School> schools, List<Person> friends,
                      Map<School, Person> bestFriendBySchool) {
}