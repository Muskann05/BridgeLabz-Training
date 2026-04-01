class BankAccount {
    //  Static 
    static String bankName = "State bank of India";
    static int totalAccounts = 0;
    //  Instance variables 
    String accountHolder;
    // final variable
    final String accountNumber;   
    double balance;
    //  Constructor 
    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }
    //  Deposit 
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    //  Withdraw 
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("\nWithdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    // Display
    void display() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
    // Static Method
    static void showTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }
}
//  Main Class
public class BankAccountSystem {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(
                "Lynda Princy", "ACC12345", 1000.0);

        BankAccount acc2 = new BankAccount(
                "Prince Danish", "ACC67890", 500.0);
        // instanceof
        if (acc1 instanceof BankAccount) {
            System.out.println("\nAccount 1 Details:");
            acc1.display();
        }
        if (acc2 instanceof BankAccount) {
            System.out.println("\nAccount 2 Details:");
            acc2.display();
        }

        BankAccount.showTotalAccounts();

        //Transactions
        System.out.println("\nPerforming transactions on Account 1:");
        acc1.deposit(200.0);
        acc1.withdraw(150.0);
        acc1.display();
        acc2.display();

        acc2.deposit(100.0);
        // insufficient balance
        acc2.withdraw(700.0); 
    }
}
