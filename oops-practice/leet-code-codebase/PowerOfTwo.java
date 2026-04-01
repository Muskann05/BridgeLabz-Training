import java.util.Scanner;
public class PowerOfTwo {
    // Method to check power of two
    public static boolean isPowerOfTwo(int n) {
        if (n > 0) {
            return (n & (n - 1)) == 0;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input number
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        // Check and display result
        if (isPowerOfTwo(n)) {
            System.out.println(n + " is a Power of Two");
        } else {
            System.out.println(n + " is NOT a Power of Two");
        }
    }
}
