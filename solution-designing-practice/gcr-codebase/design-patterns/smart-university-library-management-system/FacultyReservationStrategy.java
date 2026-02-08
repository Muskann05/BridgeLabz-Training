public class FacultyReservationStrategy implements ReservationStrategy {
    public void reserve(String userName, String bookTitle) {
        System.out.println(userName + " reserved '" + bookTitle + "' for 30 days.");
    }
}