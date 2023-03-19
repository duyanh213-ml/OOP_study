package midternexam.homework.homework3.bai1.bai16;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {

      clearScreen();
      Scanner scanner = new Scanner(System.in);

      Account account1 = new Account("A101", "An", 88);
      System.out.println(account1);

      Account account2 = new Account("A101", "Binh");
      System.out.println(account2);

      System.out.println("Id is: " + account1.getId());
      System.out.println("Name is: " + account1.getName());
      System.out.println("Balance is: " + account1.getBalance());

      account1.credit(100);
      System.out.println(account1);
      account1.debit(50);
      System.out.println(account1);
      account1.debit(500);
      System.out.println(account1);

      account1.transferTo(account2, 100);
      System.out.println(account1);
      System.out.println(account2);
      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
