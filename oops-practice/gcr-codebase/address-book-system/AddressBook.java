import java.util.ArrayList;
public class AddressBook {
    private ArrayList<Contacts> contactList = new ArrayList<>();
    // UC-2: Add new contact
    public void addContact(Contacts contact) {
        contactList.add(contact);
        System.out.println(" Contact added successfully!");
    }
    // Display all contacts
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
