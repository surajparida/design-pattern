package design.behavioral.visitor.computer;

public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}