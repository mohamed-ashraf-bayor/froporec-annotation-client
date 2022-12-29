package com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-12-28T21:36:09.4518801-05:00",
    comments = "version: 1.4"
)
public record ImmutableSchool(java.lang.String name)  {

	public static final String NAME = "name"; // type: java.lang.String
	
	public ImmutableSchool(com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated.School school) {
		this(school.name());
	}

	public static ImmutableSchool buildWith(com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated.School school) {
		return new ImmutableSchool(school.name());
	}

	public static ImmutableSchool buildWith(com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated.ImmutableSchool immutableSchool) {
		return new ImmutableSchool(immutableSchool.name());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableSchool buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableSchool((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, null));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableSchool buildWith(com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated.School school, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableSchool((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, school.name()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableSchool buildWith(com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated.ImmutableSchool immutableSchool, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableSchool((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, immutableSchool.name()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public ImmutableSchool with(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableSchool((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, this.name()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public <T> ImmutableSchool with(String fieldName, T fieldValue) {
		return new ImmutableSchool(fieldName.equals(NAME) ? (java.lang.String) fieldValue : this.name());
	}
}