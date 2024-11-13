package PR2.tut09.utils;

public class StringProcessor {
    public static void main(String[] args) {
        String input = TextIO.getWord();
        System.out.println("Original String: " + input);

        // Reverse String
        String reversedString = reverseString(input);
        System.out.println("Reversed String: " + reversedString);

        // Count Vowels and Consonants
        int[] vowelsConsonants = countVowelsAndConsonants(input);
        System.out.println("Vowels: " + vowelsConsonants[0] + ", Consonants: " + vowelsConsonants[1]);

        // Display Characters at Odd Positions
        String oddPositions = displayCharactersAtOddPositions(input);
        System.out.println("Characters at Odd Positions: " + oddPositions);

        // Display Characters at Even Positions
        String evenPositions = displayCharactersAtEvenPositions(input);
        System.out.println("Characters at Even Positions: " + evenPositions);

        // Count Uppercase and Lowercase Letters
        int[] uppercaseLowercase = countUppercaseAndLowercaseLetters(input);
        System.out.println("Uppercase: " + uppercaseLowercase[0] + ", Lowercase: " + uppercaseLowercase[1]);

        // Calculate Occurrence of Each Character
        int[] occurrence = calculateOccurrenceOfEachCharacter(input);
        for (int i = 0; i < occurrence.length; i++) {
            if (occurrence[i] != 0) {
                System.out.println("Occurrences of " + (char)i + ": " + occurrence[i]);
            }
        }

        // Extract a Substring from a Specific Position with a Length
        System.out.println("Enter starting index for substring: ");
        int start = TextIO.getInt();
        System.out.println("Enter length of substring: ");
        int length = TextIO.getInt();
        String substring = extractSubstring(input, start, length);
        System.out.println("Substring: " + substring);

        // Find Index of First Occurrence of a Substring
        System.out.println("Enter substring to find index of: ");
        String subStr = TextIO.getWord();
        int firstIndex = findIndexOfFirstOccurrence(input, subStr);
        System.out.println("Index of first occurrence of '" + subStr + "': " + firstIndex);

        // Find Index of Last Occurrence of a Substring
        int lastIndex = findIndexOfLastOccurrence(input, subStr);
        System.out.println("Index of last occurrence of '" + subStr + "': " + lastIndex);

        // Divide String at a Specified Separator
        System.out.println("Enter separator to divide the string: ");
        String separator = TextIO.getWord();
        String[] dividedStrings = divideString(input, separator);
        System.out.println("Divided strings:");
        for (String str : dividedStrings) {
            System.out.println(str);
        }
    }

    // Reverse String
    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    // Count Vowels and Consonants
    public static int[] countVowelsAndConsonants(String str) {
        int[] counts = new int[2]; // Index 0: vowels, Index 1: consonants
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    counts[0]++;
                } else {
                    counts[1]++;
                }
            }
        }
        return counts;
    }

    // Display Characters at Odd Positions
    public static String displayCharactersAtOddPositions(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    // Display Characters at Even Positions
    public static String displayCharactersAtEvenPositions(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < str.length(); i += 2) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Count Uppercase and Lowercase Letters
    public static int[] countUppercaseAndLowercaseLetters(String str) {
        int[] counts = new int[2]; // Index 0: uppercase, Index 1: lowercase
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                counts[0]++;
            } else if (Character.isLowerCase(ch)) {
                counts[1]++;
            }
        }
        return counts;
    }

    // Calculate Occurrence of Each Character
    public static int[] calculateOccurrenceOfEachCharacter(String str) {
        int[] counts = new int[256]; // Assuming ASCII characters
        for (char ch : str.toCharArray()) {
            counts[ch]++;
        }
        return counts;
    }

    // Extract a Substring from a Specific Position with a Length
    public static String extractSubstring(String str, int start, int length) {
        if (start < 0 || start >= str.length() || length <= 0) {
            return "";
        }
        int end = Math.min(start + length, str.length());
        return str.substring(start, end);
    }

    // Find Index of First Occurrence of a Substring
    public static int findIndexOfFirstOccurrence(String str, String subStr) {
        return str.indexOf(subStr);
    }

    // Find Index of Last Occurrence of a Substring
    public static int findIndexOfLastOccurrence(String str, String subStr) {
        return str.lastIndexOf(subStr);
    }

    // Divide String at a Specified Separator
    public static String[] divideString(String str, String separator) {
        return str.split(separator);
    }
}

