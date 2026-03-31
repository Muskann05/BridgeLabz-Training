import java.util.Scanner;
public class StringConcatenationComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input number of operations
        System.out.print("Enter number of concatenations: ");
        int n = sc.nextInt();
        // Using String (O(N^2))
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < n; i++) {
            str = str + "a";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time using String: " + (endTime - startTime) + " ms");
        // Using StringBuilder (O(N))
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time using StringBuilder: " + (endTime - startTime) + " ms");
        // Using StringBuffer (O(N))
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbf.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time using StringBuffer: " + (endTime - startTime) + " ms");
    }
}
