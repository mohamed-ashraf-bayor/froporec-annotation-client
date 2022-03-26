package com.bayor.froporec.annotation.client.immutable.data3_methodparametersannotated;

import org.froporec.annotations.Immutable;

import static java.lang.String.format;

public class BusinessLogic {

    public static void main(String[] args) {
        displayWithRecords(new Person("PERSON1_NAME", 10), new School("SCHOOL1_NAME"));
    }

    private static void displayStudentInfo(Person person, School school) {
        System.out.println(format(
                "\n\n\n%s is attending %s\n\n\n",
                person.lastname(),
                school.name()
        ));
    }

    private static void displayWithRecords(@Immutable Person person, @Immutable(alsoConvert = Student.class) School school) {
        ImmutablePerson immutablePerson = new ImmutablePerson(person);
        ImmutableSchool immutableSchool = new ImmutableSchool(school);
        ImmutableStudent immutableStudent = new ImmutableStudent(new Student(10, "GRADE_INFO", school, "PERSON1_NAME", 20));
        System.out.println(format(
                "\n\n\n%s is attending %s (gr=%s) with Records\n\n\n",
                immutablePerson.lastname(),
                immutableSchool.name(),
                immutableStudent.grade()
        ));
    }
}