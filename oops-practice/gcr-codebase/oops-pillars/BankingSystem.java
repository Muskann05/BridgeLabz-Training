interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}

abstract class BankAccount {

    // Encapsulation
    private String accountNumber;
    private String holderName;
    protected double balance;

    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Abstract method
    abstract void calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 4.0;

    SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * INTEREST_RATE / 100;
        System.out.println("Savings Account Interest: ₹" + interest);
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan applied for Savings Account");
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 2;
    }
}

class CurrentAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 2.0;

    CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * INTEREST_RATE / 100;
        System.out.println("Current Account Interest: ₹" + interest);
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan applied for Current Account");
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 3;
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        // Polymorphism
        BankAccount acc1 = new SavingsAccount("SA101", "Muskan", 50000);
        BankAccount acc2 = new CurrentAccount("CA201", "Amit", 80000);

        acc1.deposit(5000);
        acc1.calculateInterest();

        acc2.withdraw(10000);
        acc2.calculateInterest();

        // Loan processing
        Loanable loan1 = (Loanable) acc1;
        loan1.applyForLoan();
        System.out.println("Loan Eligibility: ₹" + loan1.calculateLoanEligibility());

        Loanable loan2 = (Loanable) acc2;
        loan2.applyForLoan();
        System.out.println("Loan Eligibility: ₹" + loan2.calculateLoanEligibility());
    }
}
