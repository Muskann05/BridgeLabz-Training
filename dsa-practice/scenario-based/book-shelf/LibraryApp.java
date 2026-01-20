import java.util.Scanner;
public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        while (true) {
            System.out.println("Library Menu");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Catalog");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter genre: ");
                    String genre = sc.nextLine();
                    library.addBook(new Book(title, author, genre));
                    break;

                case 2:
                    System.out.print("Enter title: ");
                    String t = sc.nextLine();
                    System.out.print("Enter author: ");
                    String a = sc.nextLine();
                    System.out.print("Enter genre: ");
                    String g = sc.nextLine();
                    library.removeBook(new Book(t, a, g));
                    break;

                case 3:
                    library.displayCatalog();
                    break;

                case 4:
                    System.out.println("Exiting Library System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
