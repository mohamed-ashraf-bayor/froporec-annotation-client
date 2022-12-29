package com.bayor.froporec.annotation.client.factorymthds.record;

import java.time.LocalDate;

public record ExamReport(int candidateId, String fullName, ContactInfo contactInfo,
                         Integer examId, String submittedExamContent, LocalDate examDate,
                         Double score, Boolean passed) {}