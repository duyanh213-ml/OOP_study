package midternexam.homework.homework3.bai2.bai26;

public class MyPoint {
   private int x;
   private int y;

   public MyPoint() {
      this(0, 0);
   }

   public MyPoint(int x, int y) {
      this.x = x;
      this.y = y;
   }

   public int getX() {
      return this.x;
   }

   public void setX(int x) {
      this.x = x;
   }

   public int getY() {
      return this.y;
   }

   public void setY(int y) {
      this.y = y;
   }

   public void setXY(int x, int y) {
      this.x = x;
      this.y = y;
   }

   public double distance(int x, int y) {
      return Math.sqrt(((double) this.x - x) * (this.x - x) + ((double) this.y - y) * (this.y - y));
   }

   public double distance(MyPoint anotherPoint) {
      return distance(anotherPoint.getX(), anotherPoint.getY());
   }

   public double distance() {
      return distance(0, 0);
   }

   @Override
   public String toString() {
      return "Point: (" + this.x + ", " + this.y + ")";
   }

}
