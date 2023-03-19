package midternexam.homework.homework2.bai2.bai21;

import java.util.Scanner;

public class FactorialRecursive {

   public static void main(String[] args) {
      clearScreen();

      Scanner scanner = new Scanner(System.in);
      System.out.println(factorial(6));
      System.out.println(factorial(7));
      System.out.println(factorial(8));
      System.out.println(factorial(9));

      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();
   }

   public static int factorial(int n) {
      if (n == 0 || n == 1) {
         return 1;
      }
      return n * factorial(n - 1);
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
