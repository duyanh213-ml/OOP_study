package midternexam.homework.homework1.bai3;

import java.util.Scanner;

import midternexam.homework.homework1.bai3.bai31.ReverseString;
import midternexam.homework.homework1.bai3.bai310.Hex2Dec;
import midternexam.homework.homework1.bai3.bai311.Oct2Dec;
import midternexam.homework.homework1.bai3.bai312.RadixN2Dec;
import midternexam.homework.homework1.bai3.bai32.CountVowelsDigits;
import midternexam.homework.homework1.bai3.bai33.PhoneKeyPad;
import midternexam.homework.homework1.bai3.bai34.CaesarCode;
import midternexam.homework.homework1.bai3.bai35.DecipherCaesarCode;
import midternexam.homework.homework1.bai3.bai36.ExchangeCipher;
import midternexam.homework.homework1.bai3.bai37.Palindrome;
import midternexam.homework.homework1.bai3.bai38.CheckHexStr;
import midternexam.homework.homework1.bai3.bai39.Bin2Dec;

public class Excercise3 {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      try {
         boolean isExit = false;

         while (!isExit) {

            displayMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            while (choice < 1 || choice > 13) {
               System.out.println("Invalid choice!!!!!!!!!!");
               System.out.print("Please press 1 to 13 on keyboard to choose: ");
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
               case 11:
                  option11(args);
                  break;
               case 12:
                  option12(args);
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
      System.out.println("\t|    6. Excercise 3.6                        |");
      System.out.println("\t|    7. Excercise 3.7                        |");
      System.out.println("\t|    8. Excercise 3.8                        |");
      System.out.println("\t|    9. Excercise 3.9                        |");
      System.out.println("\t|    10. Excercise 3.10                      |");
      System.out.println("\t|    11. Excercise 3.11                      |");
      System.out.println("\t|    12. Excercise 3.12                      |");
      System.out.println("\t|    13. Exit Excercise-3                    |");
      System.out.println("\t+--------------------------------------------+");
      System.out.print("Your choice(Enter from 1 to 13): ");
   }

   public static void option1(String args[]) {
      ReverseString.main(args);

   }

   public static void option2(String args[]) {
      CountVowelsDigits.main(args);
   }

   public static void option3(String args[]) {
      PhoneKeyPad.main(args);
   }

   public static void option4(String args[]) {
      CaesarCode.main(args);
   }

   public static void option5(String args[]) {
      DecipherCaesarCode.main(args);
   }

   public static void option6(String args[]) {
      ExchangeCipher.main(args);
   }

   public static void option7(String args[]) {
      Palindrome.main(args);

   }

   public static void option8(String args[]) {
      CheckHexStr.main(args);
   }

   public static void option9(String args[]) {
      Bin2Dec.main(args);
   }

   public static void option10(String args[]) {
      Hex2Dec.main(args);
   }

   public static void option11(String args[]) {
      Oct2Dec.main(args);
   }

   public static void option12(String args[]) {
      RadixN2Dec.main(args);
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
