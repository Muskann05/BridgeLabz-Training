class CurrentAccount extends Account {

    public CurrentAccount(int accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.02; // 2% interest
    }
}
