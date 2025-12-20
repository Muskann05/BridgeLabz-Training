import java.util.Scanner;

public class StoreNumbersAndSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take Array to store up to 10 numbers
        double[] numbers = new double[10];

        double total = 0.0;
        int index = 0;
        while (true) {

            System.out.print("Enter a number: ");
            double value = sc.nextDouble();

            // Break if value is 0 or negative or array is full
            if (value <= 0 || index == 10) {
                break;
            }
            numbers[index] = value;
            index++;
        }
      // Calculate total
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // prin sum
        System.out.println("Total = " + total);
    }
}

