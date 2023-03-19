package midternexam.homework.homework1.bai1.bai11;

import java.util.Scanner;

public class SquarePattern {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {

         System.out.println("-Using for loop");
         useForLoopSquarePattern(scanner);
         System.out.println("-Using while-do loop");
         useWhileDoLoopSquarePattern(scanner);

      } catch (Exception e) {
         System.out.println("Invalid input");
      }
      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();

   }

   // Using for loop
   public static void useForLoopSquarePattern(Scanner scanner) {
      System.out.print("Enter the size: ");
      int sizeOfSquare = scanner.nextInt();

      // Check the validity of user input
      if (sizeOfSquare > 0) {
         // Outer loop to print each of row
         for (int row = 1; row <= sizeOfSquare; row++) {
            System.out.print("\t"); // to move the square in the middle of output-view

            // Inner loop to print each of column in a row
            for (int column = 1; column <= sizeOfSquare; column++) {
               System.out.print("# ");
            }
            System.out.println(); // to the nextline after end of a row
         }
      } else {
         System.out.println("Invalid size!!!");
      }
   }

   // Using while loop
   public static void useWhileDoLoopSquarePattern(Scanner scanner) {
      System.out.print("Enter the size: ");
      int sizeOfSquare = scanner.nextInt();

      // Check the validity of user input
      if (sizeOfSquare > 0) {
         // Two below variables use to sign the current column and row when the while-do
         // loop execute
         int currentColumn;
         int currentRow = 1;

         // Outer loop to print each of row
         while (currentRow <= sizeOfSquare) {
            currentColumn = 1;
            System.out.print("\t"); // to move the square in the middle of output-view

            // Inner loop to print each of column in a row
            while (currentColumn <= sizeOfSquare) {
               System.out.print("# ");
               currentColumn++;
            }
            System.out.println(); // to the nextline after end of a row
            currentRow++;
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
