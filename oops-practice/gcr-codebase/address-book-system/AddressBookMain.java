import java.util.*;
public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, AddressBook> addressBooks = new HashMap<>();
        System.out.println(" Welcome to Address Book Program ");
        int choice;
        // use console to edit 
        do {
            System.out.println("\n1. Add New Address Book");
            System.out.println("2. Add New Contact");
            System.out.println("3. Display All Contacts");
            System.out.println("4. Edit Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");
            System.out.print(" Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                // UC6: Add multiple Address Books
                case 1:
                    System.out.print(" Enter Address Book Name: ");
                    String bookName = scanner.nextLine();
                    if (addressBooks.containsKey(bookName)) {
                        System.out.println(" Address Book already exists!");
                    } else {
                        addressBooks.put(bookName, new AddressBook());
                        System.out.println(" Address Book created successfully!");
                    }
                    break;
                case 2:
                    System.out.print(" Enter Address Book Name: ");
                    bookName = scanner.nextLine();
                    AddressBook addressBook = addressBooks.get(bookName);
                    if (addressBook == null) {
                        System.out.println(" Address Book not found!");
                        break;
                    }
                    System.out.print(" Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print(" Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print(" Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print(" Enter City: ");
                    String city = scanner.nextLine();
                    System.out.print(" Enter State: ");
                    String state = scanner.nextLine();
                    System.out.print(" Enter Zip: ");
                    String zip = scanner.nextLine();
                    System.out.print(" Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print(" Enter Email: ");
                    String email = scanner.nextLine();
                    Contacts contact = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);
                    addressBook.addContact(contact);
                    break;
                case 3:
                    System.out.print(" Enter Address Book Name: ");
                    bookName = scanner.nextLine();
                    addressBook = addressBooks.get(bookName);
                    if (addressBook == null) {
                        System.out.println(" Address Book not found!");
                        break;
                    }
                    addressBook.displayAllContacts();
                    break;
                // UC3: Edit contact
                case 4:
                    System.out.print(" Enter Address Book Name: ");
                    bookName = scanner.nextLine();
                    addressBook = addressBooks.get(bookName);
                    if (addressBook == null) {
                        System.out.println(" Address Book not found!");
                        break;
                    }
                    System.out.print(" Enter First Name of contact to edit: ");
                    String editName = scanner.nextLine();
                    addressBook.editContact(editName, scanner);
                    break;
                // UC4: Delete contact
                case 5:
                    System.out.print(" Enter Address Book Name: ");
                    bookName = scanner.nextLine();
                    addressBook = addressBooks.get(bookName);
                    if (addressBook == null) {
                        System.out.println(" Address Book not found!");
                        break;
                    }
                    System.out.print(" Enter First Name of contact to delete: ");
                    String deleteName = scanner.nextLine();
                    addressBook.deleteContact(deleteName);
                    break;
                case 6:
                    System.out.println(" Exiting Address Book. ");
                    break;
                default:
                    System.out.println(" Invalid choice! Please try again.");
            }
        } while (choice != 6);
    }
}
