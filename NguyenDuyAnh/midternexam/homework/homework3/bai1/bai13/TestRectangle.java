package midternexam.homework.homework3.bai1.bai13;

import java.util.Scanner;

public class TestRectangle {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      Rectangle rectangle1 = new Rectangle(1.2f, 3.4f);
      System.out.println(rectangle1);

      rectangle1.setLength(7.8f);
      rectangle1.setWidth(5.6f);
      System.out.println(rectangle1);

      System.out.printf("The area is: %.2f%n", rectangle1.getArea());
      System.out.printf("The perimeter is: %.2f%n", rectangle1.getPerimeter());

      System.out.println("\nPress any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

}
