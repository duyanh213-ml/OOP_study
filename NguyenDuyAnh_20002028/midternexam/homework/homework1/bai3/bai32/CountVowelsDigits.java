package midternexam.homework.homework1.bai3.bai32;

import java.util.Scanner;

public class CountVowelsDigits {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      countVowelsDigits(scanner);
      System.out.println("\nPress any key to exit...");
      scanner.nextLine();

      clearScreen();

   }

   public static void countVowelsDigits(Scanner scanner) {
      System.out.print("Enter a string: ");
      String text = scanner.nextLine();
      text = text.toLowerCase();

      int vowelsCount = 0;
      int digitalCount = 0;
      double percentOfVowels;
      double percentOfDigits;

      // To calculate 4 variables above
      for (int index = 0; index < text.length(); index++) {
         if (text.charAt(index) == 'a' || text.charAt(index) == 'e' || text.charAt(index) == 'i'
               || text.charAt(index) == 'u' || text.charAt(index) == 'o') {
            vowelsCount++;
         }
         if (text.charAt(index) >= '0' && text.charAt(index) <= '9') {
            digitalCount++;
         }
      }
      percentOfVowels = ((double) vowelsCount / text.length()) * 100.0;
      percentOfDigits = ((double) digitalCount / text.length()) * 100.0;

      System.out.printf("Number of vowels: %d (%.2f%%)", vowelsCount, percentOfVowels);
      System.out.printf(", Number of digits: %d (%.2f%%)", digitalCount, percentOfDigits);

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
