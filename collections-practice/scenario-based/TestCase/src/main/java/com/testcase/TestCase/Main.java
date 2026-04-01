package com.testcase.TestCase;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();

        Program account = new Program(initialBalance);

        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        try {
            account.deposit(depositAmount);
            System.out.println("Balance after deposit: " + account.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Enter withdraw amount: ");
        double withdrawAmount = sc.nextDouble();
        try {
            account.withdraw(withdrawAmount);
            System.out.println("Balance after withdrawal: " + account.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}