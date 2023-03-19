package midternexam.homework.homework2.bai4.bai41;

import java.util.Scanner;

public class PerfectAndDeficient {

   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         System.out.print("Enter the upper bound: ");
         int upperBound = scanner.nextInt();
         numberList(upperBound);
      } catch (Exception e) {
         System.out.println("Invalid input!!!");
      }

      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();

   }

   public static boolean isDeficient(int num) {

      if (num < 1) {
         return false;
      }

      int sum = 1;

      for (int i = 2; i < num; i++) {
         if (num % i == 0) {
            sum += i;
         }
      }

      return (sum < num);
   }

   public static boolean isPerfect(int num) {

      if (num < 2) {
         return false;
      }

      int sum = 1;

      for (int i = 2; i < num; i++) {
         if (num % i == 0) {
            sum += i;
         }
      }

      return (sum == num);
   }

   public static void numberList(int upperBound) {

      if (upperBound <= 0) {
         System.out.println("Upper bound is should be positive!!!!! ");
      } else {

         int countPerfect = 0;
         int countDeficient = 0;
         double result;

         System.out.println("These number are perfect: ");
         for (int i = 1; i <= upperBound; i++) {
            if (isPerfect(i)) {
               System.out.print(i + "\t");
               countPerfect++;
            }
         }
         result = ((double) countPerfect / upperBound) * 100.0;
         System.out.printf("%n%d perfect number found %.2f%%", countPerfect, result);
         System.out.println();

         System.out.println("These number are deficient: ");
         for (int i = 1; i <= upperBound; i++) {
            if (isDeficient(i)) {
               System.out.print(i + "\t");
               countDeficient++;
            }
         }
         result = ((double) countDeficient / upperBound) * 100.0;
         System.out.printf("%n%d deficient number found %.2f%%", countDeficient, result);
         System.out.println();

         System.out.println("These number are neither deficient nor perfect: ");
         for (int i = 1; i <= upperBound; i++) {
            if (!isDeficient(i) && !isPerfect(i)) {
               System.out.print(i + "\t");
            }
         }
         int remainder = upperBound - (countDeficient + countPerfect);
         result = 100.0 * ((double) remainder / upperBound);
         System.out.printf("%n%d number found %.2f%%", remainder, result);
      }
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

}
