package midternexam.homework.homework2.bai4;

import java.util.Scanner;

import midternexam.homework.homework2.bai4.bai41.PerfectAndDeficient;
import midternexam.homework.homework2.bai4.bai42.PrimeNumber;
import midternexam.homework.homework2.bai4.bai43.PrimeFactor;
import midternexam.homework.homework2.bai4.bai44.GCD;

public class Excercise4 {
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
         // TODO: handle exception
      }

   }

   public static void displayMenu() {
      System.out.println("\t+--------------------------------------------+");
      System.out.println("\t|                 EXCERCISE-4                |");
      System.out.println("\t+--------------------------------------------+");
      System.out.println("\t|    Please choose an excercise subnumber:   |");
      System.out.println("\t|    1. Excercise 4.1                        |");
      System.out.println("\t|    2. Excercise 4.2                        |");
      System.out.println("\t|    3. Excercise 4.3                        |");
      System.out.println("\t|    4. Excercise 4.4                        |");
      System.out.println("\t|    5. Exit Excercise-4                     |");
      System.out.println("\t+--------------------------------------------+");
      System.out.print("Your choice(Enter from 1 to 10): ");
   }

   public static void option1(String args[]) {
      PerfectAndDeficient.main(args);

   }

   public static void option2(String args[]) {
      PrimeNumber.main(args);
   }

   public static void option3(String args[]) {
      PrimeFactor.main(args);
   }

   public static void option4(String args[]) {
      GCD.main(args);
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
