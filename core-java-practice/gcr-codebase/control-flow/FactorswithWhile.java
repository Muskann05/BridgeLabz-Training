import java.util.Scanner;

class FactorsWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int counter = 1;

        // While loop for factors
        while (counter < number) {
            if (number % counter == 0)
                System.out.println(counter);

            counter++;
        }
    }
}
