import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int sum = 0;

        // Find sum of divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                sum += i;
        }

        // Check abundant
        if (sum > number)
            System.out.println("Abundant Number");
        else
            System.out.println("Not an Abundant Number");
    }
}
