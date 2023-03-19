package midternexam.homework.homework6.bai16;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      Cat cat = new Cat("Tom");

      cat.greets();

      Dog dog = new Dog("Spike");

      dog.greets();
      dog.greets(dog);

      BigDog bigDog = new BigDog("A");

      bigDog.greets();
      bigDog.greets(new BigDog("B"));
      bigDog.greets(dog);

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
