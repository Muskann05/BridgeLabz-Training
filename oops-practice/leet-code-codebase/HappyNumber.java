import java.util.Scanner;

public class HappyNumber {

    // LeetCode logic method
    public static boolean isHappy(int n) {
        //  base cases
        if (n == 1 || n == 7)
            return true;
        // Single digit non-happy numbers
        if (n < 10)
            return false;
        int sum = 0;

        // Sum of squares of digits
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }

        return isHappy(sum); 
    }

    // Main method with user input
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isHappy(n))
            System.out.println("Happy Number");
        else
            System.out.println("Not a Happy Number");

        
    }
}
