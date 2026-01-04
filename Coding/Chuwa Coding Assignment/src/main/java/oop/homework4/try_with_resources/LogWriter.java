package oop.homework4.try_with_resources;

public class LogWriter implements AutoCloseable {
    public void write(String message) {
        System.out.println("LogWriter: " + message);
    }

    @Override
    public void close() {
        System.out.println("LogWriter closed");
    }
}



