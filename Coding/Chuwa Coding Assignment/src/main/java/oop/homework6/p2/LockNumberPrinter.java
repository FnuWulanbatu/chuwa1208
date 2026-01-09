package oop.homework6.p2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class LockNumberPrinter {
    private int current = 1;
    private final int max;

    private final ReentrantLock lock = new ReentrantLock();
    private final Condition oddCondition = lock.newCondition();
    private final Condition evenCondition = lock.newCondition();

    public LockNumberPrinter(int max) {
        this.max = max;
    }

    public void printOdd() {
        while (true) {
            lock.lock();
            try {
                while (current <= max && current % 2 == 0) {
                    awaitSafely(oddCondition);
                }
                if (current > max) {
                    evenCondition.signalAll();
                    oddCondition.signalAll();
                    return;
                }
                System.out.println(Thread.currentThread().getName() + ": " + current);
                current++;
                evenCondition.signal();
            } finally {
                lock.unlock();
            }
        }
    }

    public void printEven() {
        while (true) {
            lock.lock();
            try {
                while (current <= max && current % 2 != 0) {
                    awaitSafely(evenCondition);
                }
                if (current > max) {
                    oddCondition.signalAll();
                    evenCondition.signalAll();
                    return;
                }
                System.out.println(Thread.currentThread().getName() + ": " + current);
                current++;
                oddCondition.signal();
            } finally {
                lock.unlock();
            }
        }
    }

    private void awaitSafely(Condition condition) {
        try {
            condition.await();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

