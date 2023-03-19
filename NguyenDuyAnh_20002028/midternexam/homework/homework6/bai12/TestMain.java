package midternexam.homework.homework6.bai12;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      GeometricObject geometricObject = new Circle(4.5);

      System.out.println(geometricObject);
      System.out.println(geometricObject.getArea());
      System.out.println(geometricObject.getPerimeter());

      GeometricObject geometricObject2 = new Rectangle(4.5, 8.2);

      System.out.println(geometricObject2);

      System.out.println(geometricObject2);
      System.out.println(geometricObject2.getArea());
      System.out.println(geometricObject2.getPerimeter());

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
