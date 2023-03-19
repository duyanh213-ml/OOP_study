package midternexam.homework.homework3.bai2.bai22;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      // A book written by 3 authors
      Author authors[] = new Author[3];
      authors[0] = new Author("An", "an@email.com", 'f');
      authors[1] = new Author("Binh", "binh@email.com", 'f');
      authors[2] = new Author("Tam", "tam@email.com", 'f');

      SetOfBook anotherJavaBook = new SetOfBook("Master java in 6 hours", authors, 144.3, 10000);
      System.out.println(anotherJavaBook);
      
      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

}
