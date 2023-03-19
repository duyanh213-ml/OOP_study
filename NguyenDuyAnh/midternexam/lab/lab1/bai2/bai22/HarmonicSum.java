package midternexam.lab.lab1.bai2.bai22;

import java.util.Scanner;

public class HarmonicSum {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      final int MAX_DENOMINATOR = 50000;
      double sum_L2R = 0.0;
      double sum_R2L = 0.0;
      double absDiff;

      for (int i = 1; i <= MAX_DENOMINATOR; i++) {
         sum_L2R += (double) 1 / i;
      }
      System.out.println("The harmonic sum from left to right is: " + sum_L2R);

      for (int i = MAX_DENOMINATOR; i > 0; i--) {
         sum_R2L += (double) 1 / i;
      }
      System.out.println("The harmonic sum from right to left is: " + sum_L2R);

      if (sum_L2R > sum_R2L)
         absDiff = sum_L2R - sum_R2L;
      else
         absDiff = sum_R2L - sum_L2R;
      System.out.println("The absolute difference between them is: " + absDiff);
      
      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
