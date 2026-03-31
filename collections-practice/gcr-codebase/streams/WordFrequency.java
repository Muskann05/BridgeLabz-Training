import java.io.*;
import java.util.*;
public class WordFrequency{
    public static void main(String[] args) {
        Map<String, Integer> wordCount = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
            List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());
            list.sort((a, b) -> b.getValue() - a.getValue());
            System.out.println("Top 5 most frequent words:");
            for (int i = 0; i < 5 && i < list.size(); i++) {
                System.out.println(list.get(i).getKey() + " : " + list.get(i).getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
