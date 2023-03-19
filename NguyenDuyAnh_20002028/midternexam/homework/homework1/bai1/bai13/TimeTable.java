package midternexam.homework.homework1.bai1.bai13;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        clearScreen();

        Scanner scanner = new Scanner(System.in);

        try {
            printTimeTable(scanner);

        } catch (Exception e) {
            System.out.println("Invalid input!!!!");
        }
        System.out.println("\nPress any key to exit...");
        scanner.nextLine();
        scanner.nextLine();

        clearScreen();
    }

    public static void printTimeTable(Scanner scanner) {
        System.out.print("Enter the size: ");
        int sizeOfTimeTable = scanner.nextInt();

        // Check the validity of user input
        if (sizeOfTimeTable > 0) {

            // to format output like the request output of this excercise
            System.out.printf("%2s  |", "*");

            // this loop print the first row, which represent the column value in time table
            for (int headerColumnValue = 1; headerColumnValue <= sizeOfTimeTable; headerColumnValue++) {
                System.out.printf("%4d", headerColumnValue);
            }
            System.out.println(); // to the nextline after ending the row above

            // These code represent the row-line "--------------------"" to
            // separate first row (column header and the other)
            // .............................................................
            System.out.print("-----");
            for (int loopTime = 1; loopTime <= sizeOfTimeTable; loopTime++) {
                System.out.print("----");

            }
            System.out.print("--");
            System.out.println(); // to the nextline after ending the row above

            // ..............................................................

            // This double loop use to print the remainder row after we print the first row
            // and the row illustrate "------"
            for (int row = 1; row <= sizeOfTimeTable; row++) {
                System.out.printf("%2d  |", row);
                for (int column = 1; column <= sizeOfTimeTable; column++) {
                    System.out.printf("%4d", (column * row));

                }
                System.out.println(); // to the nextline after ending the row above

            }

        } else {
            System.out.println("Invalid input!!!");
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
