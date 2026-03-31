import java.util.Scanner;

public class FibonacciComparison {
    // Recursive approach
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    } 
    // iterative approach
    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        // Recursive timing
        long startRec = System.currentTimeMillis();
        int recResult = fibonacciRecursive(n);
        long endRec = System.currentTimeMillis();
        long recTime = endRec - startRec;

        // Iterative timing
        long startItr = System.currentTimeMillis();
        int itrResult = fibonacciIterative(n);
        long endItr = System.currentTimeMillis();
        long itrTime = endItr - startItr;
        // print result
        System.out.println("\nResults:");
        System.out.println("Fibonacci(" + n + ") using Recursive: " + recResult);
        System.out.println("Fibonacci(" + n + ") using Iterative: " + itrResult);
        // print time for both approach
        System.out.println("\nTime Taken:");
        System.out.println("Recursive Time: " + recTime + " ms");
        System.out.println("Iterative Time: " + itrTime + " ms");
    }
}
