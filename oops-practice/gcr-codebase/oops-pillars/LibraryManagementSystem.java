interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

abstract class LibraryItem {

    // Encapsulation
    private int itemId;
    private String title;
    private String author;
    private boolean available = true;
    private String borrowerName;

    LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters (restricted access)
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    // Controlled access methods
    protected void borrowItem(String borrowerName) {
        if (available) {
            this.borrowerName = borrowerName;
            available = false;
        }
    }

    protected void returnItem() {
        borrowerName = null;
        available = true;
    }

    // Concrete method
    public void getItemDetails() {
        System.out.println("ID: " + itemId +
                ", Title: " + title +
                ", Author: " + author +
                ", Available: " + available);
    }

    // Abstract method
    abstract int getLoanDuration();
}

class Book extends LibraryItem implements Reservable {

    Book(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 14; // days
    }

    @Override
    public void reserveItem() {
        System.out.println("Book reserved");
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

class Magazine extends LibraryItem implements Reservable {

    Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 7; // days
    }

    @Override
    public void reserveItem() {
        System.out.println("Magazine reserved");
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

class DVD extends LibraryItem implements Reservable {

    DVD(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    int getLoanDuration() {
        return 3; // days
    }

    @Override
    public void reserveItem() {
        System.out.println("DVD reserved");
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        // Polymorphism
        LibraryItem item1 = new Book(101, "Java Programming", "James Gosling");
        LibraryItem item2 = new Magazine(201, "Tech Monthly", "Editorial Team");
        LibraryItem item3 = new DVD(301, "Inception", "Christopher Nolan");

        item1.getItemDetails();
        System.out.println("Loan Duration: " + item1.getLoanDuration() + " days");

        item2.getItemDetails();
        System.out.println("Loan Duration: " + item2.getLoanDuration() + " days");

        item3.getItemDetails();
        System.out.println("Loan Duration: " + item3.getLoanDuration() + " days");

        // Reservation using interface
        Reservable r1 = (Reservable) item1;
        r1.reserveItem();
    }
}
