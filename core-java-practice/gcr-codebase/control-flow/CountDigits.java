import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int count = 0;

        // Count digits
        while (number != 0) {
            count++;
            number = number / 10;
        }

        System.out.println("Number of digits: " + count);
    }
}
