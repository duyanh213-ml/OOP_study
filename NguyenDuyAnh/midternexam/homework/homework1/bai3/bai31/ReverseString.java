package midternexam.homework.homework1.bai3.bai31;

import java.util.Scanner;

public class ReverseString {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      reverseString(scanner);
      System.out.println("\nPress any key to exit...");
      scanner.nextLine();

      clearScreen();

   }

   public static void reverseString(Scanner scanner) {
      System.out.print("Enter a string: ");
      String text = scanner.nextLine();
      System.out.print("The reverse of string " + text + " is: ");

      for (int index = text.length() - 1; index >= 0; index--) {
         System.out.print(text.charAt(index));
      }
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
