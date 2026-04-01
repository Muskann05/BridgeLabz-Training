import java.util.Scanner;

class FactorsOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        System.out.println("Factors of " + num + " are:");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println("\nSum of factors = " + sumOfFactors(factors));
        System.out.println("Product of factors = " + productOfFactors(factors));
        System.out.println("Sum of squares of factors = " + sumOfSquares(factors));
    }

    // Method to find factors
    static int[] findFactors(int num) {
        int count = 0;

        // loop to count factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // Initialize array with count
        int[] factors = new int[count];
        int index = 0;

        // loop to store factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find product of factors
    static int productOfFactors(int[] factors) {
        int product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find sum of squares of factors
    static int sumOfSquares(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }
}
