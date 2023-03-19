package midternexam.lab.lab1.bai3.bai33;

import java.util.Scanner;

public class PensionContributionCalculator {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         pensionContributionCalculator(scanner);

      } catch (Exception e) {
         System.out.println("Invalid input!!!!");
      }

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();
   }

   public static double pensionContributionCalculator(Scanner scanner) {
      final int SALARYCEILING = 6000;
      final double EMPLOYEERATE55ANDBELOW = 0.2;
      final double EMPLOYERRATE55ANDBELOW = 0.17;
      final double EMPLOYEERATE55TO60 = 0.13;
      final double EMPLOYERRATE55TO60 = 0.13;
      final double EMPLOYEERATE60TO65 = 0.075;
      final double EMPLOYERRATE60TO65 = 0.09;
      final double EMPLOYEERATE65ABOVE = 0.05;
      final double EMPLOYERRATE65ABOVE = 0.075;

      System.out.print("Enter the monthly salary: $");
      double monthlySalary = scanner.nextDouble();
      if (monthlySalary > 0) {
         System.out.print("\nEnter the age: ");
         int age = scanner.nextInt();
         double employeeContribution = -1.0; // Assign a temporary value
         double employerContribution = -1.0; // Assign a temporary value

         if (age > 0) {
            if (monthlySalary <= 6000) {
               if (age <= 55) {
                  employeeContribution = monthlySalary * EMPLOYEERATE55ANDBELOW;
                  employerContribution = monthlySalary * EMPLOYERRATE55ANDBELOW;
               } else if (age <= 60) {
                  employeeContribution = monthlySalary * EMPLOYEERATE55TO60;
                  employerContribution = monthlySalary * EMPLOYERRATE55TO60;
               } else if (age <= 65) {
                  employeeContribution = monthlySalary * EMPLOYEERATE60TO65;
                  employerContribution = monthlySalary * EMPLOYERRATE60TO65;
               } else {
                  employeeContribution = monthlySalary * EMPLOYEERATE65ABOVE;
                  employerContribution = monthlySalary * EMPLOYERRATE65ABOVE;
               }
            } else {
               if (age <= 55) {
                  employeeContribution = SALARYCEILING * EMPLOYEERATE55ANDBELOW;
                  employerContribution = SALARYCEILING * EMPLOYERRATE55ANDBELOW;
               } else if (age <= 60) {
                  employeeContribution = SALARYCEILING * EMPLOYEERATE55TO60;
                  employerContribution = SALARYCEILING * EMPLOYERRATE55TO60;
               } else if (age <= 65) {
                  employeeContribution = SALARYCEILING * EMPLOYEERATE60TO65;
                  employerContribution = SALARYCEILING * EMPLOYERRATE60TO65;
               } else {
                  employeeContribution = SALARYCEILING * EMPLOYEERATE65ABOVE;
                  employerContribution = SALARYCEILING * EMPLOYERRATE65ABOVE;
               }
            }
            System.out.printf("The employee's contribution is: $%.2f%n", employeeContribution);
            System.out.printf("The employer's contribution is: $%.2f%n", employerContribution);
            System.out.printf("The total's contribution is: $%.2f%n",
                  (employeeContribution + employerContribution));
         } else {
            System.out.println("Invalid input");
         }
      } else {
         System.out.println("Invalid input");
      }
      return monthlySalary; // to use in the exercise 3.4

   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
