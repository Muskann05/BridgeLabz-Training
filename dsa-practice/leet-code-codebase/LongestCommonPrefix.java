import java.util.*;
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        // Edge case
        if (strs == null || strs.length == 0) {
            return "";
        }
        // Sort the array
        Arrays.sort(strs);
        // Compare first and last strings
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int idx = 0;
        while (idx < s1.length() && idx < s2.length()) {
            if (s1.charAt(idx) == s2.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take number of strings
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] strs = new String[n];
        // Take string inputs
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }
        // Call function and print result
        String result = longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: \"" + result + "\"");
    }
}
