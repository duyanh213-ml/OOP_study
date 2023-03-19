package midternexam.homework.homework1.bai1.bai16;

import java.util.Scanner;

public class HillPattern {
   public static void main(String[] args) {
      clearScreen();

      Scanner scanner = new Scanner(System.in);
      try {
         printHillPattern(scanner);
      } catch (Exception e) {
         System.out.println("Invalid input!!!");
      }
      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();
   }

   public static void printHillPattern(Scanner scanner) {
      System.out.print("Enter the size: ");
      int size = scanner.nextInt();

      // Check the validity of user input
      if (size > 0) {
         System.out.println("A\n");
         printHillPatternA(size);
         System.out.println("\nB\n");
         printHillPatternB(size);
         System.out.println("\nC\n");
         printHillPatternC(size);
         System.out.println("\nD\n");
         printHillPatternD(size);
      } else {
         System.out.println("Invalid input!!!");
      }
   }

   // In hill-partern A and B, we use matrix size (n x 2x - 1)
   private static void printHillPatternA(int size) {
      int distance = 0; // to increase "#" when the row index go up
      for (int row = 1; row <= size; row++) {
         for (int column = 1; column <= (2 * size) - 1; column++) {
            if (column <= size + distance && column >= size - distance) {
               System.out.print("# ");
            } else {
               System.out.print("  ");
            }
         }
         distance++;
         System.out.println(); // to the nextline
      }

   }

   private static void printHillPatternB(int size) {
      int distance = size - 1; // to decrease "#" when the row index increase
      for (int row = 1; row <= size; row++) {
         for (int column = 1; column <= (2 * size) - 1; column++) {
            if (column <= size + distance && column >= size - distance) {
               System.out.print("# ");
            } else {
               System.out.print("  ");
            }
         }
         distance--;
         System.out.println(); // to the nextline
      }
   }
   // In hill-partern A and B, we use matrix size (2n - 1 x 2x - 1)

   private static void printHillPatternC(int size) {
      int distance = 0;
      for (int row = 1; row <= (2 * size) - 1; row++) {
         if (row <= size) {
            for (int column = 1; column <= (2 * size) - 1; column++) {
               if (column <= size + distance && column >= size - distance) {
                  System.out.print("# ");
               } else {
                  System.out.print("  ");
               }
            }
            distance++;
         } else {
            distance--; // (notice)
            for (int column = 1; column <= (2 * size) - 1; column++) {
               // we have to plus 1 in both condition to make sure that the number of item '#'
               // in row size + 1 have to be equal to the one's in row n - 1;
               if (column <= size + distance - 1 && column >= size - distance + 1) {
                  System.out.print("# ");
               } else {
                  System.out.print("  ");
               }
            }

         }

         System.out.println(); // to the nextline
      }
   }

   private static void printHillPatternD(int size) {
      int distance = 0;
      for (int row = 1; row <= (2 * size); row++) {
         if (row <= size) {
            for (int column = 1; column <= (2 * size) - 1; column++) {
               if (column < size + distance && column > size - distance) {
                  // This is just the difference between C & D
                  System.out.print("  "); // ("# ") in C
               } else {
                  System.out.print("# "); // (" ") in C
               }
            }
            distance++;
         } else {
            distance--; // (notice)
            for (int column = 1; column <= (2 * size) - 1; column++) {
               // This is just the difference between C & D
               if (column <= size + distance - 1 && column >= size - distance + 1) {
                  System.out.print("  "); // ("# ") in C
               } else {
                  System.out.print("# "); // (" ") in C
               }
            }

         }

         System.out.println(); // to the nextline
      }
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
