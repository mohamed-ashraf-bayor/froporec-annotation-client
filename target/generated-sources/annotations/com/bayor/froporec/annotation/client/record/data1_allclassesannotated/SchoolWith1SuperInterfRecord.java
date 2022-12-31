package com.bayor.froporec.annotation.client.record.data1_allclassesannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-12-30T21:03:44.0135558-05:00",
    comments = "version: 1.4"
)
public record SchoolWith1SuperInterfRecord(java.lang.String name) implements com.bayor.froporec.annotation.client.testinterf.TestInterface1 {

	public static final String NAME = "name"; // type: java.lang.String
	
	public SchoolWith1SuperInterfRecord(com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolWith1SuperInterf schoolWith1SuperInterf) {
		this(schoolWith1SuperInterf.getName());
	}

	public static SchoolWith1SuperInterfRecord buildWith(com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolWith1SuperInterf schoolWith1SuperInterf) {
		return new SchoolWith1SuperInterfRecord(schoolWith1SuperInterf.getName());
	}

	public static SchoolWith1SuperInterfRecord buildWith(com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolWith1SuperInterfRecord schoolWith1SuperInterfRecord) {
		return new SchoolWith1SuperInterfRecord(schoolWith1SuperInterfRecord.name());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static SchoolWith1SuperInterfRecord buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new SchoolWith1SuperInterfRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, null));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static SchoolWith1SuperInterfRecord buildWith(com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolWith1SuperInterf schoolWith1SuperInterf, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new SchoolWith1SuperInterfRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, schoolWith1SuperInterf.getName()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static SchoolWith1SuperInterfRecord buildWith(com.bayor.froporec.annotation.client.record.data1_allclassesannotated.SchoolWith1SuperInterfRecord schoolWith1SuperInterfRecord, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new SchoolWith1SuperInterfRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, schoolWith1SuperInterfRecord.name()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public SchoolWith1SuperInterfRecord with(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new SchoolWith1SuperInterfRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(NAME, this.name()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public <T> SchoolWith1SuperInterfRecord with(String fieldName, T fieldValue) {
		return new SchoolWith1SuperInterfRecord(fieldName.equals(NAME) ? (java.lang.String) fieldValue : this.name());
	}
}