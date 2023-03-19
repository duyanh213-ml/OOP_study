package midternexam.homework.homework3.bai1.bai12;


public class Circle {
   private double radius;

   public Circle() {
      this.radius = 1.0;
   }

   public Circle(double radius) {
      this.radius = radius;
   }

   public double getRadius() {
      return this.radius;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   public double getArea() {
      if (this.radius > 0) {
         return this.radius * this.radius * Math.PI;
      }
      return -1.0;
   }

   public double getCircumference() {
      if (this.radius > 0) {
         return 2.0 * this.radius * Math.PI;
      }
      return -1.0;
   }

   @Override
   public String toString() {
      return "Circle [Radius = " + this.radius + " ]";
   }

   
}
