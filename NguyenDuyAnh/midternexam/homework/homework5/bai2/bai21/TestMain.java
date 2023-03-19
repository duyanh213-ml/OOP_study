package midternexam.homework.homework5.bai2.bai21;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         System.out.println("Choose a test:");
         System.out.println("1. Test line");
         System.out.println("2. Test linesub");
         System.out.println("3. Test point");
         System.out.print("Your choice: ");

         int choice = Integer.parseInt(scanner.nextLine());

         while (choice < 1 || choice > 3) {
            System.out.println("Invalid choice!!!!");
            System.out.print("Please choose from 1 - 3: ");
            choice = Integer.parseInt(scanner.nextLine());
         }

         switch (choice) {
            case 1:
               TestLine.main(args);
               break;
            case 2:
               TestLineSub.main(args);
               break;
            case 3:
               TestPoint.main(args);
               break;
            default:
         }
      } catch (Exception e) {
         System.out.println("Invalid input!!!!");
      }

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
