package midternexam.lab.lab2.bai1.bai11;

import java.util.Scanner;

public class PrintArray {
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

      System.out.print("The values are: [");
      for (int index = 0; index < itemArray.length; index++) {
         if (index != itemArray.length - 1) {
            System.out.print(itemArray[index] + ", ");
         } else {
            System.out.print(itemArray[index]);
         }
      }
      System.out.println("]");
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
