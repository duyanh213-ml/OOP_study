package midternexam.homework.homework1.bai3.bai34;

import java.util.Scanner;

public class CaesarCode {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      enCeasarCode(scanner);
      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();
   }

   public static void enCeasarCode(Scanner scanner) {
      System.out.print("Enter the message that you want to encode: ");
      String password = scanner.nextLine();
      password = password.toUpperCase();
      System.out.print("The Ceacar code is: ");
      for (int index = 0; index < password.length(); index++) {
         if (password.charAt(index) == 'X') {
            System.out.print('A');
         } else if (password.charAt(index) == 'Y') {
            System.out.print('B');
         } else if (password.charAt(index) == 'Z') {
            System.out.print('C');
         } else {
            int numberOfText = (int) password.charAt(index) + 3;
            System.out.print((char) numberOfText);
         }

      }
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
