import java.util.Scanner;

public class SentenceFormatter {

    // Method to format the paragraph
    public static String formatParagraph(String input) {

        // Edge case: empty or only spaces
        if (input == null || input.trim().isEmpty()) {
            return "";
        }

        // Remove extra spaces
        input = input.trim().replaceAll("\\s+", " ");

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Capitalize first letter of sentence
            if (capitalizeNext && Character.isLetter(ch)) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(ch);
            }

            // After punctuation, add space and capitalize next letter
            if (ch == '.' || ch == '?' || ch == '!') {
                capitalizeNext = true;

                if (i + 1 < input.length() && input.charAt(i + 1) != ' ') {
                    result.append(' ');
                }
            }
        }

        return result.toString();
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String paragraph = sc.nextLine();

        String formattedText = formatParagraph(paragraph);

        System.out.println("\nFormatted Paragraph:");
        System.out.println(formattedText);

        
    }
}
