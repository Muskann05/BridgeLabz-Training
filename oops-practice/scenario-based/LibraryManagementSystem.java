import java.util.*;

class BookNotAvailableException extends Exception {
    BookNotAvailableException(String msg) {
        super(msg);
    }
}

class Book {
    String title;
    String author;
    boolean available;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }
}

public class LibraryManagementSystem {

    static List<Book> books = new ArrayList<>();

    static void searchBook(String keyword) {
        for (Book b : books) {
            if (b.title.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(b.title + " - " +
                        (b.available ? "Available" : "Checked Out"));
            }
        }
    }

    static void checkoutBook(String title) throws BookNotAvailableException {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                if (!b.available)
                    throw new BookNotAvailableException("Book already checked out");
                b.available = false;
                System.out.println("Book checked out successfully");
                return;
            }
        }
        System.out.println("Book not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        books.add(new Book("Java Basics", "James"));
        books.add(new Book("Python Intro", "Guido"));

        System.out.print("Search book: ");
        String search = sc.nextLine();
        searchBook(search);

        try {
            System.out.print("Enter book title to checkout: ");
            String title = sc.nextLine();
            checkoutBook(title);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
