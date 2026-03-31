import java.util.*;
public class RestaurantReservationSystem {
    Map<Integer, Table> tables = new HashMap<>();
    List<Reservation> reservations = new ArrayList<>();
    // Add table method
    public void addTable(int tableNumber, int capacity) {
        tables.put(tableNumber, new Table(tableNumber, capacity));
    }
    // add reserve table method
    public void reserveTable(int tableNumber, String timeSlot, String customerName)
            throws TableAlreadyReservedException {
        for (Reservation r : reservations) {
            if (r.tableNumber == tableNumber && r.timeSlot.equals(timeSlot)) {
                throw new TableAlreadyReservedException(
                        "Table " + tableNumber + " is already reserved at " + timeSlot);
            }
        }
        reservations.add(new Reservation(tableNumber, timeSlot, customerName));
        System.out.println("Reservation successful for " + customerName);
    }
    // cancel reservation method
    public void cancelReservation(int tableNumber, String timeSlot) {
        Iterator<Reservation> it = reservations.iterator();
        while (it.hasNext()) {
            Reservation r = it.next();
            if (r.tableNumber == tableNumber && r.timeSlot.equals(timeSlot)) {
                it.remove();
                System.out.println("Reservation cancelled.");
                return;
            }
        }
        System.out.println("No reservation found to cancel.");
    }
    // show available table method
    public void showAvailableTables(String timeSlot) {
        System.out.println("Available tables at " + timeSlot + ":");
        for (Table t : tables.values()) {
            boolean reserved = false;
            for (Reservation r : reservations) {
                if (r.tableNumber == t.tableNumber && r.timeSlot.equals(timeSlot)) {
                    reserved = true;
                    break;
                }
            }
            if (!reserved) {
                System.out.println("Table " + t.tableNumber + " (Capacity: " + t.capacity + ")");
            }
        }
    }
}
