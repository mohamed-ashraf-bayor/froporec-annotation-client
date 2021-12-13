package com.bayor.froporec.annotation.client.data6_complexpojos;

@javax.annotation.processing.Generated(
    value = "org.froporec.GenerateRecordProcessor",
    date = "2021-12-13T15:13:46.9099297-05:00",
    comments = "version: 1.1"
)
public record CustomerContactInfoRecord(java.lang.String phoneNumber, java.lang.String email, java.lang.String idCardNumber, boolean documentValid) {
	public CustomerContactInfoRecord(com.bayor.froporec.annotation.client.data6_complexpojos.CustomerContactInfo customerContactInfo) {
		this(customerContactInfo.getPhoneNumber(), customerContactInfo.getEmail(), customerContactInfo.getIdCardNumber(), customerContactInfo.isDocumentValid());
	}
}
