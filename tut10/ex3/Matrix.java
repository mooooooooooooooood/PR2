package PR2.tut10.ex3;

import java.io.*;
import java.util.Arrays;

public class Matrix {
    private double[][] matrix;
    //Constructor
    public Matrix(int n, int m) {
        matrix = new double[n][m];
    }
    //getter & setter
    public double[][] getMatrix() {
        return this.matrix;
    }

    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }

    // Method to save the content of the matrix to a file
    public void save(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println(matrix.length);
            writer.println(matrix[0].length);
            for (double[] row : matrix) {
                for (double value : row) {
                    writer.print(value + " ");
                }
                writer.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Static method to read data about a matrix from a file and create the matrix
    public static Matrix read(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int n = Integer.parseInt(reader.readLine());
            int m = Integer.parseInt(reader.readLine());
            Matrix result = new Matrix(n, m);
            for (int i = 0; i < n; i++) {
                String[] values = reader.readLine().trim().split("\\s+");
                for (int j = 0; j < m; j++) {
                    result.matrix[i][j] = Double.parseDouble(values[j]);
                }
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to compute the sum of two matrices
    public Matrix sum(Matrix m) {
        if (this.matrix.length != m.matrix.length || this.matrix[0].length != m.matrix[0].length) {
            System.out.println("Matrices must have the same dimensions for addition.");
            return null;
        }
        Matrix result = new Matrix(this.matrix.length, this.matrix[0].length);
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                result.matrix[i][j] = this.matrix[i][j] + m.matrix[i][j];
            }
        }
        return result;
    }

    // Method to compute the product of two matrices
    public Matrix product(Matrix m) {
        if (this.matrix[0].length != m.matrix.length) {
            System.out.println("Matrices must have compatible dimensions for multiplication.");
            return null;
        }
        Matrix result = new Matrix(this.matrix.length, m.matrix[0].length);
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < m.matrix[0].length; j++) {
                for (int k = 0; k < this.matrix[0].length; k++) {
                    result.matrix[i][j] += this.matrix[i][k] * m.matrix[k][j];
                }
            }
        }
        return result;
    }

    public Matrix transpose() {
        int rows = matrix.length;
        int cols = matrix[0].length;
        Matrix result = new Matrix(cols, rows);
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                result.getMatrix()[i][j] = matrix[j][i];
            }
        }
        return result;
    }

    // Method to override toString() for easy printing
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (double[] row : matrix) {
            sb.append(Arrays.toString(row)).append("\n");
        }
        return sb.toString();
    }
}

