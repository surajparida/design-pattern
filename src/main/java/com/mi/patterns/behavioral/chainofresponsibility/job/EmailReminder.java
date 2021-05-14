package com.mi.patterns.behavioral.chainofresponsibility.job;

public class EmailReminder extends Job {

    public EmailReminder(int jobId) {
        this.jobId = jobId;
    }

    @Override
    protected void process(String message) {
        System.out.println(message);
        System.out.println("Email Reminder Completed.");
    }
}
