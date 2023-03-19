package midternexam.lab.lab2.bai1.bai15;

import java.util.Scanner;

public class Dec2Hex {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a decimal number: ");
      int decimal = scanner.nextInt();
      System.out.println("The equipvalent hexidecimal number is: " + Integer.toHexString(decimal));
      System.out.println("Press any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
