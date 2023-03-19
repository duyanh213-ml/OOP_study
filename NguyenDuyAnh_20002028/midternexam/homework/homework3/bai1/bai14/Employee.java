package midternexam.homework.homework3.bai1.bai14;

public class Employee {

   private int id;
   private String firstName;
   private String lastName;
   private int salary;

   public Employee(int id, String firstName, String lastName, int salary) {
      this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.salary = salary;
   }

   public int getId() {
      return this.id;
   }

   public String getFirstName() {
      return this.firstName;
   }

   public String getLastName() {
      return this.lastName;
   }

   public int getSalary() {
      return this.salary;
   }

   public void setSalary(int salary) {
      this.salary = salary;
   }

   public int getAnnualSalary() {
      return this.salary * 12;
   }

   public int raiseSalary(int percent) {
      float rate = (float) percent / 100;
      this.salary += Math.round((float) this.salary * rate);
      return this.salary;
   }

   @Override
   public String toString() {
      return "Employee [" + "id = " + getId() + ", firstName = " + getFirstName() + ", lastName = " + getLastName()
            + ", salary = " + getSalary() + "]";
   }

}
