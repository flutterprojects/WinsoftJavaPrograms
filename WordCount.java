import java.util.*;

 class WordCount {
    public static void main(String[] args) {
        String originalText = "I am Muskan. I am from Satara. I am in last year";
        System.out.println("Original Text: " + originalText);
        Map<String, Integer> wordCount = countWords(originalText);
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

     static Map<String, Integer> countWords(String originalText) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = originalText.split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        return wordCount;
    }
}
