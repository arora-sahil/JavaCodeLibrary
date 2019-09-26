package com.java.thread.examples;

public class ThreadUsingRunnable {
    public static void main(String[] args) throws InterruptedException {

        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread("hi");
        Thread t2 = new Thread(runnable);

        t1.setName("t1");
        // Priorities
//        t1.setPriority(9);
//        t2.setPriority(10);

        t1.start();
        t2.start();

        t2.join();

       // System.out.println(Thread.currentThread().getName());
        System.out.println("Main thread");

    }
}

class MyRunnable implements Runnable
{
    @Override
    public void run() {
        for (int i=0;i<5;i++)
            System.out.println("child thread");
    }
}
