package com.mi.patterns.behavioral.observer.subject;

public abstract class Observer {
   protected Subject subject;
   public abstract void update();
}
