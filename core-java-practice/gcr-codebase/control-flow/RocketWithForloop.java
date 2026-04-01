import java.util.Scanner;

class RocketLaunchFor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        // Countdown using for loop
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
