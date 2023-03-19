package midternexam.homework.homework1.bai3.bai312;

import java.util.Scanner;

public class RadixN2Dec {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         convertOctToDecimal(scanner);
      } catch (Exception e) {
         System.out.println("Invalid input!!!!");
      }

      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();
   }

   public static void convertOctToDecimal(Scanner scanner) {
      System.out.print("Enter the radix: ");
      int base = scanner.nextInt();
      scanner.nextLine();
      System.out.print("Enter a string of the radix above: ");
      String text = scanner.nextLine();
      boolean flag = true;

      if (flag) {
         int decimal = toDecimal(text, base);
         System.out.println("The equivalent decimal number of base() " + base + ") \"" + text + "\" is: " + decimal);

      } else {
         System.out.println("\"" + text + "\" is not a " + base + "'s String");

      }
   }

   public static int toDecimal(String str, int base) {
      int len = str.length();
      int power = 1;

      int num = 0;

      for (int i = len - 1; i >= 0; i--) {

         if (val(str.charAt(i)) >= base) {
            System.out.println("Invalid Number");
            return -1;
         }

         num += val(str.charAt(i)) * power;
         power = power * base;
      }

      return num;
   }

   public static int val(char c) {
      if (c >= '0' && c <= '9')
         return (int) c - '0';
      else
         return (int) c - 'A' + 10;
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

}
