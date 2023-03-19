package midternexam.homework.homework1.bai1.bai15;

import java.util.Scanner;

public class BoxPattern {
    public static void main(String[] args) {
        clearScreen();
        Scanner scanner = new Scanner(System.in);
        try {
            printBoxPattern(scanner);

        } catch (Exception e) {
            System.out.println("Invalid input!!!!");

        }
        System.out.println("\nPress any key to exit...");
        scanner.nextLine();
        scanner.nextLine();

        clearScreen();
    }

    public static void printBoxPattern(Scanner scanner) {
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        // Check the validity of user input
        if (size > 0) {
            System.out.println("A\n");
            printBoxPatternA(size);
            System.out.println("\nB\n");
            printBoxPatternB(size);
            System.out.println("\nC\n");
            printBoxPatternC(size);
            System.out.println("\nD\n");
            printBoxPatternD(size);
        } else {
            System.out.println("Invalid input!!!");
        }
    }

    // We use matrix by double for-loop to create 4 kind of box-pattern A, B, C, D
    // Notice: We use matrix size n - 1.
    private static void printBoxPatternA(int size) {

        for (int row = 1; row < size; row++) {
            for (int column = 1; column < size; column++) {
                if (row == 1 || row == size - 1) {
                    // a black space after "#" use to make output-view look clearly
                    System.out.print("# ");
                } else if (column == 1 || column == size - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // to the nextline
        }
    }

    private static void printBoxPatternB(int size) {

        for (int row = 1; row < size; row++) {
            for (int column = 1; column < size; column++) {
                if (row == 1 || row == size - 1) {
                    // a black space after "#" use to make output-view look clearly
                    System.out.print("# ");
                } else if (column == row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // to the nextline
        }
    }

    private static void printBoxPatternC(int size) {

        for (int row = 1; row < size; row++) {
            for (int column = 1; column < size; column++) {
                if (row == 1 || row == size - 1) {
                    // a black space after "#" use to make output-view look clearly
                    System.out.print("# ");
                } else if (column == size - row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // to the nextline
        }
    }

    private static void printBoxPatternD(int size) {

        for (int row = 1; row < size; row++) {
            for (int column = 1; column < size; column++) {
                if (row == 1 || row == size - 1) {
                    // a black space after "#" use to make output-view look clearly
                    System.out.print("# ");
                } else if (column == size - row || column == row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // to the nextline
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
