package design.behavioral.chainofresponsibility.job;

public class CancelOrders extends Job {

   public CancelOrders(int jobId){
      this.jobId = jobId;
   }

   @Override
   protected void process(String message) {
      System.out.println(message);
      System.out.println("Order Cancellation Completed");
   }
}