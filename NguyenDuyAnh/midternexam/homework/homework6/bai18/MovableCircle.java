package midternexam.homework.homework6.bai18;


public class MovableCircle implements Movable{
   private int radius;
   private MovablePoint center;

   public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
      this.center = new MovablePoint(x, y, xSpeed, ySpeed);
      this.radius = radius;
   }

   @Override
   public void moveUp() {
      this.center.moveUp();
   }

   @Override
   public void moveDown() {
      this.center.moveDown();
   }

   @Override
   public void moveLeft() {
      this.center.moveLeft();

   }

   @Override
   public void moveRight() {
      this.center.moveRight();

   }

   @Override
   public String toString() {
      return this.center.toString() + ", radius = " + this.radius;
   }
}
