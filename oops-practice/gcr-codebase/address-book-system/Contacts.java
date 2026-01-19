// Use Case - 1 : Contact Class
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

    // display Contact details
    public void displayContacts(){
        System.out.println(" Contact Details ");
        System.out.println(" First Name : " + firstName + " , Last Name : " + lastName + " , Address : " + address + " , City : " + city + " , state : " + state + ",  Zip : " + zip + " , Phone Number : " + phoneNumber + " , Email : " + email);
    }



    
}
