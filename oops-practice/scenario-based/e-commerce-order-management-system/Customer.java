// customer class
public class Customer {
    private String customerName;
    private int customerId;

    // constructor
    public Customer(String customerName , int customerId){
        this.customerName = customerName;
        this.customerId = customerId;
    }

    // method to displayinfo
    public void displayCustomer(){
        System.out.println("Customer name is" + customerName + "customer id is " + customerId );

    }
    
}
