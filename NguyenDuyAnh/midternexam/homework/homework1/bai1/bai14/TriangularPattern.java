package midternexam.homework.homework1.bai1.bai14;

import java.util.Scanner;

public class TriangularPattern {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         printTriangularPattern(scanner);

      } catch (Exception e) {
         System.out.println("Invalid input!!!!");
      }
      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();

   }

   public static void printTriangularPattern(Scanner scanner) {
      System.out.print("Enter the size: ");
      int size = scanner.nextInt();

      // Check the validity of user input
      if (size > 0) {
         System.out.println("A\n");
         printTriangularPatternA(size);
         System.out.println("\nB\n");
         printTriangularPatternB(size);
         System.out.println("\nC\n");
         printTriangularPatternC(size);
         System.out.println("\nD\n");
         printTriangularPatternD(size);

      } else {
         System.out.println("Invalid input");
      }
   }
   // We use matrix by double for-loop to create 4 kind of triangle A, B, C, D

   // Pattern A
   private static void printTriangularPatternA(int size) {
      for (int row = 1; row <= size; row++) {
         for (int column = 1; column <= size; column++) {
            if (column <= row) {
               // a black space after "#" use to make output-view look clearly
               System.out.print("# ");
            } else {
               System.out.print("  ");
            }
         }
         System.out.println(); // to the nextline
      }
   }

   // Pattern B
   private static void printTriangularPatternB(int size) {
      for (int row = 1; row <= size; row++) {
         for (int column = size; column >= 1; column--) {
            if (column >= row) {
               // a black space after "#" use to make output-view look like a "real" triangle
               System.out.print("# ");
            } else {
               System.out.print("  ");
            }
         }
         System.out.println(); // to the nextline
      }
   }

   // Pattern C
   private static void printTriangularPatternC(int size) {
      for (int row = 1; row <= size; row++) {
         for (int column = 1; column <= size; column++) {
            if (column >= row) {
               // a black space after "#" use to make output-view look like a "real" triangle
               System.out.print("# ");
            } else {
               System.out.print("  ");
            }
         }
         System.out.println(); // to the nextline
      }
   }

   // Pattern D
   private static void printTriangularPatternD(int size) {
      for (int row = 1; row <= size; row++) {
         for (int column = size; column >= 1; column--) {
            if (column <= row) {
               // a black space after "#" use to make output-view look like a "real" triangle
               System.out.print("# ");
            } else {
               System.out.print("  ");
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
