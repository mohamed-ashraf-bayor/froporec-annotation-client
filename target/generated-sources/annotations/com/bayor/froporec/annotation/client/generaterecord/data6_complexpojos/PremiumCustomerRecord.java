package com.bayor.froporec.annotation.client.generaterecord.data6_complexpojos;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T16:18:17.4976694-05:00",
    comments = "version: 1.2"
)
public record PremiumCustomerRecord(java.lang.String firstName, java.lang.String lastName, java.lang.Boolean active, int age, java.util.List<com.bayor.froporec.annotation.client.generaterecord.data6_complexpojos.AddressRecord> customerAddressList, java.util.Map<java.lang.String, com.bayor.froporec.annotation.client.generaterecord.data6_complexpojos.CustomerContactInfoRecord> customerContactInfoByType, boolean premiumCustomer) {
	public PremiumCustomerRecord(com.bayor.froporec.annotation.client.generaterecord.data6_complexpojos.PremiumCustomer premiumCustomer) {
		this(premiumCustomer.getFirstName(), premiumCustomer.getLastName(), premiumCustomer.getActive(), premiumCustomer.getAge(), java.util.Optional.ofNullable(premiumCustomer.getCustomerAddressList()).isEmpty() ? java.util.List.of() : premiumCustomer.getCustomerAddressList().stream().map(object -> new com.bayor.froporec.annotation.client.generaterecord.data6_complexpojos.AddressRecord(object)).collect(java.util.stream.Collectors.toUnmodifiableList()), java.util.Optional.ofNullable(premiumCustomer.getCustomerContactInfoByType()).isEmpty() ? java.util.Map.of() : premiumCustomer.getCustomerContactInfoByType().entrySet().stream().collect(java.util.stream.Collectors.toUnmodifiableMap(entry -> (entry.getKey()), entry -> new com.bayor.froporec.annotation.client.generaterecord.data6_complexpojos.CustomerContactInfoRecord(entry.getValue()))), premiumCustomer.isPremiumCustomer());
	}
}
