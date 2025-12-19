package oop.homework3.payment;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Credit Card payment processed: $" + amount);
        return true;
    }
}



