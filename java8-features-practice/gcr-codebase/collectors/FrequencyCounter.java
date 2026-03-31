import java.util.*;
import java.util.stream.Collectors;
public class FrequencyCounter {
    public static void main(String[] args) {
        String paragraph = "Java is powerful and Java is popular and Java is everywhere";
        Map<String, Integer> wordCount = Arrays.stream(paragraph.toLowerCase().split("\\s+"))
                .collect(Collectors.toMap(
                        word -> word,
                        word -> 1,
                        Integer::sum
                ));
        System.out.println("Word frequency:");
        wordCount.forEach((word, count) ->
                System.out.println(word + " : " + count));
    }
}