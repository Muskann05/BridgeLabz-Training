import java.util.Scanner;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {

        // Remove leading and trailing spaces
        s = s.trim();

        int count = 0;

        // Count characters from the end 
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        int result = lengthOfLastWord(input);

        System.out.println("Length of last word: " + result);

    }
}
