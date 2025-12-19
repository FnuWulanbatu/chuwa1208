package oop.homework4.try_with_resources;

public class DataProcessor implements AutoCloseable {
    public void process(String data) {
        System.out.println("DataProcessor processing: " + data);
    }

    @Override
    public void close() {
        System.out.println("DataProcessor closed");
    }
}


