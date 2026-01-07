class SavingsAccount extends Account {

    public SavingsAccount(int accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.04; // 4% interest
    }
}
