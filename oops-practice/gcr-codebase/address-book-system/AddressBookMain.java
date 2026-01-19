import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        System.out.println("Welcome to Address Book Program");
        int choice;
        do {
            System.out.println("1. Add New Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {

                case 1:
                    System.out.print("Enter First Name: ");                    
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter City: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter State: ");
                    String state = scanner.nextLine();
                    System.out.print("Enter Zip: ");
                    String zip = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    Contacts contact = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);
                    addressBook.addContact(contact);
                    break;

                case 2:
                    addressBook.displayAllContacts();
                    break;

                case 3:
                    System.out.println(" Exiting Address Book. ");
                    break;

                default:
                    System.out.println(" Invalid choice! Please try again.");
            }
        } while (choice != 3);
    }
}
