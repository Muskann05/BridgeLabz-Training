import java.util.Scanner;

class FactorsFor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Check positive integer
        if (number > 0) {

            // Loop to find factors
            for (int i = 1; i < number; i++) {
                if (number % i == 0)
                    System.out.println(i);
            }
        }
    }
}
