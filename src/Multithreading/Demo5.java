package Multithreading;

// Thread.yield() --> static method
public class Demo5 {
    public static void main(String [] args) throws InterruptedException {

        Thread t1 = new Thread(()-> {
            for(int i=1;i<=10;i++){
                System.out.println("T1 " + i);
                Thread.yield();  // It's static so we can call using class name
            }
        });

        Thread t2 = new Thread(()-> {
            for(int i=1;i<=10;i++){
                System.out.println("T2 " + i);
            }
        });

        t1.start();
        t2.start();


    }
}

// Thread.yield() --> I am willing to give my CPU time to someone else with same priority and that wants to run
// 1. OS Can reject this.  // flow order is not preserved
// 2. It is like a suggestion to the OS
// 3. Current thread does not go to waiting, Timed_Waiting, Blocked, It does go to only RUNNABLE State.