package midternexam.homework.homework3.bai2.bai21;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      Author Tim = new Author("Tim", "tim@email.com", 'm');
      System.out.println(Tim);

      Tim.setEmail("tim@gmail.com");
      System.out.println(Tim);

      Book javaBook = new Book("Master java in 1 day", Tim, 10.43, 1000);
      System.out.println(javaBook);
      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

}
