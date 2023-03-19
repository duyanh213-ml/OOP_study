package midternexam.homework.homework5.bai2.bai21;

public class TestLineSub {
   public static void main(String[] args) {
      Point point[] = new Point[6];

      for (int i = 0; i < point.length; i++) {
         point[i] = new Point(i, i);
      }

      LineSub line[] = new LineSub[3];

      for (int i = 0; i < line.length; i++) {
         line[i] = new LineSub(point[i], point[i + 3]);
      }

      int count = 1;
      for (LineSub item : line) {
         System.out.println("Line number " + count + "\n");
         System.out.println("-Point begin: " + item.getBegin());
         System.out.println("-X begin: " + item.getBeginX());
         System.out.println("-Y begin: " + item.getBeginY());

         System.out.println("-Point end: " + item.getEnd());
         System.out.println("-X end: " + item.getEndX());
         System.out.println("-Y end" + item.getEndY());

         System.out.println("-Gradient: " + item.getGradient());
         System.out.println("-Length: " + item.getLength());
         System.out.println();
         count++;

      }
   }
}
