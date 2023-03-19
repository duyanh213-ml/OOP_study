package midternexam.homework.homework2.bai3.bai31;

import java.util.Scanner;

public class LinearSearch {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      int arr[] = { 1, 3, 5, 6, 9, 10 };
      int key = 5;
      int valueReturn = usingLinearSearch(arr, key);

      if (valueReturn != -1) {
         System.out.println(key + " is found in this array at the index " + valueReturn);
      } else {
         System.out.println(key + " is not found in this array");
      }

      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();
   }

   public static int usingLinearSearch(int arr[], int key) {

      if (arr == null) {
         return -1;
      }

      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == key) {
            return i;
         }
      }

      return -1;
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
