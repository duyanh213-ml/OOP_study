package midternexam.homework.homework2.bai1.bai16;

import java.util.Scanner;

public class SystemConversion {

   public static Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
      clearScreen();
      try {
         System.out.print("Enter the input radix: ");
         int inRadix = scanner.nextInt();
         scanner.nextLine();

         System.out.print("Enter a number(suitable for input radix): ");
         String in = scanner.nextLine();

         System.out.print("Enter the output radix: ");
         int outRadix = scanner.nextInt();
         scanner.nextLine();

         System.out
               .println(in + " in radix " + inRadix + " is " + toRadix(in, inRadix, outRadix)
                     + " in radix " + outRadix);
      } catch (Exception e) {
         System.out.println("Invalid input");
      }

      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();
   }

   public static String toRadix(String in, int inRadix, int outRadix) {

      int num = Integer.parseInt(in, inRadix);
      return Integer.toUnsignedString(num, outRadix);
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
