package midternexam.homework.homework2.bai3;

import java.util.Scanner;

import midternexam.homework.homework2.bai3.bai31.LinearSearch;
import midternexam.homework.homework2.bai3.bai32.BinarySearch;
import midternexam.homework.homework2.bai3.bai33.BubbleSort;
import midternexam.homework.homework2.bai3.bai34.SelectionSort;
import midternexam.homework.homework2.bai3.bai35.InsertionSort;

public class Excercise3 {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         boolean isExit = false;

         while (!isExit) {

            displayMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            while (choice < 1 || choice > 6) {
               System.out.println("Invalid choice!!!!!!!!!!");
               System.out.print("Please press 1 to 6 on keyboard to choose: ");
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
      System.out.println("\t|                 EXCERCISE-3                |");
      System.out.println("\t+--------------------------------------------+");
      System.out.println("\t|    Please choose an excercise subnumber:   |");
      System.out.println("\t|    1. Excercise 3.1                        |");
      System.out.println("\t|    2. Excercise 3.2                        |");
      System.out.println("\t|    3. Excercise 3.3                        |");
      System.out.println("\t|    4. Excercise 3.4                        |");
      System.out.println("\t|    5. Excercise 3.5                        |");
      System.out.println("\t|    6. Exit Excercise-3                     |");
      System.out.println("\t+--------------------------------------------+");
      System.out.print("Your choice(Enter from 1 to 6): ");
   }

   public static void option1(String args[]) {
      LinearSearch.main(args);

   }

   public static void option2(String args[]) {
      BinarySearch.main(args);
   }

   public static void option3(String args[]) {
      BubbleSort.main(args);
   }

   public static void option4(String args[]) {
      SelectionSort.main(args);
   }

   public static void option5(String args[]) {
      InsertionSort.main(args);
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
