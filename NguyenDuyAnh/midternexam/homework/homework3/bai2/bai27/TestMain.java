package midternexam.homework.homework3.bai2.bai27;

import java.util.Scanner;

import midternexam.homework.homework3.bai2.bai26.MyPoint;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);

      MyPoint myPoint[] = new MyPoint[6];

      for (int i = 0; i < myPoint.length; i++) {
         myPoint[i] = new MyPoint(i, i);
      }

      MyLine myLine[] = new MyLine[3];

      for (int i = 0; i < myLine.length; i++) {
         myLine[i] = new MyLine(myPoint[i], myPoint[i + 3]);
      }

      int count = 1;
      for (MyLine item : myLine) {
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
      System.out.println("Press any key to exit...");
      scanner.nextLine();
      clearScreen();

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
