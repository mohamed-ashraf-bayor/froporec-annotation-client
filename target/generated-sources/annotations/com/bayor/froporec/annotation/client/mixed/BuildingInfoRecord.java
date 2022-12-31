package com.bayor.froporec.annotation.client.mixed;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-12-30T21:03:44.1415548-05:00",
    comments = "version: 1.4"
)
public record BuildingInfoRecord(int number, java.lang.String streetName)  {

	public static final String NUMBER = "number"; // type: int
	public static final String STREET_NAME = "streetName"; // type: java.lang.String
	
	public BuildingInfoRecord(com.bayor.froporec.annotation.client.mixed.BuildingInfo buildingInfo) {
		this(buildingInfo.getNumber(), buildingInfo.getStreetName());
	}

	public static BuildingInfoRecord buildWith(com.bayor.froporec.annotation.client.mixed.BuildingInfo buildingInfo) {
		return new BuildingInfoRecord(buildingInfo.getNumber(), buildingInfo.getStreetName());
	}

	public static BuildingInfoRecord buildWith(com.bayor.froporec.annotation.client.mixed.BuildingInfoRecord buildingInfoRecord) {
		return new BuildingInfoRecord(buildingInfoRecord.number(), buildingInfoRecord.streetName());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static BuildingInfoRecord buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new BuildingInfoRecord((int) fieldsNameValuePairs.getOrDefault(NUMBER, 0), (java.lang.String) fieldsNameValuePairs.getOrDefault(STREET_NAME, null));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static BuildingInfoRecord buildWith(com.bayor.froporec.annotation.client.mixed.BuildingInfo buildingInfo, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new BuildingInfoRecord((int) fieldsNameValuePairs.getOrDefault(NUMBER, buildingInfo.getNumber()), (java.lang.String) fieldsNameValuePairs.getOrDefault(STREET_NAME, buildingInfo.getStreetName()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static BuildingInfoRecord buildWith(com.bayor.froporec.annotation.client.mixed.BuildingInfoRecord buildingInfoRecord, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new BuildingInfoRecord((int) fieldsNameValuePairs.getOrDefault(NUMBER, buildingInfoRecord.number()), (java.lang.String) fieldsNameValuePairs.getOrDefault(STREET_NAME, buildingInfoRecord.streetName()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public BuildingInfoRecord with(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new BuildingInfoRecord((int) fieldsNameValuePairs.getOrDefault(NUMBER, this.number()), (java.lang.String) fieldsNameValuePairs.getOrDefault(STREET_NAME, this.streetName()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public <T> BuildingInfoRecord with(String fieldName, T fieldValue) {
		return new BuildingInfoRecord(fieldName.equals(NUMBER) ? (int) fieldValue : this.number(), fieldName.equals(STREET_NAME) ? (java.lang.String) fieldValue : this.streetName());
	}
}