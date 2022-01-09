package com.bayor.froporec.annotation.client.generaterecord.data6_complexpojos;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T19:19:31.1273393-05:00",
    comments = "version: 1.2"
)
public record CustomerContactInfoRecord(java.lang.String phoneNumber, java.lang.String email, java.lang.String idCardNumber, boolean documentValid) {
	public CustomerContactInfoRecord(com.bayor.froporec.annotation.client.generaterecord.data6_complexpojos.CustomerContactInfo customerContactInfo) {
		this(customerContactInfo.getPhoneNumber(), customerContactInfo.getEmail(), customerContactInfo.getIdCardNumber(), customerContactInfo.isDocumentValid());
	}
}
