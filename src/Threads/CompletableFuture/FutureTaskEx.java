package Threads.CompletableFuture;

import java.util.concurrent.*;

public class FutureTaskEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> future = executorService.submit(callable);
        System.out.println(future.get());
        System.out.println("Doing Operation after calling the future get");
    }

    static Callable<String> callable = () -> {
        System.out.println("sleeping future thread for 10 sec");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Callable future task has completed";
    };
}
