import java.util.Scanner;

class SumUntilBreak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        // Infinite loop
        while (true) {
            double value = scanner.nextDouble();

            // Break condition
            if (value <= 0)
                break;

            total += value;
        }

        System.out.println("Total = " + total);
    }
}
