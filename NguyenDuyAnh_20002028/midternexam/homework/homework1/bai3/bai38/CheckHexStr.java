package midternexam.homework.homework1.bai3.bai38;

import java.util.Scanner;

public class CheckHexStr {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      checkHexString(scanner);
      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();
   }

   public static void checkHexString(Scanner scanner) {
      System.out.print("Enter a string: ");
      String text = scanner.nextLine();
      text = text.toLowerCase();
      boolean flag = true;
      for (int index = 0; index < text.length(); index++) {
         if (!(text.charAt(index) >= '0' && text.charAt(index) <= '9'
               || text.charAt(index) >= 'a' && text.charAt(index) <= 'f')) {
            flag = false;
            break;
         }
      }
      if (flag) {
         System.out.println("\"" + text + "\" is a hex String");

      } else {
         System.out.println("\"" + text + "\" is not a hex String");

      }
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
