package midternexam.homework.homework4.bai14;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      MyTime myTime = new MyTime(3, 10, 10);
      System.out.println(myTime);

      System.out.println("Hour: " + myTime.getHour());
      System.out.println("Minute: " + myTime.getMinute());
      System.out.println("Second: " + myTime.getSecond());

      // Invalid setting:
      myTime.setHour(24);
      myTime.setMinute(69);
      myTime.setSecond(100);
      myTime.setTime(1, 1, 60);
      System.out.println(myTime);

      // Valid setting:
      myTime.setHour(2);
      myTime.setMinute(14);
      myTime.setSecond(1);
      System.out.println(myTime);
      myTime.setTime(1, 4, 12);
      System.out.println(myTime);

      myTime.nextMinute();
      System.out.println(myTime);
      myTime.nextSecond();
      System.out.println(myTime);
      myTime.nextHour();
      System.out.println(myTime);

      myTime.previousHour();
      System.out.println(myTime);
      myTime.previousMinute();
      System.out.println(myTime);
      myTime.previousSecond();
      System.out.println(myTime);

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
