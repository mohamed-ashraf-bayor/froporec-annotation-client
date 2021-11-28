package com.bayor.froporec.annotation.client.data5_collections_partiallyannotated;

import org.froporec.GenerateRecord;

import java.util.List;
import java.util.Map;
import java.util.Set;

@GenerateRecord
public class Student extends Person {

    private int mark;
    private String grade;
    private Set<School> schools;
    private List<Person> friends;
    private Map<School, Person> bestFriendBySchool;

    public Student(String name, int age, int mark, String grade, Set<School> schools) {
        super(name, age);
        this.mark = mark;
        this.grade = grade;
        this.schools = schools;
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

    public Set<School> getSchools() {
        return schools;
    }

    public void setSchools(Set<School> schools) {
        this.schools = schools;
    }

    public List<Person> getFriends() {
        return friends;
    }

    public void setFriends(List<Person> friends) {
        this.friends = friends;
    }

    public Map<School, Person> getBestFriendBySchool() {
        return bestFriendBySchool;
    }

    public void setBestFriendBySchool(Map<School, Person> bestFriendBySchool) {
        this.bestFriendBySchool = bestFriendBySchool;
    }
}