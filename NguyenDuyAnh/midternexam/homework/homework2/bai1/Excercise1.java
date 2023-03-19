package midternexam.homework.homework2.bai1;

import java.util.Scanner;

import midternexam.homework.homework2.bai1.bai11.Matrix;
import midternexam.homework.homework2.bai1.bai12.Trigonometric;
import midternexam.homework.homework2.bai1.bai13.SpecialSeries;
import midternexam.homework.homework2.bai1.bai14.FactorialInt;
import midternexam.homework.homework2.bai1.bai15.FibonacciInt;
import midternexam.homework.homework2.bai1.bai16.SystemConversion;
import midternexam.homework.homework2.bai1.bai17.NumberGuess;
import midternexam.homework.homework2.bai1.bai18.WordGuess;
import midternexam.homework.homework2.bai1.bai19.DateUtil;

public class Excercise1 {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         boolean isExit = false;

         while (!isExit) {

            displayMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            while (choice < 1 || choice > 10) {
               System.out.println("Invalid choice!!!!!!!!!!");
               System.out.print("Please press 1 to 10 on keyboard to choose: ");
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
               case 8:
                  option8(args);
                  break;
               case 9:
                  option9(args);
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
      System.out.println("\t|    5. Excercise 1.5                        |");
      System.out.println("\t|    6. Excercise 1.6                        |");
      System.out.println("\t|    7. Excercise 1.7                        |");
      System.out.println("\t|    8. Excercise 1.8                        |");
      System.out.println("\t|    9. Excercise 1.9                        |");
      System.out.println("\t|    10. Exit Excercise-1                    |");
      System.out.println("\t+--------------------------------------------+");
      System.out.print("Your choice(Enter from 1 to 10): ");
   }

   public static void option1(String args[]) {
      Matrix.main(args);

   }

   public static void option2(String args[]) {
      Trigonometric.main(args);
   }

   public static void option3(String args[]) {
      SpecialSeries.main(args);
   }

   public static void option4(String args[]) {
      FactorialInt.main(args);
   }

   public static void option5(String args[]) {
      FibonacciInt.main(args);
   }

   public static void option6(String args[]) {
      SystemConversion.main(args);
   }

   public static void option7(String args[]) {
      NumberGuess.main(args);

   }

   public static void option8(String args[]) {
      WordGuess.main(args);
   }

   public static void option9(String args[]) {
      DateUtil.main(args);
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
