package midternexam.homework.homework3.bai2.bai28;

import java.util.Scanner;

import midternexam.homework.homework3.bai2.bai26.MyPoint;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      MyCircle myCircle = new MyCircle(new MyPoint(2, 1), 5);

      System.out.println(myCircle);

      System.out.println("x = " + myCircle.getCenterX());
      System.out.println("y = " + myCircle.getCenterX());
      System.out.println("radius = " + myCircle.getRadius());

      System.out.println("x = " + myCircle.getCenterXY()[0] + ", y = " + myCircle.getCenterXY()[1]);
      System.out.println("Area = " + myCircle.getArea());
      System.out.println("Distance with central point(0, 0): " + myCircle.getDistance(new MyCircle()));

      myCircle.setCenter(new MyPoint(1, 1));
      System.out.println(myCircle);
      myCircle.setCenterX(10);
      myCircle.setCenterY(4);
      System.out.println(myCircle);
      myCircle.setCenterXY(5, 6);
      System.out.println(myCircle);
      myCircle.setRadius(10);
      System.out.println(myCircle);
      
      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
