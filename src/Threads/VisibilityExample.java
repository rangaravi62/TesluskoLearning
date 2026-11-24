package Threads;

public class VisibilityExample {
    volatile int count = 0;

    synchronized void increment(){
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        VisibilityExample d = new VisibilityExample();
        Thread[] threads = new Thread[10000];
        for (int i = 0; i < 10000; i++) {
            threads[i] = new Thread(d::increment);
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println(d.count);

    }
}
