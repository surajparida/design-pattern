package com.mi.patterns.behavioral.chainofresponsibility.job;

public class JobRunner {

   private static Job loadJobs(){

      Job cancelOrders = new CancelOrders(Job.CANCEL_ORDERS);
      Job emailReminder = new EmailReminder(Job.EMAIL_REMINDER);
      Job dailyReport = new DailyReport(Job.DAILY_REPORTING);

      cancelOrders.setJob(emailReminder);
      emailReminder.setJob(dailyReport);

      return cancelOrders;
   }

   public static void main(String[] args) {
      Job job = loadJobs();

      job.begin(Job.CANCEL_ORDERS, "Order Cancellation Starting.");

      job.begin(Job.DAILY_REPORTING, "Daily Reporting Starting.");

      job.begin(Job.EMAIL_REMINDER, "Email Reminder Starting.");
   }
}
