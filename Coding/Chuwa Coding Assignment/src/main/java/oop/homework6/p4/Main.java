package oop.homework6.p4;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        AsyncTasks tasks = new AsyncTasks();

        CompletableFuture<Integer> square = tasks.computeSquareAsync(12);
        CompletableFuture<Integer> sumSquares = tasks.sumSquaresAsync(3, 4);
        CompletableFuture<String> validUser = tasks.fetchUserAndFormat(7);
        CompletableFuture<String> invalidUser = tasks.fetchUserAndFormat(0);

        System.out.println("computeSquareAsync(12) = " + square.join());
        System.out.println("sumSquaresAsync(3,4) = " + sumSquares.join());
        System.out.println("fetchUserAndFormat(7) = " + validUser.join());
        System.out.println("fetchUserAndFormat(0) = " + invalidUser.join());
    }
}

