package com.mi.patterns.behavioral.chainofresponsibility.events;

public class Query {
    public String creatureName;
    public Argument argument;
    public int result;

    public Query(String creatureName, Argument argument, int result) {
        this.creatureName = creatureName;
        this.argument = argument;
        this.result = result;
    }

    public enum Argument {
        ATTACK, DEFENSE
    }
}

