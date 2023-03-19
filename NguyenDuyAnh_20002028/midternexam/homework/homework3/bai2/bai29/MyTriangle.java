package midternexam.homework.homework3.bai2.bai29;

import midternexam.homework.homework3.bai2.bai26.MyPoint;

public class MyTriangle {
   private MyPoint v1;
   private MyPoint v2;
   private MyPoint v3;

   public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
      this(new MyPoint(x1, y1), new MyPoint(x2, y2), new MyPoint(x3, y3));
   }

   public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
      this.v1 = v1;
      this.v2 = v2;
      this.v3 = v3;
   }

   @Override
   public String toString() {
      return "MyTriangle[ v1 = (" + this.v1.getX() + ", " + this.v1.getY() + "), v2 = (" + this.v2.getX() + ", "
            + this.v2.getY() + "), v3 = (" + this.v3.getX() + ", " + this.v3.getY() + ")]";
   }

   public double getParemeter() {
      return this.v1.distance(v2) + this.v2.distance(v3) + this.v3.distance(v1);
   }

   public String getType() {
      if (this.v1.distance(v2) == this.v2.distance(v3) && this.v3.distance(v1) == this.v3.distance(v2)) {
         return "Equilateral";
      }
      if (this.v1.distance(v2) == this.v2.distance(v3) && this.v3.distance(v1) != this.v3.distance(v2)
            || this.v1.distance(v2) == this.v1.distance(v3) && this.v3.distance(v1) != this.v3.distance(v2)
            || this.v3.distance(v2) == this.v1.distance(v3) && this.v3.distance(v1) != this.v1.distance(v2)) {
         return "Isosceles";
      }
      return "Scalene";
   }

}
