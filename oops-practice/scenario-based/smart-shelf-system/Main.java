public class Main {
    public static void main(String[] args) {

        SmartShelf shelf = new SmartShelf(10);

        shelf.addBook(new Book("Java"));
        shelf.addBook(new Book("Python"));
        shelf.addBook(new Book("C"));
        shelf.addBook(new Book("Android"));

        shelf.displayBooks();
    }
}
