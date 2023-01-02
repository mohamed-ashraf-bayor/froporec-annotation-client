package com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2023-01-02T14:58:47.6360294-05:00",
    comments = "version: 1.4"
)
public record ImmutableSchool(java.lang.String name)  {

	public static final String NAME = "name"; // type: java.lang.String
	
	public ImmutableSchool(com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.School school) {
		this(school.name());
	}

	public static ImmutableSchool buildWith(com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.School school) {
		return new ImmutableSchool(school.name());
	}

	public static ImmutableSchool buildWith(com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool immutableSchool) {
		return new ImmutableSchool(immutableSchool.name());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableSchool buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableSchool((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, null));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableSchool buildWith(com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.School school, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableSchool((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, school.name()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableSchool buildWith(com.bayor.froporec.annotation.client.immutable.data2_fieldsannotated.ImmutableSchool immutableSchool, java.util.Map<String, Object> fieldsNameValuePairs) {
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