package midternexam.homework.homework3.bai1.bai16;

public class Account {

   private String id;
   private String name;
   private int balance;

   public Account(String id, String name) {
      this.id = id;
      this.name = name;
      this.balance = 0;
   }

   public Account(String id, String name, int balance) {
      this.id = id;
      this.name = name;
      this.balance = balance;
   }

   public String getId() {
      return this.id;
   }

   public String getName() {
      return this.name;
   }

   public int getBalance() {
      return this.balance;
   }

   public int credit(int amount) {
      return this.balance += amount;
   }

   public int debit(int amount) {
      if (amount <= this.balance) {
         this.balance -= amount;
      } else {
         System.out.println("Amount exceeded balance");
      }
      return this.balance;
   }

   public int transferTo(Account another, int amount) {
      if (amount <= this.balance) {
         this.balance -= amount;
         another.balance += amount;
      } else {
         System.out.println("Amount exceeded balance");
      }
      return this.balance;
   }

   @Override
   public String toString() {
      return "{" + " id='" + getId() + "'" + ", name='" + getName() + "'" + ", balance='" + getBalance() + "'" + "}";
   }

}
