package com.mi.patterns.behavioral.chainofresponsibility.job;

public class DailyReport extends Job {

   public DailyReport(int jobId){
      this.jobId = jobId;
   }

   @Override
   protected void process(String message) {
      System.out.println( message);
      System.out.println("Daily Reporting Completed");

   }
}
