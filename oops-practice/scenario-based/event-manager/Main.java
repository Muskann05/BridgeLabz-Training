public class Main {
    public static void main(String[] args) {

        EventManager manager = new EventManager(10);

        manager.addTicket(new Ticket(1500));
        manager.addTicket(new Ticket(500));
        manager.addTicket(new Ticket(2500));
        manager.addTicket(new Ticket(800));
        manager.addTicket(new Ticket(1200));

        manager.displayAllTickets();

        System.out.println("Cheapest Ticket: " +
                manager.getCheapestTicket().getPrice());

        System.out.println("Most Expensive Ticket: " +
                manager.getCostliestTicket().getPrice());
    }
}
