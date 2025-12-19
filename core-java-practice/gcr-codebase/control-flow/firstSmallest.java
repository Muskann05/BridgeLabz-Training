import java.util.Scanner;

class FirstSmallest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read three numbers
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        // Check if first number is smallest
        boolean isSmallest = (number1 < number2 && number1 < number3);

        // Print result
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}
