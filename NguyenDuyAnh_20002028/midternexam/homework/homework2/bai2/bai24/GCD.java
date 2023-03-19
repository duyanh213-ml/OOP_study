package midternexam.homework.homework2.bai2.bai24;

import java.util.Scanner;

public class GCD {

   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      int num1 = 100;
      int num2 = 80;

      System.out.println("Great common divisor of " + num1 + " and " + num2 + " is: ");
      System.out.println(findGCD(num1, num2));
      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();
   }

   public static int findGCD(int num1, int num2) {

      if (num2 != 0) {
         return findGCD(num2, num1 % num2);
      }

      return num1;
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
