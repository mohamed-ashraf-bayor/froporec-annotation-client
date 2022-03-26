package com.bayor.froporec.annotation.client.record.data1_allclassesannotated;

import com.bayor.froporec.annotation.client.testinterf.TestInterface1;
import com.bayor.froporec.annotation.client.testinterf.TestInterface2;
import org.froporec.annotations.Record;

@Record
public class School {

    private String name;

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// testing with superinterfaces

@Record(superInterfaces = TestInterface1.class)
class SchoolWith1SuperInterf {

    private String name;

    public SchoolWith1SuperInterf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

@Record(superInterfaces = {TestInterface1.class, TestInterface2.class})
class SchoolWithMultipleSuperInterf {

    private String name;

    public SchoolWithMultipleSuperInterf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}