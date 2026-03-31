public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("12345", 1000.0);
        System.out.printf("%.2f%n", savings.calculateFee());

        BankAccount savings2 = new SavingsAccount("67890", 500.0);
        System.out.printf("%.2f%n", savings2.calculateFee());

        BankAccount checking1 = new CheckingAccount("11111", 1500.0);
        System.out.printf("%.2f%n", checking1.calculateFee());

        BankAccount checking2 = new CheckingAccount("22222", 500.0);
        System.out.printf("%.2f%n", checking2.calculateFee());
    }
}
