package midternexam.lab.lab1.bai2.bai21;

import java.util.Scanner;

public class SumAverageRunningInt {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         System.out.println("There are 2 ways of executing this program, choose one of them");
         System.out.println("1. Using for-loop");
         System.out.println("2. Using while-loop");
         System.out.println("Enter your choice by press 1 or 2 on keyboard");

         int choice = scanner.nextInt();

         if (choice == 1) {
            usingForLoop();
         } else if (choice == 2) {
            usingWhileLoop(true);
         } else {
            System.out.println("Your choice is not valid!!!!!!");
         }

         System.out.println("Application of loop:");
         System.out.println("From 111 to 8899:");
         sumAverageRunningInt();
         sumOfTheSquares();
         sumOfTheOdd_EvenAndTheAbsDifference();
      } catch (Exception e) {
         System.out.println("Invalid input!!!!!");
      }

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();
   }

   public static void usingForLoop() {
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;

      int sum = 0;
      for (int i = LOWERBOUND; i <= UPPERBOUND; i++) {
         sum += i;
      }
      double average = (double) sum / 100;
      System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
      System.out.println("The average is " + average);
   }

   public static void usingWhileLoop(boolean isUsingWhileDo) {
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;
      int sum = 0;
      int count = LOWERBOUND;

      if (isUsingWhileDo) {
         while (count <= UPPERBOUND) {
            sum += count;
            count++;
         }
      } else {
         do {
            sum += count;
            count++;
         } while (count <= UPPERBOUND);
      }
      double average = (double) sum / 100;
      System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
      System.out.println("The average is " + average);
   }

   public static void sumAverageRunningInt() {
      final int LOWERBOUND = 111;
      final int UPPERBOUND = 8899;

      int sum = 0;
      int count = 0;

      for (int i = LOWERBOUND; i <= UPPERBOUND; i++) {
         sum += i;
         count++;
      }

      double average = (double) sum / count;
      System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
      System.out.println("The average is " + average);
   }

   public static void sumOfTheSquares() {
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;

      int sum = 0;
      for (int i = LOWERBOUND; i <= UPPERBOUND; i++) {
         sum += i * i;
      }
      System.out.println("The sum of the squares" + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
   }

   public static void sumOfTheOdd_EvenAndTheAbsDifference() {
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;

      int sumOdd = 0;
      int sumEven = 0;

      for (int i = LOWERBOUND; i <= UPPERBOUND; i++) {
         if (i % 2 == 0)
            sumEven += i;
         else
            sumOdd += i;
      }

      int absDiff = (sumOdd > sumEven) ? sumOdd - sumEven : sumEven - sumOdd;

      System.out.println("The sum of the odd number from" + LOWERBOUND + " to " + UPPERBOUND + " is " + sumOdd);
      System.out.println("The sum of the even number from" + LOWERBOUND + " to " + UPPERBOUND + " is " + sumEven);
      System.out.println("The absolute difference between them is: " + absDiff);

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
