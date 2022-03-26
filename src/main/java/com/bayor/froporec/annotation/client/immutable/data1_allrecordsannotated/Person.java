package com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated;

import com.bayor.froporec.annotation.client.testinterf.TestInterface1;
import com.bayor.froporec.annotation.client.testinterf.TestInterface2;
import org.froporec.annotations.Immutable;

@Immutable
public record Person(String lastname, int age) {
}

// testing the use of superinterfaces

@Immutable(superInterfaces = TestInterface2.class)
record PersonWith1SuperInterf(String lastname, int age) {
}

@Immutable(superInterfaces = {TestInterface1.class, TestInterface2.class})
record PersonWithMultipleSuperInterf(String lastname, int age) {
}