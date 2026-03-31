import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial smart card balance: Rs.");
        double smartCardBalance = scanner.nextDouble();

        int distance;
        double fare;

        while (true) {

            System.out.println("\nCurrent Balance: Rs." + smartCardBalance);
            System.out.print("Enter distance in km (Enter -1 to exit): ");
            distance = scanner.nextInt();

            // Exit condition
            if (distance == -1) {
                break;
            }

            // Fare calculation using ternary operator assume values for fare calculation
            fare = (distance <= 5) ? 10 :
                   (distance <= 15) ? 20 : 30;

            // Check for sufficient balance
            if (smartCardBalance >= fare) {
                smartCardBalance -= fare;
                System.out.println("Fare Rs." + fare + " deducted successfully.");
            } else {
                System.out.println("Insufficient balance. Please recharge.");
                break;
            }

            // Stop if balance becomes zero
            if (smartCardBalance == 0) {
                System.out.println("Balance exhausted.");
                break;
            }
        }

        System.out.println("Thank you for using Delhi Metro ");
        System.out.println("Remaining Balance: Rs." + smartCardBalance);

    }
}
