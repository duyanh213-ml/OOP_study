package midternexam.homework.homework5.bai1.bai13;

public class Point2D {
   private float x;
   private float y;

   public Point2D() {
      this(0.0f, 0.0f);
   }

   public Point2D(float x, float y) {
      this.x = x;
      this.y = y;
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

   public float[] getXY() {
      float xy[] = new float[2];
      xy[0] = this.x;
      xy[1] = this.y;
      return xy;
   }

   public void setXY(float x, float y) {
      setX(x);
      setX(y);
   }

   @Override
   public String toString() {
      return "(" + getX() + ", " + getY() + ")";
   }

}
