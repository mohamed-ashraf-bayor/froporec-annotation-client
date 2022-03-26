package com.bayor.froporec.annotation.client.record.data6_complexpojos;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:04.0712987-04:00",
    comments = "version: 1.3"
)
public record CustomerContactInfoRecord(java.lang.String phoneNumber, java.lang.String email, java.lang.String idCardNumber, boolean documentValid)  {
	public CustomerContactInfoRecord(com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfo customerContactInfo) {
		this(customerContactInfo.getPhoneNumber(), customerContactInfo.getEmail(), customerContactInfo.getIdCardNumber(), customerContactInfo.isDocumentValid());
	}
}
