package PR2.tut09.utils;
import PR2.tut09.utils.exceptions.InvalidInputException;
public class PyramidPrinter {
    public static void main(String[] args) {
        try {
            int rows = getNumberOfRows();
            printHalfRightPyramid(rows);
            printHalfLeftPyramid(rows);
            printFullPyramid(rows);
            printInvertedHalfRightPyramid(rows);
            printInvertedHalfLeftPyramid(rows);
            printInvertedFullPyramid(rows);
            printFloydsTriangle(rows);
            printPascalsPyramid(rows);
            printPyramidWithMultiplesOf2(rows);
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static int getNumberOfRows() throws InvalidInputException {
        System.out.println("Enter the number of rows for the pyramids: ");
        int rows = TextIO.getInt();
        if (rows < 0) {
            throw new InvalidInputException("Number of rows cannot be negative.");
        }
        return rows;
    }

    private static void printHalfRightPyramid(int rows) {
        System.out.println("Half-Right Pyramid:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void printHalfLeftPyramid(int rows) {
        System.out.println("\nHalf-Left Pyramid:");
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void printFullPyramid(int rows) {
        System.out.println("\nFull Pyramid:");
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void printInvertedHalfRightPyramid(int rows) {
        System.out.println("\nInverted Half-Right Pyramid:");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void printInvertedHalfLeftPyramid(int rows) {
        System.out.println("\nInverted Half-Left Pyramid:");
        for (int i = rows; i >= 1; i--) {
            for (int j = rows - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void printInvertedFullPyramid(int rows) {
        System.out.println("\nInverted Full Pyramid:");
        for (int i = rows; i >= 1; i--) {
            for (int j = rows - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void printFloydsTriangle(int rows) {
        System.out.println("\nFloyd's Triangle:");
        int number = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    private static void printPascalsPyramid(int rows) {
        System.out.println("\nPascal's Pyramid:");
        int[][] pyramid = new int[rows][rows * 2 - 1];
        for (int i = 0; i < rows; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                pyramid[i][rows - 1 - i + 2 * j] = num;
                num = num * (i - j) / (j + 1);
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows * 2 - 1; j++) {
                if (pyramid[i][j] != 0) {
                    System.out.print(pyramid[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void printPyramidWithMultiplesOf2(int rows) {
        System.out.println("\nPyramid with Multiples of 2:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((j * 2) + " ");
            }
            System.out.println();
        }
    }


}

