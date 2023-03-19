package midternexam.homework.homework3.bai2.bai22;

public class SetOfBook {
   private String name;
   private Author[] author;
   private double price;
   private int qty;

   public SetOfBook(String name, Author[] author, double price) {
      this.name = name;
      this.author = author;
      this.price = price;
      this.qty = 0;
   }

   public SetOfBook(String name, Author[] author, double price, int qty) {
      this.name = name;
      this.author = author;
      this.price = price;
      this.qty = qty;
   }

   public String getName() {
      return this.name;
   }

   public Author[] getAuthor() {
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

   @Override
   public String toString() {
      String authors = "";
      for (int i = 0; i < this.author.length; i++) {
         authors += "[name = " + this.author[i].getName() + ", email = " + this.author[i].getEmail() + ", gender = "
               + this.author[i].getGender() + "]";
      }
      return "Book [name = " + this.name + ", Author{" + authors + "}, price = " + this.price + "$, qty = " + this.qty
            + "]";
   }

}
