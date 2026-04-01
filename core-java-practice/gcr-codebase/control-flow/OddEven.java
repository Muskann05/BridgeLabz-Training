import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Loop from 1 to number
        for (int i = 1; i <= number; i++) {

            // Check even or odd
            if (i % 2 == 0)
                System.out.println(i + " is Even");
            else
                System.out.println(i + " is Odd");
        }
    }
}
