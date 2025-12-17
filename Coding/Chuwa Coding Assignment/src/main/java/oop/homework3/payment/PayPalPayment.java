package oop.homework3.payment;

public class PayPalPayment implements PaymentMethod {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("PayPal payment processed: $" + amount);
        return true;
    }
}


