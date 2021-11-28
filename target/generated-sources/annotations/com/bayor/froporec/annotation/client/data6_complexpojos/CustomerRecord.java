package com.bayor.froporec.annotation.client.data6_complexpojos;

@javax.annotation.processing.Generated(
    value = "org.froporec.GenerateRecordProcessor",
    date = "2021-11-27T23:20:56.0700513-05:00",
    comments = "version: 1.1"
)
public record CustomerRecord(java.lang.String firstName, java.lang.String lastName, java.lang.Boolean active, int age, java.util.List<com.bayor.froporec.annotation.client.data6_complexpojos.AddressRecord> customerAddressList, java.util.Map<java.lang.String, com.bayor.froporec.annotation.client.data6_complexpojos.CustomerContactInfoRecord> customerContactInfoByType) {
	public CustomerRecord(com.bayor.froporec.annotation.client.data6_complexpojos.Customer customer) {
		this(customer.getFirstName(), customer.getLastName(), customer.getActive(), customer.getAge(), customer.getCustomerAddressList().stream().map(object -> new com.bayor.froporec.annotation.client.data6_complexpojos.AddressRecord(object)).collect(java.util.stream.Collectors.toUnmodifiableList()), customer.getCustomerContactInfoByType().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> (entry.getKey()), entry -> new com.bayor.froporec.annotation.client.data6_complexpojos.CustomerContactInfoRecord(entry.getValue()))));
	}
}
