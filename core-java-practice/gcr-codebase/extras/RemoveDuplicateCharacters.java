import java.util.Scanner;

public class RemoveDuplicateCharacters {

    // Method to remove duplicate characters
    public static String removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // check if character already exists in result
            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String output = removeDuplicates(input);

        System.out.println("String after removing duplicates: " + output);

        sc.close();
    }
}

