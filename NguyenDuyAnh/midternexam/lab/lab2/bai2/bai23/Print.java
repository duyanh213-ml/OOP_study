package midternexam.lab.lab2.bai2.bai23;

import java.util.Scanner;

public class Print {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         // Integer type
         System.out.print("Enter the number of items (int arr): ");
         int numberOfArr1 = scanner.nextInt();
         int array[] = new int[numberOfArr1];
         print(scanner, array);

         // Double type
         System.out.print("Enter the number of items (double arr): ");
         int numberOfArr2 = scanner.nextInt();
         double array2[] = new double[numberOfArr2];
         print(scanner, array2);

         // Float type
         System.out.print("Enter the number of items (float arr): ");
         int numberOfArr3 = scanner.nextInt();
         float array3[] = new float[numberOfArr3];
         print(scanner, array3);
      } catch (Exception e) {
         System.out.println("invalid input!!!!");
      }

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();
   }

   public static void print(Scanner scanner, int array[]) {

      if (array == null) {
         return;
      }

      System.out.print("Enter the value of all items (separated by space): ");
      for (int index = 0; index < array.length; index++) {
         array[index] = scanner.nextInt();
      }

      System.out.print("The values are: [");
      for (int index = 0; index < array.length; index++) {
         if (index != array.length - 1)
            System.out.print(array[index] + ", ");
         else
            System.out.print(array[index]);
      }
      System.out.println("]");
   }

   public static void print(Scanner scanner, double array[]) {

      if (array == null) {
         return;
      }

      System.out.print("Enter the value of all items (separated by space): ");
      for (int index = 0; index < array.length; index++) {
         array[index] = scanner.nextDouble();
      }

      System.out.print("The values are: [");
      for (int index = 0; index < array.length; index++) {
         if (index != array.length - 1)
            System.out.print(array[index] + ", ");
         else
            System.out.print(array[index]);
      }
      System.out.println("]");
   }

   public static void print(Scanner scanner, float array[]) {

      if (array == null) {
         return;
      }

      System.out.print("Enter the value of all items (separated by space): ");
      for (int index = 0; index < array.length; index++) {
         array[index] = scanner.nextFloat();
      }

      System.out.print("The values are: [");
      for (int index = 0; index < array.length; index++) {
         if (index != array.length - 1)
            System.out.print(array[index] + ", ");
         else
            System.out.print(array[index]);
      }
      System.out.println("]");
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
