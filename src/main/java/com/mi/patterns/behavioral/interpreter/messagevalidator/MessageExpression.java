package com.mi.patterns.behavioral.interpreter.messagevalidator;

public class MessageExpression implements Expression {

    private Expression header = null;
    private Expression content = null;

    public MessageExpression(Expression header, Expression content) {
        this.header = header;
        this.content = content;
    }

    @Override
    public boolean interpret(String context) {
        return header.interpret(context) || content.interpret(context);
    }
}
