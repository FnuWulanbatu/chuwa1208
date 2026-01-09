package oop.homework6.p2;

public class OddTask implements Runnable {
    private final LockNumberPrinter printer;

    public OddTask(LockNumberPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printOdd();
    }
}

