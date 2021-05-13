package design.behavioral.interpreter.messagevalidator;

public class HeaderExpression implements Expression {

   private String data;

   public HeaderExpression(String data){
      this.data = data; 
   }

   @Override
   public boolean interpret(String context) {
   
      if(context.contains(data)){
         return true;
      }
      return false;
   }
}