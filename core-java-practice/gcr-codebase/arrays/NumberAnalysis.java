import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of 5 numbers
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // iterate loop
        for (int i = 0; i < numbers.length; i++) {

            // Check if number is positive
            if (numbers[i] > 0) {

                // Check even or odd for positive number
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }

            }
            // Check if number is negative
            else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            }
            // If number is zero
            else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

        // Comparing first and last elements of array
        if (numbers[0] == numbers[4]) {
            System.out.println("First and last elements are Equal");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First element is Greater than last element");
        } else {
            System.out.println("First element is Less than last element");
        }
    }
}
