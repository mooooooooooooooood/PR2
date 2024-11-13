package PR2.tut12;

public class EvenNumberSequence {
    // Recursive method to generate the first sequence up to the specified index
    public static int even(int n) {
        if (n == 0) {
            return 0;
        } else {
            // Recursive call to generate the previous number and add 2 to it
            return even(n - 1) + 2;
        }
    }

    // Main method to test the sequence generation
    public static void main(String[] args) {
        // Generate and print the first 5 numbers of the sequence
        for (int i = 0; i < 5; i++) {
            System.out.println(even(i));
        }
    }
}
