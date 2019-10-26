package com.java.thread.examples;

public class MyThread extends Thread{

    boolean flag = true;
    public void stopRunning()
    {
        flag = false;
    }
    public void run()
    {
        while(flag) {
            for(int i =0 ;i<5;i++)
           System.out.println("Thread is running");
        }
    }
}
class ThreadDemo
{
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.setPriority(10);
        myThread.start();
        myThread.stopRunning();
        for(int i=0;i<5;i++)
        System.out.println("Main thread");




    }
}