package design.creational.facade.shape;

public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Square::draw()");
   }
}