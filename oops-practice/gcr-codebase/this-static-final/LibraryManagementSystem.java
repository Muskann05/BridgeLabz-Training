
class Book {

    // Static
    static String libraryName = "Egmore Library";
    // Instance variables
    String title;
    String author;
    //  Final 
    final String isbn;
    //  Constructor 
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    // Static Method
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
     // Display 
    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

// Main Class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book(
                "Effective Java",
                "Joshua Bloch",
                "978-0134685991"
        );

        // instanceof
        if (book1 instanceof Book) {
            Book.displayLibraryName();
            book1.displayBookDetails();
        }
    }
}
