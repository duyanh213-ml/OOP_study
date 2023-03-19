package midternexam.homework.homework4.bai11;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      MyComplex myComplex = new MyComplex(3, 4);
      System.out.println(myComplex);

      // Check getValue:
      System.out.println("The real is: " + myComplex.getReal());
      System.out.println("The imaginary is: " + myComplex.getImg());

      // Check setValue:
      myComplex.setReal(6);
      myComplex.setImg(8);
      System.out.println(myComplex);

      myComplex.setValue(5, 4);
      System.out.println(myComplex);

      // Check boolean type methods
      System.out.println(myComplex.isReal());
      System.out.println(myComplex.isImaginary());
      System.out.println(new MyComplex(4, 0).isReal());
      System.out.println(new MyComplex(0, 1).isImaginary());
      System.out.println(myComplex.isEqual(5, 4));
      System.out.println(myComplex.isEqual(new MyComplex(0, 2)));

      // Check argument, magnitude
      System.out.printf("The argument is: %.2f (rad) %n", myComplex.arguments());
      System.out.printf("The magnitude is: %.2f%n", myComplex.magnitude());

      // Check "myComplex" type methods
      // Modify the current instance
      MyComplex anotherComplex = new MyComplex(3, 4);
      myComplex.addInto(anotherComplex);
      System.out.println(myComplex);
      myComplex.subtract(anotherComplex);
      System.out.println(myComplex);
      myComplex.multiply(anotherComplex);
      System.out.println(myComplex);
      myComplex.divde(anotherComplex);
      System.out.println(myComplex);
      myComplex.conjugate();
      System.out.println(myComplex);

      // Creat a new instace but not modify the current instance
      MyComplex complex1 = myComplex.addNew(myComplex);
      System.out.println(complex1 + "\n" + myComplex);
      MyComplex complex2 = myComplex.subtractNew(myComplex);
      System.out.println(complex2 + "\n" + myComplex);
      
      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
