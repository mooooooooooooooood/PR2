package PR2.tut08.work_occurrence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WordOccurrence {

    public static void main(String[] args) {
        String inputFile = "src/PR2/tut08/work_occurrence/input.txt";
        String outputFile = "src/PR2/tut08/work_occurrence/output.txt";

        try {
            Map<String, Integer> wordCounts = countWordOccurrences(inputFile);
            writeWordOccurrences(outputFile, wordCounts);
            System.out.println("Word occurrences written to output file: " + outputFile);
        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
        }
    }

    public static Map<String, Integer> countWordOccurrences(String inputFile) throws IOException {
        Map<String, Integer> wordCounts = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split by whitespace
                for (String word : words) {
                    // Remove leading/trailing whitespace and special characters
                    word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().trim();
                    if (!word.isEmpty()) {
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }
        }
        return wordCounts;
    }

    public static void writeWordOccurrences(String outputFile, Map<String, Integer> wordCounts) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            int totalWords = wordCounts.values().stream().mapToInt(Integer::intValue).sum();
            writer.write("Total number of words: " + totalWords);
            writer.newLine();

            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }
        }
    }
}

