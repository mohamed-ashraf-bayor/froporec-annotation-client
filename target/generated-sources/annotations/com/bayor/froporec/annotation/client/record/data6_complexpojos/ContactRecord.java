package com.bayor.froporec.annotation.client.record.data6_complexpojos;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-12-30T21:03:44.0175594-05:00",
    comments = "version: 1.4"
)
public record ContactRecord(java.lang.String phoneNumber, java.lang.String email)  {

	public static final String PHONE_NUMBER = "phoneNumber"; // type: java.lang.String
	public static final String EMAIL = "email"; // type: java.lang.String
	
	public ContactRecord(com.bayor.froporec.annotation.client.record.data6_complexpojos.Contact contact) {
		this(contact.getPhoneNumber(), contact.getEmail());
	}

	public static ContactRecord buildWith(com.bayor.froporec.annotation.client.record.data6_complexpojos.Contact contact) {
		return new ContactRecord(contact.getPhoneNumber(), contact.getEmail());
	}

	public static ContactRecord buildWith(com.bayor.froporec.annotation.client.record.data6_complexpojos.ContactRecord contactRecord) {
		return new ContactRecord(contactRecord.phoneNumber(), contactRecord.email());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ContactRecord buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ContactRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(PHONE_NUMBER, null), (java.lang.String) fieldsNameValuePairs.getOrDefault(EMAIL, null));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ContactRecord buildWith(com.bayor.froporec.annotation.client.record.data6_complexpojos.Contact contact, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ContactRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(PHONE_NUMBER, contact.getPhoneNumber()), (java.lang.String) fieldsNameValuePairs.getOrDefault(EMAIL, contact.getEmail()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ContactRecord buildWith(com.bayor.froporec.annotation.client.record.data6_complexpojos.ContactRecord contactRecord, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ContactRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(PHONE_NUMBER, contactRecord.phoneNumber()), (java.lang.String) fieldsNameValuePairs.getOrDefault(EMAIL, contactRecord.email()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public ContactRecord with(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ContactRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(PHONE_NUMBER, this.phoneNumber()), (java.lang.String) fieldsNameValuePairs.getOrDefault(EMAIL, this.email()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public <T> ContactRecord with(String fieldName, T fieldValue) {
		return new ContactRecord(fieldName.equals(PHONE_NUMBER) ? (java.lang.String) fieldValue : this.phoneNumber(), fieldName.equals(EMAIL) ? (java.lang.String) fieldValue : this.email());
	}
}