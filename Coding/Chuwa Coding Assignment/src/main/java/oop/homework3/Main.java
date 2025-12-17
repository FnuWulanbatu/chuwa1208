package oop.homework3;

import oop.homework3.library.Book;
import oop.homework3.library.Library;
import oop.homework3.payment.CreditCardPayment;
import oop.homework3.payment.PayPalPayment;
import oop.homework3.payment.PaymentMethod;
import oop.homework3.singleton.ConfigManager;

public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCardPayment();
        creditCard.processPayment(100.0);
        creditCard.printReceipt();

        PaymentMethod payPal = new PayPalPayment();
        payPal.processPayment(250.5);
        payPal.printReceipt();

        Library library = new Library();
        library.addBook(new Book("Clean Code", "978-0132350884"));
        library.addBook(new Book("Effective Java", "978-0134685991"));
        library.addBook(new Book("Design Patterns", "978-0201633610"));
        library.displayLibrary();

        ConfigManager c1 = ConfigManager.getInstance();
        ConfigManager c2 = ConfigManager.getInstance();
        System.out.println(c1 == c2);

        c1.setConfig("env", "dev");
        c1.setConfig("timeout", "30");
        c1.setConfig("region", "us-west");
        c1.displayAllConfigs();
    }
}


