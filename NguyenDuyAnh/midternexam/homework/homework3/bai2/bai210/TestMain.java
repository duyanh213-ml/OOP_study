package midternexam.homework.homework3.bai2.bai210;

import java.util.Scanner;

import midternexam.homework.homework3.bai2.bai26.MyPoint;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      MyRectangle myRectangle = new MyRectangle(4, 3, 2, 8);

      System.out.println(myRectangle);

      System.out.println("top-left: " + myRectangle.getTopLeft());
      System.out.println("bottomright: " + myRectangle.getBottomRight());

      myRectangle.setBottomRight(new MyPoint(6, 2));
      myRectangle.setTopLeft(new MyPoint(3, 4));

      System.out.println(myRectangle);

      myRectangle.setBottomRight(new MyPoint(8, 1));
      myRectangle.setTopLeft(new MyPoint(3, 5));

      System.out.println(myRectangle);
      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
