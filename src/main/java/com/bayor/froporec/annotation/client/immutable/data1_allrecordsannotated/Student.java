package com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated;

import org.froporec.annotations.Immutable;

@Immutable
public record Student(int mark, String grade, School school, String lastname, int age) {
}