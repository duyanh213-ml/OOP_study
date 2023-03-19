package midternexam.lab;

import java.util.Scanner;

import midternexam.lab.lab1.Lab1;
import midternexam.lab.lab2.Lab2;
import midternexam.lab.lab6.Lab6;

public class LabMenu {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         boolean isExit = false;
         int choice;

         while (!isExit) {

            displayMenu();
            choice = Integer.parseInt(scanner.nextLine());

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
      System.out.println("+--------------------------------------------+");
      System.out.println("|                L-A-B M-E-N-U               |");
      System.out.println("+--------------------------------------------+");
      System.out.println("|        Please choose a lab number:         |");
      System.out.println("|    1. Lab 1                                |");
      System.out.println("|    2. Lab 2                                |");
      System.out.println("|    3. Lab 6                                |");
      System.out.println("|    4. Exit Lab-Menu                        |");
      System.out.println("+--------------------------------------------+");
      System.out.print("Your choice(Enter from 1 to 4): ");
   }

   public static void option1(String args[]) {
      Lab1.main(args);
   }

   public static void option2(String args[]) {
      Lab2.main(args);
   }

   public static void option3(String args[]) {
      Lab6.main(args);
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
