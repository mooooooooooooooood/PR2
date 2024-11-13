package PR2.tut09.utils;
import PR2.tut09.utils.exceptions.EmptyLineException;
import PR2.tut09.utils.exceptions.InvalidInputException;
import PR2.tut09.utils.exceptions.WordLengthException;

import java.util.HashMap;
import java.util.Map;

public class LetterOccurrenceAnalyzer {
    public static void main(String[] args) {
            String word = TextIO.getWord();
            Map<Character, Integer> occurrenceMap = analyzeLetterOccurrence(word);
            displayLetterOccurrence(occurrenceMap);
    }

    private static Map<Character, Integer> analyzeLetterOccurrence(String word) {
        Map<Character, Integer> occurrenceMap = new HashMap<>();
        for (char c : word.toCharArray()) {
            char lowercaseChar = Character.toLowerCase(c);
            occurrenceMap.put(lowercaseChar, occurrenceMap.getOrDefault(lowercaseChar, 0) + 1);
        }
        return occurrenceMap;
    }

    private static void displayLetterOccurrence(Map<Character, Integer> occurrenceMap) {
        System.out.println("Letter Occurrence Analysis:");
        for (Map.Entry<Character, Integer> entry : occurrenceMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
