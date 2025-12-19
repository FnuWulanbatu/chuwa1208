package oop.homework4.exception_chaining;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);
        ATM atm = new ATM();

        try {
            atm.withdraw(account, 40.0);
        } catch (InsufficientBalanceException e) {
            System.out.println("Unexpected failure: " + e.getMessage());
        }

        try {
            atm.withdraw(account, 1000.0);
        } catch (InsufficientBalanceException e) {
            System.out.println("Failed withdrawal caught: " + e.getMessage());
            if (e.getCause() != null) {
                System.out.println("Cause: " + e.getCause().getMessage());
            }
        }
    }
}


