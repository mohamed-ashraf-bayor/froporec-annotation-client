package com.bayor.froporec.annotation.client.generaterecord.data6_complexpojos;

import org.froporec.GenerateRecord;

@GenerateRecord
public class Contact {

    private String phoneNumber;

    private String email;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
