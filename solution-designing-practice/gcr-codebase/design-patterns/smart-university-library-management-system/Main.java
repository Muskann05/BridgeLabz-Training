public class Main {
    public static void main(String[] args) {

        // Singleton
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        // Factory
        User student = UserFactory.createUser("student", "Alice");
        User faculty = UserFactory.createUser("faculty", "Dr. Bob");
        User guest = UserFactory.createUser("guest", "Charlie");

        student.showRole();
        faculty.showRole();
        guest.showRole();

        // Observer registration
        catalog.addObserver(student);
        catalog.addObserver(faculty);
        catalog.addObserver(guest);

        // Builder
        Book book = new Book.BookBuilder("Design Patterns")
                .author("GoF")
                .edition("2nd")
                .genre("Software Engineering")
                .build();

        // Add book
        catalog.addBook(book);

        // Strategy (Reservation)
        ReservationStrategy studentStrategy = new StudentReservationStrategy();
        ReservationStrategy facultyStrategy = new FacultyReservationStrategy();

        catalog.reserveBook("Alice", "Design Patterns", studentStrategy);
        catalog.reserveBook("Dr. Bob", "Design Patterns", facultyStrategy);
    }
}