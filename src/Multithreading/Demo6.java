package Multithreading;

public class Demo6 {
    public static void main(String [] args) throws InterruptedException {

        Thread t1 = new Thread(()-> {
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("Running");
            }
        });

        t1.start();

        Thread.sleep(1000); // print for 1 sec while thread is in sleep

        t1.interrupt();  // As soon as interrupt is false it stopped.

    }
}

/*
    Thread --> interrupt flag (default true)
    t1.interrupt() -> Sends a signal to t1 thread that it should stop doing what it's doing.

    We can gracefully handle:
    --> you can make a thread run untill a condition.
    --> Canceling a long running task.
    --> used to stop thread pool.

    isInterrupted() --> return interrupt flag value (T/F)
    interrupted() --> return interrupt flag value (T/F) but also set it back to false

     --> sleep(), join(), wait() : TIMED_WAITING, WAITING --> interrupt()
     This looks like Java thread interruption notes:

     isInterrupted() is an instance method that checks the interrupt flag without clearing it.
     interrupted() is a static method that checks the flag and then resets it to false.
     Threads in TIMED_WAITING or WAITING states (from calls like sleep(), join(), or wait()) will throw an InterruptedException if interrupt() is called on them.

 */
