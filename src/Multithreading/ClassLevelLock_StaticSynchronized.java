package Multithreading;


// Static Synchronization

class Counter2 {

    static int count = 0;

    static void increment() {
        synchronized (Counter2.class) {
            try {
                Thread.sleep(2000);
            }
            catch (Exception e) {}

            count++;
            System.out.println(count);
        }
    }
}

public class ClassLevelLock_StaticSynchronized {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> Counter2.increment());

        Thread t2 = new Thread(() -> Counter2.increment());

        t1.start();
        t2.start();
    }
}
