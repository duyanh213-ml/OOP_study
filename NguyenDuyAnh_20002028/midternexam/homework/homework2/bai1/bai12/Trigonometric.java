package midternexam.homework.homework2.bai1.bai12;

import java.util.Scanner;

public class Trigonometric {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      System.out.println("sin(pi/2): ");
      System.out.println(sin((3.14 / 2), 10));

      System.out.println("cos(pi/2): ");
      System.out.println(cos(3.14, 10));

      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static double sin(double x, int numTerm) {

      double sinx = x;
      double temp = -1.0 * ((x * x * x) / (2.0 * 3.0));

      for (int i = 2; i <= numTerm; i++) {
         sinx += temp;
         temp *= -1.0 * ((x * x) / (2.0 * i * (2.0 * i + 1.0)));
      }

      return sinx;
   }

   public static double cos(double x, int numTerm) {

      double cosx = 1.0;
      double temp = -1.0 * ((x * x) / (1.0 * 2.0));

      for (int i = 2; i <= numTerm; i++) {
         cosx += temp;
         temp *= -1.0 * ((x * x) / (2.0 * i * (2.0 * i - 1.0)));
      }

      return cosx;
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
