package PR2.tut2;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {6, 7, 8}
        };
        System.out.println("Original matrix: ");
        printMatrix(matrix);
        System.out.println();
        int[][] transposedMatrix = transposeMatrix(matrix);
        System.out.println("Transposed matrix: ");
        printMatrix(transposedMatrix);
    }

    public static void printMatrix (int[][] matrix){
        for (int i= 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " - ");
            }
            System.out.println();
        }
    }

    public static int[][] transposeMatrix (int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] transposedMatrix = new int[col][row];
        for (int i = 0 ; i < col; i++) {
            for (int j = 0 ; j < row; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }
        return transposedMatrix;
    }
}