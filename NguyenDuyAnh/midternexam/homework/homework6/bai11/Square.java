package midternexam.homework.homework6.bai11;

public class Square extends Rectangle {

   public Square() {
      this(1.0);
   }

   public Square(double side) {
      this(side, "red", true);
   }

   public Square(double side, String color, boolean filled) {
      super(side, side, color, filled);
   }

   public double getSide() {
      return super.getLength();
   }

   public void setSide(double side) {
      super.setLength(side);
      super.setWidth(side);
   }

   public void setWidth(double side) {
      setSide(side);
   }

   public void setLength(double side) {
      setSide(side);
   }

   @Override
   public String toString() {
      return "Square[" + super.toString() + "]";
   }
}