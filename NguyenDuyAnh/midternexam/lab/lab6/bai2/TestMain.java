package midternexam.lab.lab6.bai2;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      Point point = new Point(1, 1);
      System.out.println(point.distance(new Point(2, 2)));
      Polyline polyline = new Polyline();

      for (int i = 0; i < 10; i++) {
         polyline.appendPoint(new Point(i, i));
      }

      Point point2 = new Point(10, 10);

      polyline.appendPoint(point2);

      System.out.println(polyline);

      System.out.println(polyline.getLength());
      
      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
