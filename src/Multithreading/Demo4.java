package Multithreading;

// join method of thread
public class Demo4 {
    public static void main(String [] args) throws InterruptedException {

        System.out.println("Main Thread Starts");

        Thread t1 = new Thread(()-> {
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e) {}
            System.out.println("Thread-0 Starts");
        });

           t1.start();
        // t1.join();
        // t1.join(1000);  // let the t1 thread first complete its execution

        System.out.println("Main Thread Ends");
    }
}
