package midternexam.lab.lab1.bai2.bai23;

import java.util.Scanner;

public class ComputePi {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         System.out.println("choose one of these options.");
         System.out.println("1. Using solution 1 to compute PI");
         System.out.println("2. Using solution 2 to compute PI");
         System.out.print("Your choice (Enter 1 or 2): ");
         int choice = scanner.nextInt();

         if (choice == 1) {
            computePIBySolution1(1000);
         } else if (choice == 2) {
            computePIBySolution2(1000);
         } else {
            System.out.println("Your choice is not valid!!!!!!");
         }
      } catch (Exception e) {
         System.out.println("Invalid input!!!");
      }

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();
   }

   public static void computePIBySolution1(int maxDenominator) {
      double sum = 0.0;
      for (int i = 1; i <= maxDenominator; i += 2) {
         if (i % 4 == 1) {
            sum += (double) 4 / i;
         } else if (i % 4 == 3) {
            sum -= (double) 4 / i;
         } else {
            continue;
         }

      }
      System.out.println("The result of pi after computing is: " + sum);
      System.out.println("Compare the values obtained and the " +
            " Math.PI, in percents of Math.PI: " + ((sum / Math.PI) * 100) + "%");
   }

   public static void computePIBySolution2(int maxTerm) {
      double sum = 0.0;
      for (int i = 1; i <= maxTerm; i++) {
         if (i % 2 == 1) {
            sum += (double) 4 / (i * 2 - 1);
         } else if (i % 4 == 3) {
            sum -= (double) 4 / (i * 2 - 1);
         } else {
            continue;
         }

      }
      System.out.println("The result of pi after computing is: " + sum);
      System.out.println("Compare the values obtained and the " +
            " Math.PI, in percents of Math.PI: " + ((sum / Math.PI) * 100) + "%");
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
