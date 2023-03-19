package midternexam.homework.homework3.bai1.bai17;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      Date date = new Date(1, 12, 2012);
      System.out.println(date);

      // Test an invalid case
      date.setDay(32);
      System.out.println(date);
      date.setDate(29, 2, 2019);
      System.out.println(date);

      // Test valid case:
      date.setDate(29, 2, 2012);
      System.out.println(date);
      date.setDay(1);
      System.out.println(date);
      date.setMonth(7);
      System.out.println(date);
      date.setYear(2002);
      System.out.println(date);
      
      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
