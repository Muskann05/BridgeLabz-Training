package com.Junit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class BankAccountTest {
    @Test
    void testDeposit() {
        BankAccount acc = new BankAccount();
        acc.deposit(100);
        assertEquals(100, acc.getBalance());
    }
    @Test
    void testWithdraw() {
        BankAccount acc = new BankAccount();
        acc.deposit(100);
        acc.withdraw(50);
        assertEquals(50, acc.getBalance());
    }
    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount acc = new BankAccount();
        acc.deposit(50);
        assertThrows(IllegalArgumentException.class, () -> acc.withdraw(100));
    }
}
