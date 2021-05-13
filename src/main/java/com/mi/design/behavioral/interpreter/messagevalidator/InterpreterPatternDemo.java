package design.behavioral.interpreter.messagevalidator;

public class InterpreterPatternDemo {

   // THIS Can be added as separate design pattern

   public static Expression getMessageExpression(){
      Expression head = new HeaderExpression("<head>");
      Expression content = new ContentExpression("<body>");
      return new MessageExpression(head, content);
   }


   public static void main(String[] args) {
      Expression isMessage = getMessageExpression();

      System.out.println("Is valid message ? " + isMessage.interpret("<head></head> <body>hi</body>"));
    }
}