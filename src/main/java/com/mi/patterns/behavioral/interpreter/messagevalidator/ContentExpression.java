package com.mi.patterns.behavioral.interpreter.messagevalidator;

public class ContentExpression implements Expression {

   private String data = null;

   public ContentExpression(String data){
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
