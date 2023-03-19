package midternexam.homework.homework2.bai1.bai11;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        clearScreen();
        Scanner scanner = new Scanner(System.in);
        try {
            int matrixA[][] = new int[3][3];
            int matrixB[][] = new int[3][3];

            System.out.println("Input matrix A (3x3)");
            matrixA = inputMatrix(matrixA, scanner);
            System.out.println("Input matrix B (3x3)");
            matrixB = inputMatrix(matrixB, scanner);

            printMatrix(matrixA);
            printMatrix(matrixB);

            System.out.println(isSameLength(matrixA, matrixB));

            int sumMatrix[][] = add2Matrix(matrixA, matrixB);
            int subtractMatrix[][] = subtract2Matrix(matrixA, matrixB);
            int multipleMatrix[][] = multiple2Matrix(matrixA, matrixB);

            System.out.println("Sum: ");
            printMatrix(sumMatrix);

            System.out.println("Subtraction: ");
            printMatrix(subtractMatrix);

            System.out.println("Multiplication: ");
            printMatrix(multipleMatrix);
        } catch (Exception e) {
            System.out.println("Invalid input!!!");
        }

        System.out.println("\nPress any key to exit...");
        scanner.nextLine();
        scanner.nextLine();

        clearScreen();

    }

    public static int[][] inputMatrix(int matrix[][], Scanner scanner) {
        if (matrix == null) {
            System.out.println("Invalid matrix");
            return null;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void printMatrix(int matrix[][]) {

        if (matrix == null) {
            System.out.println("Invalid matrix");
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(double matrix[][]) {

        if (matrix == null) {
            System.out.println("Invalid matrix");
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 2 methods here are
    // overloading--------------------------------------------------------

    public static boolean isSameLength(int matrixA[][], int matrixB[][]) {

        if (matrixA.length == matrixB.length && matrixA[0].length == matrixB[0].length) {
            return true;
        }

        return false;
    }

    public static boolean isSameLength(double matrixA[][], double matrixB[][]) {

        if (matrixA.length == matrixB.length && matrixA[0].length == matrixB[0].length) {
            return true;
        }

        return false;
    }

    // 2 methods here are
    // overloading--------------------------------------------------------

    public static int[][] add2Matrix(int matrixA[][], int matrixB[][]) {

        if (!isSameLength(matrixA, matrixB)) {
            return null;
        }

        int sum[][] = new int[matrixA.length][matrixA[0].length];

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return sum;
    }

    public static double[][] add2Matrix(double matrixA[][], double matrixB[][]) {

        if (!isSameLength(matrixA, matrixB)) {
            return null;
        }

        double sum[][] = new double[matrixA.length][matrixA[0].length];

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return sum;
    }

    // 2 methods here are
    // overloading--------------------------------------------------------

    public static int[][] subtract2Matrix(int matrixA[][], int matrixB[][]) {

        if (!isSameLength(matrixA, matrixB)) {
            return null;
        }

        int subtraction[][] = new int[matrixA.length][matrixA[0].length];

        for (int i = 0; i < subtraction.length; i++) {
            for (int j = 0; j < subtraction[0].length; j++) {
                subtraction[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        return subtraction;
    }

    public static double[][] subtract2Matrix(double matrixA[][], double matrixB[][]) {

        if (!isSameLength(matrixA, matrixB)) {
            return null;
        }

        double subtraction[][] = new double[matrixA.length][matrixA[0].length];

        for (int i = 0; i < subtraction.length; i++) {
            for (int j = 0; j < subtraction[0].length; j++) {
                subtraction[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        return subtraction;
    }

    // 2 methods here are
    // overloading--------------------------------------------------------

    public static int[][] multiple2Matrix(int matrixA[][], int matrixB[][]) {

        if (matrixA[0].length != matrixB.length) {
            return null;
        }

        int product[][] = new int[matrixA.length][matrixB[0].length];

        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[0].length; j++) {
                for (int k = 0; k < matrixB.length; k++) {
                    product[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return product;
    }

    public static double[][] multiple2Matrix(double matrixA[][], double matrixB[][]) {

        if (matrixA[0].length != matrixB.length) {
            return null;
        }

        double product[][] = new double[matrixA.length][matrixB[0].length];

        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[0].length; j++) {
                for (int k = 0; k < matrixB.length; k++) {
                    product[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return product;
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}