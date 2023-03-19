package midternexam.homework.homework4.bai12;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      MyPolynomial myPolynomial = new MyPolynomial(2, 4, 3);
      System.out.println(myPolynomial);

      MyPolynomial givenPolynomial = new MyPolynomial(1, 2, 3, 4);
      System.out.println(givenPolynomial);

      MyPolynomial adding2Polynomial = myPolynomial.add(givenPolynomial);
      System.out.println("- Adding 2 polynomials: " + adding2Polynomial);

      MyPolynomial multi2Polynomial = myPolynomial.multiply(givenPolynomial);
      System.out.println("- Multiplying 2 polynomials: " + multi2Polynomial);

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
