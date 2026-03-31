class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    TicketNode next;

    TicketNode(int ticketId, String customerName, String movieName,
               String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    private TicketNode head = null;
    // Add ticket at end
    public void addTicket(int id, String customer, String movie,
                          String seat, String time) {
        TicketNode newTicket = new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = newTicket;
            newTicket.next = head;
        } else {
            TicketNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newTicket;
            newTicket.next = head;
        }
    }

    // Remove ticket by Ticket ID
    public void removeTicket(int id) {
        if (head == null) return;
        TicketNode curr = head, prev = null;
        do {
            if (curr.ticketId == id) {
                if (curr == head && curr.next == head) {
                    head = null;
                } else {
                    if (curr == head) {
                        head = head.next;
                    }
                    if (prev != null) {
                        prev.next = curr.next;
                    } else {
                        TicketNode last = head;
                        while (last.next != curr) {
                            last = last.next;
                        }
                        last.next = curr.next;
                    }
                }
                System.out.println("Ticket " + id + " removed");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Ticket not found");
    }

    // Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }
        TicketNode temp = head;
        System.out.println("\nCurrent Booked Tickets:");
        do {
            System.out.println("Ticket ID: " + temp.ticketId +
                    ", Customer: " + temp.customerName +
                    ", Movie: " + temp.movieName +
                    ", Seat: " + temp.seatNumber +
                    ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by Customer Name or Movie Name
    public void searchTicket(String key) {
        if (head == null) return;
        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(key) ||
                temp.movieName.equalsIgnoreCase(key)) {
                System.out.println("Found Ticket → ID: " + temp.ticketId +
                        ", Customer: " + temp.customerName +
                        ", Movie: " + temp.movieName +
                        ", Seat: " + temp.seatNumber);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) {
            System.out.println("No ticket found for: " + key);
        }
    }

    // Count total tickets
    public int countTickets() {
        if (head == null) return 0;
        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
}

public class OnlineTicketReservation {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        // Adding tickets
        system.addTicket(101, "Amit", "Inception", "A1", "10:30 AM");
        system.addTicket(102, "Neha", "Avatar", "B2", "11:00 AM");
        system.addTicket(103, "Rahul", "Inception", "C3", "11:30 AM");
        system.addTicket(104, "Sneha", "Titanic", "D4", "12:00 PM");

        system.displayTickets();

        // Search tickets
        system.searchTicket("Inception");
        system.searchTicket("Neha");

        // Remove a ticket
        system.removeTicket(102);
        system.displayTickets();

        // Count tickets
        System.out.println("\nTotal Booked Tickets: " + system.countTickets());
    }
}
