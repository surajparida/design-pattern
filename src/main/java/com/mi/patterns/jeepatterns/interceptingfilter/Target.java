package com.mi.patterns.jeepatterns.interceptingfilter;

public class Target {
   public void execute(String request){
      System.out.println("Executing request: " + request);
   }
}
