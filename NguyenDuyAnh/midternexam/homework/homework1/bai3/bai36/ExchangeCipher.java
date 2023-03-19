package midternexam.homework.homework1.bai3.bai36;

import java.util.Scanner;

public class ExchangeCipher {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      exchangeCipherRule(scanner);
      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void exchangeCipherRule(Scanner scanner) {
      System.out.print("Enter the message to encode: ");
      final int keyNumber = (int) 'M';
      String password = scanner.nextLine();
      password = password.toUpperCase();
      System.out.print("Decoding: ");
      for (int index = 0; index < password.length(); index++) {
         int numberOfText = (int) password.charAt(index);
         if (numberOfText > keyNumber) {
            System.out.print((char) (keyNumber - (numberOfText - keyNumber) + 1));
         } else {
            System.out.print((char) (keyNumber + (keyNumber - numberOfText) + 1));
         }

      }
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
