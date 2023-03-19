package midternexam.homework.homework6.bai15;

public class Circle implements GeometricObject {
   protected double radius;

   public Circle(double radius) {
      this.radius = radius;
   }

   @Override
   public String toString() {
      return "Circle[radius = " + this.radius + "]";
   }

   @Override
   public double getArea() {
      return this.radius * this.radius * Math.PI;
   }

   @Override
   public double getPerimeter() {
      return this.radius * 2 * Math.PI;
   }
}
