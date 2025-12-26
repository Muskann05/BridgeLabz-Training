import java.util.Scanner;

public class ToggleCase {

    // Method to toggle case of characters
    public static String toggleCase(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Uppercase to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                result = result + (char)(ch + 32);
            }
            // Lowercase to uppercase
            else if (ch >= 'a' && ch <= 'z') {
                result = result + (char)(ch - 32);
            }
            // Other characters
            else {
                result = result + ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // take input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        // call method

        String output = toggleCase(input);
        // print output

        System.out.println("Toggled string: " + output);

        sc.close();
    }
}
