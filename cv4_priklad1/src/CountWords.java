import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CountWords {
public static void main(String[] args) {
        // Path to the input text file
        String filePath = "soubor.txt";

        try {
            // Create a FileReader to read the file
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            HashMap<String, Integer> wordMap = new HashMap<String, Integer>();

            while ((line = bufferedReader.readLine()) != null) {
                // Split the line into words using whitespace as the delimiter
                String[] words = line.split("\\s+");

                // Add each word to the uniqueWords set
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Close the file reader
            bufferedReader.close();

            // Print the words and their counts
            System.out.println("Words and their counts:");
            for (String word : wordMap.keySet()) {
                System.out.println(word + ": " + wordMap.get(word));
            }


            // Print the unique words
            System.out.println("Unique words:");
            for (String word : wordMap.keySet()) {
                System.out.println(word);
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
