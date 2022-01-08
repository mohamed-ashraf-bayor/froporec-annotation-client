package com.bayor.froporec.annotation.client.generaterecord.data6_complexpojos;

import org.froporec.GenerateRecord;

import java.util.List;
import java.util.Map;

@GenerateRecord
public class Customer {

    private String firstName;

    private String lastName;

    private Boolean active;

    private int age;

    private List<Address> customerAddressList;

    private Map<String, CustomerContactInfo> customerContactInfoByType;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getCustomerAddressList() {
        return customerAddressList;
    }

    public void setCustomerAddressList(List<Address> customerAddressList) {
        this.customerAddressList = customerAddressList;
    }

    public Map<String, CustomerContactInfo> getCustomerContactInfoByType() {
        return customerContactInfoByType;
    }

    public void setCustomerContactInfo(Map<String, CustomerContactInfo> customerContactInfoByType) {
        this.customerContactInfoByType = customerContactInfoByType;
    }
}