package midternexam.homework.homework5.bai1.bai14;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      try {
         Shape shape[] = new Shape[10];
         int choice;

         for (int i = 0; i < shape.length; i++) {
            System.out.println("Choose a shape number " + (i + 1));
            System.out.println("1. Circle ");
            System.out.println("2. Rectangle ");
            System.out.println("3. Square ");

            choice = scanner.nextInt();
            while (choice < 1 || choice > 3) {
               System.out.println("Invalid choice, choose again!!!!!");
               choice = scanner.nextInt();
            }
            scanner.nextLine();

            switch (choice) {
               case 1:
                  shape[i] = new Circle(i + 1);
                  break;
               case 2:
                  shape[i] = new Rectangle(i + 1, i + 2);
                  break;
               default:
                  shape[i] = new Square(i + 1);
            }

         }

         for (Shape eachShape : shape) {
            if (eachShape instanceof Circle) {
               System.out.println((Circle) eachShape);
            } else if (eachShape instanceof Rectangle) {
               System.out.println((Rectangle) eachShape);
            } else {
               System.out.println((Square) eachShape);
            }
         }
      } catch (Exception e) {
         System.out.println("Invalid input!!!!");
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
