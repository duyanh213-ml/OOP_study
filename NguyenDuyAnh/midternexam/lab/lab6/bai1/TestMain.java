package midternexam.lab.lab6.bai1;

import java.sql.Date;
import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      Customer customer = new Customer("Nguyen Duy Anh");
      System.out.println(customer);
      customer.setMemberType("Gold");
      System.out.println(customer);
      customer.setMember(true);
      System.out.println(customer);

      Visit visit = new Visit(customer, Date.valueOf("2021-11-25"));
      System.out.println(visit);

      visit.setProductExpense(100.0);
      visit.setServiceExpense(80.0);
      System.out.println(visit.getTotalExpense());

      System.out.println(DiscountRate.getProductDiscountRate(customer.getMemberType()));
      System.out.println(DiscountRate.getProductDiscountRate(new Customer("Nguyen Duy Binh").getMemberType()));

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
