package midternexam.homework.homework5.bai2;

import java.util.Scanner;

import midternexam.homework.homework5.bai2.bai21.TestMain;

public class Excercise2 {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         boolean isExit = false;

         while (!isExit) {

            displayMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            while (choice < 1 || choice > 3) {
               System.out.println("Invalid choice!!!!!!!!!!");
               System.out.print("Please press 1 to 3 on keyboard to choose: ");
               choice = Integer.parseInt(scanner.nextLine());
            }
            clearScreen();

            switch (choice) {
               case 1:
                  option1(args);
                  break;
               case 2:
                  option2(args);
                  break;
               default:
                  isExit = true;
            }
         }
      } catch (Exception e) {
         clearScreen();
      }

   }

   public static void displayMenu() {
      System.out.println("\t+--------------------------------------------+");
      System.out.println("\t|                 EXCERCISE-2                |");
      System.out.println("\t+--------------------------------------------+");
      System.out.println("\t|    Please choose an excercise subnumber:   |");
      System.out.println("\t|    1. Excercise 2.1                        |");
      System.out.println("\t|    2. Excercise 2.2                        |");
      System.out.println("\t|    3. Exit Excercise-2                     |");
      System.out.println("\t+--------------------------------------------+");
      System.out.print("Your choice(Enter from 1 to 3): ");
   }

   public static void option1(String args[]) {
      TestMain.main(args);

   }

   public static void option2(String args[]) {
      midternexam.homework.homework5.bai2.bai22.TestMain.main(args);
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
