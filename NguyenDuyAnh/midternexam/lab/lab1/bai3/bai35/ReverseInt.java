package midternexam.lab.lab1.bai3.bai35;

import java.util.Scanner;

public class ReverseInt {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         System.out.println("Enter a number: ");
         int number = scanner.nextInt();

         System.out.print("The reverse number is: ");
         while (number > 0) {
            int digit = number % 10;
            System.out.print(digit);
            number /= 10;
         }
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
