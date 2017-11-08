package JavaCore.Task4;

import JavaCore.IO.Output;

public class RotationClass {
    private int n;
    private int[][] matrix;

    public RotationClass() {
        n = (int) (Math.random() * 8) + 1;
        matrix = new int[n][n];
        fillMathrix();
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public RotationClass(int n) {
        this.n = n;
        matrix = new int[n][n];
        fillMathrix();
    }

    /**
     * The method that fill matrix with random numbers
     */
    private void fillMathrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 8) + 1;
            }
        }
    }

    /**
     * The method that rotate matrix
     *
     * @return
     */
    private int[][] rotateMatrix() {
        int[][] mas = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                mas[i][j] = matrix[j][matrix.length - i - 1];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = mas[i][j];
            }
        }
        return matrix;
    }

    /**
     * The execution method that computes the results of a task and prints them
     */
    public void run() {
        Output.printMatrix(matrix);
        System.out.println();
        Output.printMatrix(rotateMatrix());

    }
}
