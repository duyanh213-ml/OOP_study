package midternexam.homework.homework5.bai2.bai22;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      Cylinder cylinder[] = new Cylinder[10];

      for (int i = 0; i < cylinder.length; i++) {
         cylinder[i] = new Cylinder(i + 1, i + 1, "red");
      }

      for (Cylinder cylinderItem : cylinder) {
         System.out.println(cylinderItem);
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
