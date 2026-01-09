package oop.homework6.p3;

public class ThreeThreadPrinter {
    private int current = 1;
    private final int max;

    public ThreeThreadPrinter(int max) {
        this.max = max;
    }

    public synchronized void print(int remainder) {
        while (current <= max) {
            while (current <= max && ((current - 1) % 3) != remainder) {
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

