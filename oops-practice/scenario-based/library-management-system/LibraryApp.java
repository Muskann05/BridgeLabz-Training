public class LibraryApp {

    public static void main(String[] args) {

        Book book1 = new Book(101, "Java Programming");

        Member student = new Member(1, "Rohan", "Student");
        Member staff = new Member(2, "Dr. Sharma", "Staff");

        Transaction t1 = new Transaction(book1, student);

        try {
            t1.issue();
            t1.issue();
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        t1.returnBook(3);

        // Polymorphism demo
        Transaction t2 = new Transaction(book1, staff);
        try {
            t2.issue();
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
        t2.returnBook(2);
    }
}
