package midternexam.homework.homework1.bai1.bai12;

import java.util.Scanner;

public class CheckerPattern {
   public static void main(String[] args) {
      clearScreen();

      Scanner scanner = new Scanner(System.in);
      try {
         printCheckPattern(scanner);
      } catch (Exception e) {
         System.out.println("Invalid input!!!!");
      }

      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();

   }

   public static void printCheckPattern(Scanner scanner) {
      System.out.print("Enter the size: ");
      int size = scanner.nextInt();

      // Check the validity of user input
      if (size > 0) {
         // The purpose of using double for-loop below is similar to
         // the one's in method squarePatternForLoop()
         for (int row = 1; row <= size; row++) {
            if (row % 2 == 0) {
               System.out.print(" ");
            }
            for (int column = 1; column <= size; column++) {
               System.out.print("# ");
            }
            System.out.println(); // to the nextline after end of a row

         }
      } else {
         System.out.println("Invalid size!!!");
      }
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
