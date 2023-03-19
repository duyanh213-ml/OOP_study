package midternexam.homework.homework3.bai2.bai28;

import midternexam.homework.homework3.bai2.bai26.MyPoint;

public class MyCircle {
   private MyPoint center;
   private int radius;

   public MyCircle() {
      this(new MyPoint(0, 0), 1);
   }

   public MyCircle(MyPoint center, int radius) {
      this.center = center;
      this.radius = radius;
   }

   public MyPoint getCenter() {
      return this.center;
   }

   public void setCenter(MyPoint center) {
      this.center = center;
   }

   public int getRadius() {
      return this.radius;
   }

   public void setRadius(int radius) {
      this.radius = radius;
   }

   public int getCenterX() {
      return this.center.getX();
   }

   public void setCenterX(int x) {
      this.center.setX(x);
      ;
   }

   public int getCenterY() {
      return this.center.getY();
   }

   public void setCenterY(int y) {
      this.center.setY(y);
      ;
   }

   public int[] getCenterXY() {
      int centerXY[] = new int[2];
      centerXY[0] = getCenterX();
      centerXY[1] = getCenterY();

      return centerXY;
   }

   public void setCenterXY(int x, int y) {
      setCenterX(x);
      setCenterY(y);
   }

   @Override
   public String toString() {
      return "MyCircle[ radius = " + this.radius + ", " + "center(" + this.getCenterX() + ", " + this.getCenterY()
            + ")]";
   }

   public double getArea() {
      return this.radius * this.radius * Math.PI;
   }

   public double getDistance(MyCircle another) {
      return Math.sqrt(Math.pow((double) this.getCenterX() - another.getCenterX(), 2.0)
            + Math.pow((double) this.getCenterY() - another.getCenterY(), 2.0));
   }

}
