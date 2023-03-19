package midternexam.homework.homework5.bai1.bai13;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         Point3D point3d[] = new Point3D[5];

         for (int i = 0; i < point3d.length; i++) {
            point3d[i] = new Point3D(i, i + 1, i + 2);
         }

         for (Point3D eachPoint : point3d) {
            System.out.println(eachPoint);
         }
      } catch (Exception e) {
         System.out.println("Invalid input!!!!!");
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
