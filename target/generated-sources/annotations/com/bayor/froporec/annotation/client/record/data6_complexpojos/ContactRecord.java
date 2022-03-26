package com.bayor.froporec.annotation.client.record.data6_complexpojos;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:03.9855269-04:00",
    comments = "version: 1.3"
)
public record ContactRecord(java.lang.String phoneNumber, java.lang.String email)  {
	public ContactRecord(com.bayor.froporec.annotation.client.record.data6_complexpojos.Contact contact) {
		this(contact.getPhoneNumber(), contact.getEmail());
	}
}
