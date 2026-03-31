public class LibraryManagementSystem {

    // Doubly Linked List Node
    static class Book {
        int bookId;
        String title;
        String author;
        String genre;
        boolean available;
        Book next;
        Book prev;

        Book(int id, String title, String author, String genre, boolean available) {
            this.bookId = id;
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.available = available;
            this.next = null;
            this.prev = null;
        }
    }

    // Doubly Linked List
    static class Library {
        private Book head;
        private Book tail;

        // Add at beginning
        void addAtBeginning(Book book) {
            if (head == null) {
                head = tail = book;
            } else {
                book.next = head;
                head.prev = book;
                head = book;
            }
        }

        // Add at end
        void addAtEnd(Book book) {
            if (head == null) {
                head = tail = book;
            } else {
                tail.next = book;
                book.prev = tail;
                tail = book;
            }
        }

        // Add at specific position (1-based)
        void addAtPosition(Book book, int position) {
            if (position <= 1 || head == null) {
                addAtBeginning(book);
                return;
            }

            Book temp = head;
            for (int i = 1; i < position - 1 && temp.next != null; i++) {
                temp = temp.next;
            }

            if (temp.next == null) {
                addAtEnd(book);
            } else {
                book.next = temp.next;
                book.prev = temp;
                temp.next.prev = book;
                temp.next = book;
            }
        }

        // Remove by Book ID
        void removeById(int id) {
            Book temp = head;

            while (temp != null) {
                if (temp.bookId == id) {
                    if (temp == head) {
                        head = head.next;
                        if (head != null) head.prev = null;
                    } else if (temp == tail) {
                        tail = tail.prev;
                        tail.next = null;
                    } else {
                        temp.prev.next = temp.next;
                        temp.next.prev = temp.prev;
                    }
                    return;
                }
                temp = temp.next;
            }
        }

        // Search by Title
        void searchByTitle(String title) {
            Book temp = head;
            boolean found = false;
            while (temp != null) {
                if (temp.title.equalsIgnoreCase(title)) {
                    displayBook(temp);
                    found = true;
                }
                temp = temp.next;
            }
            if (!found) System.out.println("Book not found");
        }

        // Search by Author
        void searchByAuthor(String author) {
            Book temp = head;
            boolean found = false;
            while (temp != null) {
                if (temp.author.equalsIgnoreCase(author)) {
                    displayBook(temp);
                    found = true;
                }
                temp = temp.next;
            }
            if (!found) System.out.println("Book not found");
        }

        // Update availability status
        void updateAvailability(int id, boolean status) {
            Book temp = head;
            while (temp != null) {
                if (temp.bookId == id) {
                    temp.available = status;
                    return;
                }
                temp = temp.next;
            }
        }

        // Display forward
        void displayForward() {
            Book temp = head;
            while (temp != null) {
                displayBook(temp);
                temp = temp.next;
            }
        }

        // Display reverse
        void displayReverse() {
            Book temp = tail;
            while (temp != null) {
                displayBook(temp);
                temp = temp.prev;
            }
        }

        // Count books
        int countBooks() {
            int count = 0;
            Book temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        // Display single book
        void displayBook(Book b) {
            System.out.println(
                    "ID: " + b.bookId +
                    ", Title: " + b.title +
                    ", Author: " + b.author +
                    ", Genre: " + b.genre +
                    ", Available: " + b.available
            );
        }
    }

    // Main method
    public static void main(String[] args) {

        Library lib = new Library();

        lib.addAtEnd(new Book(101, "Java Basics", "James", "Programming", true));
        lib.addAtEnd(new Book(102, "Data Structures", "Mark", "CS", true));
        lib.addAtBeginning(new Book(103, "Python Guide", "Guido", "Programming", false));
        lib.addAtPosition(new Book(104, "Operating Systems", "Andrew", "CS", true), 2);

        System.out.println("Library (Forward):");
        lib.displayForward();

        System.out.println("\nLibrary (Reverse):");
        lib.displayReverse();

        System.out.println("\nSearch by Title:");
        lib.searchByTitle("Java Basics");

        System.out.println("\nSearch by Author:");
        lib.searchByAuthor("Mark");

        lib.updateAvailability(103, true);

        System.out.println("\nAfter Updating Availability:");
        lib.displayForward();

        lib.removeById(102);

        System.out.println("\nAfter Removing Book ID 102:");
        lib.displayForward();

        System.out.println("\nTotal Books: " + lib.countBooks());
    }
}
