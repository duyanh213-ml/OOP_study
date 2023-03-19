package midternexam.lab.lab2.bai1.bai12;

import java.util.Scanner;

public class PrintArrayInStars {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the number of items: ");
      int numberOfItem = scanner.nextInt();

      int itemArray[] = new int[numberOfItem];

      System.out.print("Enter the value of all items (separated by space): ");
      for (int index = 0; index < itemArray.length; index++) {
         itemArray[index] = scanner.nextInt();
      }

      for (int index = 0; index < itemArray.length; index++) {
         System.out.print(itemArray[index] + ":  ");
         for (int numberOfStars = 0; numberOfStars < itemArray[index]; numberOfStars++) {
            System.out.print("*");
         }
         System.out.println("(" + itemArray[index] + ")");
      }
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
