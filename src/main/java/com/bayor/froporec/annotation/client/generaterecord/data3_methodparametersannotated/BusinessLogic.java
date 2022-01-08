package com.bayor.froporec.annotation.client.generaterecord.data3_methodparametersannotated;

import org.froporec.GenerateRecord;

import static java.lang.String.format;

public class BusinessLogic {

    public static void main(String[] args) {
        displayWithRecords(new Person("PERSON1_NAME", 10), new School("SCHOOL1_NAME"));
    }

    private static void displayStudentInfo(final Person person, final School school) {
        System.out.println(format(
                "\n\n\n%s is attending %s\n\n\n",
                person.getLastname(),
                school.getName()
        ));
    }

    private static void displayWithRecords(@GenerateRecord Person person, @GenerateRecord School school) {
        PersonRecord personRecord = new PersonRecord(person);
        SchoolRecord schoolRecord = new SchoolRecord(school);
        System.out.println(format(
                "\n\n\n%s is attending %s with Records\n\n\n",
                personRecord.lastname(),
                schoolRecord.name()
        ));
    }
}