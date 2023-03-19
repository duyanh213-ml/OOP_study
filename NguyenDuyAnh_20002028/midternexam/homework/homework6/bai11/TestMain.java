package midternexam.homework.homework6.bai11;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      Shape shape = new Circle(4.5, "orange", false);

      System.out.println(shape);
      System.out.println(shape.getArea());
      System.out.println(shape.getColor());
      System.out.println(shape.getPerimeter());
      System.out.println(shape.isFilled());

      Circle circle = (Circle) shape;

      System.out.println(circle);
      System.out.println(circle.getArea());
      System.out.println(circle.getColor());
      System.out.println(circle.getPerimeter());
      System.out.println(circle.isFilled());

      Shape shape2 = new Rectangle(4.5, 4.0);

      System.out.println(shape2);
      System.out.println(shape2.getArea());
      System.out.println(shape2.getColor());
      System.out.println(shape2.getPerimeter());
      System.out.println(shape2.isFilled());

      Rectangle shape3 = new Square(3.0);

      System.out.println(shape3);
      System.out.println(shape3.getArea());
      System.out.println(shape3.getColor());
      System.out.println(shape3.getPerimeter());
      System.out.println(shape3.isFilled());
      
      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
