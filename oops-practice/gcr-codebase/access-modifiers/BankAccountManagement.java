import java.util.Scanner;

// Base class BankAccount
class BankAccount {
    public String accountNumber;      // Public member
    protected String accountHolder;   // Protected member
    private double balance;           // Private member

    // Constructor to initialize BankAccount
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Display account details
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Subclass SavingsAccount to demonstrate access
class SavingsAccount extends BankAccount {
    private double interestRate;  // in percentage

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Display SavingsAccount details
    public void displaySavingsAccount() {
        System.out.println("Account Number: " + accountNumber); // public
        System.out.println("Account Holder: " + accountHolder); // protected
        System.out.println("Balance: " + getBalance());        // private via getter
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class
public class BankAccountManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for BankAccount
        System.out.println("Enter details for Bank Account:");
        System.out.print("Account Number: ");
        String accNumber = sc.nextLine();
        System.out.print("Account Holder: ");
        String accHolder = sc.nextLine();
        System.out.print("Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accNumber, accHolder, balance);
        System.out.println("\nBank Account Details:");
        account.displayAccount();

        // Deposit and Withdraw operations
        System.out.print("\nEnter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        System.out.println("\nUpdated Bank Account Details:");
        account.displayAccount();
        sc.nextLine(); 

        // Input for SavingsAccount
        System.out.println("\nEnter details for Savings Account:");
        System.out.print("Account Number: ");
        String saNumber = sc.nextLine();
        System.out.print("Account Holder: ");
        String saHolder = sc.nextLine();
        System.out.print("Balance: ");
        double saBalance = sc.nextDouble();
        System.out.print("Interest Rate (%): ");
        double interest = sc.nextDouble();

        SavingsAccount sa = new SavingsAccount(saNumber, saHolder, saBalance, interest);
        System.out.println("\nSavings Account Details:");
        sa.displaySavingsAccount();

    }
}
