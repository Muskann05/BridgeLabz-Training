public class Main {
    public static void main(String[] args) {

        // Account Creation (CREATE)
        Account savings = new SavingsAccount(101, 5000);
        Account current = new CurrentAccount(102, 8000);

        // Balance Check (READ)
        System.out.println("Savings Balance: " + savings.getBalance());
        System.out.println("Current Balance: " + current.getBalance());

        // Concurrent Transactions (UPDATE)
        Thread t1 = new Transaction(savings);
        Thread t2 = new Transaction(savings);

        t1.start();
        t2.start();

        // Interest Calculation (Polymorphism)
        System.out.println("Savings Interest: " + savings.calculateInterest());
        System.out.println("Current Interest: " + current.calculateInterest());

        // Transaction History (Simulated)
        System.out.println("Transactions completed successfully");
    }
}
