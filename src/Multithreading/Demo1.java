package Multithreading;


// Using Thread Class
public class Demo1 {
    public static void main(String [] args){
        MyThread1 t1 = new MyThread1();
        t1.start();
    }
}

class MyThread1 extends Thread {
     public void run(){
         System.out.println("Thread is Running");
     }
}
