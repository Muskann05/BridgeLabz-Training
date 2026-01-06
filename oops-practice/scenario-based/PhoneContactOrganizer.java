import java.util.*;

class InvalidPhoneNumberException extends Exception {
    InvalidPhoneNumberException(String msg) {
        super(msg);
    }
}

class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

public class PhoneContactOrganizer {

    static List<Contact> contacts = new ArrayList<>();

    static void addContact(String name, String phone) throws InvalidPhoneNumberException {
        if (phone.length() != 10)
            throw new InvalidPhoneNumberException("Phone number must be 10 digits");

        for (Contact c : contacts) {
            if (c.phone.equals(phone)) {
                System.out.println("Duplicate phone number not allowed");
                return;
            }
        }
        contacts.add(new Contact(name, phone));
        System.out.println("Contact added successfully");
    }

    static void searchContact(String name) {
        for (Contact c : contacts) {
            if (c.name.equalsIgnoreCase(name)) {
                System.out.println("Found: " + c.name + " - " + c.phone);
                return;
            }
        }
        System.out.println("Contact not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter phone: ");
            String phone = sc.nextLine();

            addContact(name, phone);
            searchContact(name);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
