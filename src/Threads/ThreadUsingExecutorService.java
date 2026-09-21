package Threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadUsingExecutorService {

    static Runnable runnable = () -> {
        try {
            System.out.println("task started "+Thread.currentThread().getName());
            Thread.sleep(3000);
            System.out.println("task ended "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    };

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i=0;i<5;i++){
            executorService.execute(runnable);
        }
        executorService.shutdown();
    }


}
