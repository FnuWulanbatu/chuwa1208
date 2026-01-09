package oop.homework6.p4;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class AsyncTasks {
    public CompletableFuture<Integer> computeSquareAsync(int x) {
        return CompletableFuture.supplyAsync(() -> {
            sleepMillis(200);
            return Integer.valueOf(x * x);
        });
    }

    public CompletableFuture<Integer> sumSquaresAsync(int a, int b) {
        CompletableFuture<Integer> fa = computeSquareAsync(a);
        CompletableFuture<Integer> fb = computeSquareAsync(b);
        return fa.thenCombine(fb, (ra, rb) -> Integer.valueOf(ra.intValue() + rb.intValue()));
    }

    public CompletableFuture<String> fetchUserAndFormat(int id) {
        return CompletableFuture.supplyAsync(() -> {
            if (id <= 0) {
                throw new IllegalArgumentException("invalid id");
            }
            sleepMillis(150);
            return "user-" + id;
        }).thenApply(name -> "User: " + name.toUpperCase())
          .exceptionally(ex -> "Invalid user id");
    }

    private void sleepMillis(long millis) {
        try {
            TimeUnit.MILLISECONDS.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

