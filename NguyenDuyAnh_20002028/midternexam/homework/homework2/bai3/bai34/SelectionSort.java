package midternexam.homework.homework2.bai3.bai34;

import java.util.Scanner;

public class SelectionSort {

   public static void main(String a[]) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      int arr[] = { 4, 6, 1, 2, 10, 8, 14 };

      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }

      usingSelectionSort(arr);

      System.out.println("\nAfter using selection sort: ");
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void usingSelectionSort(int[] arr) {

      if (arr == null) {
         return;
      }

      int index;
      int temp;

      for (int i = 0; i < arr.length - 1; i++) {
         index = i;

         for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[index]) {
               index = j;
            }
         }

         temp = arr[index];
         arr[index] = arr[i];
         arr[i] = temp;
      }
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

}