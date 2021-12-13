package com.bayor.froporec.annotation.client.data6_complexpojos;

@javax.annotation.processing.Generated(
    value = "org.froporec.GenerateRecordProcessor",
    date = "2021-12-13T15:13:47.1323335-05:00",
    comments = "version: 1.1"
)
public record PremiumCustomerRecord(java.lang.String firstName, java.lang.String lastName, java.lang.Boolean active, int age, java.util.List<com.bayor.froporec.annotation.client.data6_complexpojos.AddressRecord> customerAddressList, java.util.Map<java.lang.String, com.bayor.froporec.annotation.client.data6_complexpojos.CustomerContactInfoRecord> customerContactInfoByType, boolean premiumCustomer) {
	public PremiumCustomerRecord(com.bayor.froporec.annotation.client.data6_complexpojos.PremiumCustomer premiumCustomer) {
		this(premiumCustomer.getFirstName(), premiumCustomer.getLastName(), premiumCustomer.getActive(), premiumCustomer.getAge(), premiumCustomer.getCustomerAddressList().stream().map(object -> new com.bayor.froporec.annotation.client.data6_complexpojos.AddressRecord(object)).collect(java.util.stream.Collectors.toUnmodifiableList()), premiumCustomer.getCustomerContactInfoByType().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> (entry.getKey()), entry -> new com.bayor.froporec.annotation.client.data6_complexpojos.CustomerContactInfoRecord(entry.getValue()))), premiumCustomer.isPremiumCustomer());
	}
}
