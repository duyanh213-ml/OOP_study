package midternexam.lab.lab1.bai3.bai36;

import java.util.Scanner;

public class InputValidation {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         System.out.println("Enter a number between 0-10 or 90-100: ");
         int number = scanner.nextInt();

         while (number < 0 || (number > 10 && number < 90) || number > 100) {
            System.out.println("Invalid input, try again...");
            System.out.println("Enter a number between 0-10 or 90-100: ");
            number = scanner.nextInt();
         }

         System.out.println("You have entered: " + number);
      } catch (Exception e) {
         System.out.println("Invalid input!!!!!");
      }

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
