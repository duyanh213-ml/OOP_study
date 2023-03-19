package midternexam.homework.homework3.bai2.bai24;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      Customer customer = new Customer(98, "An", 10);
      System.out.println(customer);
      customer.setDiscount(8);
      System.out.println(customer);

      Invoice invoice = new Invoice(101, customer, 888.8);
      System.out.println(invoice);

      invoice.setAmount(999.9);
      System.out.println(invoice);

      System.out.printf("Amount after discount: %.2f%n", invoice.amountAfterDiscount());

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
