package midternexam.lab.lab2.bai1.bai14;

import java.util.Scanner;

public class Hex2Bin {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a hexadecimal string: ");
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
         final String[] HEX_BITS = { "0000", "0001", "0010", "0011", "0100", "0101", "0110",
               "0111", "1000", "1001", "1010", "1011", "1100", "1101",
               "1110", "1111" };
         System.out.print("The eqivalent binary for hexical " + text + " is: ");
         for (int indexOfText = 0; indexOfText < text.length(); indexOfText++) {
            int numberOfHexical = (int) text.charAt(indexOfText) - 48;
            if (text.charAt(indexOfText) >= 'a' && text.charAt(indexOfText) <= 'f') {
               numberOfHexical = (int) text.charAt(indexOfText) - 87;
            }
            System.out.print(HEX_BITS[numberOfHexical] + " ");
         }
         System.out.println();

      } else {
         System.out.println("\"" + text + "\" is not a hexical String");

      }
      System.out.println("Press any key to exit...");
      scanner.nextLine();

      clearScreen();
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
