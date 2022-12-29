package com.bayor.froporec.annotation.client.factorymthds.pojo;

import java.time.LocalDate;
import java.util.Random;

public class BusinessLogic {

    public static void main(String[] args) {

        var random = new Random();

        // registerCandidate - set params: candidateId, fullName, contactInfo
        var johnReport = new ExamReport();
        johnReport.setCandidateId(random.nextInt());
        johnReport.setFullName("John Smith");
        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setEmail("john@john.com");
        contactInfo.setCity("london");
        johnReport.setConctactInfo(contactInfo);
        displayData(johnReport, "registerCandidate");

        // submitExamContent - set params: examId, submittedExamContent, examDate
        johnReport.setExamId(random.nextInt());
        johnReport.setSubmittedExamContent("text...text...text...");
        johnReport.setExamDate(LocalDate.now());
        displayData(johnReport, "submitExamContent");

        // evaluate - set params: score, passed
        johnReport.setScore(Math.ceil(random.nextDouble() * 100));
        johnReport.setPassed(random.nextBoolean());
        displayData(johnReport, "evaluate");
    }

    private static void displayData(ExamReport examReport, String step) {
        System.out.println("\n\n" + step + " - Saved data:\n" + examReport);
    }
}