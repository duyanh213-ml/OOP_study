package midternexam.lab.lab2.bai2.bai29;

import java.util.Scanner;

public class Swap {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      try {
         System.out.print("Enter the number of items in array 1: ");
         int numberOfArr10 = scanner.nextInt();
         int array10[] = new int[numberOfArr10];

         System.out.print("Enter the value of all items (separated by space): ");
         for (int index = 0; index < array10.length; index++) {
            array10[index] = scanner.nextInt();
         }

         System.out.print("Enter the number of items in array 2: ");
         int numberOfArr11 = scanner.nextInt();
         int array11[] = new int[numberOfArr11];
         System.out.print("Enter the value of all items (separated by space): ");

         for (int index = 0; index < array11.length; index++) {
            array11[index] = scanner.nextInt();
         }
         boolean canSwap = swap(array10, array11);

         if (canSwap) {
            int tempArr[] = array10;
            array10 = array11;
            array11 = tempArr;
            System.out.println("After swap");
            System.out.println("Array 1: ");

            for (int index = 0; index < array10.length; index++) {
               System.out.print(array10[index] + " ");
            }
            System.out.println("\nArray 2: ");

            for (int index = 0; index < array11.length; index++) {
               System.out.print(array11[index] + " ");
            }
         } else {
            System.out.println("Array 1 and array 2 can not swap with each other!!");
         }
      } catch (Exception e) {
         System.out.println("invalid input!!!!");
      }

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();
   }

   public static boolean swap(int arr1[], int arr2[]) {
      if (arr1 == null || arr2 == null) {
         System.out.println("Null array!!!!");
         return false;
      }
      if (arr1.length == arr2.length) {
         return true;
      }
      return false;
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
