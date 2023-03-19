package midternexam.homework.homework3.bai1.bai12;

import java.util.Scanner;

public class TestCircle {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      Circle circle1 = new Circle(1.1);
      System.out.println(circle1);

      circle1.setRadius(2.2);
      System.out.println(circle1);

      System.out.printf("Circumference of circle 1 = %.2f%n", circle1.getCircumference());
      if (circle1.getArea() == -1) {
         System.out.println("The \"area = -1.0\" means the radius is invalid");
      }

      System.out.printf("Area of circle 1 = %.2f%n", circle1.getArea());
      if (circle1.getArea() == -1) {
         System.out.println("The \"area = -1.0\" means the radius is invalid");
      }

      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

}
