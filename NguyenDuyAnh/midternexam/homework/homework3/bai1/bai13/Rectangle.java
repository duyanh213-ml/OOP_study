package midternexam.homework.homework3.bai1.bai13;


public class Rectangle {

   private float length;
   private float width;

   public Rectangle() {
      this.length = 1.0f;
      this.width = 1.0f;
   }

   public Rectangle(float length, float width) {
      this.length = length;
      this.width = width;
   }

   public float getLength() {
      return this.length;
   }

   public void setLength(float length) {
      this.length = length;
   }

   public float getWidth() {
      return this.width;
   }

   public void setWidth(float width) {
      this.width = width;
   }

   public double getArea() {
      if (this.length >= 0.0f && this.width >= 0.0f && this.length >= this.width) {
         return this.length * this.width;
      }
      return -1.0;
   }

   public double getPerimeter() {
      if (this.length >= 0.0f && this.width >= 0.0f && this.length >= this.width) {
         return (this.length + this.width) * 2.0f;
      }
      return -1.0;
   }

   @Override
   public String toString() {
      return "Rectangle [" + "length = " + getLength() + ", width = " + getWidth() + "]";
   }

}
