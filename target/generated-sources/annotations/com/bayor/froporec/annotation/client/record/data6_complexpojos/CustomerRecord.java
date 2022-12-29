package com.bayor.froporec.annotation.client.record.data6_complexpojos;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-12-28T21:36:09.331881-05:00",
    comments = "version: 1.4"
)
public record CustomerRecord(java.lang.String firstName, java.lang.String lastName, java.lang.Boolean active, int age, java.util.List<com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord> customerAddressList, java.util.Map<java.lang.String, com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord> customerContactInfoByType)  {

	public static final String FIRST_NAME = "firstName"; // type: java.lang.String
	public static final String LAST_NAME = "lastName"; // type: java.lang.String
	public static final String ACTIVE = "active"; // type: java.lang.Boolean
	public static final String AGE = "age"; // type: int
	public static final String CUSTOMER_ADDRESS_LIST = "customerAddressList"; // type: java.util.List<com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord>
	public static final String CUSTOMER_CONTACT_INFO_BY_TYPE = "customerContactInfoByType"; // type: java.util.Map<java.lang.String, com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord>
	
	public CustomerRecord(com.bayor.froporec.annotation.client.record.data6_complexpojos.Customer customer) {
		this(customer.getFirstName(), customer.getLastName(), customer.getActive(), customer.getAge(), java.util.Optional.ofNullable(customer.getCustomerAddressList()).isEmpty() ? java.util.List.of() : customer.getCustomerAddressList().stream().map(object -> new com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord(object)).collect(java.util.stream.Collectors.toUnmodifiableList()), java.util.Optional.ofNullable(customer.getCustomerContactInfoByType()).isEmpty() ? java.util.Map.of() : customer.getCustomerContactInfoByType().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> (entry.getKey()), entry -> new com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord(entry.getValue()))));
	}

	public static CustomerRecord buildWith(com.bayor.froporec.annotation.client.record.data6_complexpojos.Customer customer) {
		return new CustomerRecord(customer.getFirstName(), customer.getLastName(), customer.getActive(), customer.getAge(), java.util.Optional.ofNullable(customer.getCustomerAddressList()).isEmpty() ? java.util.List.of() : customer.getCustomerAddressList().stream().map(object -> new com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord(object)).collect(java.util.stream.Collectors.toUnmodifiableList()), java.util.Optional.ofNullable(customer.getCustomerContactInfoByType()).isEmpty() ? java.util.Map.of() : customer.getCustomerContactInfoByType().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> (entry.getKey()), entry -> new com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord(entry.getValue()))));
	}

	public static CustomerRecord buildWith(com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerRecord customerRecord) {
		return new CustomerRecord(customerRecord.firstName(), customerRecord.lastName(), customerRecord.active(), customerRecord.age(), customerRecord.customerAddressList(), customerRecord.customerContactInfoByType());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static CustomerRecord buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new CustomerRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(FIRST_NAME, null), (java.lang.String) fieldsNameValuePairs.getOrDefault(LAST_NAME, null), (java.lang.Boolean) fieldsNameValuePairs.getOrDefault(ACTIVE, null), (int) fieldsNameValuePairs.getOrDefault(AGE, 0), (java.util.List<com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord>) fieldsNameValuePairs.getOrDefault(CUSTOMER_ADDRESS_LIST, null), (java.util.Map<java.lang.String, com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord>) fieldsNameValuePairs.getOrDefault(CUSTOMER_CONTACT_INFO_BY_TYPE, null));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static CustomerRecord buildWith(com.bayor.froporec.annotation.client.record.data6_complexpojos.Customer customer, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new CustomerRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(FIRST_NAME, customer.getFirstName()), (java.lang.String) fieldsNameValuePairs.getOrDefault(LAST_NAME, customer.getLastName()), (java.lang.Boolean) fieldsNameValuePairs.getOrDefault(ACTIVE, customer.getActive()), (int) fieldsNameValuePairs.getOrDefault(AGE, customer.getAge()), (java.util.List<com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord>) fieldsNameValuePairs.getOrDefault(CUSTOMER_ADDRESS_LIST, java.util.Optional.ofNullable(customer.getCustomerAddressList()).isEmpty() ? java.util.List.of() : customer.getCustomerAddressList().stream().map(object -> new com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord(object)).collect(java.util.stream.Collectors.toUnmodifiableList())), (java.util.Map<java.lang.String, com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord>) fieldsNameValuePairs.getOrDefault(CUSTOMER_CONTACT_INFO_BY_TYPE, java.util.Optional.ofNullable(customer.getCustomerContactInfoByType()).isEmpty() ? java.util.Map.of() : customer.getCustomerContactInfoByType().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> (entry.getKey()), entry -> new com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord(entry.getValue())))));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static CustomerRecord buildWith(com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerRecord customerRecord, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new CustomerRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(FIRST_NAME, customerRecord.firstName()), (java.lang.String) fieldsNameValuePairs.getOrDefault(LAST_NAME, customerRecord.lastName()), (java.lang.Boolean) fieldsNameValuePairs.getOrDefault(ACTIVE, customerRecord.active()), (int) fieldsNameValuePairs.getOrDefault(AGE, customerRecord.age()), (java.util.List<com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord>) fieldsNameValuePairs.getOrDefault(CUSTOMER_ADDRESS_LIST, customerRecord.customerAddressList()), (java.util.Map<java.lang.String, com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord>) fieldsNameValuePairs.getOrDefault(CUSTOMER_CONTACT_INFO_BY_TYPE, customerRecord.customerContactInfoByType()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public CustomerRecord with(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new CustomerRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(FIRST_NAME, this.firstName()), (java.lang.String) fieldsNameValuePairs.getOrDefault(LAST_NAME, this.lastName()), (java.lang.Boolean) fieldsNameValuePairs.getOrDefault(ACTIVE, this.active()), (int) fieldsNameValuePairs.getOrDefault(AGE, this.age()), (java.util.List<com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord>) fieldsNameValuePairs.getOrDefault(CUSTOMER_ADDRESS_LIST, this.customerAddressList()), (java.util.Map<java.lang.String, com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord>) fieldsNameValuePairs.getOrDefault(CUSTOMER_CONTACT_INFO_BY_TYPE, this.customerContactInfoByType()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public <T> CustomerRecord with(String fieldName, T fieldValue) {
		return new CustomerRecord(fieldName.equals(FIRST_NAME) ? (java.lang.String) fieldValue : this.firstName(), fieldName.equals(LAST_NAME) ? (java.lang.String) fieldValue : this.lastName(), fieldName.equals(ACTIVE) ? (java.lang.Boolean) fieldValue : this.active(), fieldName.equals(AGE) ? (int) fieldValue : this.age(), fieldName.equals(CUSTOMER_ADDRESS_LIST) ? (java.util.List<com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord>) fieldValue : this.customerAddressList(), fieldName.equals(CUSTOMER_CONTACT_INFO_BY_TYPE) ? (java.util.Map<java.lang.String, com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord>) fieldValue : this.customerContactInfoByType());
	}
}