package midternexam.lab.lab2.bai2.bai21;

import java.util.Scanner;

public class Exponent {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         System.out.print("Enter the base: ");
         int base = scanner.nextInt();
         System.out.print("Enter the exponent: ");
         int exp = scanner.nextInt();
         System.out.print(base + " raise to the power of " + exp + " is: " +
               exponent(base, exp));
         System.out.println();
      } catch (Exception e) {
         System.out.println("invalid input!!!!");
      }

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();

   }

   public static int exponent(int base, int exp) {
      int result = 1;
      for (int raiseTime = 1; raiseTime <= exp; raiseTime++) {
         result *= base;
      }
      return result;
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
