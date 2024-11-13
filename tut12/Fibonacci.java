package PR2.tut12;

public class Fibonacci {
    // Recursive method to generate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            // Recursive call to generate the (n-1)th Fibonacci number + the (n-2)th Fibonacci number
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Main method to test the Fibonacci sequence
    public static void main(String[] args) {
        // Generate and print the first 10 Fibonacci numbers
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
