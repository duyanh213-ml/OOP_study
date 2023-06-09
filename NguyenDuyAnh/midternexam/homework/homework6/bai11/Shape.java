package midternexam.homework.homework6.bai11;

public abstract class Shape {
   private String color;
   private boolean filled;

   public Shape() {
      this("red", true);
   }

   public Shape(String color, boolean filled) {
      this.color = color;
      this.filled = filled;
   }

   public String getColor() {
      return this.color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public boolean isFilled() {
      return this.filled;
   }

   public void setFilled(boolean filled) {
      this.filled = filled;
   }

   public abstract double getArea();

   public abstract double getPerimeter();

   @Override
   public String toString() {
      return "Shape[" + this.color + ", " + this.filled + "]";
   }

}
