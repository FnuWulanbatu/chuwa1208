package oop.homework6.p3;

public class PrintTask implements Runnable {
    private final ThreeThreadPrinter printer;
    private final int remainder;

    public PrintTask(ThreeThreadPrinter printer, int remainder) {
        this.printer = printer;
        this.remainder = remainder;
    }

    @Override
    public void run() {
        printer.print(remainder);
    }
}

