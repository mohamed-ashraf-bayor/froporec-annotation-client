package com.bayor.froporec.annotation.client.record.data6_complexpojos;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:04.0573395-04:00",
    comments = "version: 1.3"
)
public record CustomerRecord(java.lang.String firstName, java.lang.String lastName, java.lang.Boolean active, int age, java.util.List<com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord> customerAddressList, java.util.Map<java.lang.String, com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord> customerContactInfoByType)  {
	public CustomerRecord(com.bayor.froporec.annotation.client.record.data6_complexpojos.Customer customer) {
		this(customer.getFirstName(), customer.getLastName(), customer.getActive(), customer.getAge(), java.util.Optional.ofNullable(customer.getCustomerAddressList()).isEmpty() ? java.util.List.of() : customer.getCustomerAddressList().stream().map(object -> new com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord(object)).collect(java.util.stream.Collectors.toUnmodifiableList()), java.util.Optional.ofNullable(customer.getCustomerContactInfoByType()).isEmpty() ? java.util.Map.of() : customer.getCustomerContactInfoByType().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> (entry.getKey()), entry -> new com.bayor.froporec.annotation.client.record.data6_complexpojos.CustomerContactInfoRecord(entry.getValue()))));
	}
}
