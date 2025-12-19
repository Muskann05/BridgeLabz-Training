import java.util.Scanner;

class MultiplesWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int counter = 100;

        // While loop
        while (counter >= 1) {
            if (counter % number == 0)
                System.out.println(counter);

            counter--;
        }
    }
}
