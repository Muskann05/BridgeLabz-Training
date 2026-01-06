class LibraryManagement {

    static String[][] books = {
        {"Java Programming", "James Gosling", "Available"},
        {"Python Basics", "Guido", "Available"},
        {"Data Structures", "Mark Allen", "Checked Out"}
    };

    // Display all books
    static void displayBooks() {
        System.out.println("\nBook List:");
        for (int i = 0; i < books.length; i++) {
            System.out.println(
                books[i][0] + " | " + books[i][1] + " | " + books[i][2]
            );
        }
    }

    // Search by partial title
    static void searchBook(String keyword) {
        System.out.println("\nSearch Results:");
        for (int i = 0; i < books.length; i++) {
            if (books[i][0].toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(
                    books[i][0] + " | " + books[i][1] + " | " + books[i][2]
                );
            }
        }
    }

    // Checkout a book
    static void checkoutBook(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i][0].equalsIgnoreCase(title)) {
                if (books[i][2].equals("Available")) {
                    books[i][2] = "Checked Out";
                    System.out.println("Book checked out successfully!");
                } else {
                    System.out.println("Book already checked out.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public static void main(String[] args) {
        displayBooks();
        searchBook("java");
        checkoutBook("Java Programming");
        displayBooks();
    }
}
