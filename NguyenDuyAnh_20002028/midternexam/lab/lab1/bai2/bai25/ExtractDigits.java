package midternexam.lab.lab1.bai2.bai25;

import java.util.Scanner;

public class ExtractDigits {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         System.out.println("Enter number to reverse and extract: ");
         int numberToExtract = scanner.nextInt();
         extractDigits(numberToExtract);
      } catch (Exception e) {
         System.out.println("Invalid input!!!");
      }

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();
   }

   public static void extractDigits(int numberToExtract) {
      while (numberToExtract > 0) {
         int digit = numberToExtract % 10;
         System.out.print(digit + " ");
         numberToExtract /= 10;
      }
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
