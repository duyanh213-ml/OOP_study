package midternexam.lab.lab2.bai2.bai27;

import java.util.Scanner;

public class IsEqual {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      try {
         System.out.print("Enter the number of items in array 1: ");
         int numberOfArr7 = scanner.nextInt();
         int array7[] = new int[numberOfArr7];

         System.out.print("Enter the value of all items (separated by space): ");
         for (int index = 0; index < array7.length; index++) {
            array7[index] = scanner.nextInt();
         }

         System.out.print("Enter the number of items in array 2: ");
         int numberOfArr8 = scanner.nextInt();
         int array8[] = new int[numberOfArr8];

         System.out.print("Enter the value of all items (separated by space): ");
         for (int index = 0; index < array8.length; index++) {
            array8[index] = scanner.nextInt();
         }

         if (isEqual(array7, array8)) {
            System.out.println("2 array are equal!!!");
         } else {
            System.out.println("2 array are not equal!!!");

         }
      } catch (Exception e) {
         System.out.println("invalid input!!!!");
      }

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();
   }

   public static boolean isEqual(int arr1[], int arr2[]) {
      if (arr1 == null || arr2 == null) {
         System.out.println("Null array!!!!!");
         return false;
      }
      if (arr1.length == arr2.length) {
         for (int index = 0; index < arr1.length; index++) {
            if (arr1[index] != arr2[index]) {
               return false;
            }
         }
         return true;
      }
      return false;
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
