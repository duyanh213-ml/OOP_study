package midternexam.homework.homework5.bai2.bai22;

public class Cylinder {
   private Circle base;
   private double height;

   public Cylinder(double height, double radius, String color) {
      this.base = new Circle(radius, color);
      this.height = height;
   }

   public Circle getBase() {
      return this.base;
   }

   public void setBase(Circle base) {
      this.base = base;
   }

   public double getHeight() {
      return this.height;
   }

   public void setHeight(double height) {
      this.height = height;
   }

   public double getVolumn() {
      return this.height * this.base.getArea();
   }

   @Override
   public String toString() {
      return "Cylinder: subclass of " + this.base.toString() + ", height = " + this.height;
   }
}
