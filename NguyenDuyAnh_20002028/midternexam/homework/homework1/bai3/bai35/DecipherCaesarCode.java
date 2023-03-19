package midternexam.homework.homework1.bai3.bai35;

import java.util.Scanner;

public class DecipherCaesarCode {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      deCeasarCode(scanner);
      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void deCeasarCode(Scanner scanner) {
      System.out.print("Enter sequence of Ceasar code: ");
      String password = scanner.nextLine();
      password = password.toUpperCase();
      System.out.print("Decoding: ");
      for (int index = 0; index < password.length(); index++) {
         if (password.charAt(index) == 'A') {
            System.out.print('X');
         } else if (password.charAt(index) == 'B') {
            System.out.print('Y');
         } else if (password.charAt(index) == 'C') {
            System.out.print('Y');
         } else {
            int numberOfText = (int) password.charAt(index) - 3;
            System.out.print((char) numberOfText);
         }

      }
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
