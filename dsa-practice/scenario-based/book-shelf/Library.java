import java.util.*;

public class Library {
    private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();
    // to avoid duplicate
    private HashSet<Book> bookSet = new HashSet<>(); 
    // Add book
    public void addBook(Book book) {
        if (bookSet.contains(book)) {
            System.out.println("Duplicate book not allowed.");
            return;
        }
        catalog.putIfAbsent(book.genre, new LinkedList<>());
        catalog.get(book.genre).add(book);
        bookSet.add(book);
        System.out.println("Book added: " + book);
    }
    // Remove book
    public void removeBook(Book book) {
        if (!bookSet.contains(book)) {
            System.out.println("Book not found in library.");
            return;
        }
        LinkedList<Book> list = catalog.get(book.genre);
        list.remove(book);
        bookSet.remove(book);
        System.out.println("Book removed: " + book);

        if (list.isEmpty()) {
            catalog.remove(book.genre);
        }
    }
    // Display catalog
    public void displayCatalog() {
        if (catalog.isEmpty()) {
            System.out.println("Library catalog is empty.");
            return;
        }
        for (String genre : catalog.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (Book b : catalog.get(genre)) {
                System.out.println("  - " + b);
            }
        }
    }
}
