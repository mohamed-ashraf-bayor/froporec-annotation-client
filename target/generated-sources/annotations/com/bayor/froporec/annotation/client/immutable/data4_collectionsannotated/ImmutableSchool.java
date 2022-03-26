package com.bayor.froporec.annotation.client.immutable.data4_collectionsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-03-26T18:41:04.206939-04:00",
    comments = "version: 1.3"
)
public record ImmutableSchool(java.lang.String name)  {
	public ImmutableSchool(com.bayor.froporec.annotation.client.immutable.data4_collectionsannotated.School school) {
		this(school.name());
	}
}
