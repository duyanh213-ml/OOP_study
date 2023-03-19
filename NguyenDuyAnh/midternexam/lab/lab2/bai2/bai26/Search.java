package midternexam.lab.lab2.bai2.bai26;

import java.util.Scanner;

public class Search {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      try {
         System.out.print("Enter the number of items in array: ");
         int numberOfArr6 = scanner.nextInt();

         int array6[] = new int[numberOfArr6];
         System.out.print("Enter the value of all items (separated by space): ");
         for (int index = 0; index < array6.length; index++) {
            array6[index] = scanner.nextInt();
         }

         System.out.print("Enter the number you want to find: ");
         int keyValue = scanner.nextInt();
         if (search(array6, keyValue) != -1) {
            System.out.println(keyValue + " contains in this array");
         } else {
            System.out.println(keyValue + " does not contains in this array");
         }
      } catch (Exception e) {
         System.out.println("invalid input!!!!");
      }

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();
   }

   public static int search(int arr[], int key) {
      if (arr == null) {
         System.out.println("Null array!!!!!");
         return -1;
      }
      for (int index = 0; index < arr.length; index++) {
         if (key == arr[index]) {
            return key;
         }
      }
      return -1;
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
