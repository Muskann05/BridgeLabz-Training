public class CircularLinkedList {
    private Vehicle head = null;
    private Vehicle tail = null;

    // Add vehicle to roundabout
    public void addVehicle(String number) {
        Vehicle newVehicle = new Vehicle(number);
        if (head == null) {
            head = newVehicle;
            tail = newVehicle;
            newVehicle.next = head;
        } else {
            tail.next = newVehicle;
            tail = newVehicle;
            tail.next = head;
        }
        System.out.println("Vehicle " + number + " entered the roundabout.");
    }

    // Remove vehicle from roundabout
    public void removeVehicle() {
        if (head == null) {
            System.out.println("Roundabout is empty. No vehicle to remove.");
            return;
        }
        if (head == tail) {
            System.out.println("Vehicle " + head.number + " exited the roundabout.");
            head = null;
            tail = null;
        } else {
            System.out.println("Vehicle " + head.number + " exited the roundabout.");
            head = head.next;
            tail.next = head;
        }
    }

    // Display roundabout state
    public void display() {
        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }
        Vehicle temp = head;
        System.out.print("Roundabout Vehicles: ");
        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}
