import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two strings are anagrams
    public static boolean isAnagram(String s1, String s2) {

        // Remove spaces and convert to lowercase
        s1 = s1.replace(" ", "").toLowerCase();
        s2 = s2.replace(" ", "").toLowerCase();

        // If lengths are different, not anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[256]; // ASCII characters

        // Count characters of first string
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
        }

        // Reduce count using second string
        for (int i = 0; i < s2.length(); i++) {
            count[s2.charAt(i)]--;
        }

        // Check if all counts are zero
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("The strings are Anagrams");
        } else {
            System.out.println("The strings are NOT Anagrams");
        }

        sc.close();
    }
}

