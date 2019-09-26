package com.java.thiskeyword;

public class ThisUsage {
    ThisUsage()
    {
        this(10,20);
        System.out.println("hi, non parameterized");
    }

    public void disp()
    {

        System.out.println("hi");
    }
    ThisUsage(int a, int b)
    {

       System.out.println("hi parameterized");

    }
    public static void main(String[] args) {
        ThisUsage thisUsage = new ThisUsage();
        thisUsage.disp();


    }
}
