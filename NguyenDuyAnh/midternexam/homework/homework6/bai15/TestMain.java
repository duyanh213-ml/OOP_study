package midternexam.homework.homework6.bai15;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      GeometricObject circle = new Circle(10.0);

      System.out.println(circle);
      System.out.println(circle.getArea());
      System.out.println(circle.getPerimeter());

      ResizableCircle resizableCircle = new ResizableCircle(8.8);

      System.out.println(resizableCircle);
      System.out.println(resizableCircle.getArea());
      System.out.println(resizableCircle.getPerimeter());
      resizableCircle.resize(80);
      System.out.println(resizableCircle);
      
      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
