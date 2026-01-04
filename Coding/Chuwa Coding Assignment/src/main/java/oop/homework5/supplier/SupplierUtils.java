package oop.homework5.supplier;

import java.util.function.Supplier;

public class SupplierUtils {
    public static <T> T getOrDefault(T value, Supplier<T> supplier) {
        if (value != null) {
            return value;
        }
        return supplier.get();
    }
}


