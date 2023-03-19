package midternexam;

import java.util.Scanner;

import midternexam.homework.HomeWorkMenu;
import midternexam.lab.LabMenu;

public class MidternExam {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         boolean isExit = false;
         int choice;

         while (!isExit) {

            displayMenu();
            choice = Integer.parseInt(scanner.nextLine());

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
                  option3(scanner);
                  isExit = true;
            }
         }
      } catch (Exception e) {
         clearScreen();
      }

   }

   public static void displayMenu() {
      System.out.println("\t+--------------------------------------------+");
      System.out.println("\t|        MIDTERM EXAMINATION PROGRAM         |");
      System.out.println("\t+--------------------------------------------+");
      System.out.println("\t|        Please choose an option:            |");
      System.out.println("\t|    1. Go to Homework                       |");
      System.out.println("\t|    2. Go to Lab                            |");
      System.out.println("\t|    3. Exit program                         |");
      System.out.println("\t+--------------------------------------------+");
      System.out.print("Your choice(Enter from 1 to 3): ");
   }

   public static void option1(String args[]) {
      HomeWorkMenu.main(args);
   }

   public static void option2(String args[]) {
      LabMenu.main(args);
   }

   public static void option3(Scanner scanner) {
      System.out.print("B-Y-E!!!!!! Press any key to totally exit... ");
      scanner.nextLine();
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
