import java.util.Scanner;

class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number from user
        int number = scanner.nextInt();

        // Check for Natural Number
        if (number > 0) {

            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {

                // Check even or odd
                if (i % 2 == 0)
                    System.out.println(i + " is Even");
                else
                    System.out.println(i + " is Odd");
            }
        } else {
            System.out.println("Please enter a natural number");
        }
    }
}

