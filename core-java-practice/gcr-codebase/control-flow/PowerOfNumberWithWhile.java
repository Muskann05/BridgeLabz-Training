import java.util.Scanner;

class PowerWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int power = scanner.nextInt();

        int result = 1;
        int counter = 0;

        // While loop
        while (counter < power) {
            result *= number;
            counter++;
        }

        System.out.println("Result = " + result);
    }
}
