package com.mi.patterns.behavioral.visitor.computer;

public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}
