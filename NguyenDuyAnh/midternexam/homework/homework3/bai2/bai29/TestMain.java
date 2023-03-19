package midternexam.homework.homework3.bai2.bai29;

import java.util.Scanner;

import midternexam.homework.homework3.bai2.bai26.MyPoint;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      MyTriangle myTriangle = new MyTriangle(new MyPoint(1, 3), new MyPoint(), new MyPoint(4, 5));

      System.out.println(myTriangle);

      System.out.println("Paremeter = " + myTriangle.getParemeter());
      System.out.println("Type = " + myTriangle.getType());
      
      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
