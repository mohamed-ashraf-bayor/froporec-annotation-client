package com.bayor.froporec.annotation.client.generaterecord.data6_complexpojos;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T19:19:31.2879098-05:00",
    comments = "version: 1.2"
)
public record ContactRecord(java.lang.String phoneNumber, java.lang.String email) {
	public ContactRecord(com.bayor.froporec.annotation.client.generaterecord.data6_complexpojos.Contact contact) {
		this(contact.getPhoneNumber(), contact.getEmail());
	}
}
