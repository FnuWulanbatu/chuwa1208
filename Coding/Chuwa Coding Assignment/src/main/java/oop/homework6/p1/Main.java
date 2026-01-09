package oop.homework6.p1;

public class Main {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter(100);

        Thread oddThread = new Thread(new OddTask(printer), "OddThread");
        Thread evenThread = new Thread(new EvenTask(printer), "EvenThread");

        oddThread.start();
        evenThread.start();
    }
}

