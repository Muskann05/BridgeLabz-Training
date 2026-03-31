import java.util.Scanner;

public class MovieTicket {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int totalCustomers = sc.nextInt();

        for (int customer = 1; customer <= totalCustomers; customer++) {

            System.out.println("Customer " + customer);
            int totalBill = 0;

            // Movie type
            System.out.println("Select Movie Type:");
            System.out.println("1. Regular");
            System.out.println("2. 3D");
            int movieType = sc.nextInt();
            // use switch 

            switch (movieType) {
                case 1 -> totalBill += 150;
                case 2 -> totalBill += 200;
                default -> System.out.println("Invalid movie type");
            }

            // Seat type
            System.out.println("Select Seat Type:");
            System.out.println("1. Silver");
            System.out.println("2. Gold");
            int seatType = sc.nextInt();

            if (seatType == 1) {
                totalBill += 50;
            } else if (seatType == 2) {
                totalBill += 100;
            } else {
                System.out.println("Invalid seat type");
            }

            // Snacks
            System.out.print("Do you want snacks? (yes/no): ");
            String snacksChoice = sc.next();

            if (snacksChoice.equalsIgnoreCase("yes")) {
                totalBill += 80;
            }

            System.out.println("Total Ticket Price = Rs." + totalBill);
        }
    }
}
