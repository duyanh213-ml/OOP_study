package midternexam.homework.homework2.bai3.bai32;

import java.util.Scanner;

public class BinarySearch {

   public static void main(String args[]) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      int arr[] = { 1, 3, 5, 6, 9, 10 };
      int key = 10;
      int valueReturn = usingBinarySearch(arr, key);

      if (valueReturn != -1) {
         System.out.println(key + " is found in this array at the index " + valueReturn);
      } else {
         System.out.println(key + " is not found in this array");
      }
      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static int usingBinarySearch(int arr[], int key) {

      if (arr == null) {
         return -1;
      }

      int first = 0;
      int last = arr.length;
      int middle = (first + last) / 2;

      while (first <= last) {
         if (arr[middle] < key) {
            first = middle + 1;
         } else if (arr[middle] > key) {
            last = middle - 1;
         } else {
            return middle;
         }
         middle = (first + last) / 2;
      }

      return -1;
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

}
