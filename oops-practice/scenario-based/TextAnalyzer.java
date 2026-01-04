import java.util.Scanner;

public class TextAnalyzer {

    public static void analyzeText(String paragraph, String oldWord, String newWord) {

        // Edge case handling
        if (paragraph == null || paragraph.trim().isEmpty()) {
            System.out.println("Paragraph is empty.");
            return;
        }

        // Remove extra spaces
        paragraph = paragraph.trim().replaceAll("\\s+", " ");

        // Split words
        String[] words = paragraph.split(" ");

        // 1️⃣ Word count
        int wordCount = words.length;

        // 2️⃣ Longest word
        String longestWord = words[0];
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // 3️⃣ Replace word (case-insensitive)
        String updatedParagraph =
                paragraph.replaceAll("(?i)\\b" + oldWord + "\\b", newWord);

        // Output
        System.out.println("\nWord Count: " + wordCount);
        System.out.println("Longest Word: " + longestWord);
        System.out.println("Updated Paragraph:");
        System.out.println(updatedParagraph);
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String paragraph = sc.nextLine();

        System.out.println("Enter word to replace:");
        String oldWord = sc.next();

        System.out.println("Enter new word:");
        String newWord = sc.next();

        analyzeText(paragraph, oldWord, newWord);

        
    }
}
