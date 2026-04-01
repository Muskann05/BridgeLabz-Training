import java.util.Scanner;

// Base class Book
class Book {
    // Public member
    public String ISBN;  
    // Protected member
    protected String title;   
    // Private member   
    private String author;       

    // Constructor to initialize Book
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass EBook to demonstrate access modifiers
class EBook extends Book {
    private double fileSize;  // in MB

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Display EBook details
    public void displayEBook() {
        // Accessing public and protected members directly
        // public
        System.out.println("ISBN: " + ISBN);
        // protected       
        System.out.println("Title: " + title);  
        // private via getter   
        System.out.println("Author: " + getAuthor()); 
        System.out.println("File Size: " + fileSize + " MB");
    }
}

// Main class
public class BookLibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Book
        System.out.println("Enter details for Book:");
        System.out.print("ISBN: ");
        String isbn = sc.nextLine();
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Author: ");
        String author = sc.nextLine();

        Book book = new Book(isbn, title, author);
        System.out.println("\nBook Details:");
        book.displayBook();

        // Update Author
        System.out.print("\nEnter new Author name to update: ");
        String newAuthor = sc.nextLine();
        book.setAuthor(newAuthor);
        System.out.println("Updated Book Details:");
        book.displayBook();

        // Input for EBook
        System.out.println("\nEnter details for EBook:");
        System.out.print("ISBN: ");
        String eISBN = sc.nextLine();
        System.out.print("Title: ");
        String eTitle = sc.nextLine();
        System.out.print("Author: ");
        String eAuthor = sc.nextLine();
        System.out.print("File Size (MB): ");
        double fileSize = sc.nextDouble();

        EBook ebook = new EBook(eISBN, eTitle, eAuthor, fileSize);
        System.out.println("\nEBook Details:");
        ebook.displayEBook();

    }
}
