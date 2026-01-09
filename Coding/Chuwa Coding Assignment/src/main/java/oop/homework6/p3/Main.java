package oop.homework6.p3;

public class Main {
    public static void main(String[] args) {
        ThreeThreadPrinter printer = new ThreeThreadPrinter(30);

        Thread a = new Thread(new PrintTask(printer, 0), "Thread-A");
        Thread b = new Thread(new PrintTask(printer, 1), "Thread-B");
        Thread c = new Thread(new PrintTask(printer, 2), "Thread-C");

        a.start();
        b.start();
        c.start();
    }
}

