package midternexam.lab.lab2.bai2.bai25;

import java.util.Scanner;

public class IsContain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         System.out.print("Enter the number of items in array: ");
         int numberOfArr5 = scanner.nextInt();
         int array5[] = new int[numberOfArr5];

         System.out.print("Enter the value of all items (separated by space): ");
         for (int index = 0; index < array5.length; index++) {
            array5[index] = scanner.nextInt();
         }

         System.out.print("Enter the number you want to find: ");
         int keyNumber = scanner.nextInt();
         if (isContain(array5, keyNumber)) {
            System.out.println(keyNumber + " contains in this array");
         } else {
            System.out.println(keyNumber + " does not contains in this array");
         }
      } catch (Exception e) {
         System.out.println("invalid input!!!!");
      }

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();
   }

   public static boolean isContain(int arr[], int key) {
      if (arr == null) {
         System.out.println("Null array!!!");
         return false;
      }
      for (int index = 0; index < arr.length; index++) {
         if (key == arr[index]) {
            return true;
         }
      }
      return false;
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
