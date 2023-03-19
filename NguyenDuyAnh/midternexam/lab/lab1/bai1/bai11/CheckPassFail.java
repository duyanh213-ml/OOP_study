package midternexam.lab.lab1.bai1.bai11;

import java.util.Scanner;

public class CheckPassFail {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         System.out.println("Enter the mark: ");
         int mark = scanner.nextInt();
         System.out.println("The mark is " + mark);

         if (mark < 50) {
            System.out.println("---> FAIL");
         } else {
            System.out.println("---> PASS");
         }

         System.out.println("DONE");
      } catch (Exception e) {
         System.out.println("Invalid input!!!!");
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
