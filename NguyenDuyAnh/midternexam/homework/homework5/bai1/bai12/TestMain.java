package midternexam.homework.homework5.bai1.bai12;

import java.util.Scanner;

public class TestMain {
   public static void main(String[] args) {
      clearScreen();
      Scanner scanner = new Scanner(System.in);
      try {
         Person person[] = new Person[5];
         int choice;
         for (int i = 0; i < person.length; i++) {
            System.out.println("Choose the job of the person number " + (i + 1));
            System.out.println("1. Student");
            System.out.println("2. Staff");
            choice = scanner.nextInt();
            while (choice < 1 || choice > 2) {
               System.out.println("Invalid!!!!! Choose again");
               choice = scanner.nextInt();
            }
            scanner.nextLine();
            if (choice == 1) {
               System.out.print("Name: ");
               String name = scanner.nextLine();

               System.out.print("Address: ");
               String address = scanner.nextLine();

               System.out.print("Program: ");
               String program = scanner.nextLine();

               System.out.print("Year: ");
               int year = scanner.nextInt();

               scanner.nextLine();
               System.out.print("Fee: ");

               double fee = scanner.nextDouble();
               scanner.nextLine();

               person[i] = (Student) new Student(name, address, program, year, fee);
            } else {
               System.out.print("Name: ");
               String name = scanner.nextLine();

               System.out.print("Address: ");
               String address = scanner.nextLine();

               System.out.print("School: ");
               String school = scanner.nextLine();

               System.out.print("Pay: ");
               double pay = scanner.nextDouble();
               scanner.nextLine();
               person[i] = (Staff) new Staff(name, address, school, pay);
            }
         }

         for (Person item : person) {
            if (item instanceof Student) {
               System.out.println((Student) item);
            } else {
               System.out.println((Staff) item);
            }
         }
      } catch (Exception e) {
         System.out.println("Invalid input!!!!");
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
