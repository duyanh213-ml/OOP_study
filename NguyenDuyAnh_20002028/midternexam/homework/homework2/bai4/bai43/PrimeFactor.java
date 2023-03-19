package midternexam.homework.homework2.bai4.bai43;

import java.util.Scanner;

import midternexam.homework.homework2.bai4.bai42.PrimeNumber;

public class PrimeFactor {
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

   public static boolean isPrimeFactor(int num) {
      int count = 0;
      for (int i = 2; i < num; i++) {
         if (PrimeNumber.isPrime(i)) {
            count++;
         }
      }
      int primeItem[] = new int[count];
      count = 0;
      for (int i = 2; i < num; i++) {
         if (PrimeNumber.isPrime(i)) {
            primeItem[count] = i;
            count++;
         }
      }

      return isEqual1(primeItem, 0, num);
   }

   private static boolean isEqual1(int primeItem[], int temp, int num) {
      if (primeItem == null) {
         return false;
      }
      if (num < 3 && temp == 0) {
         return false;
      }
      if (num < 1 && temp > 0) {
         return false;
      }
      if (num == 1 && temp > 0) {
         return true;
      }
      while (num % primeItem[temp] != 0) {
         temp++;
         if (temp == primeItem.length) {
            return false;
         }
      }
      num /= primeItem[temp];

      return isEqual1(primeItem, temp + 1, num);
   }

   public static void numberList(int upperBound) {

      if (upperBound <= 0) {
         System.out.println("Upper bound is should be positive!!!!! ");
      } else {

         int countPrime = 0;

         System.out.println("These number are prime factors: ");
         for (int i = 1; i <= upperBound; i++) {
            if (isPrimeFactor(i)) {
               System.out.print(i + " ");
               countPrime++;
            }
         }
         System.out.println();
         double result = ((double) 100.0 * countPrime / upperBound);
         System.out.printf("%n[ %d prime factor number found (%.2f%%)]%n", countPrime, result);

      }
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
