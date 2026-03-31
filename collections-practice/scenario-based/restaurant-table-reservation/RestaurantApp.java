public class RestaurantApp {
    public static void main(String[] args) {
        RestaurantReservationSystem system = new RestaurantReservationSystem();
        system.addTable(1, 4);
        system.addTable(2, 2);
        system.addTable(3, 6);
        try {
            system.reserveTable(1, "7PM", "Alice");
            system.reserveTable(2, "7PM", "Bob");
            system.reserveTable(1, "7PM", "Charlie"); 
            // Exception
        } catch (TableAlreadyReservedException e) {
            System.out.println(e.getMessage());
        }
        system.showAvailableTables("7PM");
        system.cancelReservation(2, "7PM");
        system.showAvailableTables("7PM");
    }
}
