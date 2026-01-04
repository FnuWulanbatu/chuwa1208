package oop.homework5.bifunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> Integer.valueOf(a.intValue() + b.intValue());
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> Integer.valueOf(a.intValue() * b.intValue());

        System.out.println("add(2,3) = " + BiFunctionUtils.apply(Integer.valueOf(2), Integer.valueOf(3), add));
        System.out.println("multiply(2,3) = " + BiFunctionUtils.apply(Integer.valueOf(2), Integer.valueOf(3), multiply));

        BiFunction<String, Integer, String> repeat = (s, n) -> {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n.intValue(); i++) {
                sb.append(s);
            }
            return sb.toString();
        };
        System.out.println("repeat('ab',3) = " + BiFunctionUtils.apply("ab", Integer.valueOf(3), repeat));

        BiFunction<List<Integer>, Integer, List<Integer>> addToAll = (list, delta) -> {
            List<Integer> result = new ArrayList<Integer>();
            for (Integer v : list) {
                result.add(Integer.valueOf(v.intValue() + delta.intValue()));
            }
            return result;
        };

        List<Integer> nums = Arrays.asList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3));
        System.out.println("add 10 to all: " + BiFunctionUtils.apply(nums, Integer.valueOf(10), addToAll));
    }
}


