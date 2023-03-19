package midternexam.lab.lab1.bai1.bai14;

import java.util.Scanner;

public class PrintDayInWord {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         System.out.println("Enter the day in number from 0 to 6:");
         int dayNumber = scanner.nextInt();

         switch (dayNumber) {
            case 0:
               System.out.println("Sunday");
               break;
            case 1:
               System.out.println("Monday");
               break;
            case 2:
               System.out.println("Tuesday");
               break;
            case 3:
               System.out.println("Wednesday");
               break;
            case 4:
               System.out.println("Thursday");
               break;
            case 5:
               System.out.println("Friday");
               break;
            case 6:
               System.out.println("Saturday");
               break;
            default:
               System.out.println("Not a valid day");
         }
      } catch (Exception e) {
         System.out.println("Invalid input!!!!");
      }

      System.out.println("Press any key to exit...");
      scanner.nextLine();
      scanner.nextLine();

      clearScreen();
   }

   public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }
}
