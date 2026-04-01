import java.util.Scanner;

class NaturalSumWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 0) {

            int sumWhile = 0;
            int i = 1;

            // Calculate sum using while loop
            while (i <= n) {
                sumWhile += i;
                i++;
            }

            // Calculate sum using formula
            int sumFormula = n * (n + 1) / 2;

            System.out.println("While Loop Sum = " + sumWhile);
            System.out.println("Formula Sum = " + sumFormula);
        }
    }
}
