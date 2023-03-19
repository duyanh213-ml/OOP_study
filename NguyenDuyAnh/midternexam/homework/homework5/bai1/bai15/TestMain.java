package midternexam.homework.homework5.bai1.bai15;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      try {
         Mammal mammal[] = new Mammal[5];
         int choice;

         for (int i = 0; i < mammal.length; i++) {
            System.out.println("Choose a kind of mammal number " + (i + 1));
            System.out.println("1. Dog");
            System.out.println("2. Cat");

            choice = scanner.nextInt();
            while (choice < 1 || choice > 2) {
               System.out.println("Invalid!!!!! Choose again");
               choice = scanner.nextInt();
            }
            scanner.nextLine();

            if (choice == 1) {
               System.out.print("Name of this dog: ");
               String name = scanner.nextLine();
               mammal[i] = new Dog(name);
            } else {
               System.out.print("Name of this cat: ");
               String name = scanner.nextLine();
               mammal[i] = new Cat(name);
            }

         }

         for (Mammal eachMammal : mammal) {
            if (eachMammal instanceof Dog) {
               System.out.println((Dog) eachMammal);

            } else {
               System.out.println((Cat) eachMammal);

            }
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
