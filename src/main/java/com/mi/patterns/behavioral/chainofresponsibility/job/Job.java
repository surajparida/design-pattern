package com.mi.patterns.behavioral.chainofresponsibility.job;

public abstract class Job {
   public static int CANCEL_ORDERS = 1;
   public static int DAILY_REPORTING = 2;
   public static int EMAIL_REMINDER = 3;

   protected int jobId;

   //next element in chain or responsibility
   protected Job job;

   public void setJob(Job job){
      this.job = job;
   }

   public void begin(int jobId, String message){
      if(this.jobId == jobId){
         process(message);
      }
      if(job !=null){
         job.begin(jobId, message);
      }
   }

   abstract protected void process(String message);

}
