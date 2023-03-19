package midternexam.homework.homework5.bai1.bai11;

import java.util.Scanner;

public class TestMain {
      public static void main(String[] args) {
            clearScreen();
            Scanner scanner = new Scanner(System.in);

            Cylinder cylinder = new Cylinder(4.5, 4.5, "grey");

            System.out.println(cylinder);

            cylinder.setColor("cyan");
            cylinder.setHeight(5.5);
            cylinder.setRadius(10.0);

            System.out.println(cylinder);

            System.out.println("The area: " + cylinder.getArea());
            System.out.println("The radius: " + cylinder.getRadius());
            System.out.println("The volumn: " + cylinder.getVolumn());
            System.out.println("The height: " + cylinder.getHeight());
            System.out.println("The color: " + cylinder.getColor());
            
            System.out.println("Press any key to exit...");
            scanner.nextLine();
            clearScreen();

      }

      public static void clearScreen() {
            System.out.print("\033[H\033[2J");
            System.out.flush();
      }
}
