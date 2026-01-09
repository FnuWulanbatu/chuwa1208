package oop.homework6.p2;

public class EvenTask implements Runnable {
    private final LockNumberPrinter printer;

    public EvenTask(LockNumberPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printEven();
    }
}

