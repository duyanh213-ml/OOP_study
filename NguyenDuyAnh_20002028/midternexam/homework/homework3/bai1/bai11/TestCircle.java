package midternexam.homework.homework3.bai1.bai11;

import java.util.Scanner;

public class TestCircle {

   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      // Create an instance

      Circle circle1 = new Circle();

      circle1.setRadius(3.0);
      circle1.setColor("green");

      System.out.println("The circle 1 has: " + circle1);
      System.out.printf("Area of circle 1 = %.2f%n", circle1.getArea());
      if (circle1.getArea() == -1) {
         System.out.println("The \"area = -1.0\" means the radius is invalid");
      }

      // Create another instance

      Circle circle2 = new Circle(-4.5);

      circle2.setColor("gray");

      System.out.println("The circle 2 has: " + circle2);
      System.out.printf("Area of circle 2 = %.2f%n", circle2.getArea());
      if (circle2.getArea() == -1) {
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
