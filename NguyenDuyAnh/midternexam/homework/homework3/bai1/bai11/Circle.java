package midternexam.homework.homework3.bai1.bai11;

public class Circle {

   private double radius;
   private String color;

   public Circle() {
      this.radius = 1.0;
      this.color = "red";
   }

   public Circle(double radius) {
      this.radius = radius;
      this.color = "red";
   }

   public double getRadius() {
      return this.radius;
   }

   public void setRadius(double radius) {
      this.radius = radius;

   }

   public String getColor() {
      return this.color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public double getArea() {
      if (this.radius > 0) {
         return this.radius * this.radius * Math.PI;
      }
      return -1.0;

   }

   @Override
   public String toString() {
      return "Circle [Radius = " + this.radius + ", color = " + this.color + "]";
   }

}
