package midternexam.lab.lab2.bai2.bai28;

import java.util.Scanner;

public class CopyOf {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      try {
         System.out.print("Enter the number of items in array: ");
         int numberOfArr = scanner.nextInt();
         int array[] = new int[numberOfArr];
         System.out.print("Enter the value of all items (separated by space): ");
         for (int index = 0; index < array.length; index++) {
            array[index] = scanner.nextInt();
         }

         System.out.print("The copy version of this array is: ");
         int copyArray[] = copyOf(array);
         for (int index = 0; index < copyArray.length; index++) {
            System.out.print(copyArray[index] + " ");
         }

         System.out.print("\nEnter a new length for copy-array (less than old length): ");
         int newLength = scanner.nextInt();
         System.out.print("The copy version of this array with length " + newLength
               + " is: ");
         copyArray = copyOf(array, newLength);

         for (int index = 0; index < copyArray.length; index++) {
            System.out.print(copyArray[index] + " ");
         }
      } catch (Exception e) {
         System.out.println("invalid input!!!!");
      }

      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();
   }

   public static int[] copyOf(int originalArray[]) {
      if (originalArray == null) {
         System.out.println("Null Array");
         int arr[] = new int[1];
         arr[0] = -1;
         return arr;
      }
      return originalArray;
   }

   public static int[] copyOf(int originalArray[], int newLength) {
      if (originalArray == null) {
         System.out.println("Null Array");
         int arr[] = new int[1];
         arr[0] = -1;
         return arr;
      }
      int copyArray[] = new int[newLength];
      for (int index = 0; index < newLength; index++) {
         copyArray[index] = originalArray[index];
      }
      return copyArray;
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
