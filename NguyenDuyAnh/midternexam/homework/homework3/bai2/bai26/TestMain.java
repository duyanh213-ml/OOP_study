package midternexam.homework.homework3.bai2.bai26;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      MyPoint myPoint = new MyPoint(3, 4);

      System.out.println(myPoint);

      System.out.println("x = " + myPoint.getX());
      System.out.println("y = " + myPoint.getY());

      myPoint.setX(6);
      myPoint.setY(8);
      System.out.println(myPoint);

      myPoint.setXY(3, 4);
      System.out.println(myPoint);

      System.out.println(myPoint.distance());
      System.out.println(myPoint.distance(1, 1));
      System.out.println(myPoint.distance(new MyPoint(3, 8)));

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
