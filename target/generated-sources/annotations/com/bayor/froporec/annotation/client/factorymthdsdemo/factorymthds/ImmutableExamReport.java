package com.bayor.froporec.annotation.client.factorymthdsdemo.factorymthds;

@javax.annotation.processing.Generated(
    value = "org.froporec.FroporecAnnotationProcessor",
    date = "2023-01-02T14:58:47.6800285-05:00",
    comments = "version: 1.4"
)
public record ImmutableExamReport(int candidateId, java.lang.String fullName, com.bayor.froporec.annotation.client.factorymthdsdemo.factorymthds.ContactInfo contactInfo, java.lang.Integer examId, java.lang.String submittedExamContent, java.time.LocalDate examDate, java.lang.Double score, java.lang.Boolean passed)  {

	public static final String CANDIDATE_ID = "candidateId"; // type: int
	public static final String FULL_NAME = "fullName"; // type: java.lang.String
	public static final String CONTACT_INFO = "contactInfo"; // type: com.bayor.froporec.annotation.client.factorymthdsdemo.factorymthds.ContactInfo
	public static final String EXAM_ID = "examId"; // type: java.lang.Integer
	public static final String SUBMITTED_EXAM_CONTENT = "submittedExamContent"; // type: java.lang.String
	public static final String EXAM_DATE = "examDate"; // type: java.time.LocalDate
	public static final String SCORE = "score"; // type: java.lang.Double
	public static final String PASSED = "passed"; // type: java.lang.Boolean
	
	public ImmutableExamReport(com.bayor.froporec.annotation.client.factorymthdsdemo.factorymthds.ExamReport examReport) {
		this(examReport.candidateId(), examReport.fullName(), examReport.contactInfo(), examReport.examId(), examReport.submittedExamContent(), examReport.examDate(), examReport.score(), examReport.passed());
	}

	public static ImmutableExamReport buildWith(com.bayor.froporec.annotation.client.factorymthdsdemo.factorymthds.ExamReport examReport) {
		return new ImmutableExamReport(examReport.candidateId(), examReport.fullName(), examReport.contactInfo(), examReport.examId(), examReport.submittedExamContent(), examReport.examDate(), examReport.score(), examReport.passed());
	}

