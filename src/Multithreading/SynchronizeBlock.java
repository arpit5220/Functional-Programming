package Multithreading;

public class SynchronizeBlock {
    public static void main(String[] args) throws InterruptedException {

        Counter1 c1 = new Counter1();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 10000; i++) {
                c1.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 10000; i++) {
                c1.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c1.count);
    }
}

class Counter1 {
    public int count = 0;

    public void increment() {
        // normal code

        synchronized (this) {
            count++; // 3 operation
        }

        // normal code
    }
}
