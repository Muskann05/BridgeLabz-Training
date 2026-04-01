import java.util.Scanner;

public class EasyCoffeeCounter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // GST rate
        System.out.println("Enter gst");
        double gst = scanner.nextDouble();   
        while (true) {

            // Ask coffee type
            System.out.println("\nEnter coffee type (coffee / tea) or type exit:");
            String coffeeType = scanner.next();

            // Exit condition
            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Thank you! Cafe closed.");
                break;
            }

            // Ask quantity
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            int price = 0;

            // Decide price using switch
            switch (coffeeType.toLowerCase()) {
                case "Ameicano":
                    price = 50;
                    break;
                case "Espresso":
                    price = 30;
                    break;
                default:
                    System.out.println("Invalid coffee type");
                    continue;
            }

            // Calculate bill
            int totalBill = price * quantity;

            // Calculate GST
            double gstAmount = totalBill * gst;

            // Final bill amount
            double finalAmount = totalBill + gstAmount;

            // print bill
            System.out.println("Total Amount (without GST): Rs." + totalBill);
            System.out.println("GST Amount: Rs." + gstAmount);
            System.out.println("Final Amount to Pay: Rs." + finalAmount);
        }
    }
}
