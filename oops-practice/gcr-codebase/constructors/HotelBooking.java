import java.util.Scanner;

// HotelBooking class
class HotelBooking {

    // attributes
    String guestName;
    String roomType;
    int nights;

    // default constructor
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // parameterized constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // copy constructor
    HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }

    // method to display booking details
    void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // default booking
        System.out.println("Default Booking:");
        HotelBooking b1 = new HotelBooking();
        b1.displayBooking();

        // user input for parameterized constructor
        System.out.println("Enter guest name:");
        String name = sc.nextLine();

        System.out.println("Enter room type:");
        String room = sc.nextLine();

        System.out.println("Enter number of nights:");
        int nights = sc.nextInt();

        // parameterized booking
        System.out.println("\nUser Booking:");
        HotelBooking b2 = new HotelBooking(name, room, nights);
        b2.displayBooking();

        // copy booking
        System.out.println("Copied Booking:");
        HotelBooking b3 = new HotelBooking(b2);
        b3.displayBooking();

        
    }
}
