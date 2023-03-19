package midternexam.lab.lab1.bai1.bai12;

import java.util.Scanner;

public class CheckOddEven {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         System.out.println("Enter the number: ");
         int number = scanner.nextInt();
         System.out.println("The number is " + number);

         if (number % 2 == 0) {
            System.out.println("--> Even Number");
         } else {
            System.out.println("--> Odd Number");
         }

         System.out.println("Bye!");
      } catch (Exception e) {
         System.out.println("Invalid input!!!!!");
      }

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

}
