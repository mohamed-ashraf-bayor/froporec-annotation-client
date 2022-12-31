package com.bayor.froporec.annotation.client.mixed;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-12-30T21:03:44.1385555-05:00",
    comments = "version: 1.4"
)
public record ImmutableSchool(java.lang.String name, com.bayor.froporec.annotation.client.mixed.BuildingInfoRecord buildingInfo)  {

	public static final String NAME = "name"; // type: java.lang.String
	public static final String BUILDING_INFO = "buildingInfo"; // type: com.bayor.froporec.annotation.client.mixed.BuildingInfoRecord
	
	public ImmutableSchool(com.bayor.froporec.annotation.client.mixed.School school) {
		this(school.name(), new com.bayor.froporec.annotation.client.mixed.BuildingInfoRecord(school.buildingInfo()));
	}

	public static ImmutableSchool buildWith(com.bayor.froporec.annotation.client.mixed.School school) {
		return new ImmutableSchool(school.name(), new com.bayor.froporec.annotation.client.mixed.BuildingInfoRecord(school.buildingInfo()));
	}

	public static ImmutableSchool buildWith(com.bayor.froporec.annotation.client.mixed.ImmutableSchool immutableSchool) {
		return new ImmutableSchool(immutableSchool.name(), immutableSchool.buildingInfo());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableSchool buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableSchool((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, null), (com.bayor.froporec.annotation.client.mixed.BuildingInfoRecord) fieldsNameValuePairs.getOrDefault(BUILDING_INFO, null));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableSchool buildWith(com.bayor.froporec.annotation.client.mixed.School school, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableSchool((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, school.name()), (com.bayor.froporec.annotation.client.mixed.BuildingInfoRecord) fieldsNameValuePairs.getOrDefault(BUILDING_INFO, new com.bayor.froporec.annotation.client.mixed.BuildingInfoRecord(school.buildingInfo())));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableSchool buildWith(com.bayor.froporec.annotation.client.mixed.ImmutableSchool immutableSchool, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableSchool((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, immutableSchool.name()), (com.bayor.froporec.annotation.client.mixed.BuildingInfoRecord) fieldsNameValuePairs.getOrDefault(BUILDING_INFO, immutableSchool.buildingInfo()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public ImmutableSchool with(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableSchool((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, this.name()), (com.bayor.froporec.annotation.client.mixed.BuildingInfoRecord) fieldsNameValuePairs.getOrDefault(BUILDING_INFO, this.buildingInfo()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public <T> ImmutableSchool with(String fieldName, T fieldValue) {
		return new ImmutableSchool(fieldName.equals(NAME) ? (java.lang.String) fieldValue : this.name(), fieldName.equals(BUILDING_INFO) ? (com.bayor.froporec.annotation.client.mixed.BuildingInfoRecord) fieldValue : this.buildingInfo());
	}
}