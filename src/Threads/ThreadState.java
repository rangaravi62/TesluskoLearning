package Threads;

class ABC implements Runnable{

    @Override
    public void run() {
        try
        {
// moving thread t2 to the state timed waiting
            Thread.sleep(100);
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }

        System.out.println("The state of thread t1 while it invoked the method join() on thread t2 -"+ ThreadState.t1.getState());


        try
        {
            Thread.sleep(200);
        }
        catch (InterruptedException ie)
        {
            ie.printStackTrace();
        }
    }
}

public class ThreadState {

    public static Thread t1;
    public static ThreadState obj;

    public static void main(String[] args) {

    }
}
