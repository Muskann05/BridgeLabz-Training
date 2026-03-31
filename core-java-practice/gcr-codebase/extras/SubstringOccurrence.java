import java.util.Scanner;

public class SubstringOccurrence {

    // Method to count substring occurrences
    public static int countOccurrences(String text, String sub) {
        int count = 0;
        // iterate through loop

        for (int i = 0; i <= text.length() - sub.length(); i++) {
            boolean match = true;

            for (int j = 0; j < sub.length(); j++) {
                if (text.charAt(i + j) != sub.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // take input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String text = sc.nextLine();

        System.out.print("Enter the substring: ");
        String sub = sc.nextLine();
        // call method

        int result = countOccurrences(text, sub);
        // print the output

        System.out.println("Substring occurs " + result + " times");

        sc.close();
    }
}