	public static ImmutableExamReport buildWith(com.bayor.froporec.annotation.client.factorymthdsdemo.factorymthds.ImmutableExamReport immutableExamReport) {
		return new ImmutableExamReport(immutableExamReport.candidateId(), immutableExamReport.fullName(), immutableExamReport.contactInfo(), immutableExamReport.examId(), immutableExamReport.submittedExamContent(), immutableExamReport.examDate(), immutableExamReport.score(), immutableExamReport.passed());
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableExamReport buildWith(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableExamReport((int) fieldsNameValuePairs.getOrDefault(CANDIDATE_ID, 0), (java.lang.String) fieldsNameValuePairs.getOrDefault(FULL_NAME, null), (com.bayor.froporec.annotation.client.factorymthdsdemo.factorymthds.ContactInfo) fieldsNameValuePairs.getOrDefault(CONTACT_INFO, null), (java.lang.Integer) fieldsNameValuePairs.getOrDefault(EXAM_ID, null), (java.lang.String) fieldsNameValuePairs.getOrDefault(SUBMITTED_EXAM_CONTENT, null), (java.time.LocalDate) fieldsNameValuePairs.getOrDefault(EXAM_DATE, null), (java.lang.Double) fieldsNameValuePairs.getOrDefault(SCORE, null), (java.lang.Boolean) fieldsNameValuePairs.getOrDefault(PASSED, null));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableExamReport buildWith(com.bayor.froporec.annotation.client.factorymthdsdemo.factorymthds.ExamReport examReport, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableExamReport((int) fieldsNameValuePairs.getOrDefault(CANDIDATE_ID, examReport.candidateId()), (java.lang.String) fieldsNameValuePairs.getOrDefault(FULL_NAME, examReport.fullName()), (com.bayor.froporec.annotation.client.factorymthdsdemo.factorymthds.ContactInfo) fieldsNameValuePairs.getOrDefault(CONTACT_INFO, examReport.contactInfo()), (java.lang.Integer) fieldsNameValuePairs.getOrDefault(EXAM_ID, examReport.examId()), (java.lang.String) fieldsNameValuePairs.getOrDefault(SUBMITTED_EXAM_CONTENT, examReport.submittedExamContent()), (java.time.LocalDate) fieldsNameValuePairs.getOrDefault(EXAM_DATE, examReport.examDate()), (java.lang.Double) fieldsNameValuePairs.getOrDefault(SCORE, examReport.score()), (java.lang.Boolean) fieldsNameValuePairs.getOrDefault(PASSED, examReport.passed()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public static ImmutableExamReport buildWith(com.bayor.froporec.annotation.client.factorymthdsdemo.factorymthds.ImmutableExamReport immutableExamReport, java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableExamReport((int) fieldsNameValuePairs.getOrDefault(CANDIDATE_ID, immutableExamReport.candidateId()), (java.lang.String) fieldsNameValuePairs.getOrDefault(FULL_NAME, immutableExamReport.fullName()), (com.bayor.froporec.annotation.client.factorymthdsdemo.factorymthds.ContactInfo) fieldsNameValuePairs.getOrDefault(CONTACT_INFO, immutableExamReport.contactInfo()), (java.lang.Integer) fieldsNameValuePairs.getOrDefault(EXAM_ID, immutableExamReport.examId()), (java.lang.String) fieldsNameValuePairs.getOrDefault(SUBMITTED_EXAM_CONTENT, immutableExamReport.submittedExamContent()), (java.time.LocalDate) fieldsNameValuePairs.getOrDefault(EXAM_DATE, immutableExamReport.examDate()), (java.lang.Double) fieldsNameValuePairs.getOrDefault(SCORE, immutableExamReport.score()), (java.lang.Boolean) fieldsNameValuePairs.getOrDefault(PASSED, immutableExamReport.passed()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public ImmutableExamReport with(java.util.Map<String, Object> fieldsNameValuePairs) {
		return new ImmutableExamReport((int) fieldsNameValuePairs.getOrDefault(CANDIDATE_ID, this.candidateId()), (java.lang.String) fieldsNameValuePairs.getOrDefault(FULL_NAME, this.fullName()), (com.bayor.froporec.annotation.client.factorymthdsdemo.factorymthds.ContactInfo) fieldsNameValuePairs.getOrDefault(CONTACT_INFO, this.contactInfo()), (java.lang.Integer) fieldsNameValuePairs.getOrDefault(EXAM_ID, this.examId()), (java.lang.String) fieldsNameValuePairs.getOrDefault(SUBMITTED_EXAM_CONTENT, this.submittedExamContent()), (java.time.LocalDate) fieldsNameValuePairs.getOrDefault(EXAM_DATE, this.examDate()), (java.lang.Double) fieldsNameValuePairs.getOrDefault(SCORE, this.score()), (java.lang.Boolean) fieldsNameValuePairs.getOrDefault(PASSED, this.passed()));
	}

	@java.lang.SuppressWarnings("unchecked")
	public <T> ImmutableExamReport with(String fieldName, T fieldValue) {
		return new ImmutableExamReport(fieldName.equals(CANDIDATE_ID) ? (int) fieldValue : this.candidateId(), fieldName.equals(FULL_NAME) ? (java.lang.String) fieldValue : this.fullName(), fieldName.equals(CONTACT_INFO) ? (com.bayor.froporec.annotation.client.factorymthdsdemo.factorymthds.ContactInfo) fieldValue : this.contactInfo(), fieldName.equals(EXAM_ID) ? (java.lang.Integer) fieldValue : this.examId(), fieldName.equals(SUBMITTED_EXAM_CONTENT) ? (java.lang.String) fieldValue : this.submittedExamContent(), fieldName.equals(EXAM_DATE) ? (java.time.LocalDate) fieldValue : this.examDate(), fieldName.equals(SCORE) ? (java.lang.Double) fieldValue : this.score(), fieldName.equals(PASSED) ? (java.lang.Boolean) fieldValue : this.passed());
	}
}