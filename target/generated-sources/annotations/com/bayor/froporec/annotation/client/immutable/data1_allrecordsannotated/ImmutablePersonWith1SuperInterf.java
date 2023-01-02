package com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2023-01-02T14:58:47.6920283-05:00",
    comments = "version: 1.4"
)
public record ImmutablePersonWith1SuperInterf(java.lang.String lastname, int age) implements com.bayor.froporec.annotation.client.testinterf.TestInterface2 {

	public static final String LASTNAME = "lastname"; // type: java.lang.String
	public static final String AGE = "age"; // type: int
	
	public ImmutablePersonWith1SuperInterf(com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated.PersonWith1SuperInterf personWith1SuperInterf) {
		this(personWith1SuperInterf.lastname(), personWith1SuperInterf.age());
	}

	public static ImmutablePersonWith1SuperInterf buildWith(com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated.PersonWith1SuperInterf personWith1SuperInterf) {
		return new ImmutablePersonWith1SuperInterf(personWith1SuperInterf.lastname(), personWith1SuperInterf.age());
	}

	public static ImmutablePersonWith1SuperInterf buildWith(com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated.ImmutablePersonWith1SuperInterf immutablePersonWith1SuperInterf) {
		return new ImmutablePersonWith1SuperInterf(immutablePersonWith1SuperInterf.lastname(), immutablePersonWith1SuperInterf.age());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutablePersonWith1SuperInterf buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutablePersonWith1SuperInterf((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, null), (int) fieldsNameValuePairs.getOrDefault(AGE, 0));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutablePersonWith1SuperInterf buildWith(com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated.PersonWith1SuperInterf personWith1SuperInterf, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutablePersonWith1SuperInterf((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, personWith1SuperInterf.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, personWith1SuperInterf.age()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutablePersonWith1SuperInterf buildWith(com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated.ImmutablePersonWith1SuperInterf immutablePersonWith1SuperInterf, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutablePersonWith1SuperInterf((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, immutablePersonWith1SuperInterf.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, immutablePersonWith1SuperInterf.age()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public ImmutablePersonWith1SuperInterf with(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutablePersonWith1SuperInterf((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, this.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, this.age()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public <T> ImmutablePersonWith1SuperInterf with(String fieldName, T fieldValue) {
		return new ImmutablePersonWith1SuperInterf(fieldName.equals(LASTNAME) ? (java.lang.String) fieldValue : this.lastname(), fieldName.equals(AGE) ? (int) fieldValue : this.age());
	}
}