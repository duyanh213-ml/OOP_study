package midternexam.homework.homework3.bai2.bai24;

public class Invoice {
   private int id;
   private Customer customer;
   private double amount;

   public Invoice(int id, Customer customer, double amount) {
      this.id = id;
      this.customer = customer;
      this.amount = amount;
   }

   public int getId() {
      return this.id;
   }

   public Customer getCustomer() {
      return this.customer;
   }

   public void setCustomer(Customer customer) {
      this.customer = customer;
   }

   public double getAmount() {
      return this.amount;
   }

   public void setAmount(double amount) {
      this.amount = amount;
   }

   public int getCustomerId() {
      return this.customer.getId();
   }

   public String getCustomerName() {
      return this.customer.getName();
   }

   public int getCustomerDiscount() {
      return this.customer.getDiscount();
   }

   public double amountAfterDiscount() {
      return this.amount -= this.amount * ((double) getCustomerDiscount() / 100.0);
   }

   @Override
   public String toString() {
      return "Invoice[id = " + getId() + ", customer = " + getCustomerName() + "(" + getCustomerId() + "("
            + getCustomerDiscount() + "%), amount = " + getAmount() + "]";
   }
}
