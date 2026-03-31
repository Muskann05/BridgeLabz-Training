import java.util.Scanner;

class GreatestFactorWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int greatestFactor = 1;
        int counter = number - 1;

        // While loop
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        System.out.println("Greatest Factor = " + greatestFactor);
    }
}

