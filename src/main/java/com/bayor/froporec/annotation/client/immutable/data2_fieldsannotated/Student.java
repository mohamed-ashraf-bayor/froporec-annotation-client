package com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated;

import org.froporec.annotations.Immutable;

@Immutable
public record Student(int mark, String grade, @Immutable School school, String lastname, int age) {
}

// above class can be re-written as:

@Immutable(alsoConvert = School.class)
record StudentWithAlsoConvert(int mark, String grade, School school, String lastname, int age) {
} // name "StudentWithAlsoConvert" used here only as an example. there are no requirements regarding your classes names