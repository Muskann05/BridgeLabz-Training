import java.util.Scanner;

class CalculatorSwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double first;
        double second;
        String op;

        // Take first number input
        System.out.print("Enter first number: ");
        first = scanner.nextDouble();

        // Take second number input
        System.out.print("Enter second number: ");
        second = scanner.nextDouble();

        // Take operator input (+, -, *, /)
        System.out.print("Enter operator (+, -, *, /): ");
        op = scanner.next();

        // Switch case to perform operation based on operator
        switch (op) {

            case "+":
                // Addition
                System.out.println("Result = " + (first + second));
                break;

            case "-":
                // Subtraction
                System.out.println("Result = " + (first - second));
                break;

            case "*":
                // Multiplication
                System.out.println("Result = " + (first * second));
                break;

            case "/":
                // Division
                if (second != 0) {
                    System.out.println("Result = " + (first / second));
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
                // Invalid operator case
                System.out.println("Invalid Operator");
        }
    }
}
