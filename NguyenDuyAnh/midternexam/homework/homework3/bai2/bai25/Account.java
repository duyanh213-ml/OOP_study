package midternexam.homework.homework3.bai2.bai25;

public class Account {
   private int id;
   private Customer customer;
   private double balance;

   public Account(int id, Customer customer, double balance) {
      this.id = id;
      this.customer = customer;
      this.balance = balance;
   }

   public Account(int id, Customer customer) {
      this.id = id;
      this.customer = customer;
      this.balance = 0.0;
   }

   public int getId() {
      return this.id;
   }

   public Customer getCustomer() {
      return this.customer;
   }

   public double getBalance() {
      return this.balance;
   }

   public void setBalance(double balance) {
      this.balance = balance;
   }

   @Override
   public String toString() {
      double balance = (double) Math.round(this.balance * 100.0) / 100.0;
      return customer.toString() + "balance = $" + balance;
   }

   public double deposit(double amount) {
      return this.balance += amount;
   }

   public double withdraw(double amount) {
      if (this.balance >= amount) {
         return this.balance -= amount;
      }
      System.out.println("Amount withdrawn exceeds the curent balance!!");
      return this.balance;
   }

}
