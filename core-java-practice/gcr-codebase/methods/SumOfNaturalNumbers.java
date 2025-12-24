import java.util.Scanner;

class SumOfNaturalNumbers {

    // Method to calculate sum
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // take input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        // call method and print output

        System.out.println("Sum of first " + n + " natural numbers is " + calculateSum(n));
    }
}

