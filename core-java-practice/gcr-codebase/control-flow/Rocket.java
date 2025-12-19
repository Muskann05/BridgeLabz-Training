import java.util.Scanner;

class RocketLaunchWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take countdown start value
        int counter = scanner.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // decrement counter
        }
    }
}
