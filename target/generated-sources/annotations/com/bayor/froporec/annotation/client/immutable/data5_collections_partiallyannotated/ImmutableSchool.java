package com.bayor.froporec.annotation.client.immutable.data5_collections_partiallyannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:04.1889828-04:00",
    comments = "version: 1.3"
)
public record ImmutableSchool(java.lang.String name)  {
	public ImmutableSchool(com.bayor.froporec.annotation.client.immutable.data5_collections_partiallyannotated.School school) {
		this(school.name());
	}
}
