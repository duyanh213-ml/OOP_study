package midternexam.homework.homework1.bai3.bai37;

import java.util.Scanner;

public class Palindrome {

   public static void main(String[] args) {
      clearScreen();

      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a word to test palindromic word: ");
      String word1 = scanner.nextLine();
      runForWord(word1);
      System.out.print("Enter a word to test palindromic phrase: ");
      String word2 = scanner.nextLine();
      runForPhrase(word2);
      System.out.println("\nPress any key to exit...");
      scanner.nextLine();

      clearScreen();
   }

   public static void runForWord(String word) {
      String reverseWord = "";
      for (int i = word.length() - 1; i >= 0; i--) {
         reverseWord += word.toLowerCase().charAt(i);
      }

      if (word.toLowerCase().equals(reverseWord.toLowerCase())) {
         System.out.printf("%1$s is a palindromic word.\n", word);
      } else {
         System.out.printf("%1$s is not a palindromic word.\n", word);
      }
   }

   // This functional code refers to github!!! (Tham khảo từ một cách làm trên
   // github)
   public static void runForPhrase(String phrase) {
      String phraseLeftToRight = sanitizeString(phrase);
      String phraseRightToLeft = "";
      for (int i = phraseLeftToRight.length() - 1; i >= 0; i--) {
         phraseRightToLeft += phraseLeftToRight.charAt(i);
      }

      if (phraseLeftToRight.toLowerCase().equals(phraseRightToLeft.toLowerCase())) {
         System.out.printf("\"%1$s\" is a palindromic phrase.\n", phrase);
      } else {
         System.out.printf("\"%1$s\" is not a palindrome phrase.\n", phrase);
      }
   }

   public static String sanitizeString(String s) {
      String str = "";
      for (int i = 0; i < s.length(); i++) {
         switch (s.charAt(i)) {
            case '.':
            case ',':
            case ' ':
            case '-':
            case '\'':
            case '!':
            case '?':
               break;
            default:
               str += s.charAt(i);
         }
      }
      return str;
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

}
