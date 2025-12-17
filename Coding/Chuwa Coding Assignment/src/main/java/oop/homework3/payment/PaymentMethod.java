package oop.homework3.payment;

public interface PaymentMethod {
    boolean processPayment(double amount);

    default void printReceipt() {
        System.out.println("Payment processed successfully");
    }
}


