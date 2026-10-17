package Multithreading;

// Using Runnable interface
public class Demo2 {
    public static void main(String [] args){
       // MyRunnable r1 = new MyRunnable();
        Thread t1 = new Thread(()-> System.out.println("Thread2 is running..."));
        t1.start();
    }
}


//class MyRunnable implements Runnable{  // Runnable is functional interface, we can use lambda instead of creating class
//    public void run(){
//        System.out.println("Thread2 is Running");
//    }
//}
