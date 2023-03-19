package midternexam.homework.homework2.bai1.bai13;

import java.util.Scanner;

public class SpecialSeries {

   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      System.out.println(specialSeries(0.3, 10));
      System.out.println(specialSeries(0.4, 10));
      System.out.println(specialSeries(0.5, 10));
      System.out.println(specialSeries(0.6, 10));
      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();
   }

   public static double specialSeries(double x, int numTerm) {

      if (x > 1 || x < -1) {
         return -1.0;
      }

      double result = x + 0.5;
      double temp1 = (x * x * x) / 3.0;
      double temp2 = (1.0 * 3.0) / (2.0 * 4.0);

      for (int i = 2; i <= numTerm; i++) {
         result *= (temp1 + temp2);
         temp1 *= (x * x / 2 * i + 1);
         temp2 *= (2 * i + 1 / 2 * i + 2);
      }

      return result;

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

}