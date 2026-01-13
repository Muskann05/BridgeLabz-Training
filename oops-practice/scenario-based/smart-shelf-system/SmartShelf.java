public class SmartShelf {

    private Book[] shelf;
    private int count;

    public SmartShelf(int size) {
        shelf = new Book[size];
        count = 0;
    }

    // Add book in correct alphabetical position
    public void addBook(Book book) {
        int position = count;

        for (int i = 0; i < count; i++) {
            if (book.getTitle().compareToIgnoreCase(shelf[i].getTitle()) < 0) {
                position = i;
                break;
            }
        }

        // shift books to make space
        for (int i = count; i > position; i--) {
            shelf[i] = shelf[i - 1];
        }

        shelf[position] = book;
        count++;
    }

    public void displayBooks() {
        System.out.println("SmartShelf Books:");
        for (int i = 0; i < count; i++) {
            System.out.println(shelf[i].getTitle());
        }
    }
}
