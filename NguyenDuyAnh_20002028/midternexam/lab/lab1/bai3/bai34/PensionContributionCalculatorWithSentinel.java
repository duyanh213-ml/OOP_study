package midternexam.lab.lab1.bai3.bai34;

import java.util.Scanner;

import midternexam.lab.lab1.bai3.bai33.PensionContributionCalculator;

public class PensionContributionCalculatorWithSentinel {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         System.out.println("Type -1 to monthly to salary if you wanna stop");
         pensionContributionCalculatorWithSentinel(scanner);
      } catch (Exception e) {
         System.out.println("Invalid input!!!");
      }

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();
   }

   public static void pensionContributionCalculatorWithSentinel(Scanner scanner) {
      double monthlySalary = PensionContributionCalculator.pensionContributionCalculator(scanner);
      while (monthlySalary != -1.0) {
         monthlySalary = PensionContributionCalculator.pensionContributionCalculator(scanner);
      }
      System.out.println("Bye!");
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
