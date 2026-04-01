import java.util.Scanner;

public class BusRoute {

    public static void main(String[] args) {
        // take input

        Scanner scanner = new Scanner(System.in);

        int totalDistance = 0;
        int distanceAtStop;
        char getOffChoice;

        while (true) {

            System.out.print("Enter distance covered till next stop (in km): ");
            distanceAtStop = scanner.nextInt();

            totalDistance += distanceAtStop;

            System.out.println("Total distance covered: " + totalDistance + " km");

            System.out.print("Do you want to get off at this stop? (y/n): ");
            getOffChoice = scanner.next().charAt(0);

            if (getOffChoice == 'y' || getOffChoice == 'Y') {
                break;
            }
        }

        System.out.println("Passenger got off.");
        System.out.println("Final distance travelled: " + totalDistance + " km");

    }
}
