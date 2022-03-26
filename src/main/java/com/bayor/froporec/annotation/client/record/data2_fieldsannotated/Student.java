package com.bayor.froporec.annotation.client.record.data2_fieldsannotated;

import org.froporec.annotations.Record;

@Record
public class Student extends Person {

    private int mark;
    private String grade;
    private @Record School school;
    private @Record Person friend;

    public Student(String name, int age, int mark, String grade, School school) {
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