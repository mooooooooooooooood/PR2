package PR2.tut2;

public class LowestBitCommon {
    public static void main(String[] args) {
        long num1 = 18;
        long num2 = 25;

        String firstBit = longToBinary(num1);
        System.out.println(num1 +": " + firstBit);
        String secondBit = longToBinary(num2);
        System.out.println(num2 +": " + secondBit);

        int lowestCommon = lowestCommon(num1, num2);
        System.out.print("lowestCommon of ("+ num1 + "," + num2 + ") would be " + lowestCommon);
    }
    public static String longToBinary(long number) {
        String binary = "";
        while (number > 0) {
            long remainder = number % 2;
            binary = remainder + binary;
            number /= 2;
        }
        return binary;
    }

    public static int lowestCommon(long firstNumber, long secondNumber) {
        int result = -1;
        // convert long to binary String
        String firstBit = longToBinary(firstNumber);
        String secondBit = longToBinary(secondNumber);
        // convert binary String to long number
        long firstBinary = Long.parseLong(firstBit);
        long secondBinary = Long.parseLong(secondBit);
        // make sure firstBinary always smallest
        if (firstBinary > secondBinary) {
            long temp = secondBinary;
            secondBinary = firstBinary;
            firstBinary = temp;
        }
//		System.out.println("F = " + firstBinary +", S = " + secondBinary);
        int count = 0;
        while (firstBinary > 0) {
            // get last digit
            int firstBinUnit = (int) firstBinary % 10;
            int secondBinUnit = (int) secondBinary % 10;
            // compare last digits
            if (firstBinUnit == secondBinUnit) {
                result = count;
                break;
            }
            // next digit
            firstBinary /= 10;
            secondBinary /= 10;
            count++;
        }

        return result;
    }
}
