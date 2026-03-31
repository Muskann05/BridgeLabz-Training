import java.util.Scanner;
public class TrafficManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedList roundabout = new CircularLinkedList();
        VehicleQueue waitingQueue = new VehicleQueue(5);
        while (true) {
            System.out.println("\nTraffic Manager Menu ");
            System.out.println("1. Add vehicle to waiting queue");
            System.out.println("2. Move vehicle from queue to roundabout");
            System.out.println("3. Remove vehicle from roundabout");
            System.out.println("4. Display roundabout");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle number: ");
                    String num = sc.nextLine();
                    waitingQueue.enqueue(num);
                    break;
                case 2:
                    if (!waitingQueue.isEmpty()) {
                        String vehicle = waitingQueue.dequeue();
                        roundabout.addVehicle(vehicle);
                    }
                    break;
                case 3:
                    roundabout.removeVehicle();
                    break;
                case 4:
                    roundabout.display();
                    break;
                case 5:
                    System.out.println("Exiting Traffic Manager");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
