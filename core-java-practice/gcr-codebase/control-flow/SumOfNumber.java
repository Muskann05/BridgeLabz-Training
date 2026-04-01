import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double total = 0.0;

        // Loop until user enters 0
        while (true) {
            double value = scanner.nextDouble();

            if (value == 0)
                break;

            total += value;
        }

        // Print total sum
        System.out.println("Total = " + total);
    }
}
