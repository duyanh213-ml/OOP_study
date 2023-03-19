package midternexam.lab.lab1.bai3.bai37;

import java.util.Scanner;

public class AverageWithInputValidation {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      try {
         System.out.println("Enter the mark 0-100 for student 1: ");
         int mark1 = scanner.nextInt();

         while (mark1 < 0 || mark1 > 100) {
            System.out.println("Invalid input, try again,...");
            System.out.println("Enter the mark 0-100 for student 1: ");
            mark1 = scanner.nextInt();
         }

         System.out.println("Enter the mark 0-100 for student 2: ");
         int mark2 = scanner.nextInt();

         while (mark2 < 0 || mark2 > 100) {
            System.out.println("Invalid input, try again,...");
            System.out.println("Enter the mark 0-100 for student 2: ");
            mark2 = scanner.nextInt();
         }

         System.out.println("Enter the mark 0-100 for student 3: ");
         int mark3 = scanner.nextInt();

         while (mark3 < 0 || mark3 > 100) {
            System.out.println("Invalid input, try again,...");
            System.out.println("Enter the mark 0-100 for student 3: ");
            mark3 = scanner.nextInt();
         }

         System.out.printf("The average is: %.2f", (mark1 + mark2 + mark3) / 3.0);
      } catch (Exception e) {
         System.out.println("Invalid input!!!!!");
      }

      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
