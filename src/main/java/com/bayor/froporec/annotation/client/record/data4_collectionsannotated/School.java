package com.bayor.froporec.annotation.client.record.data4_collectionsannotated;

import org.froporec.annotations.Record;

@Record
public class School {

    private String name;

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}