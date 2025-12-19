import java.util.Scanner;

class FactorialFor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        long factorial = 1;

        // Calculate factorial using for loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial = " + factorial);
    }
}
