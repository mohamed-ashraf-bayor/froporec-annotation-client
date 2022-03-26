package com.bayor.froporec.annotation.client.superrecord;

import com.bayor.froporec.annotation.client.testinterf.TestInterface1;
import com.bayor.froporec.annotation.client.testinterf.TestInterface2;
import org.froporec.annotations.SuperRecord;

@SuperRecord(mergeWith = {School.class, Student.class}, superInterfaces = {TestInterface1.class, TestInterface2.class})
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