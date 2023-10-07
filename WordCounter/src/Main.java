import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a text: ");
            String inputText = scanner.nextLine().toLowerCase();


            String[] words = inputText.split("[\\s\\p{Punct}]+");


            int totalWordCount = 0;


            Map<String, Integer> wordFrequencyMap = new HashMap<>();


            String[] stopWords = {"the", "and", "in", "to", "of", "a", "for", "on", "with", "an"};

            for (String word : words) {

                totalWordCount++;

                if (isStopWord(word, stopWords)) {
                    totalWordCount--;
                    continue;
                }


                wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
            }


            System.out.println("Total word count (excluding common words): " + totalWordCount);


            System.out.println("Unique word count: " + wordFrequencyMap.size());


            System.out.println("Word frequency statistics:");
            for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }

        private static boolean isStopWord(String word, String[] stopWords) {
            for (String stopWord : stopWords) {
                if (word.equals(stopWord)) {
                    return true;
                }
            }
            return false;
        }


}