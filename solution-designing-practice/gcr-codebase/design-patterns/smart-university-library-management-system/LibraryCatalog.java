import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    private static LibraryCatalog instance;
    private List<Book> books = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();
    private Logger logger = Logger.getInstance();

    private LibraryCatalog() {}

    public static synchronized LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void addBook(Book book) {
        books.add(book);
        logger.log("Book added: " + book.getTitle());
        notifyObservers(book.getTitle());
    }

    public void reserveBook(String userName, String bookTitle, ReservationStrategy strategy) {
        logger.log(userName + " is reserving book: " + bookTitle);
        strategy.reserve(userName, bookTitle);
    }

    private void notifyObservers(String bookName) {
        for (Observer o : observers) {
            o.update("New book available: " + bookName);
        }
    }
}