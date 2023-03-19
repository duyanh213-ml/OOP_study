package midternexam.lab.lab1.bai3.bai31;

import java.util.Scanner;

public class SumProductMinMax3 {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         System.out.println("choose one of these options.");
         System.out.println("1. Display sum, product, min, max of 3 numbers");
         System.out.println("2. Display sum, product, min, max of 5 numbers");
         System.out.print("Your choice (Enter 1 or 2): ");
         int choice = scanner.nextInt();

         if (choice == 1) {
            sumProductMinMax3(scanner);

         } else if (choice == 2) {
            sumProductMinMax5(scanner);

         } else {
            System.out.println("Your choice is not valid!!!!!!");
         }
      } catch (Exception e) {
         System.out.println("Invalid input!!!!");
      }

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();
   }

   public static void sumProductMinMax3(Scanner scanner) {
      System.out.print("Enter 1st integer: ");
      int number1 = scanner.nextInt();
      System.out.print("Enter 2nd integer: ");
      int number2 = scanner.nextInt();
      System.out.print("Enter 3rd integer: ");
      int number3 = scanner.nextInt();
      System.out.println(); // to the next line
      System.out.print("The sum is: " + (number1 + number2 + number3));
      System.out.print("\nThe product is: " + (number1 * number2 * number3));
      System.out.print("\nThe min is: " + Math.min(number1, Math.min(number2, number3)));
      System.out.print("\nThe max is: " + Math.max(number1, Math.max(number2, number3)));

   }

   public static void sumProductMinMax5(Scanner scanner) {
      System.out.print("Enter 1st integer: ");
      int number1 = scanner.nextInt();
      System.out.print("Enter 2nd integer: ");
      int number2 = scanner.nextInt();
      System.out.print("Enter 3rd integer: ");
      int number3 = scanner.nextInt();
      System.out.print("Enter 4th integer: ");
      int number4 = scanner.nextInt();
      System.out.print("Enter 5th integer: ");
      int number5 = scanner.nextInt();
      System.out.println(); // to the next line
      System.out.print("The sum is: " + (number1 + number2 + number3 + number4 + number5));
      System.out.print("\nThe product is: " + (number1 * number2 * number3 * number4 * number5));
      System.out.print(
            "\nThe min is: " + Math.min(number1, Math.min(number2, Math.min(number3, Math.min(number4, number5)))));
      System.out.print(
            "\nThe max is: " + Math.max(number1, Math.max(number2, Math.max(number3, Math.max(number4, number5)))));

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
