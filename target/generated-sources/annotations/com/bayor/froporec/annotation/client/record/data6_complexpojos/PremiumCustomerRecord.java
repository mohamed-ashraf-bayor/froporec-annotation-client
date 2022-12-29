package com.bayor.froporec.annotation.client.record.data6_complexpojos;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-12-28T21:36:09.2748792-05:00",
    comments = "version: 1.4"
)
public record PremiumCustomerRecord(java.lang.String firstName, java.lang.String lastName, java.lang.Boolean active, int age, java.util.List<com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord> customerAddressList, java.util.Map<java.lang.String, com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord> customerContactInfoByType, boolean premiumCustomer)  {

	public static final String FIRST_NAME = "firstName"; // type: java.lang.String
	public static final String LAST_NAME = "lastName"; // type: java.lang.String
	public static final String ACTIVE = "active"; // type: java.lang.Boolean
	public static final String AGE = "age"; // type: int
	public static final String CUSTOMER_ADDRESS_LIST = "customerAddressList"; // type: java.util.List<com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord>
	public static final String CUSTOMER_CONTACT_INFO_BY_TYPE = "customerContactInfoByType"; // type: java.util.Map<java.lang.String, com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord>
	public static final String PREMIUM_CUSTOMER = "premiumCustomer"; // type: boolean
	
