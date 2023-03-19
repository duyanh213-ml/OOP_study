package midternexam.homework.homework3.bai2;

import java.util.Scanner;

import midternexam.homework.homework3.bai2.bai21.TestMain;

public class Excercise2 {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         boolean isExit = false;

         while (!isExit) {

            displayMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            while (choice < 1 || choice > 11) {
               System.out.println("Invalid choice!!!!!!!!!!");
               System.out.print("Please press 1 to 11 on keyboard to choose: ");
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
               case 10:
                  option10(args);
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
      System.out.println("\t|                 EXCERCISE-2                |");
      System.out.println("\t+--------------------------------------------+");
      System.out.println("\t|    Please choose an excercise subnumber:   |");
      System.out.println("\t|    1. Excercise 2.1                        |");
      System.out.println("\t|    2. Excercise 2.2                        |");
      System.out.println("\t|    3. Excercise 2.3                        |");
      System.out.println("\t|    4. Excercise 2.4                        |");
      System.out.println("\t|    5. Excercise 2.5                        |");
      System.out.println("\t|    6. Excercise 2.6                        |");
      System.out.println("\t|    7. Excercise 2.7                        |");
      System.out.println("\t|    8. Excercise 2.8                        |");
      System.out.println("\t|    9. Excercise 2.9                        |");
      System.out.println("\t|    10. Excercise 2.10                      |");
      System.out.println("\t|    11. Exit Excercise-2                    |");
      System.out.println("\t+--------------------------------------------+");
      System.out.print("Your choice(Enter from 1 to 11): ");
   }

   public static void option1(String args[]) {
      TestMain.main(args);

   }

   public static void option2(String args[]) {
      midternexam.homework.homework3.bai2.bai22.TestMain.main(args);
   }

   public static void option3(String args[]) {
      midternexam.homework.homework3.bai2.bai23.TestMain.main(args);
   }

   public static void option4(String args[]) {
      midternexam.homework.homework3.bai2.bai24.Main.main(args);
   }

   public static void option5(String args[]) {
      midternexam.homework.homework3.bai2.bai25.Main.main(args);
   }

   public static void option6(String args[]) {
      midternexam.homework.homework3.bai2.bai26.TestMain.main(args);

   }

   public static void option7(String args[]) {
      midternexam.homework.homework3.bai2.bai27.TestMain.main(args);
   }

   public static void option8(String args[]) {
      midternexam.homework.homework3.bai2.bai28.TestMain.main(args);

   }

   public static void option9(String args[]) {
      midternexam.homework.homework3.bai2.bai29.TestMain.main(args);

   }

   public static void option10(String args[]) {
      midternexam.homework.homework3.bai2.bai210.TestMain.main(args);

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
