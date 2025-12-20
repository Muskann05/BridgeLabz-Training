import java.util.Scanner;

public class Divisibleby5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // take input from user

        int number = scanner.nextInt();

        // Check divisibility by 5
        boolean isDivisible = (number % 5 == 0);

        // Print result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
    }
}
