import java.util.Scanner;

class SumOfNaturalNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read number
        int number = scanner.nextInt();

        // Check for natural number
        if (number >= 0) {

            // Formula to calculate sum
            int sum = number * (number + 1) / 2;

            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
