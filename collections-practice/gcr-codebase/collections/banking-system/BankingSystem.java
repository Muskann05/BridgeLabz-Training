import java.util.*;
public class BankingSystem {
    private HashMap<Integer, Double> accountMap = new HashMap<>();
    private Queue<Integer> withdrawalQueue = new LinkedList<>();
    // Add account
    public void addAccount(int accountNumber, double balance) {
        accountMap.put(accountNumber, balance);
    }
    // Request withdrawal
    public void requestWithdrawal(int accountNumber) {
        withdrawalQueue.add(accountNumber);
    }
    // Process withdrawal requests
    public void processWithdrawals(double amount) {
        System.out.println("Processing Withdrawals:");
        while (!withdrawalQueue.isEmpty()) {
            int acc = withdrawalQueue.remove();
            double balance = accountMap.get(acc);
            if (balance >= amount) {
                accountMap.put(acc, balance - amount);
                System.out.println("Withdrawal successful for Account " + acc);
            } else {
                System.out.println("Insufficient balance for Account " + acc);
            }
        }
    }
    // Display customers sorted by balance
    public void displaySortedByBalance() {
        TreeMap<Double, Integer> sortedMap = new TreeMap<>();
        for (Map.Entry<Integer, Double> entry : accountMap.entrySet()) {
            sortedMap.put(entry.getValue(), entry.getKey());
        }
        System.out.println("\nAccounts Sorted by Balance:");
        for (Map.Entry<Double, Integer> entry : sortedMap.entrySet()) {
            System.out.println("Account " + entry.getValue() + " -> Balance: " + entry.getKey());
        }
    }
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        bank.addAccount(101, 5000);
        bank.addAccount(102, 3000);
        bank.addAccount(103, 7000);

        bank.requestWithdrawal(101);
        bank.requestWithdrawal(102);

        bank.processWithdrawals(2000);
        bank.displaySortedByBalance();
    }
}
