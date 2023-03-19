package midternexam.homework.homework3.bai2.bai210;

import midternexam.homework.homework3.bai2.bai26.MyPoint;

public class MyRectangle {
   private MyPoint topLeft;
   private MyPoint bottomRight;

   public MyRectangle(int x1, int y1, int x2, int y2) {
      this.topLeft = new MyPoint(Math.min(x1, x2), Math.max(y1, y2));
      this.bottomRight = new MyPoint(Math.max(x1, x2), Math.min(y1, y2));
   }

   public MyRectangle() {
   }

   public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
      this.topLeft = topLeft;
      this.bottomRight = bottomRight;
   }

   public MyPoint getTopLeft() {
      return this.topLeft;
   }

   public void setTopLeft(MyPoint topLeft) {
      if (topLeft.getX() == Math.min(this.bottomRight.getX(), topLeft.getX())
            && topLeft.getY() == Math.max(this.bottomRight.getY(), topLeft.getY())) {
         return;
      }
      this.topLeft = topLeft;
   }

   public MyPoint getBottomRight() {
      return this.bottomRight;
   }

   public void setBottomRight(MyPoint bottomRight) {
      if (bottomRight.getX() == Math.max(this.topLeft.getX(), bottomRight.getX())
            && bottomRight.getY() == Math.min(this.topLeft.getY(), bottomRight.getY())) {
         return;
      }
      this.bottomRight = bottomRight;
   }

   @Override
   public String toString() {
      return "MyRectangle[ Top-left " + this.topLeft + ", bottom-right "
            + this.bottomRight + "]";
   }

}
