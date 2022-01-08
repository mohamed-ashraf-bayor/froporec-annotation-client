package com.bayor.froporec.annotation.client.generateimmutable.data1_allrecordsannotated;

import org.froporec.GenerateImmutable;

@GenerateImmutable
public record Person(String lastname, int age) {
}