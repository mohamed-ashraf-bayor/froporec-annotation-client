package com.bayor.froporec.annotation.client.factorymthdsdemo.record;

import java.time.LocalDate;
import java.util.Random;

public class BusinessLogic {

    public static void main(String[] args) {

        var random = new Random();

        // registerCandidate - set params: candidateId, fullName, contactInfo
        var johnCandidate = new ExamReport(random.nextInt(), "John Smith", new ContactInfo("john@john.com", "london"), null, null, null, null, null);
        displayData(johnCandidate, "registerCandidate");

        // submitExamContent - set params: examId, submittedExamContent, examDate
        var johnExam = new ExamReport(johnCandidate.candidateId(), johnCandidate.fullName(), johnCandidate.contactInfo(), random.nextInt(), "text...text...text...", LocalDate.now(), null, null);
        displayData(johnExam, "submitExamContent");

        // evaluate - set params: score, passed
        var johnEvaluation = new ExamReport(johnExam.candidateId(), johnExam.fullName(), johnExam.contactInfo(), johnExam.examId(), johnExam.submittedExamContent(), johnExam.examDate(), Math.ceil(random.nextDouble() * 100), random.nextBoolean());
        displayData(johnEvaluation, "evaluate");
    }

    private static void displayData(ExamReport examReport, String step) {
        System.out.println("\n\n" + step + " - Saved data:\n" + examReport);
    }
}