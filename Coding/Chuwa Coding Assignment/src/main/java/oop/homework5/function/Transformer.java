package oop.homework5.function;

import java.util.function.Function;

public class Transformer {
    public static <T, R> R transform(T input, Function<T, R> function) {
        return function.apply(input);
    }
}


