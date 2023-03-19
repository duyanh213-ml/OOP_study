package midternexam.homework.homework5.bai2.bai21;

public class TestPoint {
   public static void main(String[] args) {
      Point point[] = new Point[5];

      for (int i = 0; i < point.length; i++) {
         point[i] = new Point(i, i);
      }

      for (Point item : point) {
         System.out.println(item);
      }

   }
}