	public PremiumCustomerRecord(com.bayor.froporec.annotation.client.record.data6_complexpojos.PremiumCustomer premiumCustomer) {
		this(premiumCustomer.getFirstName(), premiumCustomer.getLastName(), premiumCustomer.getActive(), premiumCustomer.getAge(), java.util.Optional.ofNullable(premiumCustomer.getCustomerAddressList()).isEmpty() ? java.util.List.of() : premiumCustomer.getCustomerAddressList().stream().map(object -> new com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord(object)).collect(java.util.stream.Collectors.toUnmodifiableList()), java.util.Optional.ofNullable(premiumCustomer.getCustomerContactInfoByType()).isEmpty() ? java.util.Map.of() : premiumCustomer.getCustomerContactInfoByType().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> (entry.getKey()), entry -> new com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord(entry.getValue()))), premiumCustomer.isPremiumCustomer());
	}

	public static PremiumCustomerRecord buildWith(com.bayor.froporec.annotation.client.record.data6_complexpojos.PremiumCustomer premiumCustomer) {
		return new PremiumCustomerRecord(premiumCustomer.getFirstName(), premiumCustomer.getLastName(), premiumCustomer.getActive(), premiumCustomer.getAge(), java.util.Optional.ofNullable(premiumCustomer.getCustomerAddressList()).isEmpty() ? java.util.List.of() : premiumCustomer.getCustomerAddressList().stream().map(object -> new com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord(object)).collect(java.util.stream.Collectors.toUnmodifiableList()), java.util.Optional.ofNullable(premiumCustomer.getCustomerContactInfoByType()).isEmpty() ? java.util.Map.of() : premiumCustomer.getCustomerContactInfoByType().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> (entry.getKey()), entry -> new com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord(entry.getValue()))), premiumCustomer.isPremiumCustomer());
	}

	public static PremiumCustomerRecord buildWith(com.bayor.froporec.annotation.client.record.data6_complexpojos.PremiumCustomerRecord premiumCustomerRecord) {
		return new PremiumCustomerRecord(premiumCustomerRecord.firstName(), premiumCustomerRecord.lastName(), premiumCustomerRecord.active(), premiumCustomerRecord.age(), premiumCustomerRecord.customerAddressList(), premiumCustomerRecord.customerContactInfoByType(), premiumCustomerRecord.premiumCustomer());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static PremiumCustomerRecord buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new PremiumCustomerRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(FIRST_NAME, null), (java.lang.String) fieldsNameValuePairs.getOrDefault(LAST_NAME, null), (java.lang.Boolean) fieldsNameValuePairs.getOrDefault(ACTIVE, null), (int) fieldsNameValuePairs.getOrDefault(AGE, 0), (java.util.List<com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord>) fieldsNameValuePairs.getOrDefault(CUSTOMER_ADDRESS_LIST, null), (java.util.Map<java.lang.String, com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord>) fieldsNameValuePairs.getOrDefault(CUSTOMER_CONTACT_INFO_BY_TYPE, null), (boolean) fieldsNameValuePairs.getOrDefault(PREMIUM_CUSTOMER, false));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static PremiumCustomerRecord buildWith(com.bayor.froporec.annotation.client.record.data6_complexpojos.PremiumCustomer premiumCustomer, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new PremiumCustomerRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(FIRST_NAME, premiumCustomer.getFirstName()), (java.lang.String) fieldsNameValuePairs.getOrDefault(LAST_NAME, premiumCustomer.getLastName()), (java.lang.Boolean) fieldsNameValuePairs.getOrDefault(ACTIVE, premiumCustomer.getActive()), (int) fieldsNameValuePairs.getOrDefault(AGE, premiumCustomer.getAge()), (java.util.List<com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord>) fieldsNameValuePairs.getOrDefault(CUSTOMER_ADDRESS_LIST, java.util.Optional.ofNullable(premiumCustomer.getCustomerAddressList()).isEmpty() ? java.util.List.of() : premiumCustomer.getCustomerAddressList().stream().map(object -> new com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord(object)).collect(java.util.stream.Collectors.toUnmodifiableList())), (java.util.Map<java.lang.String, com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord>) fieldsNameValuePairs.getOrDefault(CUSTOMER_CONTACT_INFO_BY_TYPE, java.util.Optional.ofNullable(premiumCustomer.getCustomerContactInfoByType()).isEmpty() ? java.util.Map.of() : premiumCustomer.getCustomerContactInfoByType().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> (entry.getKey()), entry -> new com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord(entry.getValue())))), (boolean) fieldsNameValuePairs.getOrDefault(PREMIUM_CUSTOMER, premiumCustomer.isPremiumCustomer()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static PremiumCustomerRecord buildWith(com.bayor.froporec.annotation.client.record.data6_complexpojos.PremiumCustomerRecord premiumCustomerRecord, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new PremiumCustomerRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(FIRST_NAME, premiumCustomerRecord.firstName()), (java.lang.String) fieldsNameValuePairs.getOrDefault(LAST_NAME, premiumCustomerRecord.lastName()), (java.lang.Boolean) fieldsNameValuePairs.getOrDefault(ACTIVE, premiumCustomerRecord.active()), (int) fieldsNameValuePairs.getOrDefault(AGE, premiumCustomerRecord.age()), (java.util.List<com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord>) fieldsNameValuePairs.getOrDefault(CUSTOMER_ADDRESS_LIST, premiumCustomerRecord.customerAddressList()), (java.util.Map<java.lang.String, com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord>) fieldsNameValuePairs.getOrDefault(CUSTOMER_CONTACT_INFO_BY_TYPE, premiumCustomerRecord.customerContactInfoByType()), (boolean) fieldsNameValuePairs.getOrDefault(PREMIUM_CUSTOMER, premiumCustomerRecord.premiumCustomer()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public PremiumCustomerRecord with(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new PremiumCustomerRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(FIRST_NAME, this.firstName()), (java.lang.String) fieldsNameValuePairs.getOrDefault(LAST_NAME, this.lastName()), (java.lang.Boolean) fieldsNameValuePairs.getOrDefault(ACTIVE, this.active()), (int) fieldsNameValuePairs.getOrDefault(AGE, this.age()), (java.util.List<com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord>) fieldsNameValuePairs.getOrDefault(CUSTOMER_ADDRESS_LIST, this.customerAddressList()), (java.util.Map<java.lang.String, com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord>) fieldsNameValuePairs.getOrDefault(CUSTOMER_CONTACT_INFO_BY_TYPE, this.customerContactInfoByType()), (boolean) fieldsNameValuePairs.getOrDefault(PREMIUM_CUSTOMER, this.premiumCustomer()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public <T> PremiumCustomerRecord with(String fieldName, T fieldValue) {
		return new PremiumCustomerRecord(fieldName.equals(FIRST_NAME) ? (java.lang.String) fieldValue : this.firstName(), fieldName.equals(LAST_NAME) ? (java.lang.String) fieldValue : this.lastName(), fieldName.equals(ACTIVE) ? (java.lang.Boolean) fieldValue : this.active(), fieldName.equals(AGE) ? (int) fieldValue : this.age(), fieldName.equals(CUSTOMER_ADDRESS_LIST) ? (java.util.List<com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord>) fieldValue : this.customerAddressList(), fieldName.equals(CUSTOMER_CONTACT_INFO_BY_TYPE) ? (java.util.Map<java.lang.String, com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord>) fieldValue : this.customerContactInfoByType(), fieldName.equals(PREMIUM_CUSTOMER) ? (boolean) fieldValue : this.premiumCustomer());
	}
}