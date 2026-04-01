import java.util.Scanner;

class PowerFor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int power = scanner.nextInt();

        int result = 1;

        // Loop to calculate power
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        System.out.println("Result = " + result);
    }
}
