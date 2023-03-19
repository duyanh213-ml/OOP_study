package midternexam.homework.homework2.bai4.bai42;

import java.util.Scanner;

public class PrimeNumber {

   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      try {
         System.out.print("Enter the upper bound: ");
         int upperBound = scanner.nextInt();
         numberList(upperBound);
      } catch (Exception e) {
         System.out.println("Invalid input!!!!");
      }

      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();

   }

   public static boolean isPrime(int num) {

      if (num < 2) {
         return false;
      }

      if (num == 2) {
         return true;
      }

      for (int i = 2; i <= Math.sqrt(num); i++) {
         if (num % i == 0) {
            return false;
         }
      }

      return true;
   }

   public static void numberList(int upperBound) {

      if (upperBound <= 0) {
         System.out.println("Upper bound is should be positive!!!!! ");
      } else {

         int countPrime = 0;

         System.out.println("These number are prime: ");
         for (int i = 1; i <= upperBound; i++) {
            if (isPrime(i)) {
               System.out.println(i);
               countPrime++;
            }
         }
         double result = ((double) 100.0 * countPrime / upperBound);
         System.out.printf("%n[ %d prime number found (%.2f%%)]%n", countPrime, result);

      }
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
