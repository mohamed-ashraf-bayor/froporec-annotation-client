package com.bayor.froporec.annotation.client.generaterecord.data4_collectionsannotated;

import org.froporec.GenerateRecord;

@GenerateRecord
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