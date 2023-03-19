package midternexam.lab.lab2.bai2.bai22;

import java.util.Scanner;

public class HasEight {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         findMagicSum(scanner);

      } catch (Exception e) {
         System.out.println("invalid input!!!!");
      }
      System.out.println("Press any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();
   }

   public static boolean hasEight(int number) {
      int hasDigit;
      while (number > 0) {
         hasDigit = number % 10;
         if (hasDigit == 8) {
            return true;
         }
         number /= 10;
      }
      return false;
   }

   public static void findMagicSum(Scanner scanner) {
      int magicSum = 0;
      System.out.print("Enter a positive number (or -1 to end): ");
      int positiveNum = scanner.nextInt();
      if (hasEight(positiveNum)) {
         magicSum += positiveNum;
      }
      boolean stop = false;
      while (!stop) {
         if (positiveNum == -1) {
            stop = true;
            break;
         } else if (positiveNum < 0) {
            System.out.print("Please enter a positive number (or -1 to end): ");
            positiveNum = scanner.nextInt();
         } else {
            System.out.print("Enter a positive number (or -1 to end): ");
            positiveNum = scanner.nextInt();
            if (hasEight(positiveNum)) {
               magicSum += positiveNum;
            }
         }
      }
      System.out.println("The magic sum is: " + magicSum);
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
