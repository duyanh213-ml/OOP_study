package midternexam.homework.homework2.bai3.bai33;

import java.util.Scanner;

public class BubbleSort {

   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      int arr[] = { 4, 6, 1, 2, 10, 8, 14 };

      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }

      usingBubbleSort(arr);

      System.out.println("\nAfter using bubble sort: ");
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }

      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void usingBubbleSort(int[] arr) {

      if (arr == null) {
         return;
      }

      int temp;

      for (int i = 0; i < arr.length; i++) {
         for (int j = 1; j < (arr.length - i); j++) {
            if (arr[j - 1] > arr[j]) {
               temp = arr[j - 1];
               arr[j - 1] = arr[j];
               arr[j] = temp;
            }

         }
      }

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

}