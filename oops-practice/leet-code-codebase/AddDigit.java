import java.util.Scanner;

public class AddDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Single digit result: 0");
        } else if (num % 9 == 0) {
            System.out.println("Single digit result: 9");
        } else {
            System.out.println("Single digit result: " + (num % 9));
        }

        sc.close();
    }
}
