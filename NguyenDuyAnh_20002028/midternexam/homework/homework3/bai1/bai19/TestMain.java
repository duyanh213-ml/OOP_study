package midternexam.homework.homework3.bai1.bai19;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      Ball ball = new Ball(50, 50, 5, 10, 3);
      System.out.println(ball);
      ball.setRadius(10);
      ball.setX(10);
      ball.setY(10);
      ball.setXDelta(20);
      ball.setYDelta(20);
      System.out.println(ball);

      System.out.println("Get radius: " + ball.getRadius());
      System.out.println("Get X: " + ball.getX());
      System.out.println("Get Y: " + ball.getY());
      System.out.println("Get delta X: " + ball.getXDelta());
      System.out.println("Get delta Y: " + ball.getYDelta());

      for (int i = 0; i < 10; i++) {
         ball.move();
         System.out.println(ball);
      }

      ball.reflectHorizontal();
      ball.reflectVertical();

      System.out.println(ball);

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
