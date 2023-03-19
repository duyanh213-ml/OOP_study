package midternexam.homework.homework2.bai1.bai15;

import java.util.Scanner;

public class FibonacciInt {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      System.out.println("-Fibonacci:");

      int num = 0;
      int fibonacci = calFibonacci(num);

      System.out.println("F(" + num + ") = " + fibonacci);

      while (calFibonacci(num) > 0) {

         num++;
         fibonacci = calFibonacci(num);

         if (fibonacci > 0) {
            System.out.println("F(" + num + ") = " + fibonacci);

         } else {
            System.out.println("F(" + num + ") is out of integer ");

         }

      }

      System.out.println("-Triibonacci:");

      num = 0;
      int tribonacci = calTribonacci(num);

      System.out.println("F(" + num + ") = " + tribonacci);

      while (calTribonacci(num) > 0) {

         num++;
         tribonacci = calTribonacci(num);

         if (tribonacci > 0) {
            System.out.println("F(" + num + ") = " + tribonacci);

         } else {
            System.out.println("F(" + num + ") is out of integer ");

         }

      }
      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();
   }

   public static int calFibonacci(int numTerm) {

      if (numTerm >= 0) {

         if (numTerm == 0) {
            return 1;

         } else if (numTerm == 1) {
            return 1;

         } else {

            int fGrandparent = 1;
            int fparent = 1;
            int fibo = 0;

            for (int i = 2; i <= numTerm; i++) {
               fibo = fGrandparent + fparent;
               fGrandparent = fparent;
               fparent = fibo;
            }

            return fibo;
         }
      }
      return -1;
   }

   public static int calTribonacci(int numTerm) {

      if (numTerm >= 0) {

         if (numTerm == 0) {
            return 1;

         } else if (numTerm == 1) {
            return 1;

         } else if (numTerm == 2) {
            return 2;

         } else {

            int fSuperGrandparent = 1;
            int fGrandparent = 1;
            int fparent = 2;
            int fibo = 0;

            for (int i = 2; i <= numTerm; i++) {
               fibo = fSuperGrandparent + fGrandparent + fparent;
               fSuperGrandparent = fGrandparent;
               fGrandparent = fparent;
               fparent = fibo;
            }

            return fibo;
         }
      }
      return -1;
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
