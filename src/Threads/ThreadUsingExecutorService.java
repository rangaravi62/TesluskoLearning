package Threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadUsingExecutorService {

    static Runnable runnable = () -> {
        try {
            System.out.println("task started");
            Thread.sleep(3000);
            System.out.println("task ended");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    };

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(runnable);
        executorService.shutdown();
    }


}
