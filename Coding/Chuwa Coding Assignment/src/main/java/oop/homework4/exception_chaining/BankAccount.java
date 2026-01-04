package oop.homework4.exception_chaining;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount must be positive");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. balance=" + balance + ", amount=" + amount);
        }
        balance -= amount;
    }
}



