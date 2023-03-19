package midternexam.homework.homework3.bai1.bai19;

public class Ball {
   private float x;
   private float y;
   private int radius;
   private float xDelta;
   private float yDelta;

   public Ball(float x, float y, int radius, int speed, int direction) {
      this.x = x;
      this.y = y;
      this.radius = radius;
      this.xDelta = (float) (speed * Math.cos(direction));
      this.yDelta = (float) (speed * Math.sin(direction));
   }

   public float getX() {
      return this.x;
   }

   public void setX(float x) {
      this.x = x;
   }

   public float getY() {
      return this.y;
   }

   public void setY(float y) {
      this.y = y;
   }

   public int getRadius() {
      return this.radius;
   }

   public void setRadius(int radius) {
      this.radius = radius;
   }

   public float getXDelta() {
      return this.xDelta;
   }

   public void setXDelta(float xDelta) {
      this.xDelta = xDelta;
   }

   public float getYDelta() {
      return this.yDelta;
   }

   public void setYDelta(float yDelta) {
      this.yDelta = yDelta;
   }

   public void move() {
      this.x += this.xDelta;
      this.y += this.yDelta;
   }

   public void reflectHorizontal() {
      this.xDelta = -this.xDelta;
   }

   public void reflectVertical() {
      this.yDelta = -this.yDelta;
   }

   @Override
   public String toString() {
      return "Ball[(" + this.x + ", " + this.y + "), speed(" + xDelta + ", " + yDelta + ")]";
   }
}
