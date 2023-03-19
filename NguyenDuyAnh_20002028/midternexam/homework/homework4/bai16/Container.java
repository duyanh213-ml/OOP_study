package midternexam.homework.homework4.bai16;

public class Container {
   private int x1;
   private int y1;
   private int x2;
   private int y2;

   public Container(int x, int y, int height, int width) {
      this.x1 = x;
      this.y1 = y;
      x2 = x1 + width - 1;
      y2 = y1 + height - 1;
   }

   public int getX() {
      return this.x1;
   }

   public int getY() {
      return this.y1;
   }

   public int getWidth() {
      return this.x2;
   }

   public int getHeight() {
      return this.y2;
   }

   public boolean collides(Ball ball) {
      if (ball.getX() - ball.getRadius() <= this.x1 || ball.getX() + ball.getRadius() >= this.x2) {
         ball.reflectHorizontal();
         return true;
      }

      if (ball.getY() - ball.getRadius() <= this.y1 || ball.getY() + ball.getRadius() >= this.y2) {
         ball.reflectVertical();
         return true;
      }
      return false;
   }

   @Override
   public String toString() {
      return "Container[(" + this.x1 + ", " + this.y1 + "), (" + this.x2 + ", " + this.y2 + ")]";
   }

}
