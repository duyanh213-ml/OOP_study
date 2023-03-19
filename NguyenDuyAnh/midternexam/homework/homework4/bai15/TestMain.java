package midternexam.homework.homework4.bai15;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      MyDate date = new MyDate(1, 12, 2012);
      System.out.println(date);

      // Test getter
      System.out.println("day: " + date.getDay());
      System.out.println("month: " + date.getMonth());
      System.out.println("year: " + date.getYear());

      // Test an invalid case
      date.setMonth(13);
      System.out.println(date);
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

      date.nextMonth();
      System.out.println(date);
      date.PreviousDay();
      System.out.println(date);
      date.nextMonth().nextMonth();
      System.out.println(date);
      date.previousYear();
      System.out.println(date);
      date.previousMonth();
      System.out.println(date);
      date.nextYear();
      System.out.println(date);
      date.nextDay();
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
