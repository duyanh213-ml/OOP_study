package midternexam.lab.lab6.bai1;

import java.sql.Date;

public class Visit {
   private Customer customer;
   private Date date;
   private double serviceExpense;
   private double productExpense;

   public Visit(Customer customer, Date date) {
      this.customer = customer;
      this.date = date;

   }

   public Customer getCustomer() {
      return this.customer;
   }

   public void setCustomer(Customer customer) {
      this.customer = customer;
   }

   public Date getDate() {
      return this.date;
   }

   public void setDate(Date date) {
      this.date = date;
   }

   public double getServiceExpense() {
      return this.serviceExpense;
   }

   public void setServiceExpense(double serviceExpense) {
      this.serviceExpense = serviceExpense;
   }

   public double getProductExpense() {
      return this.productExpense;
   }

   public void setProductExpense(double productExpense) {
      this.productExpense = productExpense;
   }

   public double getTotalExpense() {
      return this.productExpense + this.serviceExpense;
   }

   @Override
   public String toString() {
      return "[" + " customer = " + getCustomer() + ", date = " + getDate() + ", serviceExpense = "
            + getServiceExpense() + ", productExpense = " + getProductExpense() + "]";
   }

}
