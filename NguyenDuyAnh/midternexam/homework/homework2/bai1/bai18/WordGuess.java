package midternexam.homework.homework2.bai1.bai18;

import java.util.Scanner;

public class WordGuess {
   public static void main(String[] args) {
      clearScreen();

      Scanner scanner = new Scanner(System.in);
      System.out.println("Input the keyword");
      String keyWord = scanner.nextLine();
      clearScreen();

      boolean gameOverFlag = false;
      int count = 1;
      String blank = "";
      for (int i = 0; i < keyWord.length(); i++) {
         blank += "-";
      }
      while (!gameOverFlag) {
         System.out.print("Key in one character or your key word guess: ");
         String yourGuess = scanner.nextLine();

         if (yourGuess.length() == 1) {
            char c = yourGuess.charAt(0);
            System.out.print("Trial " + count + ": ");
            boolean flag = true;
            for (int i = 0; i < keyWord.length(); i++) {
               if (keyWord.charAt(i) == c) {
                  blank = blank.substring(0, i) + c + blank.substring(i + 1, blank.length());
                  flag = false;
               }
            }
            if (flag) {
               System.out.println("Key word does not contain character \"" + c + "\"");
            } else {
               System.out.println(blank);
            }
            count++;
         } else if (yourGuess.equals(keyWord)) {
            System.out.println("Congratulation!!!!");
            System.out.println("You got in " + count + " trial");
            gameOverFlag = true;
         } else {
            System.out.println("Your keyword is incorrect!!!");
            count++;
         }

      }
      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
