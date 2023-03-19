package midternexam.lab.lab6.bai2;

public class Point {
   private int x;
   private int y;

   public Point(int x, int y) {
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

   public int[] getXY() {
      int xy[] = { this.x, this.y };
      return xy;
   }

   public void setXY(int x, int y) {
      setX(x);
      setY(y);
   }

   @Override
   public String toString() {
      return "[" + " x = " + getX() + ", y = " + getY() + "]";
   }

   public double distance(Point another) {
      return Math.sqrt(Math.pow(this.x - another.getX(), 2.0) + Math.pow(this.y - another.getY(), 2.0));
   }
}
