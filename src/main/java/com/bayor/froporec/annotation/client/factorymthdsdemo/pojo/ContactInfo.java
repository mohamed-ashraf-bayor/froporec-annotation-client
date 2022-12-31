package com.bayor.froporec.annotation.client.factorymthdsdemo.pojo;

public class ContactInfo {
    private String email;
    private String city;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "{" +
                "email=\"" + email + '\"' +
                ", city=\"" + city + '\"' +
                '}';
    }
}