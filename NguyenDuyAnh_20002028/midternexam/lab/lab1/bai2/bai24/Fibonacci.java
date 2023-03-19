package midternexam.lab.lab1.bai2.bai24;

import java.util.Scanner;

public class Fibonacci {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         System.out.println("choose one of these options.");
         System.out.println("1.Print first 20 fibonacci and average");
         System.out.println("2.Print first 20 tribonacci");
         System.out.print("Your choice (Enter 1 or 2): ");
         int choice = scanner.nextInt();

         if (choice == 1) {
            fibonacci();
         } else if (choice == 2) {
            tribonacci();
         } else {
            System.out.println("Your choice is not valid!!!!!!");
         }
      } catch (Exception e) {
         System.out.println("Invalid input!!!!!");
      }

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();
   }

   public static void fibonacci() {
      int n = 3;
      int fn = 0;
      int fnMinus1 = 1;
      int fnMinus2 = 1;
      int nMax = 20;
      int sum = fnMinus1 + fnMinus2;

      System.out.println("The first " + nMax + " Fibonacci numbers are: ");
      System.out.print(fnMinus2 + " " + fnMinus1 + " ");
      while (n <= nMax) {
         fn = fnMinus1 + fnMinus2;
         System.out.print(fn + " ");
         fnMinus2 = fnMinus1;
         fnMinus1 = fn;
         n++;
         sum += fn;
      }

      double average = (double) sum / nMax;
      System.out.println("\n The average is: " + average);

   }

   public static void tribonacci() {
      int n = 4;
      int fn = 0;
      int fnMinus1 = 2;
      int fnMinus2 = 1;
      int fnMinus3 = 1;
      int nMax = 20;

      System.out.println("The first " + nMax + " Tribonacci numbers are: ");
      System.out.print(fnMinus3 + " " + fnMinus2 + " " + fnMinus1 + " ");
      while (n <= nMax) {
         fn = fnMinus1 + fnMinus2 + fnMinus3;
         System.out.print(fn + " ");
         fnMinus3 = fnMinus2;
         fnMinus2 = fnMinus1;
         fnMinus1 = fn;
         n++;

      }

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
