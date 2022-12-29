package com.bayor.froporec.annotation.client.factorymthds.factorymthds;

import java.time.LocalDate;
import java.util.Map;
import java.util.Random;

import static com.bayor.froporec.annotation.client.factorymthds.factorymthds.ImmutableExamReport.CANDIDATE_ID;
import static com.bayor.froporec.annotation.client.factorymthds.factorymthds.ImmutableExamReport.CONTACT_INFO;
import static com.bayor.froporec.annotation.client.factorymthds.factorymthds.ImmutableExamReport.EXAM_DATE;
import static com.bayor.froporec.annotation.client.factorymthds.factorymthds.ImmutableExamReport.EXAM_ID;
import static com.bayor.froporec.annotation.client.factorymthds.factorymthds.ImmutableExamReport.FULL_NAME;
import static com.bayor.froporec.annotation.client.factorymthds.factorymthds.ImmutableExamReport.PASSED;
import static com.bayor.froporec.annotation.client.factorymthds.factorymthds.ImmutableExamReport.SCORE;
import static com.bayor.froporec.annotation.client.factorymthds.factorymthds.ImmutableExamReport.SUBMITTED_EXAM_CONTENT;

public class BusinessLogic {

    public static void main(String[] args) {

        var random = new Random();

        // registerCandidate - set params: candidateId, fullName, contactInfo
        // var johnCandidate = new ExamReport(random.nextInt(), "John Smith", new ContactInfo("john@john.com", "london"), 0, null, null, 0, false);
        var johnCandidate = ImmutableExamReport.buildWith(Map.of(CANDIDATE_ID, random.nextInt(), FULL_NAME, "John Smith", CONTACT_INFO, new ContactInfo("john@john.com", "london")));
        displayData(johnCandidate, "registerCandidate");

        // submitExamContent - set params: examId, submittedExamContent, examDate
        // var johnExam = new ExamReport(johnCandidate.candidateId(), johnCandidate.fullName(), johnCandidate.contactInfo(), random.nextInt(), "text...text...text...", LocalDate.now(), null, null);
        var johnExam = ImmutableExamReport.buildWith(johnCandidate, Map.of(EXAM_ID, random.nextInt(), SUBMITTED_EXAM_CONTENT, "text...text...text...", EXAM_DATE, LocalDate.now()));
        displayData(johnExam, "submitExamContent");

        // evaluate - set params: score, passed
        // var johnEvaluation = new ExamReport(johnExam.candidateId(), johnExam.fullName(), johnExam.contactInfo(), johnExam.examId(), johnExam.submittedExamContent(), johnExam.examDate(), random.nextDouble(), random.nextBoolean());
        var johnEvaluation = johnExam.with(SCORE, Math.ceil(random.nextDouble() * 100)).with(PASSED, random.nextBoolean());
        displayData(johnEvaluation, "evaluate");

//        var johnCandidate = ImmutableExamReport
//                .buildWith(Map.of(CANDIDATE_ID, random.nextInt(), FULL_NAME, "John Smith", CONTACT_INFO, new ContactInfo("john@john.com", "london")))
//                .with(Map.of(EXAM_ID, random.nextInt(), SUBMITTED_EXAM_CONTENT, "text...text...text...", EXAM_DATE, LocalDate.now()))
//                .with(SCORE, Math.ceil(random.nextDouble() * 100))
//                .with(PASSED, random.nextBoolean());
//        displayData(johnCandidate, "evaluate");
    }

    private static void displayData(ImmutableExamReport immutableExamReport, String step) {
        System.out.println("\n\n" + step + " - Saved data:\n" + immutableExamReport);
    }
}