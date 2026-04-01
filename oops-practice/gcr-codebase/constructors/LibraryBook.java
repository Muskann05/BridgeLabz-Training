import java.util.Scanner;

// LibraryBook class
class LibraryBook {

    // attributes
    String title;
    String author;
    double price;
    boolean available;

    // constructor
    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        // book is available initially
        this.available = true; 
    }

    // method to borrow book
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Sorry, book is not available.");
        }
    }

    // method to display book details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // user input
        System.out.println("Enter book title:");
        String title = sc.nextLine();

        System.out.println("Enter author name:");
        String author = sc.nextLine();

        System.out.println("Enter book price:");
        double price = sc.nextDouble();

        // create object
        LibraryBook book = new LibraryBook(title, author, price);

        // display before borrowing
        System.out.println("\nBook Details:");
        book.displayDetails();

        // borrow book
        book.borrowBook();

        // display after borrowing
        System.out.println("\nAfter Borrowing:");
        book.displayDetails();

    }
}
