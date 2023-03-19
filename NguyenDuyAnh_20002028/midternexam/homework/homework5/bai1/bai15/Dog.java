package midternexam.homework.homework5.bai1.bai15;

public class Dog extends Mammal {

   public Dog(String name) {
      super(name);
   }

   public void greets() {
      System.out.println("Woof");
   }

   public void greets(Dog anotherDog) {
      System.out.println("Woooof");
   }

   @Override
   public String toString() {
      return "Dog[" + super.toString() + "]";
   }
}
