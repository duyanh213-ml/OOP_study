package midternexam.homework.homework6.bai11;

public class Circle extends Shape{
   private double radius;

   public Circle() {
      this(1.0);
   }

   public Circle(double radius) {
      this(radius, "red", true);
   }

   public Circle(double radius, String color, boolean filled) {
      super(color, filled);
      this.radius = radius;
   }

   public double getRadius() {
      return this.radius;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   public double getArea() {
      return this.radius * this.radius * Math.PI;
   }

   public double getPerimeter() {
      return this.radius * 2 * Math.PI;
   }

   @Override
   public String toString() {
      return "Circle[" + super.toString() + ", " + getRadius() + "]";
   }
}
