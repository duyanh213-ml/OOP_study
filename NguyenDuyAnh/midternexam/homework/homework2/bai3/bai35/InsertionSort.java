package midternexam.homework.homework2.bai3.bai35;

import java.util.Scanner;

public class InsertionSort {

   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      int arr[] = { 4, 6, 1, 2, 10, 8, 14 };

      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }

      usingInsertionSort(arr);

      System.out.println("\nAfter using insertion sort: ");
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }

      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void usingInsertionSort(int arr[]) {

      if (arr == null) {
         return;
      }

      int temp;
      int index;

      for (int i = 1; i < arr.length; i++) {
         temp = arr[i];
         index = i - 1;
         while ((index > -1) && (arr[index] > temp)) {
            arr[index + 1] = arr[index];
            index--;
         }
         arr[index + 1] = temp;
      }
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
