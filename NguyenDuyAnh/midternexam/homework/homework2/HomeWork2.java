package midternexam.homework.homework2;

import java.util.Scanner;

import midternexam.homework.homework2.bai1.Excercise1;
import midternexam.homework.homework2.bai2.Excercise2;
import midternexam.homework.homework2.bai3.Excercise3;
import midternexam.homework.homework2.bai4.Excercise4;

public class HomeWork2 {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         boolean isExit = false;

         while (!isExit) {

            displayMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            while (choice < 1 || choice > 5) {
               System.out.println("Invalid choice!!!!!!!!!!");
               System.out.print("Please press 1 to 5 on keyboard to choose: ");
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
               case 4:
                  option4(args);
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
      System.out.println("\t|                 HOME-WORK-2                |");
      System.out.println("\t+--------------------------------------------+");
      System.out.println("\t|     Please choose an excercise number:     |");
      System.out.println("\t|    1. Excercise 1                          |");
      System.out.println("\t|    2. Excercise 2                          |");
      System.out.println("\t|    3. Excercise 3                          |");
      System.out.println("\t|    4. Excercise 4                          |");
      System.out.println("\t|    5. Exit Homework-2                      |");
      System.out.println("\t+--------------------------------------------+");
      System.out.print("Your choice(Enter from 1 to 5): ");
   }

   public static void option1(String args[]) {
      Excercise1.main(args);
   }

   public static void option2(String args[]) {
      Excercise2.main(args);
   }

   public static void option3(String args[]) {
      Excercise3.main(args);
   }

   public static void option4(String args[]) {
      Excercise4.main(args);
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
