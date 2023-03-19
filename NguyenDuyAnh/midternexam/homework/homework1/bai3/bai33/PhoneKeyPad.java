package midternexam.homework.homework1.bai3.bai33;

import java.util.Scanner;

public class PhoneKeyPad {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      printPhoneKeyPad(scanner);
      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void printPhoneKeyPad(Scanner scanner) {
      System.out.print("Enter your password: ");
      String password = scanner.nextLine();
      password = password.toLowerCase();
      System.out.print("The sequence of keypad digits is: ");
      for (int index = 0; index < password.length(); index++) {
         System.out.print(deCoding(password.charAt(index)));
      }
   }

   private static int deCoding(char itemOfPassWord) {
      switch (itemOfPassWord) {
         case 'a':
         case 'b':
         case 'c':
            return 2;
         case 'd':
         case 'e':
         case 'f':
            return 3;
         case 'g':
         case 'h':
         case 'i':
            return 4;
         case 'j':
         case 'k':
         case 'l':
            return 5;
         case 'm':
         case 'n':
         case '0':
            return 6;
         case 'p':
         case 'q':
         case 'r':
         case 's':
            return 7;
         case 't':
         case 'u':
         case 'v':
            return 8;
         case 'w':
         case 'x':
         case 'y':
         case 'z':
            return 9;
      }
      return 0;
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
