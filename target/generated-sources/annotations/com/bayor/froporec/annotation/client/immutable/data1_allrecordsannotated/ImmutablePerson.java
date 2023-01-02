package com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2023-01-02T14:58:47.5990284-05:00",
    comments = "version: 1.4"
)
public record ImmutablePerson(java.lang.String lastname, int age)  {

	public static final String LASTNAME = "lastname"; // type: java.lang.String
	public static final String AGE = "age"; // type: int
	
	public ImmutablePerson(com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated.Person person) {
		this(person.lastname(), person.age());
	}

	public static ImmutablePerson buildWith(com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated.Person person) {
		return new ImmutablePerson(person.lastname(), person.age());
	}

	public static ImmutablePerson buildWith(com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated.ImmutablePerson immutablePerson) {
		return new ImmutablePerson(immutablePerson.lastname(), immutablePerson.age());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutablePerson buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutablePerson((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, null), (int) fieldsNameValuePairs.getOrDefault(AGE, 0));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutablePerson buildWith(com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated.Person person, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutablePerson((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, person.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, person.age()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutablePerson buildWith(com.bayor.froporec.annotation.client.immutable.data1_allrecordsannotated.ImmutablePerson immutablePerson, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutablePerson((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, immutablePerson.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, immutablePerson.age()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public ImmutablePerson with(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutablePerson((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, this.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, this.age()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public <T> ImmutablePerson with(String fieldName, T fieldValue) {
		return new ImmutablePerson(fieldName.equals(LASTNAME) ? (java.lang.String) fieldValue : this.lastname(), fieldName.equals(AGE) ? (int) fieldValue : this.age());
	}
}