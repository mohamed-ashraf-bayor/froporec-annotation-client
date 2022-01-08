package com.bayor.froporec.annotation.client.generateimmutable.data2_fieldsannotated;

import org.froporec.GenerateImmutable;

@GenerateImmutable
public record Student(int mark, String grade, @GenerateImmutable School school, String lastname, int age) {
}

// above class can be re-written as:

@GenerateImmutable(includeTypes = {School.class})
record StudentWithIncludedTypes(int mark, String grade, School school, String lastname, int age) {
} // name "StudentWithIncludedTypes" used here only as an example. there are no requirements regarding your classes names