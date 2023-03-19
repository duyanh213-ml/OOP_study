package midternexam.lab.lab2.bai2.bai24;

import java.util.Scanner;

public class ArrayToString {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         System.out.print("Enter the number of items: ");

         int numberOfArr4 = scanner.nextInt();
         int array4[] = new int[numberOfArr4];

         String stringToArr = arrayToString(scanner, array4);
         System.out.println("The values are: " + stringToArr);
      } catch (Exception e) {
         System.out.println("invalid input!!!!");
      }

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();
   }

   public static String arrayToString(Scanner scanner, int array[]) {

      if (array == null) {
         return "Null Array!!!!";
      }

      System.out.print("Enter the value of all items (separated by space): ");
      for (int index = 0; index < array.length; index++) {
         array[index] = scanner.nextInt();
      }
      String stringOfArr = "[";
      for (int index = 0; index < array.length; index++) {
         if (index != array.length - 1)
            stringOfArr += array[index] + ", ";
         else
            stringOfArr += array[index];

      }
      stringOfArr += "]";
      return stringOfArr;

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
