package midternexam.lab.lab2.bai2.bai212;

import java.util.Scanner;

public class GradesHistogram {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         representGradesHistogram(scanner);
      } catch (Exception e) {
         System.out.println("invalid input!!!!");
      }
      System.out.println("Press any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();

   }

   public static void representGradesHistogram(Scanner scanner) {
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

      representHoriZon(scanner, studentGrades);

   }

   public static void representHoriZon(Scanner scanner, int studentGrades[]) {
      if (studentGrades == null) {
         System.out.println("Null array!!!!!!");
         return;
      }

      int histogram[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

      for (int i = 0; i < studentGrades.length; i++) {
         int temp = studentGrades[i] / 10;
         histogram[temp]++;
      }

      for (int index = 0; index < histogram.length; index++) {
         System.out.print("(" + (index * 10) + " - " + (index * 10 + 9) + "):  ");
         for (int numberOfStars = 0; numberOfStars < histogram[index]; numberOfStars++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

}
