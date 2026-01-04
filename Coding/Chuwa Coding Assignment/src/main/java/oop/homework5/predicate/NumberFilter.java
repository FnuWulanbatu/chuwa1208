package oop.homework5.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NumberFilter {
    public static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<Integer>();
        for (Integer n : numbers) {
            if (predicate.test(n)) {
                result.add(n);
            }
        }
        return result;
    }
}


