package PR2.tut09.utils;

import PR2.tut09.utils.exceptions.EmptyLineException;
import PR2.tut09.utils.exceptions.InvalidInputException;

public class IntegerSumCalculator {
    public static void main(String[] args) {
        try {
            String input = getInputSequence();
            int sum = calculateSum(input);
            System.out.println("Sum of the sequence: " + sum);
        } catch (InvalidInputException | EmptyLineException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static String getInputSequence() throws InvalidInputException, EmptyLineException {
        StringBuilder sequenceBuilder = new StringBuilder();
        System.out.println("Enter a sequence of integers separated by single spaces ('0' to terminate):");

        while (true) {
            int num = TextIO.getInt();
            if (num == 0 && sequenceBuilder.length() == 0) {
                throw new EmptyLineException("Input line cannot contain only the number 0.");
            }
            if (num == 0) {
                break;
            }
            sequenceBuilder.append(num).append(" ");
        }

        String inputSequence = sequenceBuilder.toString().trim();
        if (inputSequence.isEmpty()) {
            throw new EmptyLineException("Input line cannot be empty.");
        }
        return inputSequence;
    }

    private static int calculateSum(String input) {
        String[] numbers = input.split("\\s");
        int sum = 0;
        for (String numStr : numbers) {
            sum += Integer.parseInt(numStr);
        }
        return sum;
    }
}
