package midternexam.lab.lab6.bai2;

import java.util.ArrayList;
import java.util.List;

public class Polyline {
   private List<Point> points;

   public Polyline() {
      points = new ArrayList<Point>();
   }

   public Polyline(List<Point> points) {
      this.points = points;
   }

   public void appendPoint(int x, int y) {
      this.points.add(new Point(x, y));
   }

   public void appendPoint(Point point) {
      this.points.add(point);
   }

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder("{");
      for (Point aPoint : points) {
         sb.append(aPoint.toString());
      }
      sb.append("}");
      return sb.toString();
   }

   public double getLength() {
      double sum = 0.0;
      for (int i = 1; i < points.size(); i++) {
         sum += points.get(i - 1).distance(points.get(i));
      }
      return sum;
   }

}
