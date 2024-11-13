package PR2.tut12;

public class OddNumberSequence {
    // Recursive method to generate the second sequence up to the specified index
    public static int positionSum(int n) {
        if (n == 0) {
            return 0;
        } else {
            // Recursive call to generate the previous number and add the index to it
            return positionSum(n - 1) + n;
        }
    }

    // Main method to test the sequence generation
    public static void main(String[] args) {
        // Generate and print the first 5 numbers of the sequence
        for (int i = 0; i < 5; i++) {
            System.out.println(positionSum(i));
        }
    }
}
