package midternexam.homework.homework2.bai1.bai14;

import java.util.Scanner;

public class FactorialInt {

   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      System.out.println("-Integer:");

      int num = 1;
      int factorial = calFactorial(num);

      System.out.println("The factorial of " + num + " is " + factorial);

      while (calFactorial(num) > 0) {

         num++;
         factorial = calFactorial(num);

         if (factorial > 0) {
            System.out.println("The factorial of " + num + " is " + factorial);
         } else {
            System.out.println("The factorial of " + num + " is out of range");
         }

      }

      System.out.println("-Long:");

      long number = 1;
      long longFactorial = calFactorial(number);
      System.out.println("The factorial of " + number + " is " + longFactorial);

      while (calFactorial(number) > 0) {

         number++;
         longFactorial = calFactorial(number);

         if (longFactorial > 0) {
            System.out.println("The factorial of " + number + " is " + longFactorial);
         } else {
            System.out.println("The factorial of " + number + " is out of range");
         }

      }
      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();
   }

   public static int calFactorial(int num) {

      int result = 1;

      for (int i = 2; i <= num; i++) {
         result *= i;
      }

      return result;

   }

   public static long calFactorial(long num) {

      long result = 1;

      for (int i = 2; i <= num; i++) {
         result *= i;
      }

      return result;

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

}
