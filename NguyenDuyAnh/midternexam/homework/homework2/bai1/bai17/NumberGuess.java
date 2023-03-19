package midternexam.homework.homework2.bai1.bai17;

import java.util.Scanner;

public class NumberGuess {

   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         int key = (int) (Math.random() * 100);
         // boolean isKey = true;
         int trialTime = 0;

         System.out.println("Key number in your guess: ");
         int yourGuess = scanner.nextInt();
         trialTime++;

         while (true) {
            if (yourGuess > key) {
               System.out.println("Try lower!!");

            } else if (yourGuess < key) {
               System.out.println("Try higher!!");
            } else {
               trialTime++;
               // isKey = false;
               break;
            }
            yourGuess = scanner.nextInt();
            trialTime++;
         }

         if (trialTime == 1) {
            System.out.println("You got it in 1 trial!!");
         } else {
            System.out.println("You got it in " + trialTime + " trials!!");
         }
      } catch (Exception e) {
         System.out.println("Invalid input!!!");
      }

      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      scanner.nextLine();
      clearScreen();
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

}
