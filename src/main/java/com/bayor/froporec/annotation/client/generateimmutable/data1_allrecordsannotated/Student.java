package com.bayor.froporec.annotation.client.generateimmutable.data1_allrecordsannotated;

import org.froporec.GenerateImmutable;

@GenerateImmutable
public record Student(int mark, String grade, School school, String lastname, int age) {
}