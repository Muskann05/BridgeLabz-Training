public class BankTransfer implements TransferService {

    @Override
    public void transfer(Wallet from, Wallet to, double amount) throws InsufficientBalanceException {
        from.withdrawMoney(amount);
        to.addMoney(amount);
        System.out.println("Bank transfer successful");
    }
}
