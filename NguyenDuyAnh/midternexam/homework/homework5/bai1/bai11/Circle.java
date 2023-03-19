package midternexam.homework.homework5.bai1.bai11;

public class Circle {
   private double radius;
   private String color;

   public Circle() {
      this(1.0);
   }

   public Circle(double radius) {
      this(radius, "red");
   }

   public Circle(double radius, String color) {
      this.radius = radius;
      this.color = color;
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
      return this.radius * this.radius * Math.PI;
   }

   @Override
   public String toString() {
      return "Circle[" + getRadius() + ", " + getColor() + "]";
   }

}
