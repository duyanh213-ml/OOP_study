package midternexam.homework.homework6.bai12;

public class Rectangle implements GeometricObject {
   private double width;
   private double length;

   public Rectangle(double width, double length) {
      this.width = width;
      this.length = length;
   }

   @Override
   public String toString() {
      return "Rectangle[width = " + this.width + ", length = " + this.length + "]";
   }

   @Override
   public double getArea() {
      return this.length * this.width;
   }

   @Override
   public double getPerimeter() {
      return 2.0 * (this.length + this.width);
   }
}
