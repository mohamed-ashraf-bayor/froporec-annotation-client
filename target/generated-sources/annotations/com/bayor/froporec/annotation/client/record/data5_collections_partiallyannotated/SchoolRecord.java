package com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2023-01-02T14:58:47.4580303-05:00",
    comments = "version: 1.4"
)
public record SchoolRecord(java.lang.String name)  {

	public static final String NAME = "name"; // type: java.lang.String
	
	public SchoolRecord(com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.School school) {
		this(school.getName());
	}

	public static SchoolRecord buildWith(com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.School school) {
		return new SchoolRecord(school.getName());
	}

	public static SchoolRecord buildWith(com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.SchoolRecord schoolRecord) {
		return new SchoolRecord(schoolRecord.name());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static SchoolRecord buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new SchoolRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, null));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static SchoolRecord buildWith(com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.School school, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new SchoolRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, school.getName()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static SchoolRecord buildWith(com.bayor.froporec.annotation.client.record.data5_collections_partiallyannotated.SchoolRecord schoolRecord, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new SchoolRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, schoolRecord.name()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public SchoolRecord with(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new SchoolRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, this.name()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public <T> SchoolRecord with(String fieldName, T fieldValue) {
		return new SchoolRecord(fieldName.equals(NAME) ? (java.lang.String) fieldValue : this.name());
	}
}