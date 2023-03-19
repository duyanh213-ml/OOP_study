package midternexam.homework.homework4.bai13;

import java.math.BigInteger;
import java.util.Scanner;

public class TestBigInteger {
   public static void main(String[] args) {

      clearScreen();
      Scanner scanner = new Scanner(System.in);

      BigInteger i1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
      BigInteger i2 = new BigInteger("22222222222222222222222222222222222222222222222222");
      System.out.println(i1.add(i2));
      System.out.println(i1.multiply(i2));

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
