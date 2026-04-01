// Superclass
class BankAccount {

    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : ₹" + balance);
    }
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type   : Savings Account");
    }
}

// CheckingAccount subclass
class CheckingAccount extends BankAccount {

    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type   : Checking Account");
    }
}

// FixedDepositAccount subclass
class FixedDepositAccount extends BankAccount {

    int tenure; // in years

    FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    void displayAccountType() {
        System.out.println("Account Type   : Fixed Deposit Account");
    }
}

// Main class
public class BankAccountSystem {

    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount("SA101", 50000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA201", 30000, 20000);
        FixedDepositAccount fd = new FixedDepositAccount("FD301", 100000, 5);

        sa.displayAccountType();
        sa.displayDetails();
        System.out.println();

        ca.displayAccountType();
        ca.displayDetails();
        System.out.println();

        fd.displayAccountType();
        fd.displayDetails();
    }
}
