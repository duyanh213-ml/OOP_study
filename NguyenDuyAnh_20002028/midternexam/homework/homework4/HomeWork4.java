package midternexam.homework.homework4;

import java.util.Scanner;

import midternexam.homework.homework4.bai11.TestMain;
import midternexam.homework.homework4.bai13.TestBigInteger;

public class HomeWork4 {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         boolean isExit = false;

         while (!isExit) {

            displayMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            while (choice < 1 || choice > 8) {
               System.out.println("Invalid choice!!!!!!!!!!");
               System.out.print("Please press 1 to 8 on keyboard to choose: ");
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
               case 7:
                  option7(args);
                  break;
               default:
                  isExit = true;
            }
         }
      } catch (Exception e) {
         clearScreen();
         // TODO: handle exception
      }

   }

   public static void displayMenu() {
      System.out.println("\t+--------------------------------------------+");
      System.out.println("\t|                 HOME-WORK-4                |");
      System.out.println("\t+--------------------------------------------+");
      System.out.println("\t|     Please choose an excercise number:     |");
      System.out.println("\t|    1. Excercise 1.1                        |");
      System.out.println("\t|    2. Excercise 1.2                        |");
      System.out.println("\t|    3. Excercise 1.3                        |");
      System.out.println("\t|    4. Excercise 1.4                        |");
      System.out.println("\t|    5. Excercise 1.5                        |");
      System.out.println("\t|    6. Excercise 1.6                        |");
      System.out.println("\t|    7. Excercise 1.7                        |");
      System.out.println("\t|    8. Exit Homework-4                      |");
      System.out.println("\t+--------------------------------------------+");
      System.out.print("Your choice(Enter from 1 to 8): ");
   }

   public static void option1(String args[]) {
      TestMain.main(args);
   }

   public static void option2(String args[]) {
      midternexam.homework.homework4.bai12.TestMain.main(args);
   }

   public static void option3(String args[]) {
      TestBigInteger.main(args);
   }

   public static void option4(String args[]) {
      midternexam.homework.homework4.bai14.TestMain.main(args);
   }

   public static void option5(String args[]) {
      midternexam.homework.homework4.bai15.TestMain.main(args);
   }

   public static void option6(String args[]) {
      midternexam.homework.homework4.bai16.TestMain.main(args);
   }

   public static void option7(String args[]) {
      midternexam.homework.homework4.bai17.TestMain.main(args);
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
