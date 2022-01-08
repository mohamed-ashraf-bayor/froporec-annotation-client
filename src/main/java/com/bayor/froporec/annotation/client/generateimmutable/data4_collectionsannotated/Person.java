package com.bayor.froporec.annotation.client.generateimmutable.data4_collectionsannotated;

import org.froporec.GenerateImmutable;

@GenerateImmutable
public record Person(String lastname, int age) {
}