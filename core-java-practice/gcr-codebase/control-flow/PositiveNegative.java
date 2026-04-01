import java.util.Scanner;

class NumberType {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read number
        int number = scanner.nextInt();

        // Check number type
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
