package oop.homework4.try_with_resources;

public class Main {
    public static void main(String[] args) {
        // try-with-resources is better than try-finally because resources are closed automatically
        // and it closes them in reverse order, even when exceptions occur.
        try (LogWriter logWriter = new LogWriter(); DataProcessor processor = new DataProcessor()) {
            logWriter.write("start");
            processor.process("data");
            logWriter.write("end");
        }

        LogWriter logWriter = null;
        DataProcessor processor = null;
        try {
            logWriter = new LogWriter();
            processor = new DataProcessor();
            logWriter.write("start (try-finally)");
            processor.process("data (try-finally)");
            logWriter.write("end (try-finally)");
        } finally {
            if (processor != null) {
                processor.close();
            }
            if (logWriter != null) {
                logWriter.close();
            }
        }
    }
}


