public class Main {
    public static void main(String[] args) {

        Wallet w1 = new Wallet(1000);
        Wallet w2 = new Wallet(500);

        User u1 = new User(1, "Amit", w1);
        User u2 = new User(2, "Neha", w2);

        TransferService walletTransfer = new WalletTransfer();
        TransferService bankTransfer = new BankTransfer();

        try {
            walletTransfer.transfer(u1.getWallet(), u2.getWallet(), 200);
            bankTransfer.transfer(u2.getWallet(), u1.getWallet(), 100);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nAmit Transactions:");
        u1.getWallet().showTransactions();

        System.out.println("\nNeha Transactions:");
        u2.getWallet().showTransactions();
    }
}
