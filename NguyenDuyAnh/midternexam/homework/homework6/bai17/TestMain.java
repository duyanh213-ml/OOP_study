package midternexam.homework.homework6.bai17;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      // Using subclass
      Cat cat1 = new Cat();
      cat1.greeting();
      Dog dog1 = new Dog();
      dog1.greeting();
      BigDog bigDog1 = new BigDog();
      bigDog1.greeting();

      // Using Polymophism
      Animal animal1 = new Cat();
      animal1.greeting();
      Animal animal2 = new Dog();
      animal2.greeting();
      Animal animal3 = new BigDog();
      animal3.greeting();

      // Downcast
      Dog dog2 = (Dog) animal2;
      BigDog bigDog2 = (BigDog) animal3;

      dog2.greeting();
      bigDog2.greeting();
      dog2.greeting(bigDog2);
      bigDog2.greeting(dog2);
      bigDog2.greeting(bigDog1);
      
      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
