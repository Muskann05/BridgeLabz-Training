import java.util.Scanner;

class NaturalSumFor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n >= 0) {

            int sumFor = 0;

            // Calculate sum using for loop
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("For Loop Sum = " + sumFor);
            System.out.println("Formula Sum = " + sumFormula);
        }
    }
}
