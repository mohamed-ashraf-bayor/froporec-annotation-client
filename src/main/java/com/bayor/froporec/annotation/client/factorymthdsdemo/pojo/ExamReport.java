package com.bayor.froporec.annotation.client.factorymthdsdemo.pojo;

import java.time.LocalDate;

public class ExamReport {
    private int candidateId;
    private String fullName;
    private ContactInfo contactInfo;
    private Integer examId;
    private String submittedExamContent;
    private LocalDate examDate;
    private Double score;
    private Boolean passed;

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ContactInfo getConctactInfo() {
        return contactInfo;
    }

    public void setConctactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public String getSubmittedExamContent() {
        return submittedExamContent;
    }

    public void setSubmittedExamContent(String submittedExamContent) {
        this.submittedExamContent = submittedExamContent;
    }

    public LocalDate getExamDate() {
        return examDate;
    }

    public void setExamDate(LocalDate examDate) {
        this.examDate = examDate;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Boolean isPassed() {
        return passed;
    }

    public void setPassed(Boolean passed) {
        this.passed = passed;
    }

    @Override
    public String toString() {
        return "{" +
                "candidateId=" + candidateId +
                ", fullName=\"" + fullName + '\"' +
                ", conctactInfo=" + contactInfo +
                ", examId=" + examId +
                ", submittedExamContent=" + (submittedExamContent == null ? "null" : ("\"" + submittedExamContent + "\"")) +
                ", examDate=" + examDate +
                ", score=" + score +
                ", passed=" + passed +
                '}';
    }
}