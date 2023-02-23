import java.util.*;

class MatrixMultiplication {
    public static void main(String[] args) {
        // Initializing variables
        int rowOne, colOne, rowTwo, colTwo;

        Scanner scan = new Scanner(System.in);

        // Getting rows and columns of matrix A matrix B
        System.out.print("Enter number of rows of 1st matrix: ");
        rowOne = scan.nextInt();

        System.out.print("Enter number of columns of 1st matrix: ");
        colOne = scan.nextInt();

        System.out.print("Enter number of rows of 2nd matrix: ");
        rowTwo = scan.nextInt();

        System.out.print("Enter number of columns of 2nd matrix: ");
        colTwo = scan.nextInt();

        System.out.println(
                "\nCreating Matrix A[" + rowOne + "][" + colOne + "] and Matrix B[" + rowTwo + "][" + colTwo + "]");

        // Matrix multiplication condition check
        if (colOne == rowTwo) {
            int matrixA[][] = new int[rowOne][colOne];
            int matrixB[][] = new int[rowTwo][colTwo];
            int P[][] = new int[rowOne][colTwo];

            System.out.println("");

            // Getting matrix A
            for (int i = 0; i < rowOne; i++) {
                for (int j = 0; j < colOne; j++) {
                    System.out.print("Enter element in (" + i + "," + j + ") [matrix A]: ");
                    matrixA[i][j] = scan.nextInt();
                }
            }

            System.out.println("");

            // Getting matrix B
            for (int i = 0; i < rowTwo; i++) {
                for (int j = 0; j < colTwo; j++) {
                    System.out.print("Enter element in (" + i + "," + j + ") [matrix B]: ");
                    matrixB[i][j] = scan.nextInt();
                }
            }

            // Closing scanner
            scan.close();

            int sum = 0;
            for (int i = 0; i < rowOne; i++) {
                for (int j = 0; j < colTwo; j++) {
                    for (int k = 0; k < rowTwo; k++) {
                        sum += matrixA[i][k] * matrixB[k][j];
                    }
                    P[i][j] = sum;
                    sum = 0;
                }
            }

            // printing result
            for (int i = 0; i < rowOne; i++) {
                System.out.print("| ");
                for (int j = 0; j < colTwo; j++) {
                    System.out.print(P[i][j] + " ");
                }
                System.out.print("|\n");
            }

        } else {
            System.out.println("Error: Matrix Multiplication not possible with Matrix A[" + rowOne + "][" + colOne
                    + "] and Matrix B[" + rowTwo + "][" + colTwo + "]");
        }
    }
}