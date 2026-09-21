package Threads.CompletableFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureRunasync{
    public static void main(String[] args) {
        CompletableFuture completableFuture = CompletableFuture.runAsync(runnable);
        completableFuture.join(); //waits until the daemon thread completes its task
        System.out.println("Doing Operation after completing CompletableFuture task");
    }

    static Runnable runnable = () -> {
        System.out.println("sleeping Completable thread for 10 sec");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Callable Completable task has completed");
    };
}


//Doing Operation after completing CompletableFuture task
//sleeping Completable thread for 10 sec

//output here will not print the last print statement
//CompletableFuture.runAsync() by default uses the ForkJoinPool.commonPool(). Its worker threads are typically daemon threads.
//but ExecutorService doesn't use daemon threads

//by the time daemon thread starts performing the task the main thread has finished its execution
//runAsync() returns immediately

//join() or get() can be used when we need to wait for completion.