package midternexam.homework.homework2.bai2.bai23;

import java.util.Scanner;

public class NumberSequenceRecursive {

   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      int number = 10;
      System.out.println("S(" + number + ") = " + representSequence(10));
      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();
   }

   public static String representSequence(int number) {

      if (number == 1) {
         return "1";
      }

      return representSequence(number - 1) + String.valueOf(number);
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
