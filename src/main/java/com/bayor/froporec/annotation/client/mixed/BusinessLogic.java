package com.bayor.froporec.annotation.client.mixed;

import org.froporec.annotations.Immutable;
import org.froporec.annotations.Record;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class BusinessLogic {

    public static void main(String[] args) {
        processData(new Person("LAST_NAME", 10), new School("SCHOOL_NAME", new BuildingInfo(1234, "BUILDING_NAME")));
    }

    private static void processData(@Record(alsoConvert = Student.class) Person person, @Immutable(alsoConvert = BuildingInfo.class) School school) {
        PersonRecord personRecord = new PersonRecord(person);
        ImmutableSchool immutableSchool = new ImmutableSchool(school);
        ImmutableStudent immutableStudent = new ImmutableStudent(new Student(10, "GRADE_INFO", "STUDENT_LAST_NAME", 20, Set.of(school), List.of(person), Map.of(school, person)));
        // if BuildingInfo is annotated, lines 23 and 24 will not compile
        System.out.println(String.format("%n%n> street name: %s%n%n", immutableSchool.buildingInfo().streetName()));
        // if BuildingInfo is NOT annotated, lines 23 and 24 if uncommented will allow a value change of the streetName field
        // immutableSchool.buildingInfo().setStreetName("--- NEW STREET NAME ---");
        // System.out.println(format("%n%n> street name: %s%n%n", immutableSchool.buildingInfo().getStreetName()));
    }
}