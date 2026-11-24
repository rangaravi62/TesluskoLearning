package Threads;

import java.util.concurrent.CountDownLatch;

public class dummy {

    public static void main(String[] args) throws InterruptedException {

        int count = 0;
        CountDownLatch countDownLatch = new CountDownLatch(3);

        Runnable runnable = () -> {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();

    }
}
