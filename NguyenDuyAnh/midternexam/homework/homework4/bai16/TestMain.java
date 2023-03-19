package midternexam.homework.homework4.bai16;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {

      clearScreen();
      Scanner scanner = new Scanner(System.in);

      Ball ball = new Ball(50, 50, 5, 10, 3);
      Container box = new Container(0, 0, 100, 100);
      for (int i = 0; i < 100; i++) {
         ball.move();
         box.collides(ball);
         System.out.println(ball);
      }

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
