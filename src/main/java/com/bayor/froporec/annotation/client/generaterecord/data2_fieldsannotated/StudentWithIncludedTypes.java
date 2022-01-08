package com.bayor.froporec.annotation.client.generaterecord.data2_fieldsannotated;

import org.froporec.GenerateRecord;

// rewrite of: src/main/java/com/bayor/froporec/annotation/client/generaterecord/data2_fieldsannotated/Student.java
// using "includeTypes" to avoid repetitive use of @GenerateRecord
// name "StudentWithIncludedTypes" used here only as an example. there are no requirements regarding your classes names

@GenerateRecord(includeTypes = {School.class, Person.class})
public class StudentWithIncludedTypes extends Person {

    private int mark;
    private String grade;
    private School school;
    private Person friend;

    public StudentWithIncludedTypes(String name, int age, int mark, String grade, School school) {
        super(name, age);
        this.mark = mark;
        this.grade = grade;
        this.school = school;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Person getFriend() {
        return friend;
    }

    public void setFriend(Person friend) {
        this.friend = friend;
    }
}