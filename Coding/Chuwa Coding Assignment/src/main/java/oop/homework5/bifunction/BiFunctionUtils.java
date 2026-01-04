package oop.homework5.bifunction;

import java.util.function.BiFunction;

public class BiFunctionUtils {
    public static <T, U, R> R apply(T t, U u, BiFunction<T, U, R> function) {
        return function.apply(t, u);
    }
}


