package midternexam.lab.lab1.bai1;

import java.util.Scanner;

import midternexam.lab.lab1.bai1.bai11.CheckPassFail;
import midternexam.lab.lab1.bai1.bai12.CheckOddEven;
import midternexam.lab.lab1.bai1.bai13.PrintNumberInWord;
import midternexam.lab.lab1.bai1.bai14.PrintDayInWord;

public class Excercise1 {
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
      System.out.println("\t|                 EXCERCISE-1                |");
      System.out.println("\t+--------------------------------------------+");
      System.out.println("\t|    Please choose an excercise subnumber:   |");
      System.out.println("\t|    1. Excercise 1.1                        |");
      System.out.println("\t|    2. Excercise 1.2                        |");
      System.out.println("\t|    3. Excercise 1.3                        |");
      System.out.println("\t|    4. Excercise 1.4                        |");
      System.out.println("\t|    5. Exit Excercise-1                     |");
      System.out.println("\t+--------------------------------------------+");
      System.out.print("Your choice(Enter from 1 to 5): ");
   }

   public static void option1(String args[]) {
      CheckPassFail.main(args);

   }

   public static void option2(String args[]) {
      CheckOddEven.main(args);
   }

   public static void option3(String args[]) {
      PrintNumberInWord.main(args);
   }

   public static void option4(String args[]) {
      PrintDayInWord.main(args);
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
