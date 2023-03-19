package midternexam.homework.homework5.bai2.bai21;

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

   public void setXY(int x, int y) {
      this.x = x;
      this.y = y;
   }

   @Override
   public String toString() {
      return "Point: (" + this.x + ", " + this.y + ")";
   }

}
