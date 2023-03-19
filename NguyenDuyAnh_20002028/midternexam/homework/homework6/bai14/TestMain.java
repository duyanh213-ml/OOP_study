package midternexam.homework.homework6.bai14;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      Movable movable = new MovablePoint(4, 7, 1, 2);

      System.out.println(movable);

      movable.moveDown();
      System.out.println(movable);

      System.out.println(movable);
      movable.moveUp();

      movable.moveLeft();
      System.out.println(movable);

      movable.moveRight();
      System.out.println(movable);

      Movable movable2 = new MovableCircle(5, 7, 2, 3, 10);

      System.out.println(movable2);

      movable2.moveDown();
      System.out.println(movable2);

      System.out.println(movable2);
      movable2.moveUp();

      movable2.moveLeft();
      System.out.println(movable2);

      movable2.moveRight();
      System.out.println(movable2);
      
      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
