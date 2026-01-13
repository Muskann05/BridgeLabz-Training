public class EventManager {

    private Ticket[] tickets;
    private int count;

    public EventManager(int size) {
        tickets = new Ticket[size];
        count = 0;
    }

    public void addTicket(Ticket ticket) {
        tickets[count++] = ticket;
    }

    // Find cheapest ticket
    public Ticket getCheapestTicket() {
        Ticket min = tickets[0];

        for (int i = 1; i < count; i++) {
            if (tickets[i].getPrice() < min.getPrice()) {
                min = tickets[i];
            }
        }
        return min;
    }

    // Find most expensive ticket
    public Ticket getCostliestTicket() {
        Ticket max = tickets[0];

        for (int i = 1; i < count; i++) {
            if (tickets[i].getPrice() > max.getPrice()) {
                max = tickets[i];
            }
        }
        return max;
    }

    public void displayAllTickets() {
        System.out.println("All Ticket Prices:");
        for (int i = 0; i < count; i++) {
            System.out.println(tickets[i].getPrice());
        }
    }
}
