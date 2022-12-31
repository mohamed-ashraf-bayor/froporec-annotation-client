package com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-12-30T21:03:44.1115536-05:00",
    comments = "version: 1.4"
)
public record ImmutablePersonWithMultipleSuperInterf(java.lang.String lastname, int age) implements com.bayor.froporec.annotation.client.testinterf.TestInterface1, com.bayor.froporec.annotation.client.testinterf.TestInterface2 {

	public static final String LASTNAME = "lastname"; // type: java.lang.String
	public static final String AGE = "age"; // type: int
	
	public ImmutablePersonWithMultipleSuperInterf(com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated.PersonWithMultipleSuperInterf personWithMultipleSuperInterf) {
		this(personWithMultipleSuperInterf.lastname(), personWithMultipleSuperInterf.age());
	}

	public static ImmutablePersonWithMultipleSuperInterf buildWith(com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated.PersonWithMultipleSuperInterf personWithMultipleSuperInterf) {
		return new ImmutablePersonWithMultipleSuperInterf(personWithMultipleSuperInterf.lastname(), personWithMultipleSuperInterf.age());
	}

	public static ImmutablePersonWithMultipleSuperInterf buildWith(com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated.ImmutablePersonWithMultipleSuperInterf immutablePersonWithMultipleSuperInterf) {
		return new ImmutablePersonWithMultipleSuperInterf(immutablePersonWithMultipleSuperInterf.lastname(), immutablePersonWithMultipleSuperInterf.age());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutablePersonWithMultipleSuperInterf buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutablePersonWithMultipleSuperInterf((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, null), (int) fieldsNameValuePairs.getOrDefault(AGE, 0));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutablePersonWithMultipleSuperInterf buildWith(com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated.PersonWithMultipleSuperInterf personWithMultipleSuperInterf, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutablePersonWithMultipleSuperInterf((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, personWithMultipleSuperInterf.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, personWithMultipleSuperInterf.age()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutablePersonWithMultipleSuperInterf buildWith(com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated.ImmutablePersonWithMultipleSuperInterf immutablePersonWithMultipleSuperInterf, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutablePersonWithMultipleSuperInterf((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, immutablePersonWithMultipleSuperInterf.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, immutablePersonWithMultipleSuperInterf.age()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public ImmutablePersonWithMultipleSuperInterf with(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutablePersonWithMultipleSuperInterf((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, this.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, this.age()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public <T> ImmutablePersonWithMultipleSuperInterf with(String fieldName, T fieldValue) {
		return new ImmutablePersonWithMultipleSuperInterf(fieldName.equals(LASTNAME) ? (java.lang.String) fieldValue : this.lastname(), fieldName.equals(AGE) ? (int) fieldValue : this.age());
	}
}