package midternexam.homework.homework6.bai13;

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
      
      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
