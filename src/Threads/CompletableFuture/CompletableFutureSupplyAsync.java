package Threads.CompletableFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class CompletableFutureSupplyAsync {
    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(supplier);
        completableFuture.thenAccept(res -> System.out.println(res));
        completableFuture.join();
        System.out.println("finished the main thread");
    }

    static Supplier<String> supplier = () -> {
        try {
            System.out.println("starting the daemon thread");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Completed the daemon thread";
    };


}
