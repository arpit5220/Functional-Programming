package Multithreading;

// Follow No Synchronized Behaviour
public class SynchronizedWithnewObject_Nomeans {
    public static void main(String[] args) throws InterruptedException {
        Bank1 b1 = new Bank1();

        Thread t1 = new Thread(() -> b1.m1());

        Thread t2 = new Thread(() -> b1.m1());

        t1.start();
        t2.start();


    }
}

class Bank1 {

    void m1() {
        synchronized (new Object()) {  // it has no means because the every instance create new lock so it work simultaneously.No synchronized behaviour.
            System.out.println(Thread.currentThread().getName() + " Entered m1");

            try {
                Thread.sleep(2000);
            }
            catch (Exception e) {}

            System.out.println(Thread.currentThread().getName() + " Exiting m1");
        }
    }
}
