package midternexam.homework.homework1;

import java.util.Scanner;

import midternexam.homework.homework1.bai1.Excercise1;
import midternexam.homework.homework1.bai2.bai21.Factorial;
import midternexam.homework.homework1.bai3.Excercise3;

public class HomeWork1 {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         boolean isExit = false;

         while (!isExit) {

            displayMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            while (choice < 1 || choice > 4) {
               System.out.println("Invalid choice!!!!!!!!!!");
               System.out.print("Please press 1 to 4 on keyboard to choose: ");
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
               case 3:
                  option3(args);
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
      System.out.println("\t|                 HOME-WORK-1                |");
      System.out.println("\t+--------------------------------------------+");
      System.out.println("\t|     Please choose an excercise number:     |");
      System.out.println("\t|    1. Excercise 1                          |");
      System.out.println("\t|    2. Excercise 2                          |");
      System.out.println("\t|    3. Excercise 3                          |");
      System.out.println("\t|    4. Exit Homework-1                      |");
      System.out.println("\t+--------------------------------------------+");
      System.out.print("Your choice(Enter from 1 to 4): ");
   }

   public static void option1(String args[]) {
      Excercise1.main(args);
   }

   public static void option2(String args[]) {
      Factorial.main(args);
   }

   public static void option3(String args[]) {
      Excercise3.main(args);
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
