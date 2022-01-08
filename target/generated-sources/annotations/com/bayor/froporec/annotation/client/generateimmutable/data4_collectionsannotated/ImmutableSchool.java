package com.bayor.froporec.annotation.client.generateimmutable.data4_collectionsannotated;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2022-01-08T16:18:17.4428131-05:00",
    comments = "version: 1.2"
)
public record ImmutableSchool(java.lang.String name) {
	public ImmutableSchool(com.bayor.froporec.annotation.client.generateimmutable.data4_collectionsannotated.School school) {
		this(school.name());
	}
}
