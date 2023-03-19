package midternexam.homework.homework4.bai17;

public class Player {
   private int number;
   private float x;
   private float y;
   private float z;

   public Player(int number, float x, float y) {
      this.number = number;
      this.x = x;
      this.y = y;
      this.z = 0.0f;
   }

   public void move(float xDisp, float yDisp) {
      this.x += xDisp;
      this.y += yDisp;
   }

   public void jump(float zDisp) {
      this.z += zDisp;
   }

   public boolean near(Ball ball) {
      float distance = (ball.getX() - this.x) * (ball.getX() - this.x) + (ball.getY() - this.y) * (ball.getY() - this.y)
            + (ball.getZ() - this.z) * (ball.getZ() - this.z);
      distance = (float) Math.sqrt(distance);
      if (distance <= 8) {
         return true;
      }
      return false;
   }

   public void kick() {
      System.out.println("This ball have been kicked by the player number " + this.number);
   }

}
