package midternexam.homework.homework1.bai3.bai311;

import java.util.Scanner;

public class Oct2Dec {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      convertOctToDecimal(scanner);
      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();
   }

   public static void convertOctToDecimal(Scanner scanner) {
      System.out.print("Enter a oct string: ");
      String text = scanner.nextLine();
      boolean flag = true;
      for (int index = 0; index < text.length(); index++) {
         if (!(text.charAt(index) >= '0' && text.charAt(index) <= '7')) {
            flag = false;
            break;
         }
      }
      if (flag) {
         int decimal = Integer.parseInt(text, 8);
         System.out.println("The equivalent decimal number of OCT \"" + text + "\" is: " + decimal);

      } else {
         System.out.println("\"" + text + "\" is not a OCT String");

      }
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
