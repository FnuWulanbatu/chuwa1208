package oop.homework6.p1;

public class EvenTask implements Runnable {
    private final NumberPrinter printer;

    public EvenTask(NumberPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printEven();
    }
}

