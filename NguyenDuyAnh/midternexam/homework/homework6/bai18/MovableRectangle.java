package midternexam.homework.homework6.bai18;

public class MovableRectangle implements Movable {
   private MovablePoint topLeft;
   private MovablePoint bottomRight;

   public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
      this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
      this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
   }

   @Override
   public String toString() {
      return "Top-left: " + this.topLeft.toString() + ", " + "Bottom-right" + this.bottomRight.toString();
   }

   @Override
   public void moveDown() {
      this.topLeft.moveDown();
      this.bottomRight.moveDown();
   }

   @Override
   public void moveRight() {
      this.topLeft.moveRight();
      this.bottomRight.moveRight();
   }

   @Override
   public void moveLeft() {
      this.topLeft.moveLeft();
      this.bottomRight.moveLeft();
   }

   @Override
   public void moveUp() {
      this.topLeft.moveUp();
      this.bottomRight.moveUp();
   }

}
