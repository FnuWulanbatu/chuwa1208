package oop.homework5.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(Integer.valueOf(i));
        }

        Predicate<Integer> isEven = n -> n.intValue() % 2 == 0;
        Predicate<Integer> greaterThan5 = n -> n.intValue() > 5;
        Predicate<Integer> divisibleBy3 = n -> n.intValue() % 3 == 0;

        System.out.println("Even: " + NumberFilter.filter(numbers, isEven));
        System.out.println(">5: " + NumberFilter.filter(numbers, greaterThan5));
        System.out.println("Divisible by 3: " + NumberFilter.filter(numbers, divisibleBy3));

        System.out.println("Even and >5: " + NumberFilter.filter(numbers, isEven.and(greaterThan5)));
        System.out.println("Even or divisible by 3: " + NumberFilter.filter(numbers, isEven.or(divisibleBy3)));
        System.out.println("Not even: " + NumberFilter.filter(numbers, isEven.negate()));
    }
}


