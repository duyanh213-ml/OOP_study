package midternexam.homework.homework3.bai2.bai23;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      Author Tim = new Author("Tim", "tim@email.com");
      System.out.println(Tim);

      Tim.setEmail("tim@gmail.com");
      System.out.println(Tim);

      Book javaBook = new Book("1234", "Master java in 10 hours", Tim, 18.5, 1000);
      System.out.println(javaBook);

      System.out.println(javaBook.getAuthorName());
      System.out.println(javaBook.getIsBn());
      System.out.println(javaBook.getName());

      System.out.println(javaBook.getPrice());
      System.out.println(javaBook.getQty());

      javaBook.setPrice(25.5);
      javaBook.setQty(2000);

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
