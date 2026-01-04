package oop.homework5.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        fruits.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        fruits.forEach(s -> System.out.println(s));

        fruits.forEach(System.out::println);

        Consumer<String> printUppercase = s -> System.out.println(s.toUpperCase());
        fruits.forEach(printUppercase);
    }
}


