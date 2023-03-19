package midternexam.homework.homework3.bai2.bai24;

public class Customer {
   private int id;
   private String name;
   private int discount;

   public Customer(int id, String name, int discount) {
      this.id = id;
      this.name = name;
      this.discount = discount;
   }

   public int getId() {
      return this.id;
   }

   public String getName() {
      return this.name;
   }

   public int getDiscount() {
      return this.discount;
   }

   public void setDiscount(int discount) {
      this.discount = discount;
   }

   @Override
   public String toString() {
      return this.getName() + "(" + this.getId() + ", " + this.getDiscount() + ")";
   }

}
