import java.util.Scanner;

class FactorialWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        long factorial = 1;
        int i = 1;

        // Calculate factorial
        while (i <= number) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial = " + factorial);
    }
}

