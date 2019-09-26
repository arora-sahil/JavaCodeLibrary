package com.java.thread.examples;

public class MyThread extends Thread{

    public void run()
    {
        for(;;)
            ;
    }
}
class ThreadDemo
{
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
       myThread.setPriority(10);
        myThread.start();
        for(int i=0;i<5;i++)
        System.out.println("Main thread");


    }
}