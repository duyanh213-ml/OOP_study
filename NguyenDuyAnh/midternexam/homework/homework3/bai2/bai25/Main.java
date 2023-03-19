package midternexam.homework.homework3.bai2.bai25;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      Customer customer = new Customer(101, "An", 'f');
      System.out.println(customer);

      Account account = new Account(1001, customer, 100.0);
      System.out.println(account);

      account.setBalance(150.5);
      System.out.println(account);

      account.deposit(50);
      System.out.println("After deposit: ");
      System.out.println(account);

      account.withdraw(100);
      System.out.println("After withdraw: ");
      System.out.println(account);

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
