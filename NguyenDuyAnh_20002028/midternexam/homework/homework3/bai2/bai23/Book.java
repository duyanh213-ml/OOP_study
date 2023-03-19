package midternexam.homework.homework3.bai2.bai23;

public class Book {
   private String isBn;
   private String name;
   private Author author;
   private double price;
   private int qty;

   public Book(String isBn, String name, Author author, double price, int qty) {
      this.isBn = isBn;
      this.name = name;
      this.author = author;
      this.price = price;
      this.qty = 0;
   }

   public String getIsBn() {
      return this.isBn;
   }

   public String getName() {
      return this.name;
   }

   public Author getAuthor() {
      return this.author;
   }

   public double getPrice() {
      return this.price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public int getQty() {
      return this.qty;
   }

   public void setQty(int qty) {
      this.qty = qty;
   }

   public String getAuthorName() {
      return this.author.getName();
   }

   @Override
   public String toString() {
      return "Book [isBn = " + this.isBn + "name = " + this.name + ", Author[name = " + this.author.getName()
            + ", email = "
            + this.author.getEmail() + "], price = " + this.price
            + "$, qty = "
            + this.qty + "]";
   }
}
