package com.mi.patterns.behavioral.interpreter.messagevalidator;

public interface Expression {
    public boolean interpret(String context);
}
