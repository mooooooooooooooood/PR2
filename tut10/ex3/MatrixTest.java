package PR2.tut10.ex3;

public class MatrixTest {
    public static void main(String[] args) {
        Matrix A = new Matrix(2, 3);
        A.setMatrix(new double[][]{{1, 2, 3}, {4, 5, 6}});
        A.save("src/PR2/tut10/matrix_A.txt");

        Matrix B = Matrix.read("src/PR2/tut10/ex3/matrix_A.txt");
        System.out.println("Matrix B (Read from file):");
        System.out.println(B);

        Matrix C = new Matrix(2, 3);
        C.setMatrix(new double[][]{{7, 8, 9}, {10, 11, 12}});

        Matrix sumResult = B.sum(C);
        if (sumResult != null) {
            System.out.println("Sum of matrices B and C:");
            System.out.println(sumResult);
        }

        Matrix productResult = B.product(C.transpose()); // Assuming transpose is implemented
        if (productResult != null) {
            System.out.println("Product of matrices B and C:");
            System.out.println(productResult);
        }
    }
}
