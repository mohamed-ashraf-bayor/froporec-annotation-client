package com.bayor.froporec.annotation.client.record.data6_complexpojos;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-12-30T21:03:43.9815548-05:00",
    comments = "version: 1.4"
)
public record CustomerContactInfoRecord(java.lang.String phoneNumber, java.lang.String email, java.lang.String idCardNumber, boolean documentValid)  {

	public static final String PHONE_NUMBER = "phoneNumber"; // type: java.lang.String
	public static final String EMAIL = "email"; // type: java.lang.String
	public static final String ID_CARD_NUMBER = "idCardNumber"; // type: java.lang.String
	public static final String DOCUMENT_VALID = "documentValid"; // type: boolean
	
	public CustomerContactInfoRecord(com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfo customerContactInfo) {
		this(customerContactInfo.getPhoneNumber(), customerContactInfo.getEmail(), customerContactInfo.getIdCardNumber(), customerContactInfo.isDocumentValid());
	}

	public static CustomerContactInfoRecord buildWith(com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfo customerContactInfo) {
		return new CustomerContactInfoRecord(customerContactInfo.getPhoneNumber(), customerContactInfo.getEmail(), customerContactInfo.getIdCardNumber(), customerContactInfo.isDocumentValid());
	}

	public static CustomerContactInfoRecord buildWith(com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord customerContactInfoRecord) {
		return new CustomerContactInfoRecord(customerContactInfoRecord.phoneNumber(), customerContactInfoRecord.email(), customerContactInfoRecord.idCardNumber(), customerContactInfoRecord.documentValid());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static CustomerContactInfoRecord buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new CustomerContactInfoRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(PHONE_NUMBER, null), (java.lang.String) fieldsNameValuePairs.getOrDefault(EMAIL, null), (java.lang.String) fieldsNameValuePairs.getOrDefault(ID_CARD_NUMBER, null), (boolean) fieldsNameValuePairs.getOrDefault(DOCUMENT_VALID, false));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static CustomerContactInfoRecord buildWith(com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfo customerContactInfo, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new CustomerContactInfoRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(PHONE_NUMBER, customerContactInfo.getPhoneNumber()), (java.lang.String) fieldsNameValuePairs.getOrDefault(EMAIL, customerContactInfo.getEmail()), (java.lang.String) fieldsNameValuePairs.getOrDefault(ID_CARD_NUMBER, customerContactInfo.getIdCardNumber()), (boolean) fieldsNameValuePairs.getOrDefault(DOCUMENT_VALID, customerContactInfo.isDocumentValid()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static CustomerContactInfoRecord buildWith(com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord customerContactInfoRecord, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new CustomerContactInfoRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(PHONE_NUMBER, customerContactInfoRecord.phoneNumber()), (java.lang.String) fieldsNameValuePairs.getOrDefault(EMAIL, customerContactInfoRecord.email()), (java.lang.String) fieldsNameValuePairs.getOrDefault(ID_CARD_NUMBER, customerContactInfoRecord.idCardNumber()), (boolean) fieldsNameValuePairs.getOrDefault(DOCUMENT_VALID, customerContactInfoRecord.documentValid()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public CustomerContactInfoRecord with(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new CustomerContactInfoRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(PHONE_NUMBER, this.phoneNumber()), (java.lang.String) fieldsNameValuePairs.getOrDefault(EMAIL, this.email()), (java.lang.String) fieldsNameValuePairs.getOrDefault(ID_CARD_NUMBER, this.idCardNumber()), (boolean) fieldsNameValuePairs.getOrDefault(DOCUMENT_VALID, this.documentValid()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public <T> CustomerContactInfoRecord with(String fieldName, T fieldValue) {
		return new CustomerContactInfoRecord(fieldName.equals(PHONE_NUMBER) ? (java.lang.String) fieldValue : this.phoneNumber(), fieldName.equals(EMAIL) ? (java.lang.String) fieldValue : this.email(), fieldName.equals(ID_CARD_NUMBER) ? (java.lang.String) fieldValue : this.idCardNumber(), fieldName.equals(DOCUMENT_VALID) ? (boolean) fieldValue : this.documentValid());
	}
}