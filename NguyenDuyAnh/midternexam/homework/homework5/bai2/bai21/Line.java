package midternexam.homework.homework5.bai2.bai21;

public class Line {
   private Point begin;
   private Point end;

   public Line(Point begin, Point end) {
      this.begin = begin;
      this.end = end;
   }

   public Line(int beginX, int beginY, int endX, int endY) {
      this.begin = new Point(beginX, beginY);
      this.end = new Point(endX, endY);
   }

   public Point getBegin() {
      return this.begin;
   }

   public void setBegin(Point begin) {
      this.begin = begin;
   }

   public Point getEnd() {
      return this.end;
   }

   public void setEnd(Point end) {
      this.end = end;
   }

   public int getBeginX() {
      return this.begin.getX();
   }

   public void setBeginX(int beginX) {
      this.begin.setX(beginX);
   }

   public int getBeginY() {
      return this.begin.getY();
   }

   public void setBeginY(int beginY) {
      this.begin.setY(beginY);
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
      return "Line :(begin: " + this.begin.toString() + ", end: " + this.end.toString() + ")";
   }

}
