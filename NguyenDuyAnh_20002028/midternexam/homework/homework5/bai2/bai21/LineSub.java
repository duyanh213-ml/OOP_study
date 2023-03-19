package midternexam.homework.homework5.bai2.bai21;

public class LineSub extends Point {
   private Point end;

   public LineSub(Point begin, Point end) {
      super(begin.getX(), begin.getY());
      this.end = end;
   }

   public LineSub(int beginX, int beginY, int endX, int endY) {
      super(beginX, beginY);
      this.end = new Point(endX, endY);
   }

   public Point getBegin() {
      return this;
   }

   public void setBegin(Point begin) {
      super.setXY(begin.getX(), begin.getY());
   }

   public Point getEnd() {
      return this.end;
   }

   public void setEnd(Point end) {
      this.end = end;
   }

   public int getBeginX() {
      return super.getX();
   }

   public void setBeginX(int beginX) {
      super.setX(beginX);
   }

   public int getBeginY() {
      return super.getY();
   }

   public void setBeginY(int beginY) {
      super.setY(beginY);
   }

   public int getEndX() {
      return this.end.getX();
   }

   public void setEndX(int endX) {
      this.end.setX(endX);
      ;
   }

   public int getEndY() {
      return this.end.getY();
   }

   public void setEndY(int endY) {
      this.end.setY(endY);
      ;
   }

   public void setBeginXY(int beginX, int beginY) {
      setBeginX(beginX);
      setBeginY(beginY);
   }

   public void setEndXY(int endX, int endY) {
      setEndX(endX);
      setEndY(endY);
   }

   public int getLength() {
      return (int) Math.sqrt((getBeginX() - getEndX()) * (getBeginX() - getEndX())
            + (getBeginY() - getEndY()) * (getBeginY() - getEndY()));
   }

   public double getGradient() {
      return Math.atan2((getEndY() - getBeginY()), (getEndX() - getBeginX()));
   }

   @Override
   public String toString() {
      return "Line :(begin: " + super.toString() + ", end: " + this.end.toString() + ")";
   }
}
