package com.bayor.froporec.annotation.client.immutable.data4_collectionsannotated;

import org.froporec.annotations.Immutable;

@Immutable
public record Person(String lastname, int age) {
}