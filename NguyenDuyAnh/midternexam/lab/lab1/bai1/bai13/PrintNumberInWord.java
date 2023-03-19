package midternexam.lab.lab1.bai1.bai13;

import java.util.Scanner;

public class PrintNumberInWord {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         System.out.println("Enter the number:");
         int number = scanner.nextInt();

         System.out.println("There are 2 choices for Java to execute, choose one of them.");
         System.out.println("1. Using switch-case");
         System.out.println("2. Using if-else");
         System.out.print("Your choice (Enter 1 or 2): ");
         int choice = scanner.nextInt();

         if (choice == 1) {
            usingSwitchCase(number);
         } else if (choice == 2) {
            usingIfElse(number);
         } else {
            System.out.println("Your choice is not valid!!!!!!");
         }
      } catch (Exception e) {
         System.out.println("Invalid input!!!");
      }

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();

   }

   public static void usingSwitchCase(int number) {
      switch (number) {
         case 1:
            System.out.println("ONE");
            break;
         case 2:
            System.out.println("TWO");
            break;
         case 3:
            System.out.println("THREE");
            break;
         case 4:
            System.out.println("FOUR");
            break;
         case 5:
            System.out.println("FIVE");
            break;
         case 6:
            System.out.println("SIX");
            break;
         case 7:
            System.out.println("SEVEN");
            break;
         case 8:
            System.out.println("EIGHT");
            break;
         case 9:
            System.out.println("NINE");
            break;
         default:
            System.out.println("ORTHER");
      }
   }

   public static void usingIfElse(int number) {
      if (number == 1) {
         System.out.println("ONE");

      } else if (number == 2) {
         System.out.println("TWO");

      } else if (number == 3) {
         System.out.println("THREE");

      } else if (number == 4) {
         System.out.println("FOUR");

      } else if (number == 5) {
         System.out.println("FIVE");

      } else if (number == 6) {
         System.out.println("SIX");

      } else if (number == 7) {
         System.out.println("SEVEN");

      } else if (number == 8) {
         System.out.println("EIGHT");

      } else if (number == 9) {
         System.out.println("NINE");

      } else {
         System.out.println("ORTHER");

      }
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
