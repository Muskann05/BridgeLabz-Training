// Use case 1 
public class Contacts {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    // Constructor
    public Contacts(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    // Setters for UC3 (Edit)
    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Display Contact details
    public void displayContacts(){
        System.out.println(" Contact Details ");
        System.out.println(" First Name : " + firstName + 
                           " , Last Name : " + lastName + 
                           " , Address : " + address + 
                           " , City : " + city + 
                           " , State : " + state + 
                           " , Zip : " + zip + 
                           " , Phone Number : " + phoneNumber + 
                           " , Email : " + email);
    }
}
