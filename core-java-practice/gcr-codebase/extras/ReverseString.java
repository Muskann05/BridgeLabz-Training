import java.util.Scanner;

public class ReverseString {

    // Method to reverse a string
    public static String reverseString(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        // call the method

        String result = reverseString(input);
        // print output

        System.out.println("Reversed String: " + result);

        sc.close();
    }
}
