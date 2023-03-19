package midternexam.lab.lab2.bai2.bai210;

import java.util.Scanner;

public class ReverseArray {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         System.out.print("Enter the number of items in array 1: ");
         int numberOfArr12 = scanner.nextInt();
         int array12[] = new int[numberOfArr12];

         System.out.print("Enter the value of all items (separated by space): ");
         for (int index = 0; index < array12.length; index++) {
            array12[index] = scanner.nextInt();
         }

         array12 = reverseArray(array12);

         System.out.println("After reversing: ");
         for (int index = 0; index < array12.length; index++) {
            System.out.print(array12[index] + " ");
         }
      } catch (Exception e) {
         System.out.println("Invalid input!!!!");
      }

      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();
   }

   public static int[] reverseArray(int arr[]) {
      if (arr == null) {
         System.out.println("Null Array");
         int array[] = new int[1];
         array[0] = -1;
         return array;
      }
      for (int index = 0; index < arr.length / 2; index++) {
         int temp = arr[index];
         arr[index] = arr[arr.length - 1 - index];
         arr[arr.length - 1 - index] = temp;
      }
      return arr;
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

}
