package midternexam.homework.homework3.bai2.bai27;

import midternexam.homework.homework3.bai2.bai26.MyPoint;

public class MyLine {
   private MyPoint begin;
   private MyPoint end;

   public MyLine(MyPoint begin, MyPoint end) {
      this.begin = begin;
      this.end = end;
   }

   public MyLine(int beginX, int beginY, int endX, int endY) {
      this.begin = new MyPoint(beginX, beginY);
      this.end = new MyPoint(endX, endY);
   }

   public MyPoint getBegin() {
      return this.begin;
   }

   public void setBegin(MyPoint begin) {
      this.begin = begin;
   }

   public MyPoint getEnd() {
      return this.end;
   }

   public void setEnd(MyPoint end) {
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
