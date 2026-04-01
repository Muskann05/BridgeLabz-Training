class Transaction extends Thread {
    private Account account;

    public Transaction(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        try {
            account.deposit(1000);
            account.withdraw(500);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
