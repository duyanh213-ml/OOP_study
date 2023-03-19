package midternexam.lab.lab1.bai3.bai32;

import java.util.Scanner;

public class CircleComputation {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         System.out.println("choose one of these options.");
         System.out.println("1. Display computations of circle");
         System.out.println("2. Display computations of sphere");
         System.out.println("3. Display computations of cylinder");
         System.out.print("Your choice (Enter 1, 2 or 3): ");
         int choice = scanner.nextInt();

         if (choice == 1) {
            circleComputation(scanner);
         } else if (choice == 2) {
            sphereComputation(scanner);
         } else if (choice == 3) {
            cylinderComputation(scanner);
         } else {
            System.out.println("Your choice is not valid!!!!!!");
         }
      } catch (Exception e) {
         System.out.println("Invalid input!!!");
      }

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();
   }

   public static void circleComputation(Scanner scanner) {
      System.out.print("Enter the radius: ");
      double radius = scanner.nextDouble();
      double diameter = 2.0 * radius;
      double area = Math.PI * radius * radius;
      double circumference = Math.PI * diameter;
      System.out.printf("diameter is: %.2f%n", diameter);
      System.out.printf("area is: %.2f%n", area);
      System.out.printf("circumference is: %.2f%n", circumference);

   }

   public static void sphereComputation(Scanner scanner) {
      System.out.print("Enter the radius: ");
      double radius = scanner.nextDouble();
      double surfaceArea = 4 * Math.PI * radius * radius;
      double volume = 4 / 3 * Math.PI * radius * radius * radius;
      System.out.printf("surface area is: %.2f%n", surfaceArea);
      System.out.printf("volumn is: %.2f%n", volume);

   }

   public static void cylinderComputation(Scanner scanner) {
      System.out.print("Enter the radius: ");
      double radius = scanner.nextDouble();
      System.out.print("Enter the height: ");
      double height = scanner.nextDouble();
      double baseArea = Math.PI * radius * radius;
      double surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
      double volume = baseArea * height;
      System.out.printf("base area is: %.2f%n", baseArea);
      System.out.printf("surface area is: %.2f%n", surfaceArea);
      System.out.printf("volumn is: %.2f%n", volume);

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
