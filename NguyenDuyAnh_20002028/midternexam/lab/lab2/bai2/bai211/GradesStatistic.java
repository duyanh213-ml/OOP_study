package midternexam.lab.lab2.bai2.bai211;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistic {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         representGradesStatistic(scanner);

      } catch (Exception e) {
         System.out.println("invalid input!!!!");
      }
      System.out.println("Press any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();

   }

   public static void representGradesStatistic(Scanner scanner) {
      System.out.print("Enter the number of students: ");
      int numStudent = scanner.nextInt();

      int studentGrades[] = new int[numStudent];

      for (int studentIndex = 0; studentIndex < studentGrades.length; studentIndex++) {
         System.out.print("Enter the grade for student " + (studentIndex + 1) + ": ");
         studentGrades[studentIndex] = scanner.nextInt();

         while (studentGrades[studentIndex] < 0 || studentGrades[studentIndex] > 100) {
            System.out.print("Please enter the  valid grade from 0 - 100 for student " + (studentIndex + 1) + ": ");
            studentGrades[studentIndex] = scanner.nextInt();
         }
      }

      System.out.printf("The average is: %.2f%n", findTheAverageGrade(studentGrades));
      System.out.println("The minimum is: " + findTheMinimumGrade(studentGrades));
      System.out.println("The maximum is: " + findTheMaximumGrade(studentGrades));
      System.out.println("The median is: " + findTheMedianGrade(studentGrades));
      System.out.printf("The standard deviatation is: %.2f%n", findThestandardDev(studentGrades));

   }

   private static double findTheAverageGrade(int studentGrades[]) {
      if (studentGrades == null) {
         return -1.0;
      }
      double average = 0.0;
      for (int studentIndex = 0; studentIndex < studentGrades.length; studentIndex++) {
         average += 1.0 * studentGrades[studentIndex];
      }
      average /= (1.0 * studentGrades.length);
      return average;
   }

   private static int findTheMinimumGrade(int studentGrades[]) {
      if (studentGrades == null) {
         return -1;
      }
      int min = studentGrades[0];
      for (int studentIndex = 1; studentIndex < studentGrades.length; studentIndex++) {
         if (studentGrades[studentIndex] < min)
            min = studentGrades[studentIndex];
      }
      return min;
   }

   private static int findTheMaximumGrade(int studentGrades[]) {
      if (studentGrades == null) {
         return -1;
      }
      int max = studentGrades[0];
      for (int studentIndex = 1; studentIndex < studentGrades.length; studentIndex++) {
         if (studentGrades[studentIndex] > max)
            max = studentGrades[studentIndex];
      }
      return max;
   }

   private static double findTheMedianGrade(int studentGrades[]) {
      if (studentGrades == null) {
         return -1.0;
      }
      Arrays.sort(studentGrades);
      if (studentGrades.length % 2 != 0) {
         return studentGrades[studentGrades.length / 2] * 1.0;
      }
      return (studentGrades[studentGrades.length / 2] * 1.0 + studentGrades[studentGrades.length / 2 - 1] * 1.0) / 2;
   }

   private static double findThestandardDev(int studentGrades[]) {
      if (studentGrades == null) {
         return -1.0;
      }
      double sigmaSum = 0.0;
      for (int studentIndex = 0; studentIndex < studentGrades.length; studentIndex++) {
         sigmaSum += (studentGrades[studentIndex] * studentGrades[studentIndex] * 1.0);
      }
      return Math.sqrt(sigmaSum / studentGrades.length - Math.pow(findTheAverageGrade(studentGrades), 2));
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
