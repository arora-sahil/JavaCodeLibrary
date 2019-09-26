package com.java.overloadex;

public class BasicOver {

    void  m1(int a , float b)
    {
        System.out.println("Hi m1");
    }

    void  m1(float b, int a)
    {
        System.out.println("Hi m2");
    }

    public static void main(String[] args)
    {
        BasicOver basicOver = new BasicOver();
        basicOver.m1(1L,1);
        basicOver.m1(1,1L);

    }
}
