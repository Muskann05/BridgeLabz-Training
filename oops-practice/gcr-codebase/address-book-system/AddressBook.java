import java.util.*;
public class AddressBook {
    private ArrayList<Contacts> contactList = new ArrayList<>();

    // UC2: Add new contact
    public void addContact(Contacts contact) {
        contactList.add(contact);
        System.out.println(" Contact added successfully!");
    }

    // UC3: Edit existing contact using first name
    public void editContact(String name, Scanner scanner) {
        boolean found = false;
        for (Contacts contact : contactList) {
            if (contact.getFirstName().equalsIgnoreCase(name)) {
                found = true;
                System.out.print(" Enter new Address: ");
                contact.setAddress(scanner.nextLine());
                System.out.print(" Enter new City: ");
                contact.setCity(scanner.nextLine());
                System.out.print(" Enter new State: ");
                contact.setState(scanner.nextLine());
                System.out.print(" Enter new Zip: ");
                contact.setZip(scanner.nextLine());
                System.out.print(" Enter new Phone Number: ");
                contact.setPhoneNumber(scanner.nextLine());
                System.out.print(" Enter new Email: ");
                contact.setEmail(scanner.nextLine());
                System.out.println(" Contact updated successfully!");
                break;
            }
        }
        if (!found) {
            System.out.println(" Contact not found!");
        }
    }

    // UC4: Delete contact using first name
    public void deleteContact(String name) {
        Iterator<Contacts> iterator = contactList.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Contacts contact = iterator.next();
            if (contact.getFirstName().equalsIgnoreCase(name)) {
                iterator.remove();
                found = true;
                System.out.println(" Contact deleted successfully!");
                break;
            }
        }
        if (!found) {
            System.out.println(" Contact not found!");
        }
    }

    // UC5: Display all contacts (already supports multiple contacts)
    public void displayAllContacts() {
        if (contactList.isEmpty()) {
            System.out.println(" No contacts found.");
            return;
        }
        for (Contacts contact : contactList) {
            contact.displayContacts();
        }
    }
}
