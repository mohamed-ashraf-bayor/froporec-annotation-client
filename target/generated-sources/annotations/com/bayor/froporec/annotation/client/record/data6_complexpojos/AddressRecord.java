package com.bayor.froporec.annotation.client.record.data6_complexpojos;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-12-30T21:03:44.0225539-05:00",
    comments = "version: 1.4"
)
public record AddressRecord(java.lang.String streetName, java.lang.String buildingNumber)  {

	public static final String STREET_NAME = "streetName"; // type: java.lang.String
	public static final String BUILDING_NUMBER = "buildingNumber"; // type: java.lang.String
	
	public AddressRecord(com.bayor.froporec.annotation.client.record.data6_complexpojos.Address address) {
		this(address.getStreetName(), address.getBuildingNumber());
	}

	public static AddressRecord buildWith(com.bayor.froporec.annotation.client.record.data6_complexpojos.Address address) {
		return new AddressRecord(address.getStreetName(), address.getBuildingNumber());
	}

	public static AddressRecord buildWith(com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord addressRecord) {
		return new AddressRecord(addressRecord.streetName(), addressRecord.buildingNumber());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static AddressRecord buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new AddressRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(STREET_NAME, null), (java.lang.String) fieldsNameValuePairs.getOrDefault(BUILDING_NUMBER, null));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static AddressRecord buildWith(com.bayor.froporec.annotation.client.record.data6_complexpojos.Address address, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new AddressRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(STREET_NAME, address.getStreetName()), (java.lang.String) fieldsNameValuePairs.getOrDefault(BUILDING_NUMBER, address.getBuildingNumber()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static AddressRecord buildWith(com.bayor.froporec.annotation.client.record.data6_complexpojos.AddressRecord addressRecord, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new AddressRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(STREET_NAME, addressRecord.streetName()), (java.lang.String) fieldsNameValuePairs.getOrDefault(BUILDING_NUMBER, addressRecord.buildingNumber()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public AddressRecord with(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new AddressRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(STREET_NAME, this.streetName()), (java.lang.String) fieldsNameValuePairs.getOrDefault(BUILDING_NUMBER, this.buildingNumber()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public <T> AddressRecord with(String fieldName, T fieldValue) {
		return new AddressRecord(fieldName.equals(STREET_NAME) ? (java.lang.String) fieldValue : this.streetName(), fieldName.equals(BUILDING_NUMBER) ? (java.lang.String) fieldValue : this.buildingNumber());
	}
}