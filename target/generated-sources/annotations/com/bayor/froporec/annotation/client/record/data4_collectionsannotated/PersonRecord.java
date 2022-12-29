package com.bayor.froporec.annotation.client.record.data4_collectionsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-12-28T21:36:09.4018833-05:00",
    comments = "version: 1.4"
)
public record PersonRecord(java.lang.String lastname, int age)  {

	public static final String LASTNAME = "lastname"; // type: java.lang.String
	public static final String AGE = "age"; // type: int
	
	public PersonRecord(com.bayor.froporec.annotation.client.record.data4_collectionsannotated.Person person) {
		this(person.getLastname(), person.getAge());
	}

	public static PersonRecord buildWith(com.bayor.froporec.annotation.client.record.data4_collectionsannotated.Person person) {
		return new PersonRecord(person.getLastname(), person.getAge());
	}

	public static PersonRecord buildWith(com.bayor.froporec.annotation.client.record.data4_collectionsannotated.PersonRecord personRecord) {
		return new PersonRecord(personRecord.lastname(), personRecord.age());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static PersonRecord buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new PersonRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, null), (int) fieldsNameValuePairs.getOrDefault(AGE, 0));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static PersonRecord buildWith(com.bayor.froporec.annotation.client.record.data4_collectionsannotated.Person person, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new PersonRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, person.getLastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, person.getAge()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static PersonRecord buildWith(com.bayor.froporec.annotation.client.record.data4_collectionsannotated.PersonRecord personRecord, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new PersonRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, personRecord.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, personRecord.age()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public PersonRecord with(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new PersonRecord((java.lang.String) fieldsNameValuePairs.getOrDefault(LASTNAME, this.lastname()), (int) fieldsNameValuePairs.getOrDefault(AGE, this.age()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public <T> PersonRecord with(String fieldName, T fieldValue) {
		return new PersonRecord(fieldName.equals(LASTNAME) ? (java.lang.String) fieldValue : this.lastname(), fieldName.equals(AGE) ? (int) fieldValue : this.age());
	}
}