package com.testcase.TestCase;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UnitTest {

    @Test
    public void Test_Deposit_ValidAmount() {
        Program account = new Program(1000);
        account.deposit(500);
        assertEquals(1500, account.getBalance(), 0.0);
    }

    @Test
    public void Test_Deposit_NegativeAmount() {
        Program account = new Program(1000);
        try {
            account.deposit(-200);
        } catch (IllegalArgumentException e) {
            assertEquals("Deposit amount cannot be negative", e.getMessage());
        }
    }

    @Test
    public void Test_Withdraw_ValidAmount() {
        Program account = new Program(1000);
        account.withdraw(400);
        assertEquals(600, account.getBalance(), 0.0);
    }

    @Test
    public void Test_Withdraw_InsufficientFunds() {
        Program account = new Program(500);
        try {
            account.withdraw(800);
        } catch (IllegalArgumentException e) {
            assertEquals("Insufficient funds.", e.getMessage());
        }
    }
}