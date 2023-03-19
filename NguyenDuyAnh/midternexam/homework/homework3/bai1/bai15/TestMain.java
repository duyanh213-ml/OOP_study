package midternexam.homework.homework3.bai1.bai15;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      InvoiceItem invoiceItem = new InvoiceItem("A101", "Pen Red", 888, 0.08);
      System.out.println(invoiceItem);

      invoiceItem.setQty(900);
      invoiceItem.setUnitPrice(0.1);
      System.out.println(invoiceItem);

      System.out.println("id is: " + invoiceItem.getId());
      System.out.println("description is: " + invoiceItem.getDesc());
      System.out.println("quantity is: " + invoiceItem.getQty());
      System.out.println("unit price is: " + invoiceItem.getUnitPrice());

      System.out.println("The total is: " + invoiceItem.getTotal());

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
