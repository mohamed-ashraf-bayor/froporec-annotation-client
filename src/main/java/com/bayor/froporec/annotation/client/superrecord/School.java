package com.bayor.froporec.annotation.client.superrecord;

import org.froporec.annotations.SuperRecord;

@SuperRecord(mergeWith = Student.class)
public record School(String name) {
}