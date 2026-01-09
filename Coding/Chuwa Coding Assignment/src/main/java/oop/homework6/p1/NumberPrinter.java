package oop.homework6.p1;

public class NumberPrinter {
    private int current = 1;
    private final int max;

    public NumberPrinter(int max) {
        this.max = max;
    }

    public synchronized void printOdd() {
        while (current <= max) {
            while (current <= max && current % 2 == 0) {
                waitSafely();
            }
            if (current > max) {
                notifyAll();
                return;
            }
            System.out.println(Thread.currentThread().getName() + ": " + current);
            current++;
            notifyAll();
        }
    }

    public synchronized void printEven() {
        while (current <= max) {
            while (current <= max && current % 2 != 0) {
                waitSafely();
            }
            if (current > max) {
                notifyAll();
                return;
            }
            System.out.println(Thread.currentThread().getName() + ": " + current);
            current++;
            notifyAll();
        }
    }

    private void waitSafely() {
        try {
            wait();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

