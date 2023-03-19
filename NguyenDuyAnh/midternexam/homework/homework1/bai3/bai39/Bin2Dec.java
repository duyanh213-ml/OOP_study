package midternexam.homework.homework1.bai3.bai39;

import java.util.Scanner;

public class Bin2Dec {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      convertBinToDecimal(scanner);
      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();
   }

   public static void convertBinToDecimal(Scanner scanner) {
      System.out.print("Enter a Binary string: ");
      String text = scanner.nextLine();
      boolean flag = true;
      for (int index = 0; index < text.length(); index++) {
         if (text.charAt(index) != '0' && text.charAt(index) != '1') {
            flag = false;
            break;
         }
      }
      if (flag) {
         int decimal = Integer.parseInt(text, 2);
         System.out.println("The equivalent decimal number of binary \"" + text + "\" is: " + decimal);
      } else {

         System.out.println("\"" + text + "\" invalid binary string");
      }
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
