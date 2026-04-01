abstract class Account implements BankService {
    protected int accountNumber;
    protected double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. Balance: " + balance);
    }

    public synchronized void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient Balance!");
        balance -= amount;
        System.out.println(amount + " withdrawn. Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}
