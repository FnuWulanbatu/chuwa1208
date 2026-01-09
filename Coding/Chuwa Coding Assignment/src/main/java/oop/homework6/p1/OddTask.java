package oop.homework6.p1;

public class OddTask implements Runnable {
    private final NumberPrinter printer;

    public OddTask(NumberPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printOdd();
    }
}

