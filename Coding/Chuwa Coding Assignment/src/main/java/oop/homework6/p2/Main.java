package oop.homework6.p2;

public class Main {
    public static void main(String[] args) {
        LockNumberPrinter printer = new LockNumberPrinter(100);

        Thread oddThread = new Thread(new OddTask(printer), "OddThread");
        Thread evenThread = new Thread(new EvenTask(printer), "EvenThread");

        oddThread.start();
        evenThread.start();
    }
}

