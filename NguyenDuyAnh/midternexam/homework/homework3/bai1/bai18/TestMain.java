package midternexam.homework.homework3.bai1.bai18;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      Time time = new Time(3, 10, 10);
      System.out.println(time);

      System.out.println("Hour: " + time.getHour());
      System.out.println("Minute: " + time.getMinute());
      System.out.println("Second: " + time.getSecond());

      // Invalid setting:
      time.setHour(24);
      time.setMinute(69);
      time.setSecond(100);
      time.setTime(1, 1, 60);
      System.out.println(time);

      // Valid setting:
      time.setHour(2);
      time.setMinute(14);
      time.setSecond(1);
      System.out.println(time);
      time.setTime(1, 4, 12);
      System.out.println(time);

      time.nextSecond();
      System.out.println(time);

      time.previousSecond();
      System.out.println(time);

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
