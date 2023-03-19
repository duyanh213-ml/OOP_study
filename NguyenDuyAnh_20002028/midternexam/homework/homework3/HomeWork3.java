package midternexam.homework.homework3;

import java.util.Scanner;

import midternexam.homework.homework3.bai1.Excercise1;
import midternexam.homework.homework3.bai2.Excercise2;

public class HomeWork3 {
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
      System.out.println("\t|                 HOME-WORK-3                |");
      System.out.println("\t+--------------------------------------------+");
      System.out.println("\t|     Please choose an excercise number:     |");
      System.out.println("\t|    1. Excercise 1                          |");
      System.out.println("\t|    2. Excercise 2                          |");
      System.out.println("\t|    3. Exit Homework-3                      |");
      System.out.println("\t+--------------------------------------------+");
      System.out.print("Your choice(Enter from 1 to 3): ");
   }

   public static void option1(String args[]) {
      Excercise1.main(args);
   }

   public static void option2(String args[]) {
      Excercise2.main(args);
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
