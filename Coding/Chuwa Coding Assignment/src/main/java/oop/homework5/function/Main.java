package oop.homework5.function;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> length = s -> Integer.valueOf(s.length());
        Function<String, String> uppercase = s -> s.toUpperCase();
        Function<Integer, String> evenOdd = n -> (n.intValue() % 2 == 0) ? "Even" : "Odd";

        System.out.println("length('hello') = " + Transformer.transform("hello", length));
        System.out.println("uppercase('hello') = " + Transformer.transform("hello", uppercase));
        System.out.println("evenOdd(7) = " + Transformer.transform(Integer.valueOf(7), evenOdd));

        Function<String, String> trim = s -> s.trim();
        Function<String, String> trimThenUpper = trim.andThen(uppercase);
        System.out.println("andThen: " + trimThenUpper.apply("  hi  "));

        Function<String, String> upperThenTrim = trim.compose(uppercase);
        System.out.println("compose: " + upperThenTrim.apply("  hi  "));
    }
}


