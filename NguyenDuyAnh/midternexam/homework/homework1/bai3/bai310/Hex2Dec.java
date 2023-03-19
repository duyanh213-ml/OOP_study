package midternexam.homework.homework1.bai3.bai310;

import java.util.Scanner;

public class Hex2Dec {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      convertHexToDecimal(scanner);
      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();
   }

   public static void convertHexToDecimal(Scanner scanner) {
      System.out.print("Enter a hexical string: ");
      String text = scanner.nextLine();
      boolean flag = true;
      for (int index = 0; index < text.length(); index++) {
         if (!(text.charAt(index) >= '0' && text.charAt(index) <= '9'
               || text.charAt(index) >= 'a' && text.charAt(index) <= 'f')) {
            flag = false;
            break;
         }
      }
      if (flag) {
         int decimal = Integer.parseInt(text, 16);
         System.out.println("The equivalent decimal number of hexical \"" + text + "\" is: " + decimal);

      } else {
         System.out.println("\"" + text + "\" is not a hex String");

      }
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
