package com.bayor.froporec.annotation.client.data6_complexpojos;

@javax.annotation.processing.Generated(
    value = "org.froporec.GenerateRecordProcessor",
    date = "2021-12-13T15:13:47.0176382-05:00",
    comments = "version: 1.1"
)
public record ContactRecord(java.lang.String phoneNumber, java.lang.String email) {
	public ContactRecord(com.bayor.froporec.annotation.client.data6_complexpojos.Contact contact) {
		this(contact.getPhoneNumber(), contact.getEmail());
	}
}
