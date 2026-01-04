package oop.homework4.exception_chaining;

public class ATM {
    public void withdraw(BankAccount account, double amount) throws InsufficientBalanceException {
        try {
            account.withdraw(amount);
            System.out.println("ATM withdraw success: amount=" + amount + ", balance=" + account.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println("ATM log: " + e.getMessage());
            throw new InsufficientBalanceException("ATM withdrawal failed", e);
        } finally {
            System.out.println("ATM finally block executed");
        }
    }
}



