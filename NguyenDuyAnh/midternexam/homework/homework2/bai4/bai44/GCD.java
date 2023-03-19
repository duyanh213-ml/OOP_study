package midternexam.homework.homework2.bai4.bai44;

import java.util.Scanner;

public class GCD {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      System.out.println("GCD of (10, 5), (5, 25), (8, 5), (100, 50) and (18, 12):");
      System.out.println(gcd(10, 5));
      System.out.println(gcd(5, 25));
      System.out.println(gcd(8, 5));
      System.out.println(gcd(100, 50));
      System.out.println(gcd(18, 12));

      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static int gcd(int num1, int num2) {
      if (num1 > num2) {
         return viTriGCD(num1, num2);
      }
      return viTriGCD(num2, num1);
   }

   private static int viTriGCD(int soLonHon, int soBeHon) {
      while (soBeHon != 0) {
         int temp = soBeHon;
         soBeHon = soLonHon % soBeHon;
         soLonHon = temp;
      }
      return soLonHon;
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
