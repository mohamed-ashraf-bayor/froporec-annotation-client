package com.bayor.froporec.annotation.client.factorymthds.factorymthds;


import org.froporec.annotations.Immutable;

import java.time.LocalDate;

@Immutable
public record ExamReport(int candidateId, String fullName, ContactInfo contactInfo,
                         Integer examId, String submittedExamContent, LocalDate examDate,
                         Double score, Boolean passed) {}