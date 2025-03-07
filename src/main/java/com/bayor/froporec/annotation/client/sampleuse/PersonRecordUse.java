package com.bayor.froporec.annotation.client.sampleuse;

import com.bayor.froporec.annotation.client.record.data1_allclassesannotated.Person;
import com.bayor.froporec.annotation.client.record.data1_allclassesannotated.PersonRecord;

public class PersonRecordUse {

    public static void main(String[] args) {

        Person johnPojo = new Person("Doe", 50);
        System.out.printf("""
                         %n
                         --- POJO DATA ---
                         LastName: %s, Age: %d
                        """,
                johnPojo.getLastname(),
                johnPojo.getAge());

        PersonRecord johnRecord = new PersonRecord(johnPojo);
        System.out.printf("""
                         %n
                         --- RECORD DATA ---
                         LastName: %s, Age: %d
                        """,
                johnRecord.lastname(),
                johnRecord.age());
    }
}

