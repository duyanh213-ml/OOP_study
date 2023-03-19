package midternexam.homework.homework2.bai2.bai22;

import java.util.Scanner;

public class FibonacciRecursive {

   public static void main(String[] args) {
      clearScreen();

      Scanner scanner = new Scanner(System.in);
      System.out.println("Calculate the fibonacci of " + 10);
      System.out.println(fibonacci(10));

      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();
   }

   public static int fibonacci(int n) {
      if (n == 0) {
         return 0;
      }

      if (n == 1) {
         return 1;
      }

      return fibonacci(n - 1) + fibonacci(n - 2);
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
