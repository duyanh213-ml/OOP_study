package midternexam.homework.homework4.bai17;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      Player player[] = new Player[2];
      player[0] = new Player(10, 3, 4);
      player[1] = new Player(9, 9.9f, 15.8f);

      Ball ball = new Ball(4.5f, 4.3f, 2.4f);

      System.out.println("The ball now at " + ball);
      for (int i = 0; i < player.length; i++) {
         if (player[i].near(ball)) {
            player[i].kick();
         }
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
