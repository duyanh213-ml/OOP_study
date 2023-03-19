package midternexam.homework.homework6.bai11;

public class Rectangle extends Shape {
   private double width;
   private double length;

   public Rectangle() {
      this(1.0, 1.0);
   }

   public Rectangle(double width, double length) {
      this(width, length, "red", true);
   }

   public Rectangle(double width, double length, String color, boolean filled) {
      super(color, filled);
      this.width = width;
      this.length = length;
   }

   public double getWidth() {
      return this.width;
   }

   public void setWidth(double width) {
      this.width = width;
   }

   public double getLength() {
      return this.length;
   }

   public void setLength(double length) {
      this.length = length;
   }

   public double getArea() {
      return this.length * this.width;
   }

   public double getPerimeter() {
      return 2.0 * (this.length + this.width);
   }

   @Override
   public String toString() {
      return "Rectangle[" + super.toString() + ", " + getWidth() + ", " + getLength() + "]";
   }

}
