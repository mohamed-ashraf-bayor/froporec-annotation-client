package com.bayor.froporec.annotation.client.record.data1_allclassesannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2023-01-02T14:58:47.5390279-05:00",
    comments = "version: 1.4"
)
public record SchoolWithMultipleSuperInterfRecord(java.lang.String name) implements com.bayor.froporec.annotation.client.testinterf.TestInterface1, com.bayor.froporec.annotation.client.testinterf.TestInterface2 {

	public static final String NAME = "name"; // type: java.lang.String
	
	public SchoolWithMultipleSuperInterfRecord(com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolWithMultipleSuperInterf schoolWithMultipleSuperInterf) {
		this(schoolWithMultipleSuperInterf.getName());
	}

	public static SchoolWithMultipleSuperInterfRecord buildWith(com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolWithMultipleSuperInterf schoolWithMultipleSuperInterf) {
		return new SchoolWithMultipleSuperInterfRecord(schoolWithMultipleSuperInterf.getName());
	}

	public static SchoolWithMultipleSuperInterfRecord buildWith(com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolWithMultipleSuperInterfRecord schoolWithMultipleSuperInterfRecord) {
		return new SchoolWithMultipleSuperInterfRecord(schoolWithMultipleSuperInterfRecord.name());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static SchoolWithMultipleSuperInterfRecord buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new SchoolWithMultipleSuperInterfRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, null));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static SchoolWithMultipleSuperInterfRecord buildWith(com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolWithMultipleSuperInterf schoolWithMultipleSuperInterf, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new SchoolWithMultipleSuperInterfRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, schoolWithMultipleSuperInterf.getName()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static SchoolWithMultipleSuperInterfRecord buildWith(com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolWithMultipleSuperInterfRecord schoolWithMultipleSuperInterfRecord, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new SchoolWithMultipleSuperInterfRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, schoolWithMultipleSuperInterfRecord.name()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public SchoolWithMultipleSuperInterfRecord with(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new SchoolWithMultipleSuperInterfRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, this.name()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public <T> SchoolWithMultipleSuperInterfRecord with(String fieldName, T fieldValue) {
		return new SchoolWithMultipleSuperInterfRecord(fieldName.equals(NAME) ? (java.lang.String) fieldValue : this.name());
	}
}