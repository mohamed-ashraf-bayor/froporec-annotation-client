package com.bayor.froporec.annotation.client.record.data4_collectionsannotated;

import org.froporec.annotations.Record;

@Record
public class Person {

    private String lastname;
    private int age;

    public Person(String lastname, int age) {
        this.lastname = lastname;
        this.age = age;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}