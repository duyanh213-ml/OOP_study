package midternexam.homework;

import java.util.Scanner;

import midternexam.homework.homework1.HomeWork1;
import midternexam.homework.homework2.HomeWork2;
import midternexam.homework.homework3.HomeWork3;
import midternexam.homework.homework4.HomeWork4;
import midternexam.homework.homework5.HomeWork5;
import midternexam.homework.homework6.HomeWork6;

public class HomeWorkMenu {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         boolean isExit = false;

         while (!isExit) {

            displayMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            while (choice < 1 || choice > 7) {
               System.out.println("Invalid choice!!!!!!!!!!");
               System.out.print("Please press 1 to 7 on keyboard to choose: ");
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
               case 5:
                  option5(args);
                  break;
               case 6:
                  option6(args);
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
      System.out.println("\t|           M-E-N-U  H-O-M-E-W-O-R-K         |");
      System.out.println("\t+--------------------------------------------+");
      System.out.println("\t|        Please choose a homework number:    |");
      System.out.println("\t|    1. Homework 1                           |");
      System.out.println("\t|    2. Homework 2                           |");
      System.out.println("\t|    3. Homework 3                           |");
      System.out.println("\t|    4. Homework 4                           |");
      System.out.println("\t|    5. Homework 5                           |");
      System.out.println("\t|    6. Homework 6                           |");
      System.out.println("\t|    7. Exit Homework-Menu                   |");
      System.out.println("\t+--------------------------------------------+");
      System.out.print("Your choice(Enter from 1 to 7): ");
   }

   public static void option1(String args[]) {
      HomeWork1.main(args);
   }

   public static void option2(String args[]) {
      HomeWork2.main(args);
   }

   public static void option3(String args[]) {
      HomeWork3.main(args);
   }

   public static void option4(String args[]) {
      HomeWork4.main(args);
   }

   public static void option5(String args[]) {
      HomeWork5.main(args);
   }

   public static void option6(String args[]) {
      HomeWork6.main(args);
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
