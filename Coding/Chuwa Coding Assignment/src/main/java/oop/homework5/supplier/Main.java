package oop.homework5.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Supplier<Double> random0To100 = () -> Double.valueOf(random.nextDouble() * 100.0);
        System.out.println("Random 0-100: " + random0To100.get());

        Supplier<List<Integer>> oneToTen = () -> {
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 1; i <= 10; i++) {
                list.add(Integer.valueOf(i));
            }
            return list;
        };
        System.out.println("List 1-10: " + oneToTen.get());

        String value = "already there";
        String r1 = SupplierUtils.getOrDefault(value, () -> expensiveDb("dbSupplier(should not run)"));
        System.out.println("getOrDefault(non-null): " + r1);

        String nullValue = null;
        String r2 = SupplierUtils.getOrDefault(nullValue, () -> expensiveDb("dbSupplier(should run)"));
        System.out.println("getOrDefault(null): " + r2);
    }

    private static String expensiveDb(String label) {
        System.out.println("Simulating expensive DB call: " + label);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "DB_RESULT";
    }
}


